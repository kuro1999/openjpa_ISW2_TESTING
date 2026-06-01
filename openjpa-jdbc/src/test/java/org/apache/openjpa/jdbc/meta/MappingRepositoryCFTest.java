package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.meta.MetaDataFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.doAnswer;

public class MappingRepositoryCFTest {

    private static final String MAPPING_NAME = "mappingA";

    private MappingRepository repository;
    private MetaDataFactory factory;
    private ClassLoader loader;

    @Before
    public void setUp() {
        repository = new MappingRepository();
        loader = Thread.currentThread().getContextClassLoader();
    }


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

        QueryResultMapping added = repository.addQueryResultMapping(
                String.class,
                MAPPING_NAME
        );

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
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

        QueryResultMapping first = repository.addQueryResultMapping(
                String.class,
                MAPPING_NAME
        );

        QueryResultMapping second = repository.addQueryResultMapping(
                String.class,
                MAPPING_NAME
        );

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
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

        QueryResultMapping stringMapping = repository.addQueryResultMapping(
                String.class,
                MAPPING_NAME
        );

        QueryResultMapping integerMapping = repository.addQueryResultMapping(
                Integer.class,
                MAPPING_NAME
        );

        QueryResultMapping stringResult = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
                true
        );

        QueryResultMapping integerResult = repository.getQueryResultMapping(
                Integer.class,
                MAPPING_NAME,
                loader,
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
        setUpRepositoryWithMockedFactory();

        repository.setSourceMode(0);

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
                false
        );

        assertNull("Without MODE_QUERY, no query result mapping should be loaded", result);
        verify(factory, never()).load(any(), anyInt(), any());
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
         *   (null, MAPPING_NAME)
         *
         * anche se successivamente getResultSetMappingScope(...) restituisce
         * String.class. Per questo motivo, durante load(...), il mapping deve essere
         * aggiunto con defining type null, non con String.class.
         *
         * Oracolo:
         * getQueryResultMapping(null, MAPPING_NAME, loader, true) deve restituire il
         * mapping caricato durante load(...), associato alla chiave originaria con
         * cls null.
         */

        setUpRepositoryWithMockedFactory();

        doReturn(String.class)
                .when(factory)
                .getResultSetMappingScope(MAPPING_NAME, loader);

        doAnswer(invocation -> {
            repository.addQueryResultMapping(null, MAPPING_NAME);
            return null;
        }).when(factory).load(eq(String.class), anyInt(), eq(loader));

        QueryResultMapping result = repository.getQueryResultMapping(
                null,
                MAPPING_NAME,
                loader,
                true
        );

        assertNotNull("The mapping loaded by the MetaDataFactory should be returned", result);
        assertEquals(MAPPING_NAME, result.getName());
        assertNull("The mapping should be associated with the original null class key", result.getDefiningType());
    }

    private void setUpRepositoryWithMockedFactory() {
        factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);
    }

}
