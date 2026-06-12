package org.apache.openjpa.jdbc.identifier;

import org.apache.openjpa.jdbc.schema.NameSet;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
import org.apache.openjpa.lib.identifier.IdentifierRule;
import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DBIdentifierUtilImplMTTest {


    private static final int COMPATIBLE_MAX_LEN = 20;

    private DBIdentifierUtilImpl util;
    private IdentifierConfiguration config;
    private IdentifierRule rule;



    @Before
    public void setUp() {
        /*
         * Qui creiamo mock e SUT nuovi, così ogni test parte da uno stato pulito.
         */
        config = mock(IdentifierConfiguration.class);
        rule = mock(IdentifierRule.class);

        /*
         * Configurazione del mock IdentifierConfiguration.
         */
        when(config.delimitAll()).thenReturn(false);
        when(config.getIdentifierRule(any())).thenReturn(rule);
        when(config.getDefaultIdentifierRule()).thenReturn(rule);


        when(config.delimitAll()).thenReturn(false);

        when(config.getLeadingDelimiter()).thenReturn("\"");
        when(config.getTrailingDelimiter()).thenReturn("\"");

        when(config.getSupportsDelimitedIdentifiers()).thenReturn(false);

        util = new DBIdentifierUtilImpl(config);
    }


    @After
    public void tearDown() {
        util = null;
        config = null;
    }




    @Test
    public void fromDBName_withLowerDelimitedCaseUpperSchemaCaseAndLowercaseName_returnsDelimitedIdentifier() {
        /*
         * Mutation-guided test 1
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, di tipo TABLE,
         *   delimitato e con nome pari a "\"customer\"".
         */
        when(config.getSupportsDelimitedIdentifiers()).thenReturn(true);
        when(config.getDelimitedCase()).thenReturn("lower");
        when(config.getSchemaCase()).thenReturn("upper");
        when(config.delimitAll()).thenReturn(false);

        DBIdentifier result = util.fromDBName(
                "customer",
                DBIdentifier.DBIdentifierType.TABLE
        );

        assertNotNull(result);
        assertEquals(DBIdentifier.DBIdentifierType.TABLE, result.getType());
        assertTrue(result.isDelimited());
        assertEquals("\"customer\"", result.getName());
    }

    @Test
    public void makeIdentifierValid_withDelimitedIdentifierAndUpperPolicy_returnsUpperDelimitedIdentifier() {
        /*
         * Mutation-guided test 2
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, di tipo TABLE,
         *   delimitato e con nome convertito in upper-case,
         *   pari a "\"CUSTOMER\"".
         */
        when(config.getDelimitedCase()).thenReturn("upper");

        DBIdentifier input = DBIdentifier.newIdentifier(
                "customer",
                DBIdentifier.DBIdentifierType.TABLE,
                false,
                true,
                false
        );

        DBIdentifier result = util.makeIdentifierValid(
                input,
                null,
                COMPATIBLE_MAX_LEN,
                false
        );

        assertNotNull(result);
        assertEquals(DBIdentifier.DBIdentifierType.TABLE, result.getType());
        assertTrue(result.isDelimited());
        assertEquals("\"CUSTOMER\"", result.getName());
    }

    @Test
    public void makeIdentifierValid_withTakenColumnAndTightMaxLen_truncatesBeforeAppendingVersion() {
        /*
         * Mutation-guided test 3
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, di tipo COLUMN,
         *   non delimitato, con nome pari a "ABCDE1" e lunghezza uguale a 6.
         */
        NameSet nameSet = mock(NameSet.class);

        when(nameSet.isNameTaken(any(DBIdentifier.class)))
                .thenReturn(true)
                .thenReturn(false);

        DBIdentifier input = DBIdentifier.newIdentifier(
                "abcdef",
                DBIdentifier.DBIdentifierType.COLUMN
        );

        DBIdentifier result = util.makeIdentifierValid(
                input,
                nameSet,
                6,
                true
        );

        assertNotNull(result);
        assertEquals(DBIdentifier.DBIdentifierType.COLUMN, result.getType());
        assertFalse(result.isDelimited());
        assertEquals("ABCDE1", result.getName());
        assertEquals(6, result.getName().length());
    }
}
