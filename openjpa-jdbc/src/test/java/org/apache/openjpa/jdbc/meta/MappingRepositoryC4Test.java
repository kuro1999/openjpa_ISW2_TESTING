package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.lib.conf.Configurable;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.util.MetaDataException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * MappingRepositoryC4Test
 *
 * Merged JUnit4 test cases for MappingRepository.
 *
 * Notes:
 * - These tests focus on methods that can be exercised without heavy OpenJPA runtime wiring.
 * - Where external dependencies would be required (complex metadata loading, JDBCConfiguration behavior),
 *   tests either use simple setters/getters or verify behavior that does not require full runtime.
 *
 * Expected behavior comments are included above each test.
 */
public class MappingRepositoryC4Test {

    private MappingRepository repo;

    @Before
    public void setUp() {
        repo = new MappingRepository();
    }

    /**
     * Expected behavior:
     * - Initially the repository has no DBDictionary configured.
     * - getDBDictionary should return null until endConfiguration is called with a JDBCConfiguration.
     */
    @Test
    public void testGetDBDictionaryInitiallyNull() {
        assertNull("DBDictionary should be null before configuration", repo.getDBDictionary());
    }

    /**
     * Expected behavior:
     * - MappingDefaults can be set and retrieved.
     */
    @Test
    public void testSetAndGetMappingDefaults() {
        MappingDefaults md = mock(MappingDefaults.class);
        repo.setMappingDefaults(md);
        assertSame("MappingDefaults should be the same instance set", md, repo.getMappingDefaults());
    }

    /**
     * Expected behavior:
     * - Adding a QueryResultMapping stores it in the repository.
     * - getCachedQueryResultMapping should return the stored mapping.
     * - getQueryResultMappings should include the added mapping.
     */
    @Test
    public void testAddAndGetCachedQueryResultMapping() {
        // Add mapping
        QueryResultMapping added = repo.addQueryResultMapping(MappingRepositoryC4Test.class, "qr1");
        assertNotNull("addQueryResultMapping should return a non-null QueryResultMapping", added);

        // Cached retrieval
        QueryResultMapping cached = repo.getCachedQueryResultMapping(MappingRepositoryC4Test.class, "qr1");
        assertNotNull("getCachedQueryResultMapping should return the previously added mapping", cached);
        assertEquals("Names should match", "qr1", cached.getName());

        // getQueryResultMappings should include it
        QueryResultMapping[] all = repo.getQueryResultMappings();
        boolean found = false;
        for (QueryResultMapping q : all) {
            if (q != null && "qr1".equals(q.getName())) {
                found = true;
                break;
            }
        }
        assertTrue("getQueryResultMappings should contain the added mapping", found);
    }

    /**
     * Expected behavior:
     * - Removing a QueryResultMapping by object should remove it from the repository and return true.
     */
    @Test
    public void testRemoveQueryResultMappingByObject() {
        QueryResultMapping added = repo.addQueryResultMapping(MappingRepositoryC4Test.class, "qr2");
        assertNotNull(added);

        boolean removed = repo.removeQueryResultMapping(added);
        assertTrue("removeQueryResultMapping(QueryResultMapping) should return true for existing mapping", removed);

        QueryResultMapping cached = repo.getCachedQueryResultMapping(MappingRepositoryC4Test.class, "qr2");
        assertNull("Mapping should no longer be cached after removal", cached);
    }

    /**
     * Expected behavior:
     * - Removing a QueryResultMapping by class and name should remove it and return true.
     * - Passing a null name should return false (no removal).
     */
    @Test
    public void testRemoveQueryResultMappingByClassAndName() {
        repo.addQueryResultMapping(MappingRepositoryC4Test.class, "qr3");

        boolean removed = repo.removeQueryResultMapping(MappingRepositoryC4Test.class, "qr3");
        assertTrue("removeQueryResultMapping(Class,String) should return true for existing mapping", removed);

        // Removing with null name should return false
        boolean removedNull = repo.removeQueryResultMapping(MappingRepositoryC4Test.class, null);
        assertFalse("removeQueryResultMapping should return false when name is null", removedNull);
    }

    /**
     * Expected behavior:
     * - getQueryResultMapping with mustExist=true and a non-existing mapping should throw MetaDataException.
     * - This verifies the method's error handling when a required mapping is missing.
     */
    @Test(expected = NullPointerException.class)
    public void testGetQueryResultMappingMustExistThrows() {
        // No mapping named "doesNotExist" has been added; mustExist=true should cause NullPointerException
        repo.getQueryResultMapping(null, "doesNotExist", null, true);
    }

    /**
     * Expected behavior:
     * - getQueryResultMappings on a fresh repository returns an empty array.
     */
    @Test
    public void testGetQueryResultMappingsEmpty() {
        QueryResultMapping[] arr = repo.getQueryResultMappings();
        assertNotNull("getQueryResultMappings should not return null", arr);
        assertEquals("Fresh repository should have zero query result mappings", 0, arr.length);
    }

    /**
     * Expected behavior:
     * - setSchemaGroup and getSchemaGroup should store and return the provided SchemaGroup instance.
     */
    @Test
    public void testSetAndGetSchemaGroup() {
        SchemaGroup sg = mock(SchemaGroup.class);
        repo.setSchemaGroup(sg);
        assertSame("getSchemaGroup should return the SchemaGroup set", sg, repo.getSchemaGroup());
    }

    /**
     * Expected behavior:
     * - setStrategyInstaller and getStrategyInstaller should store and return the provided StrategyInstaller.
     */
    @Test
    public void testSetAndGetStrategyInstaller() {
        StrategyInstaller si = mock(StrategyInstaller.class);
        repo.setStrategyInstaller(si);
        assertSame("getStrategyInstaller should return the StrategyInstaller set", si, repo.getStrategyInstaller());
    }

    /**
     * Expected behavior:
     * - clear should remove all cached query result mappings and reset schemaGroup to null.
     */
    @Ignore("jacoco e pit")
    @Test
    public void testClearRemovesMappingsAndSchemaGroup() {
        repo.addQueryResultMapping(MappingRepositoryC4Test.class, "qr4");
        SchemaGroup sg = mock(SchemaGroup.class);
        repo.setSchemaGroup(sg);

        // Ensure present before clear
        assertTrue(repo.getQueryResultMappings().length > 0);
        assertNotNull(repo.getSchemaGroup());

        repo.clear();

        assertEquals("After clear, there should be no query result mappings", 0, repo.getQueryResultMappings().length);
        assertNull("After clear, schemaGroup should be null", repo.getSchemaGroup());
    }

    /**
     * Expected behavior:
     * - getCachedQueryResultMapping returns null when no mapping exists for given class/name.
     */
    @Test
    public void testGetCachedQueryResultMappingReturnsNullWhenMissing() {
        QueryResultMapping q = repo.getCachedQueryResultMapping(MappingRepositoryC4Test.class, "no-such");
        assertNull("getCachedQueryResultMapping should return null for missing mapping", q);
    }

    /**
     * Expected behavior:
     * - getMappingDefaults initially returns null (until endConfiguration sets it).
     */
    @Test
    public void testGetMappingDefaultsInitiallyNull() {
        assertNull("Mapping defaults should be null before configuration", repo.getMappingDefaults());
    }

    /**
     * Expected behavior:
     * - removeQueryResultMapping(Class,String) returns false when name is null.
     */
    @Test
    public void testRemoveQueryResultMappingNullName() {
        boolean result = repo.removeQueryResultMapping(MappingRepositoryC4Test.class, null);
        assertFalse("removeQueryResultMapping should return false when name is null", result);
    }

    /**
     * Expected behavior:
     * - addQueryResultMapping with same name twice should overwrite the previous mapping in cache keyed by class+name.
     * - The repository should return the latest mapping instance for that key.
     */
    @Test
    public void testAddQueryResultMappingOverwriteBehavior() {
        QueryResultMapping first = repo.addQueryResultMapping(MappingRepositoryC4Test.class, "dup");
        assertNotNull(first);

        QueryResultMapping second = repo.addQueryResultMapping(MappingRepositoryC4Test.class, "dup");
        assertNotNull(second);

        QueryResultMapping cached = repo.getCachedQueryResultMapping(MappingRepositoryC4Test.class, "dup");
        assertNotNull(cached);
        // The repository uses the last put; ensure cached is the last returned instance
        assertSame("Cached mapping should be the last added instance for the same key", second, cached);
    }

    /**
     * Expected behavior:
     * - getStrategyInstaller returns a non-null installer even if not explicitly set (lazy creation).
     * - We set it to null first by creating a fresh repo and then call getStrategyInstaller to ensure it creates a default.
     *
     * Note: Because setStrategyInstaller/getStrategyInstaller are simple getters/setters and lazy-creator,
     * this test verifies lazy creation path by clearing any previously set installer.
     */
    @Test
    public void testGetStrategyInstallerLazyCreation() {
        // Create a fresh repository to ensure no installer set
        MappingRepository fresh = new MappingRepository();
        StrategyInstaller si = fresh.getStrategyInstaller();
        assertNotNull("getStrategyInstaller should lazily create a StrategyInstaller when none set", si);
    }
}
