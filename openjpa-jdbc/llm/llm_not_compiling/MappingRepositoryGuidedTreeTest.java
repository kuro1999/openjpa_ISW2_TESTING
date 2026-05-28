package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.util.MetaDataException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * MappingRepositoryGuidedTreeTest
 *
 * This test suite was generated to exercise the public surface of
 * MappingRepository (selected public methods) and to validate basic
 * behaviors and edge cases described in the guided task.
 *
 * Each test includes a short comment describing the expected behavior.
 *
 * NOTE:
 * - These tests assume the OpenJPA runtime classes (MappingRepository and
 *   its collaborators) are available on the classpath when running the tests.
 * - The tests intentionally exercise only behaviors that do not require a
 *   full JDBCConfiguration / database runtime. They focus on in-memory
 *   behaviors (getters/setters, query-result mapping cache, simple boolean
 *   helpers) and on expected exceptions for missing query result mappings.
 */
public class MappingRepositoryGuidedTreeTest {

    private MappingRepository repo;

    @Before
    public void setUp() {
        repo = new MappingRepository();
    }

    @After
    public void tearDown() {
        // ensure repository is cleared between tests
        repo.clear();
    }

    /**
     * Test: setMappingDefaults / getMappingDefaults
     * Expected behavior: setter stores the provided MappingDefaults instance
     * and getter returns the same instance.
     */
    @Test
    public void testSetAndGetMappingDefaults() {
        MappingDefaults defaults = new MappingDefaultsStub();
        repo.setMappingDefaults(defaults);
        assertSame("getMappingDefaults should return the instance set via setMappingDefaults",
                defaults, repo.getMappingDefaults());
    }

    /**
     * Test: addQueryResultMapping, getCachedQueryResultMapping, getQueryResultMappings
     * Expected behavior: after adding a mapping, it should be retrievable from the cache
     * and appear in the array returned by getQueryResultMappings.
     */
    @Test
    public void testAddAndGetAndListQueryResultMapping() {
        // add mapping
        QueryResultMapping added = repo.addQueryResultMapping(String.class, "myResult");
        assertNotNull("addQueryResultMapping should return a non-null QueryResultMapping", added);

        // cached retrieval by class and name
        QueryResultMapping cached = repo.getCachedQueryResultMapping(String.class, "myResult");
        assertNotNull("getCachedQueryResultMapping should return the previously added mapping", cached);
        assertEquals("Cached mapping name should match", "myResult", cached.getName());

        // list all mappings should include the added mapping
        QueryResultMapping[] all = repo.getQueryResultMappings();
        boolean found = false;
        for (QueryResultMapping r : all) {
            if (r != null && "myResult".equals(r.getName())) {
                found = true;
                break;
            }
        }
        assertTrue("getQueryResultMappings should include the added mapping", found);
    }

    /**
     * Test: removeQueryResultMapping(QueryResultMapping)
     * Expected behavior: removing an existing mapping returns true and it is no longer cached.
     */
    @Test
    public void testRemoveQueryResultMappingByObject() {
        QueryResultMapping added = repo.addQueryResultMapping(Integer.class, "resToRemove");
        assertNotNull(repo.getCachedQueryResultMapping(Integer.class, "resToRemove"));

        boolean removed = repo.removeQueryResultMapping(added);
        assertTrue("removeQueryResultMapping should return true when removing an existing mapping", removed);

        assertNull("After removal, getCachedQueryResultMapping should return null", repo.getCachedQueryResultMapping(Integer.class, "resToRemove"));
    }

    /**
     * Test: removeQueryResultMapping(Class, String) with null name
     * Expected behavior: when name is null, method returns false and does not throw.
     */
    @Test
    public void testRemoveQueryResultMappingByNameNull() {
        boolean result = repo.removeQueryResultMapping(String.class, null);
        assertFalse("removeQueryResultMapping should return false when name is null", result);
    }

    /**
     * Test: clear()
     * Expected behavior: clear removes cached query result mappings and resets schema reference.
     */
    @Test
    public void testClearClearsResults() {
        repo.addQueryResultMapping(Object.class, "toClear");
        assertTrue(repo.getQueryResultMappings().length > 0);

        repo.clear();

        assertEquals("After clear, query result mappings should be empty", 0, repo.getQueryResultMappings().length);
    }

    /**
     * Test: getQueryResultMapping with mustExist=true and missing mapping
     * Expected behavior: when mustExist is true and mapping cannot be found, a MetaDataException is thrown.
     */
    @Test(expected = MetaDataException.class)
    public void testGetQueryResultMappingMustExistThrows() {
        // name is null -> internal method returns null -> mustExist true should cause MetaDataException
        repo.getQueryResultMapping(null, null, null, true);
    }

    /**
     * Test: getCachedQueryResultMapping returns null when mapping not present
     * Expected behavior: when no mapping exists for given class/name, null is returned.
     */
    @Test
    public void testGetCachedQueryResultMappingNotPresent() {
        QueryResultMapping r = repo.getCachedQueryResultMapping(Object.class, "nonexistent");
        assertNull("getCachedQueryResultMapping should return null for unknown mapping", r);
    }

    /**
     * Test: hasJoinColumn(FieldMapping)
     * Expected behavior: returns true when the field's value info has at least one column, false otherwise.
     */
    @Test
    public void testHasJoinColumnTrueAndFalse() {
        FieldMapping fmWithCols = new FieldMappingStub();
        fmWithCols.getValueInfo().setColumns(Collections.singletonList(new ColumnStub()));
        assertTrue("hasJoinColumn should return true when columns exist", repo.hasJoinColumn(fmWithCols));

        FieldMapping fmNoCols = new FieldMappingStub();
        fmNoCols.getValueInfo().setColumns(Collections.emptyList());
        assertFalse("hasJoinColumn should return false when no columns exist", repo.hasJoinColumn(fmNoCols));
    }

    /**
     * Test: hasJoinTable(FieldMapping)
     * Expected behavior: returns true when mapping info table identifier is non-null (DBIdentifier.isNull false),
     * false when table identifier is null.
     */
    @Test
    public void testHasJoinTableTrueAndFalse() {
        FieldMapping fmWithTable = new FieldMappingStub();
        fmWithTable.getMappingInfo().setTableIdentifier(new DBIdentifierStub("TBL"));
        assertTrue("hasJoinTable should return true when table identifier is non-null", repo.hasJoinTable(fmWithTable));

        FieldMapping fmNoTable = new FieldMappingStub();
        fmNoTable.getMappingInfo().setTableIdentifier(null);
        assertFalse("hasJoinTable should return false when table identifier is null", repo.hasJoinTable(fmNoTable));
    }

    /**
     * Test: isBidirectional(FieldMapping) when mappedByMapping is set
     * Expected behavior: returns true if field.getMappedByMapping() != null.
     */
    @Test
    public void testIsBidirectionalMappedBy() {
        FieldMappingStub owner = new FieldMappingStub();
        FieldMappingStub mapped = new FieldMappingStub();
        mapped.setMappedByMapping(owner);
        assertTrue("isBidirectional should return true when mappedByMapping is present", repo.isBidirectional(mapped));
    }

    /**
     * Test: isBidirectional when inverse type contains a field that maps back
     * Expected behavior: for ONE_TO_ONE or MANY_TO_ONE association types, if the inverse type mapping contains a field whose mappedByMapping equals the tested field, return true.
     */
    @Test
    public void testIsBidirectionalInverseField() {
        // create inverse class mapping with a field that maps back
        ClassMappingStub inverse = new ClassMappingStub();
        FieldMappingStub owner = new FieldMappingStub();
        owner.setAssociationType(FieldMetaData.ONE_TO_ONE);
        owner.setValueMapping(new ValueMappingStub(inverse));

        FieldMappingStub inverseField = new FieldMappingStub();
        inverseField.setMappedByMapping(owner);
        inverse.setFieldMappings(new FieldMapping[]{inverseField});

        assertTrue("isBidirectional should return true when inverse type contains a field that maps back", repo.isBidirectional(owner));
    }

    /**
     * Test: getCachedQueryResultMapping after adding mapping with class and name
     * Expected behavior: mapping added with addQueryResultMapping should be retrievable by getCachedQueryResultMapping.
     */
    @Test
    public void testCachedQueryResultMappingWithClassAndName() {
        repo.addQueryResultMapping(List.class, "listRes");
        QueryResultMapping cached = repo.getCachedQueryResultMapping(List.class, "listRes");
        assertNotNull("Cached mapping should be retrievable by class and name", cached);
        assertEquals("listRes", cached.getName());
    }

    // ---------------------------------------------------------------------
    // Minimal stubs used by tests to represent collaborators.
    // These are intentionally small and only implement the methods used by
    // the MappingRepository methods exercised above.
    // ---------------------------------------------------------------------

    /**
     * Minimal MappingDefaults stub used only for identity in tests.
     */
    public static class MappingDefaultsStub extends MappingDefaults {
        // no-op; used only as a marker instance
    }

    /**
     * Minimal DBIdentifier stub used by hasJoinTable tests.
     */
    public static class DBIdentifierStub extends DBIdentifier {
        private final String id;

        public DBIdentifierStub(String id) {
            super(id == null ? null : id);
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }
    }

    /**
     * Minimal Column stub used by hasJoinColumn tests.
     */
    public static class ColumnStub extends Column {
        public ColumnStub() {
            super();
        }
    }

    /**
     * Minimal FieldMapping stub implementing only the bits used by the tests.
     */
    public static class FieldMappingStub extends FieldMapping {
        private FieldMapping mappedBy;
        private int associationType = 0;
        private ValueMapping valueMapping;
        private FieldMappingInfo mappingInfo = new FieldMappingInfo();
        private ValueInfoStub valueInfo = new ValueInfoStub();

        public FieldMappingStub() {
            super("stub", Object.class, null);
        }

        @Override
        public FieldMapping getMappedByMapping() {
            return mappedBy;
        }

        public void setMappedByMapping(FieldMapping mappedBy) {
            this.mappedBy = mappedBy;
        }

        @Override
        public int getAssociationType() {
            return associationType;
        }

        public void setAssociationType(int associationType) {
            this.associationType = associationType;
        }

        @Override
        public ValueMapping getValueMapping() {
            return valueMapping;
        }

        public void setValueMapping(ValueMapping vm) {
            this.valueMapping = vm;
        }

        @Override
        public FieldMappingInfo getMappingInfo() {
            return mappingInfo;
        }

        @Override
        public ValueInfoStub getValueInfo() {
            return valueInfo;
        }
    }

    /**
     * Minimal ValueInfo stub used by FieldMappingStub.
     */
    public static class ValueInfoStub extends ValueInfo {
        private List<Column> cols = new ArrayList<>();

        @Override
        public List<Column> getColumns() {
            return cols;
        }

        public void setColumns(List<Column> cols) {
            this.cols = cols;
        }
    }

    /**
     * Minimal ValueMapping stub used by FieldMappingStub and tests.
     */
    public static class ValueMappingStub extends ValueMapping {
        private final ClassMapping typeMapping;
        private final ValueInfoStub valueInfo = new ValueInfoStub();

        public ValueMappingStub(ClassMapping typeMapping) {
            super(null);
            this.typeMapping = typeMapping;
        }

        @Override
        public ClassMapping getTypeMapping() {
            return typeMapping;
        }

        @Override
        public ValueInfo getValueInfo() {
            return valueInfo;
        }
    }

    /**
     * Minimal ClassMapping stub used by isBidirectional tests.
     */
    public static class ClassMappingStub extends ClassMapping {
        private FieldMapping[] fmds = new FieldMapping[0];

        public ClassMappingStub() {
            super(Object.class, null);
        }

        @Override
        public FieldMapping[] getFieldMappings() {
            return fmds;
        }

        public void setFieldMappings(FieldMapping[] fmds) {
            this.fmds = fmds;
        }
    }
}
