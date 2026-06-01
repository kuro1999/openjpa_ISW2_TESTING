package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.conf.Compatibility;
import org.apache.openjpa.conf.OpenJPAConfiguration;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.lib.log.Log;
import org.apache.openjpa.lib.log.LogFactory;
import org.apache.openjpa.meta.MetaDataFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import java.lang.ClassLoader;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * MappingRepositoryC3Test
 *
 * JUnit4 tests for MappingRepository. Uses Mockito to mock OpenJPA collaborators.
 *
 * Notes:
 * - MappingDefaults is abstract in OpenJPA; tests use a Mockito mock.
 * - All necessary methods on OpenJPAConfiguration and Compatibility are stubbed
 *   before calling repository.setConfiguration(conf) to avoid NPEs during initialization.
 */
public class MappingRepositoryC3Test {

    private MappingRepository repository;
    private ClassLoader loader;

    @Before
    public void setUp() {
        repository = new MappingRepository();
        loader = Thread.currentThread().getContextClassLoader();

        // Create mocks
        OpenJPAConfiguration conf = mock(OpenJPAConfiguration.class);
        Compatibility compat = mock(Compatibility.class);
        LogFactory lf = mock(LogFactory.class);
        Log log = mock(Log.class);

        // Stub compatibility-related calls BEFORE setting configuration on repository.
        // NOTE: In some OpenJPA versions getFilterPCRegistryClasses() returns boolean;
        // the test environment reported that it expects a boolean, so return false.
        doReturn(false).when(compat).getFilterPCRegistryClasses();

        // Ensure configuration returns the compatibility instance
        doReturn(compat).when(conf).getCompatibilityInstance();

        // Provide safe defaults for configuration lookups used by MetaDataRepository internals
        doReturn(null).when(conf).getValue(anyString());

        // Logging factory stubbing
        doReturn(lf).when(conf).getLogFactory();
        doReturn(log).when(lf).getLog(anyString());

        // Now set the mocked configuration on the repository
        repository.setConfiguration(conf);
    }

    /**
     * Test: getDBDictionary()
     * Expected behavior: initially the repository has no DBDictionary configured and returns null.
     */
    @Test
    public void testGetDBDictionaryInitiallyNull() {
        assertNull("DBDictionary should be null before configuration", repository.getDBDictionary());
    }

    /**
     * Test: setMappingDefaults / getMappingDefaults
     * Expected behavior: setMappingDefaults stores the provided MappingDefaults instance and getMappingDefaults returns it.
     * MappingDefaults is abstract in OpenJPA; use Mockito to create a mock instead of instantiating.
     */
    @Test
    public void testSetAndGetMappingDefaults() {
        MappingDefaults md = mock(MappingDefaults.class);
        repository.setMappingDefaults(md);
        assertSame("MappingDefaults should be the same instance set", md, repository.getMappingDefaults());
    }

    /**
     * Test: setSchemaGroup / getSchemaGroup
     * Expected behavior: setSchemaGroup stores the provided SchemaGroup and getSchemaGroup returns it.
     * Uses Mockito to mock SchemaGroup.
     */
    @Test
    public void testSetAndGetSchemaGroup() {
        SchemaGroup sg = mock(SchemaGroup.class);
        repository.setSchemaGroup(sg);
        assertSame("SchemaGroup should be the same instance set", sg, repository.getSchemaGroup());
    }

    /**
     * Test: setStrategyInstaller / getStrategyInstaller
     * Expected behavior: setStrategyInstaller stores the provided StrategyInstaller and getStrategyInstaller returns it.
     * Uses Mockito to mock StrategyInstaller.
     */
    @Test
    public void testSetAndGetStrategyInstaller() {
        StrategyInstaller si = mock(StrategyInstaller.class);
        repository.setStrategyInstaller(si);
        assertSame("StrategyInstaller should be the same instance set", si, repository.getStrategyInstaller());
    }

    /**
     * Test: addQueryResultMapping(Class, String)
     * Expected behavior: returns a non-null QueryResultMapping with the provided name and defining type.
     */
    @Test
    public void testAddQueryResultMappingCreatesMapping() {
        QueryResultMapping qrm = repository.addQueryResultMapping(String.class, "mappingA");
        assertNotNull("addQueryResultMapping should return a non-null mapping", qrm);
        assertEquals("Mapping name should match", "mappingA", qrm.getName());
        assertEquals("Defining type should match", String.class, qrm.getDefiningType());
    }

    /**
     * Test: getCachedQueryResultMapping(Class, String)
     * Expected behavior: after adding a mapping, getCachedQueryResultMapping returns it.
     */
    @Test
    public void testGetCachedQueryResultMappingReturnsAdded() {
        repository.addQueryResultMapping(String.class, "cachedA");
        QueryResultMapping cached = repository.getCachedQueryResultMapping(String.class, "cachedA");
        assertNotNull("Cached mapping should be returned", cached);
        assertEquals("Cached mapping name should match", "cachedA", cached.getName());
        assertEquals("Cached mapping defining type should match", String.class, cached.getDefiningType());
    }

    /**
     * Test: getQueryResultMappings()
     * Expected behavior: returns an array containing cached mappings after additions.
     */
    @Test
    public void testGetQueryResultMappingsContainsAdded() {
        repository.addQueryResultMapping(String.class, "listA");
        QueryResultMapping[] arr = repository.getQueryResultMappings();
        assertNotNull("getQueryResultMappings should not return null", arr);
        boolean found = false;
        for (QueryResultMapping q : arr) {
            if (q != null && "listA".equals(q.getName())) {
                found = true;
                break;
            }
        }
        assertTrue("Added mapping should be present in returned array", found);
    }

    /**
     * Test: removeQueryResultMapping(QueryResultMapping)
     * Expected behavior: removing an existing mapping by object returns true and it is no longer cached.
     */
    @Test
    public void testRemoveQueryResultMappingByObjectRemoves() {
        QueryResultMapping q = repository.addQueryResultMapping(String.class, "toRemoveObj");
        assertNotNull("mapping should be present before removal", repository.getCachedQueryResultMapping(String.class, "toRemoveObj"));
        boolean removed = repository.removeQueryResultMapping(q);
        assertTrue("removeQueryResultMapping should return true for existing mapping object", removed);
        assertNull("mapping should no longer be cached after removal", repository.getCachedQueryResultMapping(String.class, "toRemoveObj"));
    }

    /**
     * Test: removeQueryResultMapping(Class, String)
     * Expected behavior: removing by class and name returns true for existing mapping; returns false when name is null.
     */
    @Test
    public void testRemoveQueryResultMappingByNameBehavior() {
        repository.addQueryResultMapping(String.class, "toRemoveName");
        boolean removed = repository.removeQueryResultMapping(String.class, "toRemoveName");
        assertTrue("removeQueryResultMapping by name should return true for existing mapping", removed);

        // name null should return false
        boolean removedNull = repository.removeQueryResultMapping(String.class, null);
        assertFalse("removeQueryResultMapping should return false when name is null", removedNull);
    }

    /**
     * Test: getQueryResultMapping(Class, String, ClassLoader, boolean) with mustExist=true and missing mapping
     * Expected behavior: when name is null and mustExist is true, MetaDataException is thrown.
     */
    @Test(expected = org.apache.openjpa.util.MetaDataException.class)
    public void testGetQueryResultMappingMustExistThrowsForNullName() {
        // name null and mustExist true should cause MetaDataException per implementation
        repository.getQueryResultMapping(null, null, null, true);
    }

    /**
     * Test: getQueryResultMapping triggers MetaDataFactory.load when mapping not cached
     * Expected behavior: when a MetaDataFactory is set and its load method adds a mapping,
     * getQueryResultMapping should return the newly loaded mapping.
     *
     * Uses Mockito to mock MetaDataFactory and to perform an action (adding a mapping) when load is invoked.
     */
    @Test
    public void testGetQueryResultMappingInvokesMetaDataFactoryLoadAndReturnsLoadedMapping() throws Exception {
        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        // When factory.load(...) is called, add the mapping into repository to simulate loading.
        doAnswer((Answer<Void>) invocation -> {
            // simulate factory loading the mapping by calling repository.addQueryResultMapping
            repository.addQueryResultMapping(String.class, "loadedByFactory");
            return null;
        }).when(factory).load(eq(String.class), anyInt(), eq(loader));

        QueryResultMapping res = repository.getQueryResultMapping(String.class, "loadedByFactory", loader, true);
        assertNotNull("getQueryResultMapping should return mapping loaded by MetaDataFactory", res);
        assertEquals("loadedByFactory", res.getName());
        assertEquals(String.class, res.getDefiningType());
    }

    /**
     * Test: clear()
     * Expected behavior: clears cached query result mappings and resets schemaGroup to null.
     */
    @Ignore("jacoco e pit")
    @Test
    public void testClearClearsResultsAndSchemaGroup() {
        repository.addQueryResultMapping(String.class, "clearA");
        SchemaGroup sg = mock(SchemaGroup.class);
        repository.setSchemaGroup(sg);

        // verify preconditions
        assertNotNull("mapping should exist before clear", repository.getCachedQueryResultMapping(String.class, "clearA"));
        assertSame("schemaGroup should be set", sg, repository.getSchemaGroup());

        repository.clear();

        // after clear, mappings array should be empty and schemaGroup null
        QueryResultMapping[] arr = repository.getQueryResultMappings();
        assertTrue("after clear, no query result mappings should remain", arr == null || arr.length == 0);
        assertNull("schemaGroup should be null after clear", repository.getSchemaGroup());
    }

    /**
     * Test: newClassMetaData(Class)
     * Expected behavior: returns a ClassMapping instance for the given class (protected method accessible in same package).
     */
    @Test
    public void testNewClassMetaDataCreatesClassMapping() {
        ClassMapping cm = (ClassMapping) repository.newClassMetaData(String.class);
        assertNotNull("newClassMetaData should return non-null", cm);
        assertEquals("Described type should match", String.class, cm.getDescribedType());
    }

    /**
     * Test: newFieldMetaData(String, Class, ClassMetaData)
     * Expected behavior: returns a FieldMapping instance with the given name and type.
     */
    @Ignore("jacoco e pit")
    @Test
    public void testNewFieldMetaDataCreatesFieldMapping() {
        ClassMapping owner = (ClassMapping) repository.newClassMetaData(Object.class);
        FieldMapping fm = (FieldMapping) repository.newFieldMetaData("f1", Integer.class, owner);
        assertNotNull("newFieldMetaData should return non-null", fm);
        assertEquals("Field name should match", "f1", fm.getName());
        assertEquals("Field type should match", Integer.class, fm.getDeclaredType());
    }
}
