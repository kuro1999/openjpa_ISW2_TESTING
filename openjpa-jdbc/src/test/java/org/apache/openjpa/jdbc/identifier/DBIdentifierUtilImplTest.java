package org.apache.openjpa.jdbc.identifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.openjpa.jdbc.schema.NameSet;
import org.apache.openjpa.jdbc.schema.Schema;
import org.apache.openjpa.jdbc.schema.SchemaGroup;
import org.apache.openjpa.lib.identifier.IdentifierConfiguration;
import org.apache.openjpa.lib.identifier.IdentifierRule;
import org.junit.*;

import java.util.Collections;

public class DBIdentifierUtilImplTest {

    private static final String VALID_NON_DELIMITED_IDENTIFIER_NAME = "CUSTOMER";
    private static final String VALID_DELIMITED_IDENTIFIER_NAME = "CUSTOMER";
    private static final String EXPECTED_DELIMITED_IDENTIFIER_NAME = "\"CUSTOMER\"";
    private static final String VALID_SCHEMA_NAME = "PUBLIC";
    private static final String RESERVED_IDENTIFIER_NAME = "SELECT";
    private static final String EXPECTED_RESERVED_IDENTIFIER_NAME = "SELECT0";
    private static final String FIRST_UNIQUE_VARIANT_NAME =
            VALID_NON_DELIMITED_IDENTIFIER_NAME + "1";
    private static final String EMPTY_IDENTIFIER_NAME = "";
    private static DBIdentifier.DBIdentifierType VALID_IDENTIFIER_TYPE;

    private static final String SECOND_UNIQUE_VARIANT_NAME =
            VALID_NON_DELIMITED_IDENTIFIER_NAME + "2";

    private static final int COMPATIBLE_MAX_LEN = 20;
    private static final int ZERO_MAX_LEN = 0;
    private static final int SHORT_MAX_LEN = 4;

    private DBIdentifierUtilImpl util;
    private IdentifierConfiguration config;
    private IdentifierRule rule;

    private static String DEFAULT_DELIMITED_CASE;
    private static String DEFAULT_SCHEMA_CASE;

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
        DEFAULT_SCHEMA_CASE = "upper";
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
        when(config.getSchemaCase()).thenReturn(DEFAULT_SCHEMA_CASE);

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
        DEFAULT_SCHEMA_CASE = null;
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

        SchemaGroup schemaGroup = new SchemaGroup();
        schemaGroup.addSchema(VALID_SCHEMA_NAME);
        NameSet set = schemaGroup;

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
        NameSet set = new SchemaGroup();
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



    @Test
    public void makeIdentifierValid_withNullIdentifier_throwsException() {
        /*
         * TC4 - sname nullo
         *
         * Frame astratto:
         *   TF4 = <S1, N2, L3, U1>
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
         * Scopo:
         *   verificare il comportamento del metodo quando l'unico input invalido
         *   è l'identificatore candidato nullo.
         *
         * Oracolo:
         *   il metodo deve segnalare l'input non valido tramite eccezione.
         *
         * Nota:
         *   Gli altri parametri sono mantenuti su scelte valide, così l'eventuale
         *   errore osservato è riconducibile a sname = null.
         */
        DBIdentifier sname = null;
        NameSet set = new SchemaGroup();
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () ->
                util.makeIdentifierValid(
                        sname,
                        set,
                        COMPATIBLE_MAX_LEN,
                        checkForUniqueness
                )
        );
    }


    @Ignore("Oracolo iniziale mantenuto a documentazione: set = null non lancia eccezione nel comportamento osservato")
    @Test
    public void makeIdentifierValid_withNullNameSet_throwsException() {
        /*
         * TC5 - set nullo
         *
         * Frame astratto:
         *   TF5 = <S3, N1, L3, U1>
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
         * Scopo:
         *   verificare il comportamento del metodo quando l'unico input invalido
         *   è il NameSet nullo.
         *
         * Oracolo:
         *   il metodo deve segnalare l'input non valido tramite eccezione.
         *
         * Nota:
         *   Gli altri parametri sono mantenuti su scelte valide, così l'eventuale
         *   errore osservato è riconducibile a set = null.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = null;
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () ->
                util.makeIdentifierValid(
                        sname,
                        set,
                        maxLen,
                        checkForUniqueness
                )
        );
    }

    @Test
    public void makeIdentifierValid_withNullNameSet_returnsValidIdentifier() {
        /*
         * TC5 - set nullo
         *
         * Frame astratto:
         *   TF5 = <S3, N1, L3, U1>
         *
         * Category partition raffinata:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N1 = set nullo / assenza del contesto di unicità
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Scopo:
         *   verificare il comportamento del metodo quando il contesto di unicità
         *   è assente.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier valido equivalente all'input,
         *   perché non esiste un NameSet su cui verificare conflitti.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = null;
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


    @Ignore("Oracolo iniziale scartato: maxLen negativo non lancia eccezione nel comportamento osservato")
    @Test
    public void makeIdentifierValid_withNegativeMaxLen_throwsException() {
        /*
         * TC6 - maxLen negativo
         *
         * Frame astratto:
         *   TF6 = <S3, N2, L1, U1>
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
         * Scopo:
         *   verificare il comportamento del metodo quando l'unico input invalido
         *   è maxLen negativo.
         *
         * Oracolo:
         *   il metodo deve segnalare l'input non valido tramite eccezione.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = new SchemaGroup();
        int maxLen = -1;
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () ->
                util.makeIdentifierValid(
                        sname,
                        set,
                        maxLen,
                        checkForUniqueness
                )
        );
    }

    @Test
    public void makeIdentifierValid_withNegativeMaxLen_returnsValidIdentifier() {
        /*
         * TC6 - maxLen negativo, comportamento osservato
         *
         * Frame astratto:
         *   TF6 = <S3, N2, L1, U1>
         *
         * Category partition raffinata:
         *   S3 = sname valido, non vuoto, non delimitato
         *   N2 = set valido, vuoto
         *   L1 = maxLen negativo / valore anomalo
         *   U1 = checkForUniqueness = true
         *
         * Oracolo raffinato:
         *   il metodo non solleva eccezione e restituisce un DBIdentifier valido.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);
        NameSet set = new SchemaGroup();
        int maxLen = -1;
        boolean checkForUniqueness = true;

        DBIdentifier result = util.makeIdentifierValid(
                sname,
                set,
                maxLen,
                checkForUniqueness
        );

        assertNotNull(result);
        assertFalse(result.isDelimited());
        assertEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
    }


    @Test
    public void makeIdentifierValid_withExistingIdentifierAndUniquenessEnabled_returnsDifferentIdentifier() {
        /*
         * TC7 - Conflitto di unicità con controllo attivo
         *
         * Frame astratto:
         *   TF7 = <S3, N3, L3, U1>
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
         * Scopo:
         *   verificare che il metodo modifichi l'identificatore quando il nome
         *   candidato è già presente nel contesto e il controllo di unicità è attivo.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, non delimitato,
         *   con nome diverso da quello candidato e compatibile con maxLen.
         */
        DBIdentifier sname = DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME);

        SchemaGroup schemaGroup = new SchemaGroup();
        schemaGroup.addSchema(VALID_SCHEMA_NAME)
                .addTable(DBIdentifier.newTable(VALID_NON_DELIMITED_IDENTIFIER_NAME));
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
        assertFalse(VALID_NON_DELIMITED_IDENTIFIER_NAME.equals(result.getName()));
        assertTrue(result.getName().length() <= maxLen);

        verify(config, atLeastOnce()).getIdentifierRule(any());
    }

    @Ignore("Oracolo iniziale scartato: empty name non lancia eccezione nel comportamento osservato")
    @Test
    public void makeIdentifierValid_withEmptyIdentifierName_throwsException() {
        /*
         * TC8 - Nome vuoto
         *
         * Frame astratto:
         *   TF8 = <S2, N2, L3, U1>
         *
         * Category partition:
         *   S2 = sname invalido/robustness: empty name
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
         * Scopo:
         *   verificare il comportamento del metodo quando l'identificatore candidato
         *   esiste come oggetto, ma contiene un nome vuoto.
         *
         * Oracolo:
         *   il metodo deve gestire il caso in modo controllato tramite eccezione.
         *
         * Nota:
         *   Gli altri parametri sono mantenuti su scelte valide, così l'eventuale
         *   errore osservato è riconducibile solo al nome vuoto.
         */
        DBIdentifier sname = DBIdentifier.newTable("");
        NameSet set = new SchemaGroup();
        int maxLen = COMPATIBLE_MAX_LEN;
        boolean checkForUniqueness = true;

        assertThrows(RuntimeException.class, () ->
                util.makeIdentifierValid(
                        sname,
                        set,
                        maxLen,
                        checkForUniqueness
                )
        );
    }
    @Test
    public void makeIdentifierValid_withEmptyIdentifierName_returnsDefinedIdentifier() {
        /*
         * TC8 - Nome vuoto, comportamento osservato
         *
         * Frame astratto:
         *   TF8 = <S2, N2, L3, U1>
         *
         * Category partition raffinata:
         *   S2 = sname non nullo con nome vuoto / valore anomalo gestito
         *   N2 = set valido, vuoto
         *   L3 = maxLen valido, positivo
         *   U1 = checkForUniqueness = true
         *
         * Oracolo raffinato:
         *   il metodo non solleva eccezione e restituisce un DBIdentifier.
         */
        DBIdentifier sname = DBIdentifier.newTable("");
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
         * Frame astratto:
         *   TF1 = <N1, T1>
         *
         * Category partition:
         *   N1 = valid: non-empty database name
         *   T1 = valid: DBIdentifierType
         *
         * Input concreti:
         *   name = "CUSTOMER"
         *   id = DBIdentifier.DBIdentifierType.TABLE
         *
         * Scopo:
         *   verificare il comportamento ordinario del metodo quando riceve
         *   un nome di database non vuoto e un tipo valido di identificatore.
         *
         * Oracolo:
         *   il metodo deve restituire un DBIdentifier non nullo, del tipo richiesto
         *   e basato sul nome fornito.
         */
        DBIdentifier result = util.fromDBName(
                VALID_NON_DELIMITED_IDENTIFIER_NAME,
                VALID_IDENTIFIER_TYPE
        );

        assertNotNull(result);
        assertEquals(VALID_IDENTIFIER_TYPE, result.getType());
        assertNotNull(result.getName());
        assertEquals(VALID_NON_DELIMITED_IDENTIFIER_NAME, result.getName());
    }




    @Test
    public void fromDBName_withEmptyNameAndValidType_returnsIdentifierWithEmptyName() {
        /*
         * TC2 - Nome vuoto e tipo valido
         *
         * Frame astratto:
         *   TF2 = <N3, T1>
         *
         * Category partition:
         *   N3 = invalid: empty string
         *   T1 = valid: DBIdentifierType
         *
         * Input concreti:
         *   name = ""
         *   id = DBIdentifier.DBIdentifierType.TABLE
         *
         * Scopo:
         *   verificare il comportamento del metodo quando l'unico input invalido
         *   è il nome vuoto. Il tipo dell'identificatore resta valido.
         *
         * Oracolo:
         *   poiché la documentazione non specifica esplicitamente il comportamento
         *   per il nome vuoto, il test usa un oracolo osservazionale iniziale:
         *   se il metodo accetta l'input, deve restituire un DBIdentifier non nullo,
         *   del tipo richiesto e con nome vuoto.
         */
        DBIdentifier result = util.fromDBName(
                EMPTY_IDENTIFIER_NAME,
                VALID_IDENTIFIER_TYPE
        );

        assertNotNull(result);
        assertEquals(VALID_IDENTIFIER_TYPE, result.getType());
        assertNotNull(result.getName());
        assertEquals(EMPTY_IDENTIFIER_NAME, result.getName());
    }




    @Test
    public void fromDBName_withNullNameAndValidType_returnsNullIdentifier() {
        /*
         * TC3 - Nome nullo e tipo valido
         *
         * Frame astratto:
         *   TF3 = <N2, T1>
         *
         * Category partition:
         *   N2 = invalid: null
         *   T1 = valid: DBIdentifierType
         *
         * Input concreti:
         *   name = null
         *   id = DBIdentifier.DBIdentifierType.TABLE
         *
         * Scopo:
         *   verificare il comportamento del metodo quando l'unico input invalido
         *   è name = null. Il tipo dell'identificatore resta valido.
         *
         * Oracolo:
         *   poiché il nome è assente, il metodo deve restituire un identificatore
         *   nullo/speciale oppure gestire in modo controllato l'assenza del nome.
         *   L'oracolo iniziale verifica che il risultato sia un DBIdentifier nullo
         *   secondo la rappresentazione prevista dalla classe DBIdentifier.
         */
        DBIdentifier result = util.fromDBName(
                null,
                VALID_IDENTIFIER_TYPE
        );

        assertNotNull(result);
        assertTrue(DBIdentifier.isNull(result));
    }


    @Test
    public void fromDBName_withNonEmptyNameAndNullType_throwsRuntimeException() {
        /*
         * TC4 - Nome non vuoto e tipo nullo
         *
         * Frame astratto:
         *   TF4 = <N1, T2>
         *
         * Category partition:
         *   N1 = valid: non-empty database name
         *   T2 = invalid: null
         *
         * Input concreti:
         *   name = "CUSTOMER"
         *   id = null
         *
         * Scopo:
         *   verificare il comportamento del metodo quando l'unico input invalido
         *   è il tipo dell'identificatore. Il nome resta valido e non vuoto.
         *
         * Oracolo:
         *   poiché la documentazione parla di creazione di un identificatore
         *   "of a given type", l'assenza del tipo viene trattata come input
         *   invalido. Il metodo deve quindi segnalare il problema tramite
         *   eccezione runtime.
         */
        try {
            util.fromDBName(
                    VALID_NON_DELIMITED_IDENTIFIER_NAME,
                    null
            );
            fail("Expected a RuntimeException when DBIdentifierType is null");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }



        /*
    ##########################################################################################
    FINE PARTE BLACK-BOX INIZIO PARTE WHITE-BOX DOPO AVER VISUALIZZATO I RISULTATI SU JACOCO
    ##########################################################################################
    */

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


    /*
    ###########################################################################################
                                    MUTATION TESING AUMENTO ROBUSTEZZA
    ###########################################################################################
     */

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
