package org.apache.openjpa.jdbc.meta.randoopC4;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MappingRepositoryRandoopC4ErrorTest0 {

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

    @Ignore("CI stuff")
    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test01");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.clear();
    }

    @Ignore("CI stuff")
    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test02");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = mappingRepository0.isNonDefaultMappingAllowed();
    }

    @Ignore("CI stuff")
    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test03");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData queryMetaData2 = mappingRepository0.searchQueryMetaDataByName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.clear();
    }

    @Ignore("CI stuff")
    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test04");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray3 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray4 = mappingRepository0.getSequenceMetaDatas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.close();
    }

    @Ignore("CI stuff")
    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test05");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray3 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray4 = mappingRepository0.getMetaDatas();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup5 = mappingRepository0.getSchemaGroup();
    }

    @Ignore("CI stuff")
    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test06");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray1 = mappingRepository0.getQueryResultMappings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.close();
    }

    @Ignore("CI stuff")
    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test07");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        int int3 = mappingRepository0.getResolve();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.endConfiguration();
    }

    @Ignore("CI stuff")
    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test08");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        java.lang.String str4 = mappingRepository0.getClosestAliasName("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository5.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray7 = mappingRepository5.getQueryMetaDatas();
        java.lang.Class<?> wildcardClass8 = queryMetaDataArray7.getClass();
        mappingRepository0.addSystemListener((java.lang.Object) queryMetaDataArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.clear();
    }

    @Ignore("CI stuff")
    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test09");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        boolean boolean3 = mappingRepository0.getPreload();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray4 = mappingRepository0.getNonMappedInterfaces();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup5 = mappingRepository0.getSchemaGroup();
    }

    @Ignore("CI stuff")
    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test10");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        boolean boolean3 = mappingRepository0.is_systemListenersActivated();
        mappingRepository0.setValidate((int) 'a', false);
        mappingRepository0.setPreload(false);
        mappingRepository0.setValidate((int) (byte) 1, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = mappingRepository0.isNonDefaultMappingAllowed();
    }

    @Ignore("CI stuff")
    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test11");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray1 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(16, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.clear();
    }

    @Ignore("CI stuff")
    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test12");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        boolean boolean3 = mappingRepository0.getPreload();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray4 = mappingRepository0.getNonMappedInterfaces();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration5 = mappingRepository0.getConfiguration();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = mappingRepository0.isNonDefaultMappingAllowed();
    }

    @Ignore("CI stuff")
    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test13");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray3 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.jdbc.meta.ClassMapping[] classMappingArray4 = mappingRepository0.getMappings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = mappingRepository0.isNonDefaultMappingAllowed();
    }

    @Ignore("CI stuff")
    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test14");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        boolean boolean4 = mappingRepository0.is_systemListenersActivated();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = mappingRepository0.isNonDefaultMappingAllowed();
    }

    @Ignore("CI stuff")
    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC4ErrorTest0.test15");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setResolve((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mappingRepository0.clear();
    }
}

