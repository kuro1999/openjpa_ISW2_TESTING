package org.apache.openjpa.jdbc.identifier;

import org.apache.openjpa.jdbc.schema.NameSet;
import org.apache.openjpa.jdbc.schema.Schema;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
import org.apache.openjpa.lib.identifier.IdentifierRule;
import org.junit.*;

import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class DBIdentifierUtilImplCFTest {

    private static final String VALID_NON_DELIMITED_IDENTIFIER_NAME = "CUSTOMER";
    private static final String RESERVED_IDENTIFIER_NAME = "SELECT";
    private static final String EXPECTED_RESERVED_IDENTIFIER_NAME = "SELECT0";
    private static final String FIRST_UNIQUE_VARIANT_NAME =
            VALID_NON_DELIMITED_IDENTIFIER_NAME + "1";
    private static DBIdentifier.DBIdentifierType VALID_IDENTIFIER_TYPE;
    private static final String VALID_SCHEMA_NAME = "PUBLIC";

    private static final String SECOND_UNIQUE_VARIANT_NAME =
            VALID_NON_DELIMITED_IDENTIFIER_NAME + "2";

    private static final int COMPATIBLE_MAX_LEN = 20;

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
        VALID_IDENTIFIER_TYPE = DBIdentifier.DBIdentifierType.TABLE;
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
         * Configurazione utile per fromDBName(...).
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
        VALID_IDENTIFIER_TYPE = null;
        DEFAULT_DELIMITED_CASE = null;
    }

    /*
     * ============================================================
     * Tests for makeIdentifierValid
     * ============================================================
     */

    @Test
    public void makeIdentifierValid_withReservedWordIdentifier_returnsIdentifierWithSuffix() {
        /*
         * TC9 - Identificatore corrispondente a reserved word
         *
         * Frame astratto:
         *   TF9 = <S5, N2, L3, U1>
         *
         * Category partition raffinata:
         *   S5 = sname valido, non vuoto, non delimitato, ma reserved word
         *   N2 = set valido, vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable("SELECT")
         *   set = new SchemaGroup()
         *   maxLen = COMPATIBLE_MAX_LEN
         *   checkForUniqueness = true
         *
         * Scopo:
         *   coprire il ramo del metodo in cui il nome candidato viene riconosciuto
         *   come reserved word.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   con nome modificato rispetto alla reserved word originale.
         *   Nel comportamento atteso, "SELECT" viene trasformato in "SELECT0".
         */
        configureReservedWordScenario();

        DBIdentifier sname = DBIdentifier.newTable(RESERVED_IDENTIFIER_NAME);
        NameSet set = new SchemaGroup();
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(
                sname,
                set,
                maxLen,
                checkForUniqueness
        );

        assertNotNull(result);
        assertEquals(EXPECTED_RESERVED_IDENTIFIER_NAME, result.getName());
        assertFalse(result.isDelimited());

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }

    private void configureReservedWordScenario() {
        /*
         * Setup specifico per TC9.
         *
         * Nel setUp generale le reserved words sono disattivate:
         *   rule.getDelimitReservedWords() = false
         *
         * Per TC9 vogliamo invece forzare il ramo in cui il nome candidato
         * viene riconosciuto come reserved word.
         */
        when(rule.getDelimitReservedWords()).thenReturn(true);
        when(rule.getReservedWords()).thenReturn(Collections.singleton(RESERVED_IDENTIFIER_NAME));
        when(rule.isReservedWord(RESERVED_IDENTIFIER_NAME)).thenReturn(true);
        when(rule.requiresDelimiters(RESERVED_IDENTIFIER_NAME)).thenReturn(false);
    }

    @Test
    public void makeIdentifierValid_withExistingIdentifierAndExistingFirstVariant_returnsSecondVariant() {
        /*
         * TC10 - Conflitto di unicità con più varianti già presenti
         *
         * Frame astratto:
         *   TF10 = <S3, N3, L3, U1>
         *
         * Vincolo relazionale:
         *   set contains CUSTOMER
         *   set contains CUSTOMER1
         *
         * Category partition:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N3 = set valido, non vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Input concreti:
         *   sname = DBIdentifier.newTable("CUSTOMER")
         *   set = SchemaGroup contenente già CUSTOMER e CUSTOMER1
         *   maxLen = COMPATIBLE_MAX_LEN
         *   checkForUniqueness = true
         *
         * Scopo:
         *   verificare che il metodo prosegua il ciclo di generazione del nome
         *   quando sia il nome originale sia la prima variante sono già presenti.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   con nome CUSTOMER2.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);

        SchemaGroup schemaGroup = new SchemaGroup();
        Schema schema = schemaGroup.addSchema(VALID_SCHEMA_NAME);

        schema.addTable(DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME));
        schema.addTable(DBIdentifier.newTable(FIRST_UNIQUE_VARIANT_NAME));

        NameSet set = schemaGroup;

        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(
                sname,
                set,
                maxLen,
                checkForUniqueness
        );

        assertNotNull(result);
        assertFalse(result.isDelimited());
        assertEquals(SECOND_UNIQUE_VARIANT_NAME, result.getName());
        assertTrue(result.getName().length() <= maxLen);

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }

    /*
     * ============================================================
     * Tests for fromDBName
     * ============================================================
     */

    @Test
    public void fromDBName_withSupportedDelimitedIdentifiersAndSameCase_returnsNonDelimitedIdentifier() {
        /*
         * WB1 - Supporto delimitatori attivo e stessa policy di case
         *
         * Ramo target:
         *   if (delimCase.equals(nonDelimCase))
         *
         * Configurazione:
         *   supportsDelimitedIdentifiers = true
         *   delimitedCase = preserve
         *   schemaCase = preserve
         *
         * Scopo:
         *   coprire il ramo in cui la policy per identificatori delimitati e
         *   non delimitati coincide. In questo caso il metodo non deve introdurre
         *   delimitazione aggiuntiva.
         */
        when(config.getSupportsDelimitedIdentifiers()).thenReturn(true);
        when(config.getDelimitedCase()).thenReturn(DEFAULT_DELIMITED_CASE);
        when(config.getSchemaCase()).thenReturn(DEFAULT_DELIMITED_CASE);

        DBIdentifier result = util.fromDBName(
                VALID_NON_DELIMITED_IDENTIFIER_NAME,
                VALID_IDENTIFIER_TYPE
        );

        assertNotNull(result);
        assertEquals(VALID_IDENTIFIER_TYPE, result.getType());
        assertEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
        assertFalse(result.isDelimited());
    }

    @Test
    public void fromDBName_withPreserveDelimitedCaseAndLowerSchemaCase_returnsDelimitedIdentifier() {
        /*
         * WB2 - Delimited case preserve e schema case lower
         *
         * Ramo target:
         *   if (delimCase.equals(CASE_PRESERVE)) {
         *       if (nonDelimCase.equals(CASE_LOWER)) {
         *           caseName = name.toLowerCase();
         *       }
         *   }
         *
         * Configurazione:
         *   supportsDelimitedIdentifiers = true
         *   delimitedCase = preserve
         *   schemaCase = lower
         *   delimitAll = false
         *
         * Scopo:
         *   coprire il ramo in cui il nome atteso secondo lo schema case sarebbe
         *   lowercase, ma il nome ricevuto dal database è diverso. Il metodo preserva
         *   il nome originale marcandolo come delimitato.
         */
        when(config.getSupportsDelimitedIdentifiers()).thenReturn(true);
        when(config.getDelimitedCase()).thenReturn(DEFAULT_DELIMITED_CASE);
        when(config.getSchemaCase()).thenReturn("lower");
        when(config.delimitAll()).thenReturn(false);

        DBIdentifier result = util.fromDBName(
                VALID_NON_DELIMITED_IDENTIFIER_NAME,
                VALID_IDENTIFIER_TYPE
        );

        assertNotNull(result);
        assertEquals(VALID_IDENTIFIER_TYPE, result.getType());
        assertEquals("\"" + VALID_NON_DELIMITED_IDENTIFIER_NAME + "\"", result.getName());
        assertTrue(result.isDelimited());
    }

    @Test
    public void fromDBName_withDelimitAllTrue_returnsDelimitedIdentifier() {
        /*
         * WB3 - Delimitazione forzata da delimitAll()
         *
         * Ramo target:
         *   boolean delimit = !caseName.equals(name)
         *           || getIdentifierConfiguration().delimitAll();
         *
         * Configurazione:
         *   supportsDelimitedIdentifiers = true
         *   delimitedCase = lower
         *   schemaCase = upper
         *   delimitAll = true
         *
         * Scopo:
         *   coprire il caso in cui la delimitazione non dipende da una differenza
         *   tra caseName e name, ma viene forzata direttamente dalla configurazione
         *   delimitAll().
         */
        when(config.getSupportsDelimitedIdentifiers()).thenReturn(true);
        when(config.getDelimitedCase()).thenReturn("lower");
        when(config.getSchemaCase()).thenReturn("upper");
        when(config.delimitAll()).thenReturn(true);

        DBIdentifier result = util.fromDBName(
                VALID_NON_DELIMITED_IDENTIFIER_NAME,
                VALID_IDENTIFIER_TYPE
        );

        assertNotNull(result);
        assertEquals(VALID_IDENTIFIER_TYPE, result.getType());
        assertTrue(result.isDelimited());
        assertEquals("\"" + VALID_NON_DELIMITED_IDENTIFIER_NAME + "\"", result.getName());
    }
}
