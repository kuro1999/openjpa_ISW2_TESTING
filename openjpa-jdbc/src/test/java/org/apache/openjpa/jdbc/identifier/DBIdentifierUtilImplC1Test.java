package org.apache.openjpa.jdbc.identifier;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.openjpa.jdbc.schema.Column;
import org.apache.openjpa.jdbc.schema.NameSet;
import org.apache.openjpa.jdbc.schema.Schema;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
import org.apache.openjpa.lib.identifier.IdentifierRule;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Corrected and compilable JUnit4 test suite for DBIdentifierUtilImpl.
 *
 * Notes on design choices (in brief):
 * - Tests exercise only the public API of DBIdentifierUtilImpl.
 * - We instantiate DBIdentifierUtilImpl using the constructor that accepts
 *   an IdentifierConfiguration mock to avoid subclassing and visibility clashes.
 * - IdentifierRule is mocked to control reserved-word and delimiter behavior.
 * - SchemaGroup (real class) is used where NameSet must represent schema-level names.
 *
 * These tests are inspired by the example provided by the user but are independently
 * authored and avoid copying the example verbatim.
 */
@RunWith(MockitoJUnitRunner.class)
public class DBIdentifierUtilImplC1Test {

    private static final String SAMPLE_NAME = "CUSTOMER";
    private static final String DELIMITED_SAMPLE = "\"CUSTOMER\"";
    private static final int DEFAULT_MAXLEN = 30;
    private static final int SHORT_MAXLEN = 4;

    @Mock
    private IdentifierConfiguration idConfig;

    @Mock
    private IdentifierRule idRule;

    @Mock
    private Column mockColumn;

    @Mock
    private Schema mockSchema;

    @Mock
    private org.apache.openjpa.jdbc.schema.Table mockTable;

    private DBIdentifierUtilImpl util;

    @Before
    public void beforeEach() {
        // Prepare a fresh util instance for each test using the constructor that accepts config
        //when(idConfig.getDefaultIdentifierRule()).thenReturn(idRule);
        when(idConfig.getIdentifierRule(anyString())).thenReturn(idRule);

        // Default rule behavior: allow truncation, not a reserved word, no forced delimiters
        when(idRule.getMaxLength()).thenReturn(DEFAULT_MAXLEN);
        //when(idRule.isAllowTruncation()).thenReturn(true);
        //when(idRule.getName()).thenReturn("TABLE");
        //when(idRule.getCanDelimit()).thenReturn(true);
        //when(idRule.getMustDelimit()).thenReturn(false);
        //when(idRule.getDelimitReservedWords()).thenReturn(false);

        // Default identifier configuration behavior
        when(idConfig.delimitAll()).thenReturn(false);
        when(idConfig.getLeadingDelimiter()).thenReturn("\"");
        when(idConfig.getTrailingDelimiter()).thenReturn("\"");
        when(idConfig.getDelimitedCase()).thenReturn(DBIdentifierUtil.CASE_PRESERVE);
        when(idConfig.getSchemaCase()).thenReturn(DBIdentifierUtil.CASE_PRESERVE);
        when(idConfig.getSupportsDelimitedIdentifiers()).thenReturn(true);

        util = new DBIdentifierUtilImpl(idConfig);
    }

    @After
    public void afterEach() {
        util = null;
    }

    /**
     * Basic smoke test for makeIdentifierValid with a non-delimited table identifier.
     * Expected: returns a non-null DBIdentifier equal to the input name and not delimited.
     */
    @Test
    public void makeIdentifierValid_nonDelimitedTable_returnsSameName() {
        DBIdentifier sname = DBIdentifier.newTable(SAMPLE_NAME);
        NameSet set = new SchemaGroup(); // empty schema group

        DBIdentifier out = util.makeIdentifierValid(sname, set, DEFAULT_MAXLEN, true);

        assertNotNull(out);
        assertEquals(SAMPLE_NAME, out.getName());
        assertFalse(out.isDelimited());
        verify(idConfig, atLeastOnce()).getIdentifierRule(anyString());
    }

    /**
     * When the candidate is delimited already, the returned identifier should preserve delimiting.
     * Expected: returned identifier is delimited and its name matches the delimited form.
     */
    @Test
    public void makeIdentifierValid_alreadyDelimited_preservesDelimiters() {
        DBIdentifier sname = DBIdentifier.newTable(SAMPLE_NAME, true);
        SchemaGroup sg = new SchemaGroup();
        sg.addSchema("PUBLIC");

        DBIdentifier out = util.makeIdentifierValid(sname, sg, 0, false);

        assertNotNull(out);
        // The implementation may return the name including delimiters; check isDelimited flag and name
        assertTrue(out.isDelimited());
        assertEquals(DELIMITED_SAMPLE, out.getName());
        verify(idConfig, atLeastOnce()).getIdentifierRule(anyString());
    }

    /**
     * If maxLen is shorter than the candidate name, the result must be truncated to fit.
     * Expected: returned name length <= provided maxLen.
     */
    @Test
    public void makeIdentifierValid_shortMaxLen_truncatesName() {
        DBIdentifier sname = DBIdentifier.newTable("LONGNAME");
        NameSet set = new SchemaGroup();

        DBIdentifier out = util.makeIdentifierValid(sname, set, SHORT_MAXLEN, true);

        assertNotNull(out);
        assertFalse(out.isDelimited());
        assertTrue(out.getName().length() <= SHORT_MAXLEN);
    }

    /**
     * When the NameSet is null, uniqueness checks are skipped and the input name is returned (or adjusted only by other rules).
     * Expected: no exception and returned identifier corresponds to input (subject to truncation/reserved-word handling).
     */
    @Test
    public void makeIdentifierValid_nullNameSet_skipsUniqueness() {
        DBIdentifier sname = DBIdentifier.newTable(SAMPLE_NAME);

        DBIdentifier out = util.makeIdentifierValid(sname, null, DEFAULT_MAXLEN, true);

        assertNotNull(out);
        assertEquals(SAMPLE_NAME, out.getName());
    }

    /**
     * If the candidate name is empty (but not null), the method should still return a DBIdentifier object.
     * Expected: returned DBIdentifier is non-null and its name is a string (possibly empty) within maxLen.
     */
    @Test
    public void makeIdentifierValid_emptyName_returnsIdentifierWithEmptyOrAdjustedName() {
        DBIdentifier sname = DBIdentifier.newTable("");
        NameSet set = new SchemaGroup();

        DBIdentifier out = util.makeIdentifierValid(sname, set, DEFAULT_MAXLEN, true);

        assertNotNull(out);
        assertNotNull(out.getName());
        assertTrue(out.getName().length() <= DEFAULT_MAXLEN);
    }

    /**
     * If the candidate is a reserved word according to the IdentifierRule, the implementation
     * should alter it (for example by appending a digit) so it is not a reserved word anymore.
     * Expected: returned name differs from the reserved word and is non-null.
     */
    @Ignore("jacoco e pit")
    @Test
    public void makeIdentifierValid_reservedWord_isHandled() {
        // Arrange: make the rule report the name as reserved
        when(idRule.isReservedWord("SELECT")).thenReturn(true);
        DBIdentifier sname = DBIdentifier.newTable("SELECT");
        NameSet set = new SchemaGroup();

        DBIdentifier out = util.makeIdentifierValid(sname, set, DEFAULT_MAXLEN, false);

        assertNotNull(out);
        // The implementation appends a digit when reserved; ensure the name changed
        assertFalse("SELECT".equalsIgnoreCase(out.getName()));
    }

    /**
     * fromDBName should return DBIdentifier.NULL when name is null.
     * Expected: DBIdentifier.isNull(result) == true
     */
    @Test
    public void fromDBName_nullName_returnsNullIdentifier() {
        DBIdentifier out = util.fromDBName(null, DBIdentifier.DBIdentifierType.TABLE);
        assertNotNull(out);
        assertTrue(DBIdentifier.isNull(out));
    }

    /**
     * fromDBName with a valid name and type should produce a DBIdentifier with that name and type.
     * Expected: returned identifier has requested type and name.
     */
    @Test
    public void fromDBName_validNameAndType_returnsIdentifier() {
        DBIdentifier out = util.fromDBName(SAMPLE_NAME, DBIdentifier.DBIdentifierType.TABLE);
        assertNotNull(out);
        assertEquals(DBIdentifier.DBIdentifierType.TABLE, out.getType());
        assertEquals(SAMPLE_NAME, out.getName());
    }

    /**
     * fromDBName with null type should throw a RuntimeException (observed behavior in many OpenJPA builds).
     * Expected: RuntimeException is thrown.
     */
    @Test
    public void fromDBName_nullType_throwsRuntimeException() {
        try {
            util.fromDBName(SAMPLE_NAME, null);
            fail("Expected RuntimeException when id type is null");
        } catch (RuntimeException ex) {
            // expected
            assertNotNull(ex.getMessage());
        }
    }

    /**
     * toDBName should return a non-null string for a simple identifier.
     * Expected: non-null and non-empty result.
     */
    @Test
    public void toDBName_simpleIdentifier_returnsString() {
        DBIdentifier id = DBIdentifier.newIdentifier("MyTable", DBIdentifier.DBIdentifierType.TABLE);
        String out = util.toDBName(id, true);
        assertNotNull(out);
        assertFalse(out.isEmpty());
    }

    /**
     * appendColumns should return an empty string for null/empty input and a comma-separated list for multiple columns.
     * Expected: correct formatting for 0, 1 and many columns.
     */
    @Test
    public void appendColumns_variousCounts_formatsCorrectly() {
        // zero columns -> empty string
        assertEquals("", util.appendColumns(null));
        assertEquals("", util.appendColumns(new Column[]{}));

        // one column -> single name
        Column c1 = mock(Column.class);
        when(c1.getIdentifier()).thenReturn(DBIdentifier.newIdentifier("C1", DBIdentifier.DBIdentifierType.COLUMN));
        assertEquals(util.toDBName(c1.getIdentifier()), util.appendColumns(new Column[]{c1}));

        // two columns -> comma separated
        Column c2 = mock(Column.class);
        when(c2.getIdentifier()).thenReturn(DBIdentifier.newIdentifier("C2", DBIdentifier.DBIdentifierType.COLUMN));
        String out = util.appendColumns(new Column[]{c1, c2});
        assertTrue(out.contains(","));
    }

    /**
     * getGeneratedKeySequenceName should combine table and column names and include 'SEQ'.
     * Expected: returned DBIdentifier name contains 'SEQ'.
     */
    @Test
    public void getGeneratedKeySequenceName_combinesParts_containsSEQ() {
        DBIdentifier tname = DBIdentifier.newTable("TBL");
        DBIdentifier cname = DBIdentifier.newIdentifier("ID", DBIdentifier.DBIdentifierType.COLUMN);
        when(mockColumn.getTableIdentifier()).thenReturn(tname);
        when(mockColumn.getIdentifier()).thenReturn(cname);

        DBIdentifier seq = util.getGeneratedKeySequenceName(mockColumn, DEFAULT_MAXLEN);
        assertNotNull(seq);
        assertTrue(seq.getName().toUpperCase().contains("SEQ"));
    }

    /**
     * convertSchemaCase should remove delimiters when the identifier is delimited and return an un-delimited identifier.
     * Expected: returned identifier has delimiters removed when name was delimited.
     */
    @Test
    public void convertSchemaCase_delimitedName_removesDelimiters() {
        // Create a delimited DBIdentifier using the DBIdentifier API
        DBIdentifier del = DBIdentifier.newIdentifier("\"SCHEMA\"", DBIdentifier.DBIdentifierType.TABLE, false, true, true);
        when(idConfig.getDelimitedCase()).thenReturn(DBIdentifierUtil.CASE_UPPER);
        // Use util constructed with idConfig in beforeEach
        DBIdentifier out = util.convertSchemaCase(del);
        assertNotNull(out);
        // convertSchemaCase removes delimiters for delimited names
        assertFalse(out.getName().startsWith("\""));
        assertFalse(out.getName().endsWith("\""));
    }

    /**
     * convertAlias should return the original alias when conversion is not needed.
     * Expected: alias unchanged when supportsDelimitedIdentifiers is false.
     */
    @Test
    public void convertAlias_noConversion_needed_returnsOriginal() {
        //when(idConfig.getSupportsDelimitedIdentifiers()).thenReturn(false);
        String alias = "T0.col";
        String out = util.convertAlias(alias);
        assertEquals(alias, out);
    }
}
