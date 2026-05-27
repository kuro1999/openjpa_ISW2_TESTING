package org.apache.openjpa.jdbc.meta.randoop;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MappingRepositoryRandoopErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Ignore
    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopErrorTest0.test1");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.endConfiguration();
    }

    @Ignore
    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopErrorTest0.test2");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = mappingRepository0.isNonDefaultMappingAllowed();
    }

    @Ignore
    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopErrorTest0.test3");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.QueryMetaData queryMetaData4 = mappingRepository0.searchQueryMetaDataByName("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData7 = mappingRepository5.addSequenceMetaData("");
        java.lang.Class<?> wildcardClass8 = mappingRepository5.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping10 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass8, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.endConfiguration();
    }

    @Ignore
    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopErrorTest0.test4");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        boolean boolean2 = mappingRepository0.getPreload();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller3 = mappingRepository0.getStrategyInstaller();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.endConfiguration();
    }
}

