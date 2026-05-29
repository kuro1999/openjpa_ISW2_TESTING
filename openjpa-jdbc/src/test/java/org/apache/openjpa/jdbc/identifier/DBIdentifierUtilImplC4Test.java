package org.apache.openjpa.jdbc.identifier;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.openjpa.jdbc.conf.JDBCConfiguration;
import org.apache.openjpa.jdbc.identifier.DBIdentifier.DBIdentifierType;
import org.apache.openjpa.jdbc.schema.Column;
import org.apache.openjpa.jdbc.schema.NameSet;
import org.apache.openjpa.jdbc.schema.Schema;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.jdbc.schema.Table;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
import org.apache.openjpa.lib.identifier.IdentifierRule;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * DBIdentifierUtilImplC4Test
 *
 * Corrected comprehensive JUnit4 test suite for DBIdentifierUtilImpl.
 *
 * Notes:
 * - Uses Mockito for mocking dependencies.
 * - No reflection, no inner classes, no stubs; only Mockito mocks are used.
 * - Uses the correct Mockito runner import and correct method signatures.
 * - Each test includes a short comment describing the expected behavior.
 *
 * These tests are written against the provided DBIdentifierUtilImpl source and
 * assume the OpenJPA classes referenced in that source are available on the classpath.
 */
@RunWith(MockitoJUnitRunner.class)
public class DBIdentifierUtilImplC4Test {

    @Mock
    private IdentifierConfiguration idConfig;

    @Mock
    private IdentifierRule idRule;

    @Mock
    private NameSet nameSet;

    @Mock
    private Table table;

    @Mock
    private Table toTable;

    @Mock
    private Schema schema;

    @Mock
    private SchemaGroup schemaGroup;

    @Mock
    private Column column;

    private DBIdentifierUtilImpl util;

    @Before
    public void setUp() {
        // Default identifier configuration behavior used by many tests
        when(idConfig.getSupportsDelimitedIdentifiers()).thenReturn(false);
        when(idConfig.delimitAll()).thenReturn(false);
        when(idConfig.getDefaultIdentifierRule()).thenReturn(idRule);
        when(idRule.getName()).thenReturn("DEFAULT");
        when(idRule.getMaxLength()).thenReturn(30);
        when(idConfig.getIdentifierRule(anyString())).thenReturn(idRule);
        when(idConfig.getLeadingDelimiter()).thenReturn("\"");
        when(idConfig.getTrailingDelimiter()).thenReturn("\"");
        // Use literal strings for case values to avoid depending on constants that may be in other classes
        when(idConfig.getDelimitedCase()).thenReturn("preserve");
        //when(idConfig.getSchemaCase()).thenReturn("preserve");

        // Construct util with the mocked IdentifierConfiguration
        util = new DBIdentifierUtilImpl(idConfig);
    }

    /**
     * getValidColumnIdentifier: when name is DBIdentifier.NULL, it should return the same null identifier.
     * Expected: returns DBIdentifier.NULL without throwing.
     */
    @Test
    public void testGetValidColumnIdentifier_NullNameReturnsNull() {
        DBIdentifier nullId = DBIdentifier.NULL;
        DBIdentifier result = util.getValidColumnIdentifier(nullId, table, 10, true);
        assertSame("Should return the same NULL DBIdentifier", nullId, result);
    }

    /**
     * getValidForeignKeyIdentifier: basic flow constructs a name with prefix 'F' and delegates to makeIdentifierValid.
     * Expected: returns a non-null DBIdentifier of appropriate type (COLUMN or DEFAULT).
     *
     * Note: use correct 4-argument signature (name, table, toTable, maxLen).
     */
    @Test
    public void testGetValidForeignKeyIdentifier_Basic() {
        DBIdentifier base = DBIdentifier.newIdentifier("fk_col", DBIdentifierType.COLUMN);
        DBIdentifier tableId = DBIdentifier.newIdentifier("TBL", DBIdentifierType.TABLE);
        when(table.getIdentifier()).thenReturn(tableId);
        when(table.getSchema()).thenReturn(schema);
        when(schema.getSchemaGroup()).thenReturn(schemaGroup);

        when(idRule.getMaxLength()).thenReturn(20);
        // Call the correct overload with toTable parameter
        DBIdentifier result = util.getValidForeignKeyIdentifier(base, table, toTable, -1);
        assertNotNull("Foreign key identifier should not be null", result);
        assertNotSame("Should not return NULL identifier", DBIdentifier.NULL, result);
    }

    /**
     * getValidUniqueIdentifier: constructs a name with prefix 'U' and ensures uniqueness check path is exercised.
     * Expected: returns a non-null DBIdentifier.
     */
    @Test
    public void testGetValidUniqueIdentifier_Basic() {
        DBIdentifier base = DBIdentifier.newIdentifier("unique_col", DBIdentifierType.COLUMN);
        DBIdentifier tableId = DBIdentifier.newIdentifier("MYTABLE", DBIdentifierType.TABLE);
        when(table.getIdentifier()).thenReturn(tableId);
        when(table.getSchema()).thenReturn(schema);
        when(schema.getSchemaGroup()).thenReturn(schemaGroup);

        DBIdentifier result = util.getValidUniqueIdentifier(base, table, 30);
        assertNotNull("Unique identifier should not be null", result);
    }

    /**
     * getValidIndexIdentifier: constructs name with prefix 'I' and returns a valid DBIdentifier.
     * Expected: returns a non-null DBIdentifier.
     */
    @Test
    public void testGetValidIndexIdentifier_Basic() {
        DBIdentifier base = DBIdentifier.newIdentifier("idx_col", DBIdentifierType.COLUMN);
        DBIdentifier tableId = DBIdentifier.newIdentifier("IDXTABLE", DBIdentifierType.TABLE);
        when(table.getIdentifier()).thenReturn(tableId);
        when(table.getSchema()).thenReturn(schema);
        when(schema.getSchemaGroup()).thenReturn(schemaGroup);

        DBIdentifier result = util.getValidIndexIdentifier(base, table, 30);
        assertNotNull("Index identifier should not be null", result);
    }

    /**
     * getValidSequenceIdentifier: constructs sequence name with prefix 'S' and returns a valid DBIdentifier.
     * Expected: returns a non-null DBIdentifier of type SEQUENCE.
     */
    @Test
    public void testGetValidSequenceIdentifier_Basic() {
        DBIdentifier base = DBIdentifier.newIdentifier("seq_name", DBIdentifierType.SEQUENCE);
        when(schema.getSchemaGroup()).thenReturn(schemaGroup);

        DBIdentifier result = util.getValidSequenceIdentifier(base, schema, 30);
        assertNotNull("Sequence identifier should not be null", result);
        assertEquals("Type should be SEQUENCE", DBIdentifierType.SEQUENCE, result.getType());
    }

    /**
     * getValidTableIdentifier: constructs table name and returns a valid DBIdentifier.
     * Expected: returns a non-null DBIdentifier of type TABLE.
     */
    @Test
    public void testGetValidTableIdentifier_Basic() {
        DBIdentifier base = DBIdentifier.newIdentifier("table_name", DBIdentifierType.TABLE);
        when(schema.getSchemaGroup()).thenReturn(schemaGroup);

        DBIdentifier result = util.getValidTableIdentifier(base, schema, 30);
        assertNotNull("Table identifier should not be null", result);
        assertEquals("Type should be TABLE", DBIdentifierType.TABLE, result.getType());
    }

    /**
     * makeNameValid: verifies mapping of nameType to DBIdentifierType and that a DBIdentifier is returned.
     * Expected: returns a DBIdentifier (non-null) and does not throw for valid inputs.
     */
    @Test
    public void testMakeNameValid_TypeMapping() {
        DBIdentifier result = util.makeNameValid("somename", nameSet, 10, DBIdentifierUtil.TABLE, false);
        assertNotNull("makeNameValid should return a DBIdentifier", result);
    }

    /**
     * makeIdentifierValid: passing null should throw RuntimeException as per source.
     * Expected: RuntimeException thrown.
     */
    @Test(expected = RuntimeException.class)
    public void testMakeIdentifierValid_NullThrows() {
        util.makeIdentifierValid(null, nameSet, 10, true);
    }

    /**
     * isReservedWord: when IdentifierRule is null, should return false.
     * Expected: returns false when no rule is found.
     */
    @Test
    public void testIsReservedWord_RuleNullReturnsFalse() {
        when(idConfig.getIdentifierRule("SOME")).thenReturn(null);
        DBIdentifierUtilImpl localUtil = new DBIdentifierUtilImpl(idConfig);
        boolean res = localUtil.isReservedWord("SOME", "SELECT");
        assertFalse("If IdentifierRule is null, isReservedWord should return false", res);
    }

    /**
     * toDBName(DBIdentifier): when DBIdentifier is NULL, should return null.
     * Expected: returns null.
     */
    @Test
    public void testToDBName_DBIdentifierNullReturnsNull() {
        String res = util.toDBName(DBIdentifier.NULL);
        assertNull("toDBName should return null for DBIdentifier.NULL", res);
    }

    /**
     * toDBName(String): when name is null, should return null.
     * Expected: returns null.
     */
    @Test
    public void testToDBName_StringNullReturnsNull() {
        String res = util.toDBName((String) null, true);
        assertNull("toDBName should return null for null string", res);
    }

    /**
     * fromDBName: when name is null, should return DBIdentifier.NULL.
     * Expected: returns DBIdentifier.NULL.
     */
    @Test
    public void testFromDBName_NullNameReturnsNullIdentifier() {
        DBIdentifier res = util.fromDBName(null, DBIdentifierType.TABLE);
        assertSame("fromDBName should return DBIdentifier.NULL for null name", DBIdentifier.NULL, res);
    }

    /**
     * fromDBName: when id is null, should throw RuntimeException.
     * Expected: RuntimeException thrown.
     */
    @Test(expected = RuntimeException.class)
    public void testFromDBName_NullIdThrows() {
        util.fromDBName("NAME", null);
    }

    /**
     * append: when names is null or empty, should return DBIdentifier.NULL.
     * Expected: returns DBIdentifier.NULL for null/empty input.
     */
    @Test
    public void testAppend_NullOrEmptyReturnsNullIdentifier() {
        DBIdentifier res1 = util.append(DBIdentifierType.COLUMN, (DBIdentifier[]) null);
        assertSame(DBIdentifier.NULL, res1);
        DBIdentifier res2 = util.append(DBIdentifierType.COLUMN);
        assertSame(DBIdentifier.NULL, res2);
    }

    /**
     * append: concatenates provided DBIdentifier names into a single DBIdentifier.
     * Expected: returned DBIdentifier contains concatenated parts.
     */
    @Ignore("jacoco e pit")
    @Test
    public void testAppend_ConcatenatesNames() {
        DBIdentifier a = DBIdentifier.newIdentifier("A", DBIdentifierType.COLUMN);
        DBIdentifier b = DBIdentifier.newIdentifier("B", DBIdentifierType.COLUMN);
        DBIdentifier res = util.append(DBIdentifierType.COLUMN, a, b);
        assertNotNull(res);
        assertTrue("Combined name should contain at least one part", res.getName().length() >= 1);
    }

    /**
     * appendColumns: null or empty returns empty string; single column returns its DB name.
     * Expected: "" for null/empty; toDBName(column.getIdentifier()) for single column.
     */
    @Test
    public void testAppendColumns_NullEmptyAndSingle() {
        assertEquals("", util.appendColumns((Column[]) null));
        assertEquals("", util.appendColumns(new Column[0]));

        Column single = mock(Column.class);
        DBIdentifier id = DBIdentifier.newIdentifier("COL1", DBIdentifierType.COLUMN);
        when(single.getIdentifier()).thenReturn(id);
        assertEquals(util.toDBName(id), util.appendColumns(new Column[] { single }));
    }

    /**
     * delimit(rule, name, force): when force=true, should return a delimited string using configured delimiters.
     * Expected: returned string contains the original name and configured delimiters.
     */
    @Test
    public void testDelimit_ForceAddsDelimiters() {
        String res = util.delimit("DEFAULT", "myname", true);
        assertNotNull(res);
        assertTrue("When force=true, delimit should wrap with configured delimiters", res.startsWith("\"") && res.endsWith("\""));
        assertTrue(res.contains("myname"));
    }

    /**
     * shorten: delegates to DBDictionary.shorten; ensure it returns a non-null string for a sample.
     * Expected: returns a non-null string not longer than targetLength.
     */
    @Test
    public void testShorten_Basic() {
        String shortened = util.shorten("ABCDEFGHIJK", 5);
        assertNotNull("shorten should return a non-null string", shortened);
        assertTrue("shortened length should be <= targetLength", shortened.length() <= 5);
    }


    /**
     * convertSchemaCase: when name is DBIdentifier.NULL, returns DBIdentifier.NULL.
     * Expected: returns DBIdentifier.NULL.
     */
    @Test
    public void testConvertSchemaCase_NullReturnsNull() {
        DBIdentifier res = util.convertSchemaCase(DBIdentifier.NULL);
        assertSame(DBIdentifier.NULL, res);
    }

    /**
     * convertAlias: when alias does not require conversion, returns alias unchanged.
     * Expected: returns the same alias when no conversion is needed.
     */
    @Test
    public void testConvertAlias_NoConversionNeededReturnsSame() {
        String alias = "T0";
        String res = util.convertAlias(alias);
        assertEquals("If no conversion needed, alias should be returned unchanged", alias, res);
    }

    /**
     * getConfiguration and setConfiguration: setConfiguration should store the JDBCConfiguration instance.
     * Expected: getConfiguration returns the same object set via setConfiguration.
     */
    @Test
    public void testGetSetConfiguration() {
        DBIdentifierUtilImpl local = new DBIdentifierUtilImpl(idConfig);
        JDBCConfiguration jdbcConf = mock(JDBCConfiguration.class);
        local.setConfiguration(jdbcConf);
        assertSame("getConfiguration should return the same object set via setConfiguration", jdbcConf, local.getConfiguration());
    }

    /**
     * Edge case: ensure uniqueness loop handles NameSet.isNameTaken returning true then false.
     * Expected: makeIdentifierValid returns a different name when uniqueness required.
     */
    @Test
    public void testMakeIdentifierValid_UniquenessLoop() {
        DBIdentifier base = DBIdentifier.newIdentifier("DUPNAME", DBIdentifierType.COLUMN);
        when(nameSet.isNameTaken(any(DBIdentifier.class))).thenReturn(true, false);

        DBIdentifier result = util.makeIdentifierValid(base, nameSet, 10, true);
        assertNotNull("Result should be non-null after uniqueness resolution", result);
        assertNotEquals("Result name should differ if uniqueness was required", base.getName(), result.getName());
    }

    /**
     * Edge case: makeIdentifierValid with a delimited identifier should apply delimited case rules.
     * Expected: when delimitedCase is 'lower', returned delimited identifier is lower-cased.
     */
    @Test
    public void testMakeIdentifierValid_DelimitedCaseApplied() {
        // Create a delimited identifier (simulate by setting isDelimited true via DBIdentifier API)
        DBIdentifier del = DBIdentifier.newIdentifier("\"MyName\"", DBIdentifierType.COLUMN, false, true, true);
        when(idConfig.getDelimitedCase()).thenReturn("lower");
        DBIdentifierUtilImpl local = new DBIdentifierUtilImpl(idConfig);

        DBIdentifier res = local.makeIdentifierValid(del, null, 30, false);
        assertNotNull(res);
        // The returned identifier should be delimited and lower-cased inside delimiters
        DBIdentifier lowered = DBIdentifier.toLower(res, true);
        assertEquals("Delimited case lower should be applied", lowered.getName(), res.getName());
    }
}
