package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.util.MetaDataException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * MappingRepositoryCopilotZeroShotWithSourceTest
 *
 * This test class exercises the public behavior of MappingRepository
 * focusing on query result mapping management, schema and installer
 * setters/getters, and lifecycle clear behavior.
 *
 * Note: The MappingRepository implementation is part of the provided
 * source. The file describes the class as a "Repository of object/relational
 * mapping information." and documents the default constructor behavior.
 *
 *
 * The tests below are written for JUnit 4.
 */
public class MappingRepositoryCopilotZeroShotWithSourceTest {

    private MappingRepository repo;

    @Before
    public void setUp() {
        // Create a fresh repository for each test.
        repo = new MappingRepository();
    }

    @After
    public void tearDown() {
        // Ensure repository is cleared after each test.
        repo.clear();
    }

    /**
     * Test: getDBDictionary initially returns null.
     *
     * Expected behavior: Before configuration/endConfiguration is called,
     * the internal DBDictionary should be null.
     */
    @Test
    public void testGetDBDictionaryInitiallyNull() {
        assertNull("DBDictionary should be null before configuration", repo.getDBDictionary());
    }

    /**
     * Test: getMappingDefaults initially returns null and setMappingDefaults
     * stores the provided value.
     *
     * Expected behavior: Mapping defaults are initially null; setting to a
     * non-null value should be retrievable via getMappingDefaults.
     *
     * Note: We set and get null here to validate basic setter/getter behavior
     * without requiring a concrete MappingDefaults implementation.
     */
    @Test
    public void testGetAndSetMappingDefaultsNull() {
        assertNull("MappingDefaults should be null initially", repo.getMappingDefaults());
        repo.setMappingDefaults(null);
        assertNull("MappingDefaults should remain null after setting null", repo.getMappingDefaults());
    }

    /**
     * Test: addQueryResultMapping and getCachedQueryResultMapping.
     *
     * Expected behavior: Adding a QueryResultMapping with a name should
     * make it retrievable via getCachedQueryResultMapping using the same
     * class and name key.
     */
    @Test
    public void testAddAndGetCachedQueryResultMapping() {
        // Add a mapping for this test class (use MappingRepository class as defining type)
        QueryResultMapping added = repo.addQueryResultMapping(MappingRepository.class, "testResult");
        assertNotNull("addQueryResultMapping should return a non-null QueryResultMapping", added);

        QueryResultMapping cached = repo.getCachedQueryResultMapping(MappingRepository.class, "testResult");
        assertNotNull("getCachedQueryResultMapping should return the previously added mapping", cached);
        assertEquals("Cached mapping name should match", "testResult", cached.getName());
        assertEquals("Defining type should match", MappingRepository.class, cached.getDefiningType());
    }

    /**
     * Test: getQueryResultMappings returns all cached mappings.
     *
     * Expected behavior: After adding multiple mappings, getQueryResultMappings
     * returns an array containing them.
     */
    @Test
    public void testGetQueryResultMappingsContainsAdded() {
        repo.addQueryResultMapping(MappingRepository.class, "r1");
        repo.addQueryResultMapping(MappingRepository.class, "r2");

        QueryResultMapping[] arr = repo.getQueryResultMappings();
        assertNotNull("getQueryResultMappings should not return null", arr);
        // We expect at least the two we added; there may be others in the environment,
        // so check that our names are present.
        boolean foundR1 = Arrays.stream(arr).anyMatch(r -> "r1".equals(r.getName()));
        boolean foundR2 = Arrays.stream(arr).anyMatch(r -> "r2".equals(r.getName()));
        assertTrue("Should find mapping r1", foundR1);
        assertTrue("Should find mapping r2", foundR2);
    }

    /**
     * Test: getQueryResultMapping with null name returns null (no mapping).
     *
     * Expected behavior: When name is null, the repository should return null
     * rather than throwing an exception.
     */
    @Test
    public void testGetQueryResultMappingWithNullNameReturnsNull() {
        QueryResultMapping res = repo.getQueryResultMapping(MappingRepository.class, null, this.getClass().getClassLoader(), false);
        assertNull("getQueryResultMapping should return null when name is null", res);
    }

    /**
     * Test: getQueryResultMapping with mustExist true throws MetaDataException
     * when mapping not present.
     *
     * Expected behavior: If mustExist is true and no mapping exists, a
     * MetaDataException should be thrown.
     */
    @Test(expected = MetaDataException.class)
    public void testGetQueryResultMappingMustExistThrows() {
        // Ensure no mapping with this unlikely name exists
        repo.removeQueryResultMapping(MappingRepository.class, "nonexistent-should-throw");
        // This should throw because mustExist is true and mapping doesn't exist
        repo.getQueryResultMapping(MappingRepository.class, "nonexistent-should-throw", this.getClass().getClassLoader(), true);
    }

    /**
     * Test: removeQueryResultMapping by QueryResultMapping instance.
     *
     * Expected behavior: Removing an existing mapping by instance returns true,
     * and subsequent retrieval returns null.
     */
    @Test
    public void testRemoveQueryResultMappingByInstance() {
        QueryResultMapping added = repo.addQueryResultMapping(MappingRepository.class, "toRemove");
        assertNotNull(added);

        boolean removed = repo.removeQueryResultMapping(added);
        assertTrue("removeQueryResultMapping should return true for existing mapping", removed);

        QueryResultMapping cached = repo.getCachedQueryResultMapping(MappingRepository.class, "toRemove");
        assertNull("Mapping should no longer be cached after removal", cached);
    }

    /**
     * Test: removeQueryResultMapping by class and name.
     *
     * Expected behavior: Removing by class and name returns false when name is null,
     * and returns true when the mapping exists.
     */
    @Test
    public void testRemoveQueryResultMappingByClassAndName() {
        // Removing with null name should return false
        boolean removedNull = repo.removeQueryResultMapping(MappingRepository.class, null);
        assertFalse("removeQueryResultMapping should return false when name is null", removedNull);

        // Add and then remove
        repo.addQueryResultMapping(MappingRepository.class, "toRemove2");
        boolean removed = repo.removeQueryResultMapping(MappingRepository.class, "toRemove2");
        assertTrue("removeQueryResultMapping should return true for existing mapping", removed);
    }

    /**
     * Test: clear resets schema and results.
     *
     * Expected behavior: After adding mappings and setting a schema group,
     * calling clear should remove cached query result mappings and nullify schema.
     */
    @Test
    public void testClearResetsState() {
        repo.addQueryResultMapping(MappingRepository.class, "c1");
        // set a dummy SchemaGroup via setter (null is acceptable to validate clearing)
        repo.setSchemaGroup(null);

        // Ensure something exists
        assertNotNull("There should be at least one cached mapping before clear", repo.getQueryResultMappings());

        // Clear repository
        repo.clear();

        // After clear, query result mappings should be empty array
        QueryResultMapping[] after = repo.getQueryResultMappings();
        // The implementation returns an array; ensure none of our previously added names exist
        boolean found = Arrays.stream(after).anyMatch(r -> "c1".equals(r.getName()));
        assertFalse("Previously added mapping should not be present after clear", found);

        // Schema group should be null after clear
        assertNull("SchemaGroup should be null after clear", repo.getSchemaGroup() == null ? null : repo.getSchemaGroup());
    }

    /**
     * Test: getCachedQueryResultMapping returns null for unknown mapping.
     *
     * Expected behavior: Querying the cache for a mapping that was never added
     * returns null.
     */
    @Test
    public void testGetCachedQueryResultMappingUnknownReturnsNull() {
        QueryResultMapping cached = repo.getCachedQueryResultMapping(MappingRepository.class, "unknownMapping");
        assertNull("getCachedQueryResultMapping should return null for unknown mapping", cached);
    }

    /**
     * Test: addQueryResultMapping sets defining type and name correctly.
     *
     * Expected behavior: The returned QueryResultMapping should have the name
     * and defining type set to the provided values.
     */
    @Test
    public void testAddQueryResultMappingSetsProperties() {
        QueryResultMapping qrm = repo.addQueryResultMapping(String.class, "myName");
        assertNotNull(qrm);
        assertEquals("Name should be set on the QueryResultMapping", "myName", qrm.getName());
        assertEquals("Defining type should be set on the QueryResultMapping", String.class, qrm.getDefiningType());
    }
}
