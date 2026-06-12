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
        factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);
        loader = Thread.currentThread().getContextClassLoader();
    }



    @Test
    public void addQueryResultMapping_withSameClassAndName_replacesPreviousMappingInCache() {
        /*
         *
         * Oracolo:
         * le due chiamate devono creare due istanze diverse,
         * getQueryResultMapping deve restituire la seconda istanza.
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
        assertSame("The mapping should be the last one added",
                second, result);
    }


    @Test
    public void getQueryResultMapping_whenMappingIsAlreadyCached_returnsCachedMappingWithoutMetaDataFactory() {
        /*
         *
         * Oracolo:
         * il metodo deve restituire lo stesso oggetto
         * già presente nella cache del repository.
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
        verify(factory, never()).getResultSetMappingScope(anyString(), any(ClassLoader.class));
    }




    @Test
    public void getQueryResultMapping_withSameNameButDifferentClasses_returnsClassSpecificMapping() {
        /*
         *
         * Oracolo:
         * recuperando con String.class deve essere restituito il mapping associato
         *   a String.class,
         * recuperando con Integer.class deve essere restituito il mapping associato
         *   a Integer.class,
         * i due mapping devono essere istanze distinte.
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
         *
         * Oracolo:
         * Poiché MODE_QUERY non è abilitato il metodo
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
         * Oracolo:
         * il metodo deve restituire il
         * mapping caricato durante load, associato alla chiave originaria con
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
