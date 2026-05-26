package org.apache.openjpa.jdbc.meta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.meta.MetaDataRepository;
import org.apache.openjpa.util.MetaDataException;
import org.junit.Before;
import org.junit.Test;

public class MappingRepositoryIT {

    private static final String RESULT_MAPPING_NAME = "mappingA";
    private static final String MISSING_MAPPING_NAME = "missingMapping";

    private MappingRepository repository;
    private MetaDataFactory factory;
    private ClassLoader loader;

    @Before
    public void setUp() {
        /*
         * Integration test mirato.
         *
         * Oggetto principale reale:
         * - MappingRepository.
         *
         * Collaboratore controllato:
         * - MetaDataFactory.
         *
         * Il test non adotta un approccio big bang: non viene avviato
         * l'intero framework OpenJPA, non vengono caricati entity manager,
         * database, schema reali o parser completi dei metadata.
         *
         * Il focus è esclusivamente sulla comunicazione tra MappingRepository
         * e MetaDataFactory durante il caricamento di un QueryResultMapping.
         */
        repository = new MappingRepository();

        /*
         * La MetaDataFactory viene mockata non perché il test sia un unit test
         * puro, ma perché vogliamo controllare il collaboratore esterno e
         * osservare il protocollo di interazione tra i due moduli selezionati.
         *
         * In questo modo il test rimane un integration test top-down mirato:
         * MappingRepository è il modulo superiore, MetaDataFactory è il
         * collaboratore inferiore coinvolto nel caricamento dei metadata.
         */
        factory = org.mockito.Mockito.mock(MetaDataFactory.class);

        loader = Thread.currentThread().getContextClassLoader();

        /*
         * Collegamento tra i due componenti oggetto del test.
         */
        repository.setMetaDataFactory(factory);

        /*
         * Abilitiamo il source mode relativo ai query metadata.
         *
         * Nel metodo getQueryResultMappingInternal(...), MappingRepository
         * invoca MetaDataFactory.load(...) solo se MODE_QUERY è attivo.
         * Senza questa configurazione, il repository si fermerebbe prima
         * e restituirebbe null senza comunicare con la factory.
         */
        repository.setSourceMode(MetaDataRepository.MODE_QUERY, true);
    }

    @Test
    public void getQueryResultMapping_whenCacheMiss_delegatesToMetaDataFactoryAndReturnsLoadedMapping() {
        /*
         * TC1 - Cache miss con caricamento riuscito.
         *
         * Obiettivo:
         * verificare che MappingRepository, quando non trova un
         * QueryResultMapping nella propria cache, comunichi correttamente
         * con MetaDataFactory per caricare il mapping richiesto.
         *
         * Moduli coinvolti:
         * - MappingRepository reale;
         * - MetaDataFactory controllata tramite mock.
         *
         * Protocollo di comunicazione atteso:
         * 1. MappingRepository riceve una richiesta per RESULT_MAPPING_NAME.
         * 2. Il mapping non è presente nella cache interna.
         * 3. Poiché cls = null, MappingRepository chiede alla MetaDataFactory
         *    lo scope del result-set mapping tramite getResultSetMappingScope(...).
         * 4. MappingRepository invoca MetaDataFactory.load(...) con:
         *    - la classe scope restituita dalla factory;
         *    - MODE_META | MODE_MAPPING;
         *    - il classloader corrente.
         * 5. Durante il caricamento, la factory registra il mapping nel repository.
         * 6. MappingRepository recupera il mapping dalla cache e lo restituisce.
         *
         * Oracolo:
         * - il risultato deve essere non nullo;
         * - il nome del QueryResultMapping deve coincidere con quello richiesto;
         * - il mapping restituito deve essere lo stesso oggetto presente in cache;
         * - MetaDataFactory deve essere stata invocata secondo il protocollo atteso.
         */

        doReturn(MappingRepositoryIT.class)
                .when(factory)
                .getResultSetMappingScope(RESULT_MAPPING_NAME, loader);

        doAnswer(invocation -> {
            /*
             * Simuliamo l'effetto osservabile del caricamento metadata:
             * la factory registra nel repository il QueryResultMapping richiesto.
             *
             * Non stiamo testando il parser dei metadata o il caricamento reale
             * da annotazioni/XML. Stiamo testando che MappingRepository sappia
             * collaborare con il suo metadata loader e usare il risultato prodotto.
             */
            repository.addQueryResultMapping(null, RESULT_MAPPING_NAME);
            return null;
        }).when(factory).load(
                eq(MappingRepositoryIT.class),
                eq(MetaDataRepository.MODE_META | MetaDataRepository.MODE_MAPPING),
                eq(loader)
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
                eq(MappingRepositoryIT.class),
                eq(MetaDataRepository.MODE_META | MetaDataRepository.MODE_MAPPING),
                eq(loader)
        );
    }

    @Test
    public void getQueryResultMapping_whenFactoryDoesNotLoadMappingAndMustExist_throwsMetaDataException() {
        /*
         * TC2 - Cache miss con caricamento non risolutivo.
         *
         * Obiettivo:
         * verificare il comportamento negativo della comunicazione tra
         * MappingRepository e MetaDataFactory.
         *
         * Scenario:
         * - il mapping richiesto non è presente nella cache del repository;
         * - MappingRepository comunica correttamente con MetaDataFactory;
         * - MetaDataFactory viene invocata, ma non registra alcun
         *   QueryResultMapping nel repository;
         * - poiché mustExist = true, MappingRepository deve segnalare
         *   che il mapping richiesto non è disponibile.
         *
         * Moduli coinvolti:
         * - MappingRepository reale;
         * - MetaDataFactory controllata tramite mock.
         *
         * Protocollo di comunicazione atteso:
         * 1. MappingRepository chiede alla factory lo scope del mapping.
         * 2. MappingRepository invoca factory.load(...).
         * 3. Dopo il caricamento, il mapping rimane assente.
         * 4. MappingRepository solleva MetaDataException.
         *
         * Oracolo:
         * - deve essere sollevata MetaDataException;
         * - la factory deve essere stata comunque invocata;
         * - l'eccezione deve dipendere dal fatto che il mapping richiesto
         *   non è stato reso disponibile dopo il caricamento.
         */

        doReturn(MappingRepositoryIT.class)
                .when(factory)
                .getResultSetMappingScope(MISSING_MAPPING_NAME, loader);

        doAnswer(invocation -> {
            /*
             * La factory viene chiamata, ma non registra alcun mapping.
             * Questo simula un caricamento che non produce il result mapping
             * richiesto.
             */
            return null;
        }).when(factory).load(
                eq(MappingRepositoryIT.class),
                eq(MetaDataRepository.MODE_META | MetaDataRepository.MODE_MAPPING),
                eq(loader)
        );

        assertThrows(MetaDataException.class, () ->
                repository.getQueryResultMapping(
                        null,
                        MISSING_MAPPING_NAME,
                        loader,
                        true
                )
        );

        verify(factory).getResultSetMappingScope(MISSING_MAPPING_NAME, loader);
        verify(factory).load(
                eq(MappingRepositoryIT.class),
                eq(MetaDataRepository.MODE_META | MetaDataRepository.MODE_MAPPING),
                eq(loader)
        );
    }
}
