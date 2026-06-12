package org.apache.openjpa.jdbc.meta;

import org.apache.openjpa.meta.MetaDataFactory;
import org.apache.openjpa.util.MetaDataException;
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
         * - B1: name non null e non vuoto.
         *
         * Oracolo:
         * il metodo deve restituire un QueryResultMapping non null con nome coerente rispetto all'input e tipi string.class.
         */

        QueryResultMapping result = repository.addQueryResultMapping(String.class, MAPPING_NAME);

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
         * - B1: name non null e non vuoto.
         *
         * Oracolo:
         * il metodo deve restituire un QueryResultMapping
         * non null con nome coerente con l'input e tipo nullo.
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
         * - B2: name null.
         *
         * Oracolo:
         * il metodo deve restituire un QueryResultMapping non null di tipo string.class e nome null
         */

        QueryResultMapping result = repository.addQueryResultMapping(String.class, null);

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
         * - B3: name vuoto.
         * Oracolo:
         * il metodo deve restituire un QueryResultMapping non null con nome uguale alla stringa vuota.
         */

        QueryResultMapping result = repository.addQueryResultMapping(String.class, "");

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

    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistFalse_returnsNullWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A1: cls non null.
         * - B1: name non null e non vuoto.
         * - C1: loader non null.
         * - D2: mustExist = false.
         *
         * Oracolo:
         * il metodo deve restituire null.
         */
        setUpRepositoryWithMockedFactory();

        QueryResultMapping result = repository.getQueryResultMapping(String.class, MAPPING_NAME, loader, false);

        assertNull("No mapping was added, so the result should be null", result);

    }


    @Ignore("oracolo errato")
    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistTrue_throwsNullPointerExceptionWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A1: cls non null.
         * - B1: name non null e non vuoto.
         * - C1: loader non null.
         * - D1: mustExist = true.
         *
         * Oracolo:
         * il metodo deve lanciare un eccezzione di tipo NullPointer causa no added mapping
         */

        setUpRepositoryWithMockedFactory();

        assertThrows(NullPointerException.class, () -> repository.getQueryResultMapping(String.class, MAPPING_NAME, loader, true));

    }

    @Test
    public void getQueryResultMapping_withNonNullInputsAndMustExistTrue_throwsMetadataExceptionWhenNoMappingWasAdded() {
        /*
         * Category Partition:
         * - A1: cls non null.
         * - B1: name non null e non vuoto.
         * - C1: loader non null.
         * - D1: mustExist = true.
         *
         * Oracolo:
         * il metodo deve lanciare un eccezzione di tipo MetaData causa no added mapping
         */

        setUpRepositoryWithMockedFactory();

        assertThrows(MetaDataException.class, () -> repository.getQueryResultMapping(String.class, MAPPING_NAME, loader, true));

    }



    @Test
    public void getQueryResultMapping_whenMetaDataFactoryLoadsMapping_returnsLoadedMapping() {
        /*
         * Category Partition:
         * - A1: cls non null.
         * - B1: name non null e non vuoto.
         * - C1: loader non null.
         * - D1: mustExist = true.
         *
         * Oracolo:
         * il metodo deve restituire il QueryResultMapping non nullo con nome coerente con l'input e di tipo String.class.
         */
        setUpRepositoryWithMockedFactory();

        doAnswer(invocation -> {
            repository.addQueryResultMapping(String.class, MAPPING_NAME);
            return null;
        }).when(factory).load(eq(String.class), anyInt(), eq(loader));

        QueryResultMapping result = repository.getQueryResultMapping(String.class, MAPPING_NAME, loader, true);

        assertNotNull("The mapping loaded by the MetaDataFactory should be returned", result);
        assertEquals(MAPPING_NAME, result.getName());
        assertEquals(String.class, result.getDefiningType());

    }


    @Test
    public void getQueryResultMapping_withNullClassAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A2: cls null.
         * - B1: name non null e non vuoto.
         * - C1: loader non null.
         * - D2: mustExist = false.
         *
         *
         * Oracolo:
         * il metodo deve restituire null.
         */
        setUpRepositoryWithMockedFactory();
        repository.addQueryResultMapping(String.class, MAPPING_NAME);

        QueryResultMapping result =
                repository.getQueryResultMapping(null, MAPPING_NAME, loader, false);

        assertNull("A mapping defined for String.class should not be resolved when cls is null", result);
    }


    @Test
    public void getQueryResultMapping_withNullNameAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A1: cls non null.
         * - B2: name null.
         * - C1: loader non null.
         * - D2: mustExist = false.
         *
         * Oracolo:
         * il metodo deve restituire null.
         */
        setUpRepositoryWithMockedFactory();
        repository.addQueryResultMapping(String.class, MAPPING_NAME);

        QueryResultMapping result =
                repository.getQueryResultMapping(String.class, null, loader, false);

        assertNull("With null name, no mapping should be resolved", result);
    }

    @Test
    public void getQueryResultMapping_withEmptyNameAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A1: cls non null.
         * - B3: name vuoto.
         * - C1: loader non null.
         * - D2: mustExist = false.
         *
         * Oracolo:
         * il metodo deve restituire null.
         */
        setUpRepositoryWithMockedFactory();
        repository.addQueryResultMapping(String.class, MAPPING_NAME);

        QueryResultMapping result =
                repository.getQueryResultMapping(String.class, "", loader, false);

        assertNull("With empty name, no mapping should be resolved", result);
    }


    @Test
    public void getQueryResultMapping_withNullLoaderAndMustExistFalse_returnsNull() {
        /*
         * Category Partition:
         * - A1: cls non null.
         * - B1: name non null e non vuoto.
         * - C2: loader null.
         * - D2: mustExist = false.
         *
         * Oracolo:
         * il metodo deve restituire null.
         */
        setUpRepositoryWithMockedFactory();

        QueryResultMapping result = repository.getQueryResultMapping(String.class, MAPPING_NAME, null, false);

        assertNull("With null loader and no mapping, the result should be null", result);
    }

    private void setUpRepositoryWithMockedFactory() {
        factory = mock(MetaDataFactory.class);
        repository.setMetaDataFactory(factory);
    }

}
