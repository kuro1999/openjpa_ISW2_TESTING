package org.apache.openjpa.jdbc.meta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.meta.MetaDataRepository;
import org.junit.Before;
import org.junit.Test;

public class MappingRepositoryIT {

    private static final String RESULT_MAPPING_NAME = "mappingA";

    private MappingRepository repository;
    private MetaDataFactory factory;
    private ClassLoader loader;

    @Before
    public void setUp() {
        /*
         * Integration test top-down mirato con boundary mockato.
         *
         * Componente reale sotto test:
         * - MappingRepository.
         *
         * Componente mockato:
         * - MetaDataFactory.
         *
         * Oggetto reale osservato come risultato:
         * - QueryResultMapping.
         *
         * Questo test non è un integration test end-to-end dell'intero framework
         * OpenJPA.
         *
         * L'obiettivo è configurare uno stato iniziale, attivare il flusso di
         * caricamento dei query metadata e verificare che MappingRepository reagisca
         * correttamente all'esito prodotto dal boundary MetaDataFactory.
         *
         * La comunicazione verificata è:
         * - MappingRepository -> MetaDataFactory.
         *
         * Il risultato verificato tramite assert è:
         * - presenza, cache e restituzione di un QueryResultMapping reale.
         */
        repository = new MappingRepository();

        /*
         * MetaDataFactory viene mockata perché in questo test rappresenta il
         * boundary esterno del caricamento metadata.
         *
         * Non vogliamo testare il parser reale dei metadata OpenJPA, né il
         * caricamento da annotazioni/XML. Vogliamo invece controllare in modo
         * deterministico l'esito del caricamento e verificare come MappingRepository
         * usa tale esito.
         */
        factory = org.mockito.Mockito.mock(MetaDataFactory.class);

        loader = Thread.currentThread().getContextClassLoader();

        /*
         * Colleghiamo il repository reale al boundary mockato.
         * Da questo momento MappingRepository potrà comunicare con MetaDataFactory
         * tramite getResultSetMappingScope(...) e load(...).
         */
        repository.setMetaDataFactory(factory);

        /*
         * Abilitiamo il source mode relativo ai query metadata.
         *
         * Nel metodo getQueryResultMappingInternal(...), MappingRepository invoca
         * MetaDataFactory.load(...) solo se MODE_QUERY è attivo. Senza questa
         * configurazione, il repository si fermerebbe prima e restituirebbe null
         * senza attraversare il boundary di caricamento.
         */
        repository.setSourceMode(MetaDataRepository.MODE_QUERY, true);
    }

    @Test
    public void getQueryResultMapping_whenCacheMiss_delegatesToMetaDataFactoryAndReturnsLoadedMapping() {
        /*
         * TC - Cache miss con caricamento simulato riuscito.
         *
         * Obiettivo:
         * verificare che MappingRepository, quando non trova un QueryResultMapping
         * nella propria cache, comunichi con MetaDataFactory e gestisca correttamente
         * l'effetto prodotto dal caricamento metadata.
         *
         * Comunicazione testata:
         * - MappingRepository -> MetaDataFactory.
         *
         * Oracolo:
         * - il risultato deve essere non nullo;
         * - il nome del QueryResultMapping deve coincidere con quello richiesto;
         * - il mapping restituito deve essere lo stesso oggetto presente in cache;
         * - MetaDataFactory deve essere stata invocata secondo il protocollo atteso.
         */
        doReturn(String.class)
                .when(factory)
                .getResultSetMappingScope(RESULT_MAPPING_NAME, loader);

        doAnswer(invocation -> {
            /*
             * Simuliamo l'effetto osservabile di un caricamento metadata riuscito.
             *
             * MetaDataFactory.load(...) non restituisce direttamente un
             * QueryResultMapping. Nel flusso reale, durante il caricamento, il
             * mapping viene reso disponibile nel repository. Qui simuliamo tale
             * effetto registrando un QueryResultMapping reale nella cache del
             * repository.
             */
            repository.addQueryResultMapping(null, RESULT_MAPPING_NAME);
            return null;
        }).when(factory).load(
                String.class,
                MetaDataRepository.MODE_META | MetaDataRepository.MODE_MAPPING,
                loader
        );

        QueryResultMapping result = repository.getQueryResultMapping(
                null,
                RESULT_MAPPING_NAME,
                loader,
                true
        );

        assertNotNull(result);
        assertEquals(RESULT_MAPPING_NAME, result.getName());

        QueryResultMapping cached = repository.getCachedQueryResultMapping(
                null,
                RESULT_MAPPING_NAME
        );

        assertSame(result, cached);

        verify(factory).getResultSetMappingScope(RESULT_MAPPING_NAME, loader);
        verify(factory).load(
                String.class,
                MetaDataRepository.MODE_META | MetaDataRepository.MODE_MAPPING,
                loader
        );
    }
}
