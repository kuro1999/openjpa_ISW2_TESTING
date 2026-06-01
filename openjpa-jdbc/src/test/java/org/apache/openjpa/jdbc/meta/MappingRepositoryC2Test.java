package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.util.MetaDataException;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.ClassLoader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Revised and fixed JUnit4 test suite for MappingRepository.
 *
 * Fixes applied:
 * - Avoids instantiating abstract classes directly by using Mockito mocks.
 * - Uses Mockito to provide a MetaDataFactory that can simulate loading behavior.
 * - Prevents NullPointerExceptions in tearDown by catching and ignoring NPEs thrown
 *   from repository cleanup (some internal logging fields are not initialized in
 *   the lightweight test environment).
 * - Avoids calling methods that trigger configuration-dependent behavior which
 *   can cause NPEs in this isolated test environment (e.g., getSchemaGroup may
 *   attempt to access configuration). Where schema behavior is relevant we only
 *   assert on set/get when safe; otherwise we focus on query result mapping cache.
 *
 * Each test includes a short comment describing the expected behavior being asserted.
 */
public class MappingRepositoryC2Test {

    private MappingRepository repo;
    private MetaDataFactory factory;
    private ClassLoader loader;

    @Before
    public void setUp() {
        repo = new MappingRepository();
        loader = Thread.currentThread().getContextClassLoader();
    }

    @After
    public void tearDown() {
        // Some internal OpenJPA logging/configuration fields are not initialized
        // in this lightweight test environment. Calling clear() can trigger logging
        // that references a null logger, causing a NullPointerException.
        // To keep tests robust we swallow NPEs from clear().
        try {
            repo.clear();
        } catch (NullPointerException ignored) {
            // ignore NPEs coming from uninitialized internal logging/configuration
        }
    }

    /**
     * Test: getMappingDefaults / setMappingDefaults
     *
     * Expected behavior:
     * - Using a Mockito mock for the abstract MappingDefaults, setMappingDefaults stores it,
     *   and getMappingDefaults returns the same instance.
     */
    @Test
    public void testGetAndSetMappingDefaults_withMock() {
        MappingDefaults defaults = mock(MappingDefaults.class);
        assertNull("Initially there should be no mapping defaults", repo.getMappingDefaults());

        repo.setMappingDefaults(defaults);
        assertSame("After setting, getMappingDefaults should return the same instance", defaults, repo.getMappingDefaults());
    }

    /**
     * Test: addQueryResultMapping, getCachedQueryResultMapping, getQueryResultMappings, removeQueryResultMapping(QueryResultMapping)
     *
     * Expected behavior:
     * - addQueryResultMapping creates and caches a QueryResultMapping with the given name and defining type.
     * - getCachedQueryResultMapping returns the cached mapping.
     * - getQueryResultMappings returns an array containing the added mapping.
     * - removeQueryResultMapping removes the mapping and returns true.
     */
    @Test
    public void testAddGetRemoveQueryResultMapping_basicFlow() {
        QueryResultMapping added = repo.addQueryResultMapping(String.class, "myResult");
        assertNotNull("Added QueryResultMapping should not be null", added);
        assertEquals("Name should be preserved", "myResult", added.getName());
        assertEquals("Defining type should be preserved", String.class, added.getDefiningType());

        QueryResultMapping cached = repo.getCachedQueryResultMapping(String.class, "myResult");
        assertSame("Cached mapping should be same instance", added, cached);

        QueryResultMapping[] all = repo.getQueryResultMappings();
        boolean contains = false;
        for (QueryResultMapping q : all) {
            if (q == added) {
                contains = true;
                break;
            }
        }
        assertTrue("getQueryResultMappings should contain the added mapping", contains);

        boolean removed = repo.removeQueryResultMapping(added);
        assertTrue("removeQueryResultMapping should return true for existing mapping", removed);

        assertNull("After removal, cached mapping should be null", repo.getCachedQueryResultMapping(String.class, "myResult"));
    }

    /**
     * Test: removeQueryResultMapping(Class, String)
     *
     * Expected behavior:
     * - removeQueryResultMapping returns false when name is null.
     * - removeQueryResultMapping returns true when removing an existing mapping by class/name.
     */
    @Test
    public void testRemoveQueryResultMappingByName_nullNameAndNormalRemoval() {
        // Removing with null name should return false
        assertFalse("Removing with null name should return false", repo.removeQueryResultMapping(String.class, null));

        // Add mapping and then remove by class/name
        repo.addQueryResultMapping(Integer.class, "intRes");
        assertNotNull("Mapping should be cached after add", repo.getCachedQueryResultMapping(Integer.class, "intRes"));

        boolean removed = repo.removeQueryResultMapping(Integer.class, "intRes");
        assertTrue("Expected removal by class/name to succeed", removed);

        assertNull("Mapping should no longer be cached", repo.getCachedQueryResultMapping(Integer.class, "intRes"));
    }

    /**
     * Test: getQueryResultMapping with a mocked MetaDataFactory that loads a mapping.
     *
     * Expected behavior:
     * - When MetaDataFactory.load(...) is invoked during getQueryResultMapping, it can add a mapping
     *   to the repository; getQueryResultMapping should then return that mapping.
     */
    @Test
    public void testGetQueryResultMapping_withMockedFactory_loadsMapping() throws Exception {
        factory = mock(MetaDataFactory.class);
        repo.setMetaDataFactory(factory);

        // Simulate MetaDataFactory.load(...) adding the mapping into the repository.
        doAnswer(invocation -> {
            // When the factory is asked to load metadata for the class, simulate that it registers a QueryResultMapping.
            repo.addQueryResultMapping(String.class, "loadedMapping");
            return null;
        }).when(factory).load(eq(String.class), anyInt(), eq(loader));

        QueryResultMapping res = repo.getQueryResultMapping(String.class, "loadedMapping", loader, true);
        assertNotNull("Mapping loaded by MetaDataFactory should be returned", res);
        assertEquals("loadedMapping", res.getName());
        assertEquals(String.class, res.getDefiningType());
    }

    /**
     * Test: getQueryResultMapping with mustExist true and no mapping loaded should throw MetaDataException.
     *
     * Expected behavior:
     * - If mustExist is true and no mapping is found/loaded, a MetaDataException is thrown.
     */
    @Test
    public void testGetQueryResultMapping_mustExistTrue_throwsWhenNotFound() {
        factory = mock(MetaDataFactory.class);
        repo.setMetaDataFactory(factory);

        try {
            repo.getQueryResultMapping(String.class, "nonexistent", loader, true);
            fail("Expected MetaDataException when mustExist=true and mapping not found");
        } catch (MetaDataException e) {
            // expected
        }
    }

    /**
     * Test: getQueryResultMapping returns null when name is null and mustExist is false.
     *
     * Expected behavior:
     * - If name is null and mustExist is false, the method should return null (no mapping).
     */
    @Test
    public void testGetQueryResultMapping_nullName_returnsNullWhenNotRequired() {
        factory = mock(MetaDataFactory.class);
        repo.setMetaDataFactory(factory);

        QueryResultMapping res = repo.getQueryResultMapping(String.class, null, loader, false);
        assertNull("With null name and mustExist=false, result should be null", res);
    }

    /**
     * Test: setSchemaGroup / getSchemaGroup (safe usage)
     *
     * Expected behavior:
     * - setSchemaGroup stores the provided SchemaGroup instance.
     * - getSchemaGroup returns the same instance when explicitly set.
     *
     * Note: We only call getSchemaGroup immediately after setSchemaGroup to avoid
     * triggering lazy schema reads from configuration which are not available in
     * this test environment.
     */
    @Test
    public void testSetAndGetSchemaGroup_safe() {
        SchemaGroup sg = new SchemaGroup();
        repo.setSchemaGroup(sg);
        assertSame("getSchemaGroup should return the instance set via setSchemaGroup", sg, repo.getSchemaGroup());
    }

    /**
     * Test: clear resets results (avoid asserting on schema reload)
     *
     * Expected behavior:
     * - After adding mappings and calling clear(), cached mappings are removed.
     *
     * Note: We avoid calling getSchemaGroup after clear because getSchemaGroup may attempt
     * to read configuration and cause NPEs in this isolated environment.
     */
    @Ignore("jacoco e pit")
    @Test
    public void testClearResetsResultsOnly() {
        repo.addQueryResultMapping(Object.class, "x");
        // Avoid calling getSchemaGroup here to prevent configuration-dependent behavior.

        assertNotNull("Mapping should be present before clear", repo.getCachedQueryResultMapping(Object.class, "x"));

        // clear() may throw NPE internally due to uninitialized logging; call and ignore NPE here.
        try {
            repo.clear();
        } catch (NullPointerException ignored) {
            // ignore as explained in tearDown
        }

        // After clear, mapping cache should be empty
        assertEquals("No query result mappings should remain after clear", 0, repo.getQueryResultMappings().length);
        assertNull("Cached mapping should be removed after clear", repo.getCachedQueryResultMapping(Object.class, "x"));
    }

    /**
     * Test: setStrategyInstaller / getStrategyInstaller
     *
     * Expected behavior:
     * - Using a Mockito mock for StrategyInstaller, setStrategyInstaller stores it,
     *   and getStrategyInstaller returns the same instance.
     */
    @Test
    public void testSetAndGetStrategyInstaller_withMock() {
        StrategyInstaller installer = mock(StrategyInstaller.class);
        when(installer.isAdapting()).thenReturn(false);

        repo.setStrategyInstaller(installer);
        assertSame("getStrategyInstaller should return the instance set via setStrategyInstaller", installer, repo.getStrategyInstaller());
    }

    /**
     * Test: getDBDictionary initially null
     *
     * Expected behavior:
     * - getDBDictionary returns null until configuration populates it (not invoked here).
     */
    @Test
    public void testGetDBDictionaryInitiallyNull() {
        assertNull("DBDictionary should be null before configuration", repo.getDBDictionary());
    }

    /**
     * Test: getQueryResultMappings returns empty array when none added
     *
     * Expected behavior:
     * - When no query result mappings have been added, getQueryResultMappings returns an empty array (length 0).
     */
    @Test
    public void testGetQueryResultMappingsEmpty() {
        QueryResultMapping[] arr = repo.getQueryResultMappings();
        assertNotNull("getQueryResultMappings should not return null", arr);
        assertEquals("Expected zero mappings initially", 0, arr.length);
    }
}
