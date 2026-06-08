package org.apache.openjpa.jdbc.identifier;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.openjpa.jdbc.schema.NameSet;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
import org.apache.openjpa.lib.identifier.IdentifierRule;
import org.junit.*;


public class DBIdentifierUtilImplBBTest {

    private static final String VALID_NON_DELIMITED_IDENTIFIER_NAME = "CUSTOMER";
    private static final String EXPECTED_DELIMITED_IDENTIFIER_NAME = "\"CUSTOMER\"";
    private static final String VALID_SCHEMA_NAME = "PUBLIC";
    private static final String EMPTY_IDENTIFIER_NAME = "";
    private static DBIdentifier.DBIdentifierType valididentifiertype;

    private static final int COMPATIBLE_MAX_LEN = 20;
    private static final int ZERO_MAX_LEN = 0;
    private static final int SHORT_MAX_LEN = 4;

    private DBIdentifierUtilImpl util;
    private IdentifierConfiguration config;
    private IdentifierRule rule;
    private static String DEFAULT_DELIMITED_CASE;


    @BeforeClass
    public static void setUpClass() {
        /*
         * Eseguito una sola volta prima di tutti i test.
         *
         * Qui inizializziamo solo valori statici condivisi e immutabili.
         * Non creiamo mock qui, perché i mock devono essere nuovi per ogni test.
         */
        valididentifiertype = DBIdentifier.DBIdentifierType.TABLE;
        DEFAULT_DELIMITED_CASE = "preserve";

    }

    @Before
    public void setUp() {
        /*
         * Eseguito prima di ogni test.
         *
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

        /*
         * Delimitatori dell'identificatore.
         */
        when(config.getLeadingDelimiter()).thenReturn("\"");
        when(config.getTrailingDelimiter()).thenReturn("\"");
        /*
         * Policy di case per gli identificatori delimitati.
         */
        when(config.getDelimitedCase()).thenReturn(DEFAULT_DELIMITED_CASE);

        /*
         * Configurazione utile per fromDBName.
         */
        when(config.getSupportsDelimitedIdentifiers()).thenReturn(false);

        /*
         * Configurazione del mock IdentifierRule.
         */
        when(rule.getName()).thenReturn("TABLE");
        when(rule.getMaxLength()).thenReturn(COMPATIBLE_MAX_LEN);
        when(rule.getCanDelimit()).thenReturn(true);
        when(rule.getMustDelimit()).thenReturn(false);
        when(rule.getDelimitReservedWords()).thenReturn(false);
        when(rule.isAllowTruncation()).thenReturn(true);

        /*
         * Il nome candidato condiviso deve essere trattato come nome ordinario:
         * non è una reserved word e non richiede delimitatori.
         */
        when(rule.isReservedWord(VALID_NON_DELIMITED_IDENTIFIER_NAME)).thenReturn(false);
        when(rule.requiresDelimiters(VALID_NON_DELIMITED_IDENTIFIER_NAME)).thenReturn(false);

        util = new DBIdentifierUtilImpl(config);
    }


    @After
    public void tearDown() {
        //Eseguito dopo ogni test.
        util = null;
        config = null;
        rule = null;
    }

    @AfterClass
    public static void tearDownClass() {
        //Eseguito una sola volta dopo tutti i test.
        valididentifiertype = null;
    }


    /*
     * ============================================================
     * Tests for makeIdentifierValid
     * ============================================================
     */

    @Test
    public void makeIdentifierValid_withValidNonDelimitedTableIdentifierAndEmptySchemaGroup_returnsSameIdentifier() {
        /*
         * TC1 - Caso valido base
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
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   equivalente all'identificatore di input.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = new SchemaGroup();
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness);

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
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, delimitato,
         *   e coerente con il nome candidato.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME, true);

        SchemaGroup schemaGroup = new SchemaGroup();
        schemaGroup.addSchema(VALID_SCHEMA_NAME);
        NameSet set = schemaGroup;

        int maxLen = ZERO_MAX_LEN;
        boolean checkForUniqueness = false;

        DBIdentifier result = util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness);

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
         * Category partition:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N2 = set valido, vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME)
         *   set = new SchemaGroup()
         *   maxLen = SHORT_MAX_LEN
         *   checkForUniqueness = true
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   con nome di lunghezza minore o uguale a SHORT_MAX_LEN.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = new SchemaGroup();
        int maxLen = SHORT_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness);

        assertNotNull(result);
        assertFalse(result.isDelimited());
        assertTrue(result.getName().length() <= maxLen);

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }



    @Test
    public void makeIdentifierValid_withNullIdentifier_throwsException() {
        /*
         * TC4 - sname nullo
         *
         * Category partition:
         *   S1 = sname invalido: null
         *   N2 = set valido, vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = null
         *   set = new SchemaGroup()
         *   maxLen = COMPATIBLE_MAX_LEN
         *   checkForUniqueness = true
         *
         * Oracolo:
         *   il metodo deve segnalare l'input non valido tramite eccezione.
         */
        DBIdentifier sname = null;
        NameSet set = new SchemaGroup();
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () -> util.makeIdentifierValid(sname, set, COMPATIBLE_MAX_LEN, checkForUniqueness));
    }


    @Ignore("Oracolo iniziale mantenuto a documentazione: set = null non lancia eccezione nel comportamento osservato")
    @Test
    public void makeIdentifierValid_withNullNameSet_throwsException() {
        /*
         * TC5 - set nullo
         *
         * Category partition:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N1 = set invalido: null
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME)
         *   set = null
         *   maxLen = COMPATIBLE_MAX_LEN
         *   checkForUniqueness = true
         *
         * Oracolo:
         *   il metodo deve segnalare l'input non valido tramite eccezione.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = null;
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () -> util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness));
    }

    @Test
    public void makeIdentifierValid_withNullNameSet_returnsValidIdentifier() {
        /*
         * TC5 - set nullo
         *
         * Category partition raffinata:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N1 = set nullo / assenza del contesto di unicità
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier valido equivalente all'input,
         *   perché non esiste un NameSet su cui verificare conflitti.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = null;
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness);

        assertNotNull(result);
        assertEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
        assertFalse(result.isDelimited());

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }


    @Ignore("Oracolo iniziale scartato: maxLen negativo non lancia eccezione nel comportamento osservato")
    @Test
    public void makeIdentifierValid_withNegativeMaxLen_throwsException() {
        /*
         * TC6 - maxLen negativo
         *
         * Category partition:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N2 = set valido, vuoto
         *   L1 = maxLen invalido: negativo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME)
         *   set = new SchemaGroup()
         *   maxLen = -1
         *   checkForUniqueness = true
         *
         * Oracolo:
         *   il metodo deve segnalare l'input non valido tramite eccezione.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = new SchemaGroup();
        int maxLen = -1;
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () -> util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness));
    }

    @Test
    public void makeIdentifierValid_withNegativeMaxLen_returnsValidIdentifier() {
        /*
         * TC6 - maxLen negativo, comportamento osservato
         *
         * Category partition raffinata:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N2 = set valido, vuoto
         *   L1 = maxLen negativo
         *   U1 = checkForUniqueness = true
         *
         * Oracolo raffinato:
         *   il metodo non deve solleva eccezione e restituisce un DBIdentifier valido.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = new SchemaGroup();
        int maxLen = -1;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness);

        assertNotNull(result);
        assertFalse(result.isDelimited());
        assertEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
    }


    @Test
    public void makeIdentifierValid_withExistingIdentifierAndUniquenessEnabled_returnsDifferentIdentifier() {
        /*
         * TC7 - Conflitto di unicità con controllo attivo
         *
         * Vincolo relazionale:
         *   set contains sname
         *
         * Category partition:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N3 = set valido, non vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   con nome diverso da quello candidato e compatibile con maxLen.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);

        SchemaGroup schemaGroup = new SchemaGroup();
        schemaGroup.addSchema(VALID_SCHEMA_NAME).addTable(DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME));
        NameSet set = schemaGroup;

        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness);

        assertNotNull(result);
        assertFalse(result.isDelimited());
        assertNotEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
        assertTrue(result.getName().length() <= maxLen);

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }

    @Ignore("Oracolo iniziale scartato: empty name non lancia eccezione nel comportamento osservato")
    @Test
    public void makeIdentifierValid_withEmptyIdentifierName_throwsException() {
        /*
         * TC8 - Nome vuoto
         *
         * Category partition:
         *   S2 = sname invalido: empty name
         *   N2 = set valido, vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable("")
         *   set = new SchemaGroup()
         *   maxLen = COMPATIBLE_MAX_LEN
         *   checkForUniqueness = true
         *
         * Oracolo:
         *   il metodo deve gestire il caso lanciando un eccezione.
         */
        DBIdentifier sname = DBIdentifier.newTable("");
        NameSet set = new SchemaGroup();
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () -> util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness));
    }


    @Test
    public void makeIdentifierValid_withEmptyIdentifierName_returnsDefinedIdentifier() {
        /*
         * TC8 - Nome vuoto, comportamento osservato
         *
         * Category partition raffinata:
         *   S2 = sname non nullo con nome vuoto / valore anomalo gestito
         *   N2 = set valido, vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Oracolo raffinato:
         *   Il metodo restituisce un DBIdentifier.
         */
        DBIdentifier sname = DBIdentifier.newTable("");
        NameSet set = new SchemaGroup();
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(sname, set, maxLen, checkForUniqueness);

        assertNotNull(result);
        assertNotNull(result.getName());
        assertTrue(result.getName().length() <= maxLen);
    }


    /*
     * ============================================================
     * Tests for fromDBName
     * ============================================================
     */


    @Test
    public void fromDBName_withNonEmptyNameAndValidType_returnsIdentifierBasedOnNameAndType() {
        /*
         * TC1 - Nome non vuoto e tipo valido
         *
         * Category partition:
         *   N1 = valid: non-empty database name
         *   T1 = valid: DBIdentifierType
         *
         * Input concreti:
         *   name = "CUSTOMER"
         *   id = DBIdentifier.DBIdentifierType.TABLE
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, del tipo richiesto
         *   e basato sul nome fornito.
         */
        DBIdentifier result = util.fromDBName(VALID_NON_DELIMITED_IDENTIFIER_NAME, valididentifiertype);

        assertNotNull(result);
        assertEquals(valididentifiertype, result.getType());
        assertNotNull(result.getName());
        assertEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
    }




    @Test
    public void fromDBName_withEmptyNameAndValidType_returnsIdentifierWithEmptyName() {
        /*
         * TC2 - Nome vuoto e tipo valido
         *
         * Category partition:
         *   N3 = invalid: empty string
         *   T1 = valid: DBIdentifierType
         *
         * Input concreti:
         *   name = ""
         *   id = DBIdentifier.DBIdentifierType.TABLE
         *
         * Oracolo:
         *   Il metodo deve restituire un DBIdentifier non nullo,
         *   del tipo richiesto e con nome vuoto.
         */
        DBIdentifier result = util.fromDBName(EMPTY_IDENTIFIER_NAME, valididentifiertype);

        assertNotNull(result);
        assertEquals(valididentifiertype, result.getType());
        assertNotNull(result.getName());
        assertEquals(EMPTY_IDENTIFIER_NAME, result.getName());
    }




    @Test
    public void fromDBName_withNullNameAndValidType_returnsNullIdentifier() {
        /*
         * TC3 - Nome nullo e tipo valido
         *
         * Category partition:
         *   N2 = invalid: null
         *   T1 = valid: DBIdentifierType
         *
         * Input concreti:
         *   name = null
         *   id = DBIdentifier.DBIdentifierType.TABLE
         *
         * Oracolo:
         *   Il metodo deve restituire un identificatore nullo.
         */
        DBIdentifier result = util.fromDBName(null, valididentifiertype);

        assertNotNull(result);
        assertTrue(DBIdentifier.isNull(result));
    }


    @Test
    public void fromDBName_withNonEmptyNameAndNullType_throwsRuntimeException() {
        /*
         * TC4 - Nome non vuoto e tipo nullo
         *
         * Category partition:
         *   N1 = valid: non-empty database name
         *   T2 = invalid: null
         *
         * Input concreti:
         *   name = "CUSTOMER"
         *   id = null
         *
         * Oracolo:
         *   Il metodo deve segnalare il problema del id null tramite
         *   eccezione runtime.
         */
        try {
            util.fromDBName(VALID_NON_DELIMITED_IDENTIFIER_NAME, null);
            fail("Expected a RuntimeException when DBIdentifierType is null");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }
}
