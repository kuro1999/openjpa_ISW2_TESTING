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
         * Integration test top-down con boundary mockato.
         *
         * Componente reale sotto test:
         * - MappingRepository.
         *
         * Componente mockato:
         * - MetaDataFactory.
         *
         * Oggetto reale osservato come risultato:
         * - QueryResultMapping.
         * La comunicazione verificata è:
         * - MappingRepository -> MetaDataFactory.
         *
         * Il risultato verificato tramite assert è:
         * - presenza, cache e restituzione di un QueryResultMapping reale.
         */
        repository = new MappingRepository();

        factory = org.mockito.Mockito.mock(MetaDataFactory.class);

        loader = Thread.currentThread().getContextClassLoader();

        repository.setMetaDataFactory(factory);

        repository.setSourceMode(MetaDataRepository.MODE_QUERY, true);
    }

    @Test
    public void getQueryResultMapping_whenCacheMiss_delegatesToMetaDataFactoryAndReturnsLoadedMapping() {
        /*
         *
         * Oracolo:
         * il risultato deve essere non nullo,
         * il nome del QueryResultMapping deve coincidere con quello richiesto,
         * il mapping restituito deve essere lo stesso oggetto presente in cache,
         * MetaDataFactory deve essere stata invocata secondo il protocollo atteso.
         */
        doReturn(String.class)
                .when(factory)
                .getResultSetMappingScope(RESULT_MAPPING_NAME, loader);

        doAnswer(invocation -> {

            repository.addQueryResultMapping(null, RESULT_MAPPING_NAME);
            return null;
        }).when(factory).load(
                String.class,
                MetaDataRepository.MODE_META | MetaDataRepository.MODE_MAPPING,
                loader
        );

        /*
        * durante questa get ci sarà un cache miss con conseguente chiamata alla factory per il retrieve
        * per poi essere inserita in cache
        * sono necessarie sia MODE_META che MODE_MAPPING perche viene fatta la richieseta sia alla factory sia per
        * il mapping richiesto
        */

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
