package org.apache.openjpa.jdbc.meta;

import static org.apache.openjpa.meta.MetaDataModes.MODE_META;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.meta.MetaDataRepository;
import org.apache.openjpa.util.MetaDataException;
import org.junit.Ignore;
import org.junit.Test;

public class MappingRepositoryTest {


    private static final String MAPPING_NAME = "mappingA";

    private MappingRepository repository;
    private MetaDataFactory factory;
    private ClassLoader loader;
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
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
         *
         * Oracolo black-box:
         * La Javadoc dice "Add a query result mapping".
         * Nel caso ordinario, ci aspettiamo quindi che il metodo restituisca
         * un QueryResultMapping non null.
         *
         * Oracolo rafforzato:
         * Se l'oggetto restituito espone pubblicamente il nome e il tipo
         * dichiarante, verifichiamo che siano coerenti con gli input.
         */
        MappingRepository repository = new MappingRepository();

        QueryResultMapping result = repository.addQueryResultMapping(
                String.class,
                "mappingA"
        );

        assertNotNull("The added QueryResultMapping should not be null", result);
        assertEquals("The mapping name should match the input name",
                "mappingA", result.getName());
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
         *   Manteniamo il nome su una scelta ordinaria per isolare l'effetto
         *   del solo parametro cls null.
         *
         * Oracolo black-box prudente:
         * La Javadoc dice solo "Add a query result mapping" e non specifica
         * il comportamento con cls null. Per questo motivo il test documenta
         * il comportamento osservato.
         *
         * Oracolo operativo:
         * Se il metodo accetta cls null, il risultato deve essere un
         * QueryResultMapping non null con nome coerente con l'input.
         * Se invece il metodo non accetta cls null, il test documenterà
         * l'eccezione osservata e l'oracolo iniziale verrà aggiornato.
         */
        MappingRepository repository = new MappingRepository();

        QueryResultMapping result = repository.addQueryResultMapping(
                null,
                "mappingA"
        );

        assertNotNull("The method accepted null cls and returned a mapping", result);
        assertEquals("The mapping name should match the input name",
                "mappingA", result.getName());
        assertEquals("The mapping defining type should be null when cls is null",
                null, result.getDefiningType());
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
         *   Questo è quindi un caso di robustezza, non un caso valido garantito.
         *
         * Oracolo black-box prudente:
         * La Javadoc dice solo "Add a query result mapping", senza specificare
         * il comportamento con name null. Per questo motivo il test documenta
         * il comportamento osservato.
         *
         * Oracolo operativo:
         * Se il metodo accetta name null, il risultato deve essere un
         * QueryResultMapping non null, associato alla classe di input e con
         * nome null.
         * Se invece il metodo non accetta name null, il test documenterà
         * l'eccezione osservata e l'oracolo iniziale verrà aggiornato.
         */
        MappingRepository repository = new MappingRepository();

        QueryResultMapping result = repository.addQueryResultMapping(
                String.class,
                null
        );

        assertNotNull("The method accepted null name and returned a mapping", result);
        assertEquals("The mapping defining type should match the input class",
                String.class, result.getDefiningType());
        assertEquals("The mapping name should be null when the input name is null",
                null, result.getName());
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
         *   stringa vuota. Questo è quindi un caso di robustezza, non un caso
         *   valido garantito dal contratto documentato.
         *
         * Oracolo black-box prudente:
         * La Javadoc dice solo "Add a query result mapping", senza specificare
         * il comportamento con name vuoto.
         *
         * Oracolo operativo:
         * Se il metodo accetta name vuoto, il risultato deve essere un
         * QueryResultMapping non null, associato alla classe di input e con
         * nome uguale alla stringa vuota.
         * Se invece il metodo non accetta name vuoto, il test documenterà
         * l'eccezione osservata e l'oracolo iniziale verrà aggiornato.
         */
        MappingRepository repository = new MappingRepository();

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
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
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
         * Oracolo black-box prudente:
         * La Javadoc dice "Return the query result mapping for the given name".
         * Poiché nessun mapping è stato aggiunto e mustExist = false, ci aspettiamo
         * che il metodo gestisca l'assenza del mapping restituendo null, senza
         * lanciare eccezioni.
         */
        MappingRepository repository = new MappingRepository();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                loader,
                false
        );

        assertEquals("No mapping was added, so the result should be null",
                null, result);
    }

    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistFalse_withoutRepositorySetup_throwsNullPointerException() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
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
         * addQueryResultMapping(...). In questa fase volevamo testare strettamente
         * getQueryResultMapping(...) senza predisporre operazioni pregresse.
         *
         * Oracolo iniziale:
         * Ci si aspettava prudentemente result == null, poiché nessun mapping era
         * stato aggiunto e mustExist = false.
         *
         * Comportamento osservato:
         * Il metodo non restituisce null, ma tenta di accedere alla MetaDataFactory
         * interna. Su una MappingRepository appena creata, tale factory è null e
         * viene quindi lanciata NullPointerException.
         *
         * Oracolo aggiornato:
         * Senza setup/configurazione del repository, la chiamata diretta a
         * getQueryResultMapping(...) non è eseguibile come test funzionale stretto.
         */
        MappingRepository repository = new MappingRepository();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        assertThrows(NullPointerException.class, () ->
                repository.getQueryResultMapping(
                        String.class,
                        "mappingA",
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
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
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
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                loader,
                false
        );

        assertEquals("No mapping was added, so the result should be null",
                null, result);

    }











    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistTrueAndMockedMetaDataFactory_throwsRuntimeExceptionWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
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
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        assertThrows(RuntimeException.class, () ->
                repository.getQueryResultMapping(
                        String.class,
                        "mappingA",
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
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D1: mustExist = true.
         *   Il mapping è richiesto obbligatoriamente.
         *
         * Setup:
         * Il repository viene configurato con una MetaDataFactory mockata.
         *
         * Simulazione:
         * La MetaDataFactory, quando viene invocata tramite load(...), simula il
         * caricamento dei metadata aggiungendo al repository un QueryResultMapping
         * coerente con cls e name.
         *
         * Oracolo:
         * getQueryResultMapping(...) deve restituire il mapping reso disponibile
         * durante il caricamento della MetaDataFactory.
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        doAnswer(invocation -> {
            repository.addQueryResultMapping(String.class, "mappingA");
            return null;
        }).when(factory).load(eq(String.class), anyInt(), eq(loader));

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                loader,
                true
        );

        assertNotNull("The mapping loaded by the MetaDataFactory should be returned", result);
        assertEquals("mappingA", result.getName());
        assertEquals(String.class, result.getDefiningType());

    }


    @Test
    public void getQueryResultMapping_withNullClassAndMustExistFalseAndMockedMetaDataFactory_returnsNullWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A2: cls null.
         *   La Javadoc non specifica se cls possa essere null.
         *   Questo è quindi un caso di robustezza, non un caso valido garantito.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Setup:
         * Il repository viene configurato con una MetaDataFactory mockata.
         * Questo setup è necessario perché una MappingRepository appena creata
         * ha MetaDataFactory nulla e la chiamata diretta produrrebbe
         * NullPointerException.
         *
         * Fixture:
         * Non viene chiamato addQueryResultMapping(...), quindi non viene aggiunto
         * alcun QueryResultMapping tramite API pubblica.
         *
         * Oracolo black-box di robustezza:
         * Poiché cls null non è garantito dalla Javadoc, l'oracolo iniziale è
         * osservazionale. Con il setup minimo della MetaDataFactory e mustExist=false,
         * se nessun mapping viene caricato, ci aspettiamo che il metodo completi
         * senza eccezioni e restituisca null.
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        QueryResultMapping result = repository.getQueryResultMapping(
                null,
                "mappingA",
                loader,
                false
        );

        assertEquals("No mapping was added or loaded, so the result should be null",
                null, result);

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
         *   Questo è quindi un caso di robustezza, non un caso valido garantito.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Setup:
         * Il repository viene configurato con una MetaDataFactory mockata solo perché
         * una MappingRepository appena creata non ha MetaDataFactory configurata.
         * Il mock non viene usato come oracolo del test.
         *
         * Oracolo black-box:
         * Poiché name = null non identifica un nome di mapping e mustExist = false,
         * il metodo deve restituire null senza lanciare eccezioni.
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                null,
                loader,
                false
        );

        assertEquals("With null name, the result should be null",
                null, result);
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
         *   Questo è quindi un caso di robustezza, non un caso valido garantito.
         *
         * - C1: loader non null.
         *   Usiamo il context ClassLoader del thread corrente.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Setup:
         * Il repository viene configurato con una MetaDataFactory mockata solo perché
         * una MappingRepository appena creata non ha MetaDataFactory configurata.
         * Il mock non viene usato come oracolo del test.
         *
         * Oracolo black-box:
         * Poiché name = "" non identifica un mapping ordinario e mustExist = false,
         * il metodo deve completare senza eccezioni e restituire null.
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "",
                loader,
                false
        );

        assertEquals("With empty name, the result should be null",
                null, result);
    }


    @Test
    public void getQueryResultMapping_withNullLoaderAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A1: cls non null.
         *   Usiamo String.class come rappresentante di una classe valida.
         *
         * - B1: name non null e non vuoto.
         *   Usiamo "mappingA" come rappresentante di un nome ordinario.
         *
         * - C2: loader null.
         *   La Javadoc non specifica se loader possa essere null.
         *   Questo è quindi un caso di robustezza, non un caso valido garantito.
         *
         * - D2: mustExist = false.
         *   Il mapping non è richiesto obbligatoriamente.
         *
         * Setup:
         * Il repository viene configurato con una MetaDataFactory mockata solo perché
         * una MappingRepository appena creata non ha MetaDataFactory configurata.
         * Il mock non viene usato come oracolo del test.
         *
         * Oracolo black-box:
         * Poiché nessun mapping viene aggiunto e mustExist = false, il metodo deve
         * completare senza eccezioni e restituire null anche quando loader = null.
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                null,
                false
        );

        assertEquals("With null loader and no mapping, the result should be null",
                null, result);
    }


    /*
    ###########################################################################################
                                            WHITE-BOX
    ###########################################################################################
     */


    @Test
    public void getQueryResultMapping_whenMappingIsAlreadyCached_returnsCachedMappingWithoutMetaDataFactory() {
        /*
         * White-box target:
         * getQueryResultMappingInternal(...) contiene un ramo in cui il mapping
         * viene trovato direttamente nella cache _results.
         *
         * Codice target:
         *   Object key = getQueryResultKey(cls, name);
         *   QueryResultMapping res = _results.get(key);
         *   if (res != null)
         *       return res;
         *
         * Obiettivo:
         * coprire il ramo cache-hit di getQueryResultMapping(...), restando nel
         * perimetro dei due metodi target:
         * - addQueryResultMapping(...), usato per predisporre il mapping;
         * - getQueryResultMapping(...), usato per recuperarlo.
         *
         * Setup:
         * Il mapping viene inserito tramite addQueryResultMapping(...).
         * Non configuriamo MetaDataFactory: se getQueryResultMapping(...) non
         * trovasse il mapping in cache e provasse a caricare metadata, il test
         * fallirebbe con NullPointerException.
         *
         * Oracolo:
         * getQueryResultMapping(...) deve restituire esattamente lo stesso oggetto
         * già presente nella cache del repository.
         *
         * Nota metodologica:
         * Questo è un test white-box perché nasce dalla conoscenza del ramo interno
         * if (res != null), non dalla sola Javadoc.
         */
        MappingRepository repository = new MappingRepository();

        QueryResultMapping added = repository.addQueryResultMapping(
                String.class,
                "mappingA"
        );

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                Thread.currentThread().getContextClassLoader(),
                true
        );

        assertSame("The cached mapping should be returned directly",
                added, result);
    }



    @Test
    public void addQueryResultMapping_withSameClassAndName_replacesPreviousMappingInCache() {
        /*
         * White-box target:
         * addQueryResultMappingInternal(...) inserisce il mapping nella mappa _results
         * usando:
         *   _results.put(getQueryResultKey(res), res);
         *
         * Obiettivo:
         * verificare il comportamento della put sulla stessa chiave logica.
         * Due chiamate con stessa classe e stesso nome devono produrre la stessa
         * chiave interna, quindi il secondo mapping deve sostituire il primo nella
         * cache.
         *
         * Setup:
         * Usiamo due chiamate a addQueryResultMapping(...) con gli stessi input:
         * - stessa cls;
         * - stesso name.
         *
         * Oracolo:
         * - le due chiamate devono creare due istanze diverse;
         * - getQueryResultMapping(...) deve restituire la seconda istanza, perché
         *   è quella attualmente associata alla chiave nella cache.
         *
         * Nota metodologica:
         * Questo è un test white-box perché deriva dalla conoscenza dell'uso di
         * _results.put(...) e della chiave prodotta da getQueryResultKey(...).
         */
        MappingRepository repository = new MappingRepository();

        QueryResultMapping first = repository.addQueryResultMapping(
                String.class,
                "mappingA"
        );

        QueryResultMapping second = repository.addQueryResultMapping(
                String.class,
                "mappingA"
        );

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                Thread.currentThread().getContextClassLoader(),
                true
        );

        assertNotSame("Each add should create a new QueryResultMapping instance",
                first, second);
        assertSame("The cached mapping should be the last one added",
                second, result);
    }




    @Test
    public void getQueryResultMapping_withSameNameButDifferentClasses_returnsClassSpecificMapping() {
        /*
         * White-box target:
         * getQueryResultKey(cls, name) costruisce la chiave usando sia cls sia name.
         *
         * Obiettivo:
         * verificare che due mapping con lo stesso name ma classi diverse non si
         * sovrascrivano nella cache interna.
         *
         * Setup:
         * Aggiungiamo due mapping con:
         * - stesso name;
         * - classi diverse.
         *
         * Oracolo:
         * - recuperando con String.class deve essere restituito il mapping associato
         *   a String.class;
         * - recuperando con Integer.class deve essere restituito il mapping associato
         *   a Integer.class;
         * - i due mapping devono essere istanze distinte.
         *
         * Nota metodologica:
         * Questo è un test white-box perché deriva dalla conoscenza che la chiave
         * interna usata dalla cache dipende dalla coppia cls-name, non solo dal name.
         */
        MappingRepository repository = new MappingRepository();

        QueryResultMapping stringMapping = repository.addQueryResultMapping(
                String.class,
                "mappingA"
        );

        QueryResultMapping integerMapping = repository.addQueryResultMapping(
                Integer.class,
                "mappingA"
        );

        QueryResultMapping stringResult = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                Thread.currentThread().getContextClassLoader(),
                true
        );

        QueryResultMapping integerResult = repository.getQueryResultMapping(
                Integer.class,
                "mappingA",
                Thread.currentThread().getContextClassLoader(),
                true
        );

        assertSame("The String mapping should be retrieved for String.class",
                stringMapping, stringResult);
        assertSame("The Integer mapping should be retrieved for Integer.class",
                integerMapping, integerResult);
        assertNotSame("Mappings with same name but different classes should be distinct",
                stringResult, integerResult);
    }



    @Test
    public void getQueryResultMapping_whenSourceModeDoesNotIncludeQuery_returnsNull() {
        /*
         * White-box target:
         * getQueryResultMappingInternal(...) contiene il ramo:
         *
         *   if ((getSourceMode() & MODE_QUERY) == 0)
         *       return null;
         *
         * Obiettivo:
         * coprire il caso in cui il repository non è configurato per caricare
         * query result mappings dalla sorgente metadata.
         *
         * Setup:
         * Configuriamo una MetaDataFactory mockata per evitare NPE nel caso in cui
         * il metodo arrivasse al caricamento metadata. Impostiamo poi il source mode
         * in modo da escludere MODE_QUERY.
         *
         * Oracolo:
         * Poiché MODE_QUERY non è abilitato e il mapping non è in cache, il metodo
         * deve restituire null senza rendere disponibile alcun QueryResultMapping.
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        repository.setSourceMode(0);

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                Thread.currentThread().getContextClassLoader(),
                false
        );

        assertNull("Without MODE_QUERY, no query result mapping should be loaded", result);
    }



    @Test
    public void getQueryResultMapping_withNullClassAndFactoryScope_returnsLoadedMapping() {
        /*
         * White-box target:
         * getQueryResultMappingInternal(...) contiene il ramo:
         *
         *   if (cls == null)
         *       cls = getMetaDataFactory().getResultSetMappingScope(name, envLoader);
         *
         * Obiettivo:
         * coprire il caso in cui cls è null e il metodo chiede alla MetaDataFactory
         * di risolvere lo scope del result mapping.
         *
         * Dettaglio white-box importante:
         * La chiave di ricerca viene costruita prima della risoluzione dello scope:
         *
         *   Object key = getQueryResultKey(cls, name);
         *
         * Quindi, se cls è null, la chiave resta basata su:
         *
         *   (null, "mappingA")
         *
         * anche se successivamente getResultSetMappingScope(...) restituisce
         * String.class. Per questo motivo, durante load(...), il mapping deve essere
         * aggiunto con defining type null, non con String.class.
         *
         * Oracolo:
         * getQueryResultMapping(null, "mappingA", loader, true) deve restituire il
         * mapping caricato durante load(...), associato alla chiave originaria con
         * cls null.
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        doReturn(String.class)
                .when(factory)
                .getResultSetMappingScope("mappingA", loader);

        doAnswer(invocation -> {
            repository.addQueryResultMapping(null, "mappingA");
            return null;
        }).when(factory).load(eq(String.class), anyInt(), eq(loader));

        QueryResultMapping result = repository.getQueryResultMapping(
                null,
                "mappingA",
                loader,
                true
        );

        assertNotNull("The mapping loaded by the MetaDataFactory should be returned", result);
        assertEquals("mappingA", result.getName());
        assertEquals("The mapping should be associated with the original null class key",
                null, result.getDefiningType());
    }


    /*
    #####################################################################################################
                                                Mutation testing
    #####################################################################################################
     */



    @Test
    public void getQueryResultMapping_whenSourceModeHasMetaButNotQuery_returnsNullWithoutLoading() {
        /*
         * Motivazione PIT:
         * PIT ha segnalato un survived sulla riga:
         *
         *   if ((getSourceMode() & MODE_QUERY) == 0)
         *       return null;
         *
         * con mutazione:
         *
         *   bitwise AND -> OR
         *
         * Obiettivo:
         * usare un sourceMode non nullo ma senza MODE_QUERY, ad esempio MODE_META.
         * In questo modo il codice originale deve restituire null.
         *
         * Oracolo:
         * getQueryResultMapping(...) deve restituire null e non deve invocare
         * MetaDataFactory.load(...).
         */
        MappingRepository repository = new MappingRepository();

        MetaDataFactory factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);

        repository.setSourceMode(MetaDataRepository.MODE_META);

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                "mappingA",
                Thread.currentThread().getContextClassLoader(),
                false
        );

        assertNull("Without MODE_QUERY, the mapping should not be loaded", result);
        verify(factory, never()).load(any(), anyInt(), any());
    }



}
