package org.apache.openjpa.jdbc.identifier;

import org.apache.openjpa.jdbc.schema.NameSet;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
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


    @Before
    public void setUp() {
        /*
         * Qui creiamo mock e SUT nuovi, così ogni test parte da uno stato pulito.
         */
        config = mock(IdentifierConfiguration.class);

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
         * Obiettivo:
         *   rafforzare fromDBName(...) sui rami:
         *     else if (delimCase.equals(CASE_LOWER))
         *     if (nonDelimCase.equals(CASE_UPPER))
         *
         * Caso:
         *   delimitedCase = lower
         *   schemaCase = upper
         *   delimitAll = false
         *   name = "customer"
         *
         * In questo scenario caseName diventa "CUSTOMER", quindi è diverso
         * dal nome originale "customer". La differenza deve causare la
         * delimitazione dell'identificatore.
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
         * Obiettivo:
         *   rafforzare il ramo:
         *     if (validName.isDelimited())
         *     else if (delimCase.equals(CASE_UPPER))
         *
         * Caso:
         *   identificatore delimitato
         *   delimitedCase = upper
         *
         * Oracolo:
         *   il nome deve restare delimitato e deve essere convertito in upper-case.
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
         * Obiettivo:
         *   rafforzare la logica:
         *     if (nameLen + chars > maxLen)
         *         validName = DBIdentifier.truncate(...);
         *
         * Caso:
         *   name = "abcdef"
         *   maxLen = 6
         *   il nome iniziale è già lungo quanto maxLen
         *   il primo nome è già occupato
         *
         * Oracolo:
         *   per aggiungere il suffisso "1", il metodo deve prima troncare
         *   "abcdef" in "abcde", poi produrre "abcde1", infine convertirlo
         *   in upper-case.
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
