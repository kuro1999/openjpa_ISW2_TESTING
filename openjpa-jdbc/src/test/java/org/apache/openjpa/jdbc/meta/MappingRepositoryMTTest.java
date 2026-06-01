package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.meta.MetaDataRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MappingRepositoryMTTest {
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

        setUpRepositoryWithMockedFactory();

        repository.setSourceMode(MetaDataRepository.MODE_META);

        QueryResultMapping result = repository.getQueryResultMapping(
                String.class,
                MAPPING_NAME,
                loader,
                false
        );

        assertNull("Without MODE_QUERY, the mapping should not be loaded", result);
        verify(factory, never()).load(any(), anyInt(), any());
    }

    private void setUpRepositoryWithMockedFactory() {
        factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);
    }
}
