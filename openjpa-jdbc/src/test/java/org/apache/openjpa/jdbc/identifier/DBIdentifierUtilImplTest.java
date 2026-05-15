package org.apache.openjpa.jdbc.identifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
import org.apache.openjpa.lib.identifier.IdentifierRule;
import org.junit.Before;
import org.junit.Test;

public class DBIdentifierUtilImplTest {

    private static final String VALID_NON_DELIMITED_IDENTIFIER_NAME = "CUSTOMER";
    private static final String VALID_DELIMITED_IDENTIFIER_NAME = "CUSTOMER";
    private static final String EXPECTED_DELIMITED_IDENTIFIER_NAME = "\"CUSTOMER\"";
    private static final String VALID_SCHEMA_NAME = "PUBLIC";

    private static final int COMPATIBLE_MAX_LEN = 20;
    private static final int ZERO_MAX_LEN = 0;
    private static final int SHORT_MAX_LEN = 4;

    private DBIdentifierUtilImpl util;
    private IdentifierConfiguration config;
    private IdentifierRule rule;

    @Before
    public void setUp() {
        config = mock(IdentifierConfiguration.class);
        rule = mock(IdentifierRule.class);

        /*
         * Configurazione del mock IdentifierConfiguration.
         */
        when(config.delimitAll()).thenReturn(false);
        when(config.getIdentifierRule(any())).thenReturn(rule);
        when(config.getDefaultIdentifierRule()).thenReturn(rule);

        /*
         * Delimitatori dell'identificatore.
         *
         * Servono a IdentifierUtilImpl.isDelimited(...), che controlla se il nome
         * inizia/finisce con i delimitatori configurati.
         */
        when(config.getLeadingDelimiter()).thenReturn("\"");
        when(config.getTrailingDelimiter()).thenReturn("\"");

        /*
         * Policy di case per gli identificatori delimitati.
         */
        when(config.getDelimitedCase()).thenReturn("preserve");

        /*
         * Configurazione del mock IdentifierRule.
         */
        when(rule.getName()).thenReturn("TABLE");
        when(rule.getMaxLength()).thenReturn(COMPATIBLE_MAX_LEN);
        when(rule.getCanDelimit()).thenReturn(true);
        when(rule.getMustDelimit()).thenReturn(false);
        when(rule.getDelimitReservedWords()).thenReturn(false);

        /*
         * Il nome candidato condiviso deve essere trattato come nome ordinario:
         * non è una reserved word e non richiede delimitatori.
         */
        when(rule.isReservedWord(VALID_NON_DELIMITED_IDENTIFIER_NAME)).thenReturn(false);
        when(rule.requiresDelimiters(VALID_NON_DELIMITED_IDENTIFIER_NAME)).thenReturn(false);

        util = new DBIdentifierUtilImpl(config);
    }

    @Test
    public void makeIdentifierValid_withValidNonDelimitedTableIdentifierAndEmptySchemaGroup_returnsSameIdentifier() {
        /*
         * TC1 - Caso valido base
         *
         * Frame astratto:
         *   TF1 = <S3, N2, L3, U1>
         *
         * Category partition:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N2 = set valido, vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME)
         *   set = new SchemaGroup()
         *   maxLen = COMPATIBLE_MAX_LEN
         *   checkForUniqueness = true
         *
         * Nota:
         *   Poiché sname è un identificatore di tipo TABLE, il rappresentante concreto
         *   del parametro set deve essere SchemaGroup.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   equivalente all'identificatore di input.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        SchemaGroup set = new SchemaGroup();
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(
                sname,
                set,
                maxLen,
                checkForUniqueness
        );

        assertNotNull(result);
        assertEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
        assertFalse(result.isDelimited());

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }

    @Test
    public void makeIdentifierValid_withValidDelimitedTableIdentifierAndNonEmptySchemaGroup_returnsDelimitedIdentifier() {
        /*
         * TC2 - Nome delimitato, set non vuoto, maxLen zero
         *
         * Frame astratto:
         *   TF2 = <S4, N3, L2, U2>
         *
         * Category partition:
         *   S4 = sname valido, non vuoto, delimitato
         *   N3 = set valido, non vuoto
         *   L2 = maxLen valido/speciale, zero
         *   U2 = checkForUniqueness = false
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable(VALID_DELIMITED_IDENTIFIER_NAME, true)
         *   set = SchemaGroup non vuoto
         *   maxLen = ZERO_MAX_LEN
         *   checkForUniqueness = false
         *
         * Nota:
         *   Anche in questo test sname è un identificatore di tipo TABLE.
         *   Per questo motivo il rappresentante concreto del parametro set
         *   deve essere SchemaGroup.
         *
         * Scopo:
         *   verificare che il metodo gestisca un identificatore già delimitato,
         *   con maxLen = 0 e controllo di unicità disattivato.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, delimitato,
         *   e coerente con il nome candidato.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_DELIMITED_IDENTIFIER_NAME, true);

        SchemaGroup set = new SchemaGroup();
        set.addSchema(VALID_SCHEMA_NAME);

        int maxLen = ZERO_MAX_LEN;
        boolean checkForUniqueness = false;

        DBIdentifier result = util.makeIdentifierValid(
                sname,
                set,
                maxLen,
                checkForUniqueness
        );

        assertNotNull(result);
        assertEquals(EXPECTED_DELIMITED_IDENTIFIER_NAME, result.getName());
        assertTrue(result.isDelimited());

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }

    @Test
    public void makeIdentifierValid_withValidNonDelimitedIdentifierAndShortMaxLen_returnsIdentifierWithinMaxLen() {
        /*
         * TC3 - Identificatore più lungo di maxLen
         *
         * Qui non introduciamo un nuovo nome candidato.
         * Riutilizziamo il rappresentante condiviso:
         *   VALID_NON_DELIMITED_IDENTIFIER_NAME = "CUSTOMER"
         *
         * La condizione length(sname) > maxLen viene ottenuta scegliendo:
         *   sname = VALID_NON_DELIMITED_IDENTIFIER_NAME
         *   maxLen = SHORT_MAX_LEN
         *
         * Poiché "CUSTOMER" ha lunghezza 8, il vincolo SHORT_MAX_LEN = 4 forza
         * il metodo a produrre un identificatore compatibile con la lunghezza massima.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   con nome di lunghezza minore o uguale a SHORT_MAX_LEN.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        SchemaGroup set = new SchemaGroup();
        int maxLen = SHORT_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(
                sname,
                set,
                maxLen,
                checkForUniqueness
        );

        assertNotNull(result);
        assertFalse(result.isDelimited());
        assertTrue(result.getName().length() <= maxLen);

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }
}
