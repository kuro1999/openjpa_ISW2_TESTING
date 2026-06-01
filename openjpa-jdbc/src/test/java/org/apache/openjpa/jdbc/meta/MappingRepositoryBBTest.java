package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.meta.MetaDataFactory;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

public class MappingRepositoryBBTest {

    private static final String MAPPING_NAME = "mappingA";

    private MappingRepository repository;
    private MetaDataFactory factory;
    private ClassLoader loader;

    @Before
    public void setUp() {
        repository = new MappingRepository();
        loader = Thread.currentThread().getContextClassLoader();
    }
    /*
    ###########################################################################
                 BLACK-BOX      addQueryResultMapping()
    ###########################################################################
     */

    @Test
    public void addQueryResultMapping_withNonNullClassAndNonEmptyName_returnsMapping() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome ordinario.
         *
         * Oracolo black-box:
         * La Javadoc dice "Add a query result mapping".
         * Nel caso ordinario, ci aspettiamo quindi che il metodo restituisca
         * un QueryResultMapping non null.
         *
         * Oracolo rafforzato:
         * Se l'oggetto restituito è un oggetto non null ed espone
         * pubblicamente il nome e il tipo dichiarante,
         * verifichiamo che siano coerenti con gli input.
         */

        QueryResultMapping result = repository.addQueryResultMapping(
                String.class,
                MAPPING_NAME
        );

        assertNotNull("The added QueryResultMapping should not be null", result);
        assertEquals("The mapping name should match the input name",
                MAPPING_NAME, result.getName());
        assertEquals("The mapping declaring type should match the input class",
                String.class, result.getDefiningType());
    }


    @Test
    public void addQueryResultMapping_withNullClassAndNonEmptyName_observesBehavior() {
        /*
         * Category Partition:
         * - A2: cls null.
         *   La Javadoc non specifica se la classe possa essere null.
         *   Questo è quindi un caso di robustezza, non un caso valido garantito.
         *
         * - B1: name non null e non vuoto.
         *
         * Oracolo:
         * Se il metodo accetta cls null, il risultato deve essere un
         * QueryResultMapping non null con nome coerente con l'input.
         */

        QueryResultMapping result = repository.addQueryResultMapping(
                null,
                MAPPING_NAME
        );

        assertNotNull("The method accepted null cls and returned a mapping", result);
        assertEquals("The mapping name should match the input name",
                MAPPING_NAME, result.getName());
        assertNull("The mapping defining type should be null when cls is null", result.getDefiningType());
    }


    @Test
    public void addQueryResultMapping_withNonNullClassAndNullName_observesBehavior() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B2: name null.
         *   La Javadoc non specifica se il nome del mapping possa essere null.
         *
         * Oracolo black-box prudente:
         * La Javadoc dice solo "Add a query result mapping", senza specificare
         * il comportamento con name null.
         *
         * Oracolo:
         * Se il metodo accetta name null, il risultato deve essere un
         * QueryResultMapping non null.
         */

        QueryResultMapping result = repository.addQueryResultMapping(
                String.class,
                null
        );

        assertNotNull("The method accepted null name and returned a mapping", result);
        assertEquals("The mapping defining type should match the input class",
                String.class, result.getDefiningType());
        assertNull("The mapping name should be null when the input name is null", result.getName());
    }

    @Test
    public void addQueryResultMapping_withNonNullClassAndEmptyName_observesBehavior() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B3: name vuoto.
         *   La Javadoc non specifica se il nome del mapping possa essere una
         *   stringa vuota.
         *
         * Oracolo operativo:
         * Se il metodo accetta name vuoto, il risultato deve essere un
         * QueryResultMapping non null, associato alla classe di input e con
         * nome uguale alla stringa vuota.
         */

        QueryResultMapping result = repository.addQueryResultMapping(
                String.class,
                ""
        );

        assertNotNull("The method accepted empty name and returned a mapping", result);
        assertEquals("The mapping defining type should match the input class",
                String.class, result.getDefiningType());
        assertEquals("The mapping name should be empty when the input name is empty",
                "", result.getName());
    }

/*
    ###########################################################################
                 BLACK-BOX      getQueryResultMapping()
    ###########################################################################
     */

    @Ignore("Oracolo iniziale scartato: senza setup del repository il metodo non restituisce null, ma lancia NullPointerException per MetaDataFactory nulla")
    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistFalse_returnsNullWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome ordinario.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente come rappresentante
         *   di un ClassLoader disponibile.
         *
         * - D2: mustExist = false.
         *   Dal nome del parametro si deduce che il mapping non è richiesto
         *   obbligatoriamente.
         *
         * Fixture:
         * Il repository viene creato nuovo e non viene chiamato
         * addQueryResultMapping(...). In questa fase vogliamo testare strettamente
         * getQueryResultMapping(...) senza predisporre operazioni pregresse.
         *
         * Oracolo:
         * La Javadoc dice "Return the query result mapping for the given name".
         * Poiché nessun mapping è stato aggiunto e mustExist = false, ci aspettiamo
         * che il metodo gestisca l'assenza del mapping restituendo null, senza
         * lanciare eccezioni.
         */

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
                false
        );

        assertNull("No mapping was added, so the result should be null", result);
    }

    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistFalse_withoutRepositorySetup_throwsNullPointerException() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome ordinario.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente come rappresentante
         *   di un ClassLoader disponibile.
         *
         * - D2: mustExist = false.
         *
         * Oracolo aggiornato:
         * Senza setup del repository, la chiamata diretta a getQueryResultMapping()
         * non è eseguibile quindi ci si aspetta una NullPointerException.
         */

        assertThrows(NullPointerException.class, () ->
                repository.getQueryResultMapping(
                        String.class,
                        MAPPING_NAME,
                        loader,
                        false
                )
        );
    }


    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistFalseAndMockedMetaDataFactory_returnsNullWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome ordinario.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Setup:
         * Il tentativo su repository appena creato ha prodotto NullPointerException
         * perché getMetaDataFactory() era null. Qui configuriamo quindi una
         * MetaDataFactory mockata, senza usare addQueryResultMapping(...), per
         * mantenere il focus su getQueryResultMapping(...).
         *
         * Oracolo:
         * Poiché non viene aggiunto alcun QueryResultMapping e mustExist = false,
         * il metodo deve completare la ricerca senza eccezioni e restituire null.
         */
        setUpRepositoryWithMockedFactory();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
                false
        );

        assertNull("No mapping was added, so the result should be null", result);

    }


    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistTrueAndMockedMetaDataFactory_throwsRuntimeExceptionWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome ordinario.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D1: mustExist = true.
         *   Dal nome del parametro si deduce che il mapping è richiesto
         *   obbligatoriamente.
         *
         * Setup:
         * Il repository viene configurato con una MetaDataFactory mockata.
         * Questo setup è necessario perché il tentativo diretto su repository appena
         * creato ha mostrato che getMetaDataFactory() è null.
         *
         * Fixture:
         * Non viene chiamato addQueryResultMapping(...), quindi non viene aggiunto
         * alcun QueryResultMapping tramite API pubblica.
         *
         * Oracolo:
         * Poiché nessun mapping è stato aggiunto e mustExist = true, il metodo deve
         * segnalare l'assenza del mapping tramite eccezione.
         */

        setUpRepositoryWithMockedFactory();

        assertThrows(RuntimeException.class, () ->
                repository.getQueryResultMapping(
                        String.class,
                        MAPPING_NAME,
                        loader,
                        true
                )
        );

    }



    @Test
    public void getQueryResultMapping_whenMetaDataFactoryLoadsMapping_returnsLoadedMapping() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome valido.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D1: mustExist = true.
         *   Il mapping è richiesto obbligatoriamente.
         *
         * Oracolo:
         * getQueryResultMapping() deve restituire il mapping reso disponibile
         * durante il caricamento della MetaDataFactory.
         */
        setUpRepositoryWithMockedFactory();

        doAnswer(invocation -> {
            repository.addQueryResultMapping(String.class, MAPPING_NAME);
            return null;
        }).when(factory).load(eq(String.class), anyInt(), eq(loader));

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
                true
        );

        assertNotNull("The mapping loaded by the MetaDataFactory should be returned", result);
        assertEquals(MAPPING_NAME, result.getName());
        assertEquals(String.class, result.getDefiningType());

    }


    @Test
    public void getQueryResultMapping_withNullClassAndMustExistFalseAndMockedMetaDataFactory_returnsNullWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A2: cls null.
         *   La Javadoc non specifica se cls possa essere null.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome valido.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         *
         * Oracolo:
         * Poiché cls null non è garantito dalla Javadoc, l'oracolo iniziale è
         * osservazionale. Con il setup minimo della MetaDataFactory e mustExist=false,
         * se nessun mapping viene caricato, ci aspettiamo che il metodo completi
         * senza eccezioni e restituisca null.
         */
        setUpRepositoryWithMockedFactory();

        QueryResultMapping result = repository.getQueryResultMapping(
                null,
                MAPPING_NAME,
                loader,
                false
        );

        assertNull("No mapping was added or loaded, so the result should be null", result);

    }


    @Test
    public void getQueryResultMapping_withNullNameAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B2: name null.
         *   La Javadoc non specifica se name possa essere null.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Oracolo:
         * Poiché name = null non identifica un nome di mapping e mustExist = false,
         * il metodo deve restituire null senza lanciare eccezioni.
         */
        setUpRepositoryWithMockedFactory();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                null,
                loader,
                false
        );

        assertNull("With null name, the result should be null", result);
    }

    @Test
    public void getQueryResultMapping_withEmptyNameAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B3: name vuoto.
         *   La Javadoc non specifica se name possa essere una stringa vuota.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Oracolo:
         * Poiché name = "" non identifica un mapping ordinario e mustExist = false,
         * il metodo deve completare senza eccezioni e restituire null.
         */
        setUpRepositoryWithMockedFactory();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "",
                loader,
                false
        );

        assertNull("With empty name, the result should be null", result);
    }


    @Test
    public void getQueryResultMapping_withNullLoaderAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo MAPPING_NAME come rappresentante di un nome valido.
         *
         * - C2: loader null.
         *   La Javadoc non specifica se loader possa essere null.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Oracolo:
         * Poiché nessun mapping viene aggiunto e mustExist = false, il metodo deve
         * completare senza eccezioni e restituire null anche quando loader = null.
         */
        setUpRepositoryWithMockedFactory();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                null,
                false
        );

        assertNull("With null loader and no mapping, the result should be null", result);
    }

    private void setUpRepositoryWithMockedFactory() {
        factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);
    }

}
