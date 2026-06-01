package org.apache.openjpa.jdbc.meta.randoopC1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MappingRepositoryRandoopC1Test0 {

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

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test001");
        int int0 = org.apache.openjpa.meta.MetaDataModes.MODE_QUERY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test002");
        int int0 = org.apache.openjpa.meta.MetaDataModes.MODE_META;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test003");
        int int0 = org.apache.openjpa.meta.MetaDataModes.MODE_MAPPING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test004");
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration0 = null;
        boolean boolean1 = org.apache.openjpa.meta.MetaDataRepository.needsPreload(openJPAConfiguration0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test005");
        int int0 = org.apache.openjpa.meta.MetaDataRepository.VALIDATE_UNENHANCED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test006");
        int int0 = org.apache.openjpa.meta.MetaDataRepository.VALIDATE_META;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test007");
        int int0 = org.apache.openjpa.meta.MetaDataModes.MODE_ALL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test008");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection3 = mappingRepository0.loadPersistentTypes(true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test009");
        int int0 = org.apache.openjpa.meta.MetaDataRepository.VALIDATE_MAPPING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test010");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = mappingRepository0.getBi_1ToM_JoinTableField(fieldMapping1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test011");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData queryMetaData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.QueryMetaData queryMetaData2 = mappingRepository0.addQueryMetaData(queryMetaData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.QueryMetaData.getName()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test012");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mappingRepository0.isBi1To1JT(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test013");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = mappingRepository0.isBiMTo1JT(fieldMapping4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test014");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Object obj4 = null;
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping7 = mappingRepository0.getMapping(obj4, classLoader5, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.MetaDataException; message: Could not locate metadata for the class using oid \"null\" of type \"?\".  Registered oid type mappings: \"{}\"");
        } catch (org.apache.openjpa.util.MetaDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test015");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test016");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.SequenceMetaData sequenceMetaData7 = mappingRepository0.getSequenceMetaData("", classLoader5, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.MetaDataException; message: Could not locate the sequence with name \"\".  It is possible that the metadata file containing the sequence has not been parsed yet.  Make sure to use a persistent class whose metadata is in the same file somewhere in your application before requesting the sequence.");
        } catch (org.apache.openjpa.util.MetaDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test017");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData10 = mappingRepository0.getOrderByField(classMetaData8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test018");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mappingRepository0.isNonDefaultMappingAllowed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test019");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = mappingRepository0.isUni1To1JT(fieldMapping2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test020");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test021");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.SequenceMetaData sequenceMetaData5 = mappingRepository0.getSequenceMetaData("hi!", classLoader3, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.MetaDataException; message: Could not locate the sequence with name \"hi!\".  It is possible that the metadata file containing the sequence has not been parsed yet.  Make sure to use a persistent class whose metadata is in the same file somewhere in your application before requesting the sequence.");
        } catch (org.apache.openjpa.util.MetaDataException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test022");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = mappingRepository0.isBi1To1JT(fieldMapping6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test023");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = mappingRepository0.isBidirectional(fieldMapping4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test024");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = mappingRepository0.isBiMTo1JT(fieldMapping6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test025");
        int int0 = org.apache.openjpa.meta.MetaDataRepository.VALIDATE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test026");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        org.apache.openjpa.meta.QueryMetaData queryMetaData7 = mappingRepository0.getCachedQueryMetaData("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(queryMetaData7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test027");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mappingRepository0.isUni1ToMFK(fieldMapping5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test028");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = mappingRepository0.getBi_1ToM_JoinTableField(fieldMapping6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test029");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = mappingRepository0.isUniMTo1JT(fieldMapping2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test030");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mappingRepository0.isBiMTo1JT(fieldMapping10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test031");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.QueryMetaData queryMetaData9 = mappingRepository0.searchQueryMetaDataByName("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mappingRepository0.isUni1To1JT(fieldMapping10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(queryMetaData9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test032");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection9 = mappingRepository0.loadPersistentTypes(false, classLoader7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test033");
        int int0 = org.apache.openjpa.meta.MetaDataModes.MODE_ANN_MAPPING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test034");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test035");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strategyInstaller2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test036");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection6 = mappingRepository0.loadPersistentTypes(true, classLoader4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test037");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        java.util.Collection<java.lang.String> strCollection3 = mappingRepository0.getAliasNames();
        org.junit.Assert.assertNotNull(sequenceMetaData2);
        org.junit.Assert.assertNotNull(strCollection3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test038");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = mappingRepository0.isUni1ToMFK(fieldMapping8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test039");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        boolean boolean2 = mappingRepository0.getPreload();
        org.apache.openjpa.meta.ClassMetaData classMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData5 = mappingRepository0.getOrderByField(classMetaData3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test040");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.ClassMetaData classMetaData3 = null;
        boolean boolean4 = mappingRepository0.removeMetaData(classMetaData3);
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test041");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection12 = mappingRepository0.loadPersistentTypes(false, classLoader10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test042");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setConfiguration(configuration6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.conf.OpenJPAConfiguration.getLog(String)\" because \"this._conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test043");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test044");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.ClassMetaData classMetaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData4 = mappingRepository0.getOrderByField(classMetaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test045");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.meta.ClassMetaData classMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData7 = mappingRepository0.getOrderByField(classMetaData5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test046");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        mappingRepository0.startConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test047");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mappingRepository0.isUni1To1JT(fieldMapping5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test048");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository7.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray9 = mappingRepository7.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository7.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        java.lang.Class class16 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping18 = mappingRepository12.addQueryResultMapping(class16, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository19 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping20 = null;
        boolean boolean21 = mappingRepository19.removeQueryResultMapping(queryResultMapping20);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray22 = mappingRepository19.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller23 = null;
        mappingRepository19.setStrategyInstaller(strategyInstaller23);
        mappingRepository19.startConfiguration();
        java.lang.Class<?> wildcardClass26 = mappingRepository19.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping28 = mappingRepository12.getCachedQueryResultMapping((java.lang.Class) wildcardClass26, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping30 = mappingRepository7.getCachedQueryResultMapping((java.lang.Class) wildcardClass26, "");
        boolean boolean32 = mappingRepository0.removeQueryResultMapping((java.lang.Class) wildcardClass26, "hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = mappingRepository0.isUni1To1JT(fieldMapping33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMappingArray9);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray9, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray22);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray22, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(queryResultMapping28);
        org.junit.Assert.assertNull(queryResultMapping30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test049");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = mappingRepository0.getMetaModel(classMetaData3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test050");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.junit.Assert.assertNotNull(sequenceMetaData2);
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test051");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = mappingRepository0.getMetaModel(classMetaData9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test052");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test053");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository7.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray9 = mappingRepository7.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository7.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        java.lang.Class class16 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping18 = mappingRepository12.addQueryResultMapping(class16, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository19 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping20 = null;
        boolean boolean21 = mappingRepository19.removeQueryResultMapping(queryResultMapping20);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray22 = mappingRepository19.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller23 = null;
        mappingRepository19.setStrategyInstaller(strategyInstaller23);
        mappingRepository19.startConfiguration();
        java.lang.Class<?> wildcardClass26 = mappingRepository19.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping28 = mappingRepository12.getCachedQueryResultMapping((java.lang.Class) wildcardClass26, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping30 = mappingRepository7.getCachedQueryResultMapping((java.lang.Class) wildcardClass26, "");
        boolean boolean32 = mappingRepository0.removeQueryResultMapping((java.lang.Class) wildcardClass26, "hi!");
        org.apache.openjpa.meta.ClassMetaData classMetaData33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData35 = mappingRepository0.getOrderByField(classMetaData33, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMappingArray9);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray9, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray22);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray22, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(queryResultMapping28);
        org.junit.Assert.assertNull(queryResultMapping30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test054");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults11 = mappingRepository0.getMappingDefaults();
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNull(mappingDefaults11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test055");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository17 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping18 = null;
        boolean boolean19 = mappingRepository17.removeQueryResultMapping(queryResultMapping18);
        mappingRepository17.setResolve((int) (byte) 100, false);
        int int23 = mappingRepository17.getResolve();
        java.lang.ClassLoader classLoader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData26 = mappingRepository0.getMetaData((java.lang.Object) int23, classLoader24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test056");
        int int0 = org.apache.openjpa.meta.MetaDataRepository.VALIDATE_RUNTIME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test057");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setResolve((int) (byte) 1, true);
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection9 = mappingRepository0.loadPersistentTypes(true, classLoader7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sequenceMetaData2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test058");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        boolean boolean2 = mappingRepository0.getPreload();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mappingRepository0.hasJoinTable(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappingInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test059");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test060");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray10 = mappingRepository0.getSequenceMetaDatas();
        java.lang.Class<?> wildcardClass11 = mappingRepository0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray10);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray10, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test061");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test062");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test063");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray6 = mappingRepository5.getQueryMetaDatas();
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) mappingRepository5);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection11 = mappingRepository5.loadPersistentTypes(false, classLoader9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray6);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray6, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test064");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList10 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.meta.QueryMetaData queryMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.QueryMetaData queryMetaData12 = mappingRepository0.addQueryMetaData(queryMetaData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.QueryMetaData.getName()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
        org.junit.Assert.assertNotNull(listenerList10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test065");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.meta.ClassMetaData classMetaData4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = mappingRepository0.getMetaModel(classMetaData4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test066");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = mappingRepository0.isUni1To1JT(fieldMapping11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test067");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = mappingRepository0.isUniMTo1JT(fieldMapping6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test068");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.ClassMetaData classMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData19 = mappingRepository0.getOrderByField(classMetaData17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test069");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults9 = mappingRepository0.getMappingDefaults();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertNull(mappingDefaults9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test070");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList9 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mappingRepository0.isUni1To1JT(fieldMapping10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(listenerList9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test071");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        int int3 = mappingRepository0.getResolve();
        boolean boolean4 = mappingRepository0.getPreload();
        org.junit.Assert.assertNotNull(listenerList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test072");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        mappingRepository0.startConfiguration();
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection14 = mappingRepository0.loadPersistentTypes(true, classLoader12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test073");
        int int0 = org.apache.openjpa.meta.MetaDataModes.MODE_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test074");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        mappingRepository0.setValidate(0, false);
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection12 = mappingRepository0.loadPersistentTypes(true, classLoader10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test075");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        java.lang.String str7 = mappingRepository0.getClosestAliasName("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = mappingRepository0.hasJoinColumn(fieldMapping8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getValueInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test076");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray1 = mappingRepository0.getQueryMetaDatas();
        int int2 = mappingRepository0.getSourceMode();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository3 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping4 = null;
        boolean boolean5 = mappingRepository3.removeQueryResultMapping(queryResultMapping4);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray6 = mappingRepository3.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller7 = null;
        mappingRepository3.setStrategyInstaller(strategyInstaller7);
        boolean boolean10 = mappingRepository3.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData12 = mappingRepository3.getCachedMetaData("");
        java.lang.ClassLoader classLoader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData15 = mappingRepository0.getMetaData((java.lang.Object) classMetaData12, classLoader13, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.MetaDataException; message: Could not locate metadata for the class using oid \"null\" of type \"?\".  Registered oid type mappings: \"{}\"");
        } catch (org.apache.openjpa.util.MetaDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryMetaDataArray1);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray1, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray6);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray6, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(classMetaData12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test077");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList10 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = mappingRepository0.isUni1To1JT(fieldMapping11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
        org.junit.Assert.assertNotNull(listenerList10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test078");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        org.apache.openjpa.meta.QueryMetaData queryMetaData13 = mappingRepository0.searchQueryMetaDataByName("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = mappingRepository0.isUniMTo1JT(fieldMapping14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(queryMetaData13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test079");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray6 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup7 = null;
        mappingRepository0.setSchemaGroup(schemaGroup7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray6);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray6, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test080");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test081");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        mappingRepository0.setValidate((int) (short) 0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = mappingRepository0.hasJoinTable(fieldMapping9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappingInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test082");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getCachedMetaData("hi!");
        mappingRepository0.setSourceMode((int) (short) -1);
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(classMetaData7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test083");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        int int3 = mappingRepository0.getValidate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test084");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mappingRepository0.hasJoinColumn(fieldMapping5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getValueInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test085");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults15 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults15);
        org.apache.openjpa.meta.QueryMetaData queryMetaData17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.QueryMetaData queryMetaData18 = mappingRepository0.addQueryMetaData(queryMetaData17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.QueryMetaData.getName()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test086");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray9 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        org.apache.openjpa.meta.QueryMetaData queryMetaData12 = null;
        boolean boolean13 = mappingRepository0.removeQueryMetaData(queryMetaData12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray9);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray9, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test087");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.String> strCollection5 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository6 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository6.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller8 = mappingRepository6.getStrategyInstaller();
        mappingRepository0.setStrategyInstaller(strategyInstaller8);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strategyInstaller8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test088");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = null;
        boolean boolean7 = mappingRepository5.removeQueryResultMapping(queryResultMapping6);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray8 = mappingRepository5.getQueryMetaDatas();
        java.lang.Class class9 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping11 = mappingRepository5.addQueryResultMapping(class9, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller16 = null;
        mappingRepository12.setStrategyInstaller(strategyInstaller16);
        mappingRepository12.startConfiguration();
        java.lang.Class<?> wildcardClass19 = mappingRepository12.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping21 = mappingRepository5.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping23 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        mappingRepository0.setSourceMode((-1));
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData27 = mappingRepository0.addSequenceMetaData("");
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray8);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray8, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(queryResultMapping21);
        org.junit.Assert.assertNull(queryResultMapping23);
        org.junit.Assert.assertNotNull(sequenceMetaData27);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test089");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData13 = mappingRepository0.getMetaData("hi!", classLoader11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test090");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.meta.QueryMetaData queryMetaData9 = mappingRepository0.getCachedQueryMetaData("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup10 = mappingRepository0.getSchemaGroup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.conf.JDBCConfiguration.getSchemaFactoryInstance()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(classMetaData7);
        org.junit.Assert.assertNull(queryMetaData9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test091");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = mappingRepository0.isNonDefaultMappingAllowed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test092");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        mappingRepository0.setValidate(4, false);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test093");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = mappingRepository0.getMetaModel(classMetaData10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test094");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList10 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = mappingRepository0.isBiMTo1JT(fieldMapping11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
        org.junit.Assert.assertNotNull(listenerList10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test095");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.lib.conf.Configuration configuration10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setConfiguration(configuration10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.conf.OpenJPAConfiguration.getLog(String)\" because \"this._conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test096");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        org.apache.openjpa.meta.QueryMetaData queryMetaData13 = mappingRepository0.searchQueryMetaDataByName("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = mappingRepository0.getBi_1ToM_JoinTableField(fieldMapping14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(queryMetaData13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test097");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mappingRepository0.isBidirectional(fieldMapping10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test098");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData12 = mappingRepository0.addSequenceMetaData("hi!");
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray13 = mappingRepository0.getQueryMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNotNull(sequenceMetaData12);
        org.junit.Assert.assertNotNull(queryMetaDataArray13);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray13, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test099");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory6 = mappingRepository0.getMetaDataFactory();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = mappingRepository0.hasJoinColumn(fieldMapping7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getValueInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertNull(metaDataFactory6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test100");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        boolean boolean12 = mappingRepository0.getPreload();
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = mappingRepository0.getPersistentTypeNames(true, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test101");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.QueryMetaData queryMetaData4 = mappingRepository0.searchQueryMetaDataByName("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData7 = mappingRepository5.addSequenceMetaData("");
        java.lang.Class<?> wildcardClass8 = mappingRepository5.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping10 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass8, "hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = mappingRepository0.isBiMTo1JT(fieldMapping11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNull(queryMetaData4);
        org.junit.Assert.assertNotNull(sequenceMetaData7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(queryResultMapping10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test102");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = mappingRepository0.isBi1To1JT(fieldMapping4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test103");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setResolve((int) (short) 10);
        org.apache.openjpa.meta.QueryMetaData queryMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.QueryMetaData queryMetaData6 = mappingRepository0.addQueryMetaData(queryMetaData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.QueryMetaData.getName()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test104");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        boolean boolean2 = mappingRepository0.removeSystemListener((java.lang.Object) '#');
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData6 = mappingRepository0.getMetaData("", classLoader4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test105");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray10 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration11 = mappingRepository0.getConfiguration();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray10);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray10, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test106");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData12 = mappingRepository0.addSequenceMetaData("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = mappingRepository0.isBidirectional(fieldMapping13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNotNull(sequenceMetaData12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test107");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        boolean boolean2 = mappingRepository0.getPreload();
        org.apache.openjpa.lib.log.Log log3 = mappingRepository0.getLog();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray4 = mappingRepository0.getSequenceMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(log3);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray4);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray4, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test108");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        boolean boolean2 = mappingRepository0.removeSystemListener((java.lang.Object) '#');
        int int3 = mappingRepository0.getValidate();
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getMetaData("hi!", classLoader5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test109");
        int int0 = org.apache.openjpa.meta.MetaDataModes.MODE_MAPPING_INIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test110");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        java.lang.Class class5 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping7 = mappingRepository0.addQueryResultMapping(class5, "");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults8 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults8);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet12 = mappingRepository0.getPersistentTypeNames(false, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(queryResultMapping7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test111");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray9 = mappingRepository0.getQueryResultMappings();
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection12 = mappingRepository0.loadPersistentTypes(false, classLoader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMappingArray9);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray9, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test112");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        mappingRepository0.setValidate(16, false);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = mappingRepository0.isUni1ToMFK(fieldMapping12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test113");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults11 = mappingRepository0.getMappingDefaults();
        java.lang.ClassLoader classLoader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection14 = mappingRepository0.loadPersistentTypes(true, classLoader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNull(mappingDefaults11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test114");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.String> strCollection5 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository6 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository6.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller8 = mappingRepository6.getStrategyInstaller();
        mappingRepository0.setStrategyInstaller(strategyInstaller8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration11 = mappingRepository0.getConfiguration();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strategyInstaller8);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test115");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        int int3 = mappingRepository0.getResolve();
        mappingRepository0.setValidate(8);
        org.junit.Assert.assertNotNull(listenerList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test116");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setResolve((int) (byte) 1, true);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = mappingRepository0.isBidirectional(fieldMapping6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sequenceMetaData2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test117");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test118");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        boolean boolean12 = mappingRepository0.getPreload();
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData16 = mappingRepository0.getMetaData("hi!", classLoader14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test119");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        int int7 = mappingRepository0.getSourceMode();
        mappingRepository0.preload();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test120");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData18 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setResolve(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNotNull(sequenceMetaData18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test121");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        mappingRepository0.setValidate(3);
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray8 = mappingRepository0.getMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(classMetaDataArray8);
        org.junit.Assert.assertArrayEquals(classMetaDataArray8, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test122");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList10 = mappingRepository0.getSystemListeners();
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData14 = mappingRepository0.getMetaData("hi!", classLoader12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
        org.junit.Assert.assertNotNull(listenerList10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test123");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        mappingRepository0.setValidate(4, false);
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller8 = mappingRepository0.getStrategyInstaller();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strategyInstaller8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test124");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        boolean boolean2 = mappingRepository0.getPreload();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller3 = mappingRepository0.getStrategyInstaller();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strategyInstaller3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test125");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        boolean boolean2 = mappingRepository0.getPreload();
        org.apache.openjpa.lib.log.Log log3 = mappingRepository0.getLog();
        boolean boolean4 = mappingRepository0.getPreload();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(log3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test126");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.String> strCollection5 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository6 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository6.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller8 = mappingRepository6.getStrategyInstaller();
        mappingRepository0.setStrategyInstaller(strategyInstaller8);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData13 = mappingRepository0.getMetaData((java.lang.Object) 7, classLoader11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strategyInstaller8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test127");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData4 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mappingRepository0.isBi1To1JT(fieldMapping5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test128");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setResolve((int) (short) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData7 = mappingRepository0.getOrderByField(classMetaData5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test129");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        org.apache.openjpa.meta.QueryMetaData queryMetaData13 = mappingRepository0.searchQueryMetaDataByName("");
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(queryMetaData13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test130");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = null;
        boolean boolean7 = mappingRepository5.removeQueryResultMapping(queryResultMapping6);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray8 = mappingRepository5.getQueryMetaDatas();
        java.lang.Class class9 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping11 = mappingRepository5.addQueryResultMapping(class9, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller16 = null;
        mappingRepository12.setStrategyInstaller(strategyInstaller16);
        mappingRepository12.startConfiguration();
        java.lang.Class<?> wildcardClass19 = mappingRepository12.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping21 = mappingRepository5.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping23 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        mappingRepository0.setSourceMode((-1));
        org.apache.openjpa.lib.log.Log log26 = mappingRepository0.getLog();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray8);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray8, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(queryResultMapping21);
        org.junit.Assert.assertNull(queryResultMapping23);
        org.junit.Assert.assertNull(log26);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test131");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray4 = mappingRepository0.getNonMappedInterfaces();
        int int5 = mappingRepository0.getResolve();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray4);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray4, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test132");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean6 = mappingRepository0.getPreload();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray7 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository8 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = null;
        boolean boolean10 = mappingRepository8.removeQueryResultMapping(queryResultMapping9);
        boolean boolean12 = mappingRepository8.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray13 = mappingRepository8.getSequenceMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData14 = null;
        boolean boolean15 = mappingRepository8.removeMetaData(classMetaData14);
        java.lang.Class<?> wildcardClass16 = mappingRepository8.getClass();
        boolean boolean18 = mappingRepository0.removeQueryResultMapping((java.lang.Class) wildcardClass16, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(queryResultMappingArray7);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray7, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray13);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray13, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test133");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData6 = null;
        boolean boolean7 = mappingRepository0.removeMetaData(classMetaData6);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        boolean boolean9 = mappingRepository0.is_systemListenersActivated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test134");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray1 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray2 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mappingRepository0.isBiMTo1JT(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryMetaDataArray1);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray1, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray2);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray2, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test135");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mappingRepository0.isBi1To1JT(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sequenceMetaData2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test136");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        mappingRepository0.setResolve(10);
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test137");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        mappingRepository0.setResolve((int) '#');
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection7 = mappingRepository0.loadPersistentTypes(false, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strategyInstaller2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test138");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        mappingRepository0.setValidate(3);
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository0.getSequenceMetaData("hi!", classLoader9, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.MetaDataException; message: Could not locate the sequence with name \"hi!\".  It is possible that the metadata file containing the sequence has not been parsed yet.  Make sure to use a persistent class whose metadata is in the same file somewhere in your application before requesting the sequence.");
        } catch (org.apache.openjpa.util.MetaDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test139");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults15 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults15);
        java.util.Collection<java.lang.String> strCollection17 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup18 = null;
        mappingRepository0.setSchemaGroup(schemaGroup18);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository20 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData22 = mappingRepository20.addSequenceMetaData("");
        boolean boolean23 = mappingRepository0.removeSequenceMetaData(sequenceMetaData22);
        org.apache.openjpa.meta.ClassMetaData classMetaData24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData26 = mappingRepository0.getOrderByField(classMetaData24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strCollection17);
        org.junit.Assert.assertNotNull(sequenceMetaData22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test140");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.meta.QueryMetaData queryMetaData9 = mappingRepository0.getCachedQueryMetaData("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(classMetaData7);
        org.junit.Assert.assertNull(queryMetaData9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test141");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults15 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults15);
        java.util.Collection<java.lang.String> strCollection17 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup18 = null;
        mappingRepository0.setSchemaGroup(schemaGroup18);
        java.lang.ClassLoader classLoader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet22 = mappingRepository0.getPersistentTypeNames(false, classLoader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strCollection17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test142");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection10 = mappingRepository0.loadPersistentTypes(false, classLoader8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test143");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray10 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.QueryMetaData queryMetaData11 = null;
        boolean boolean12 = mappingRepository0.removeQueryMetaData(queryMetaData11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
        org.junit.Assert.assertNotNull(queryResultMappingArray10);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray10, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test144");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean6 = mappingRepository0.getPreload();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray7 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = mappingRepository0.getBi_1ToM_JoinTableField(fieldMapping8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(queryResultMappingArray7);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray7, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test145");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData4 = mappingRepository0.getCachedMetaData("hi!");
        int int5 = mappingRepository0.getResolve();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository6 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping7 = null;
        boolean boolean8 = mappingRepository6.removeQueryResultMapping(queryResultMapping7);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray9 = mappingRepository6.getQueryMetaDatas();
        java.lang.Class class10 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping12 = mappingRepository6.addQueryResultMapping(class10, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray13 = mappingRepository6.getPersistenceAwares();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray14 = mappingRepository6.getSequenceMetaDatas();
        mappingRepository6.preload();
        int int16 = mappingRepository6.getSourceMode();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults17 = null;
        mappingRepository6.setMappingDefaults(mappingDefaults17);
        java.lang.ClassLoader classLoader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData21 = mappingRepository0.getMetaData((java.lang.Object) mappingDefaults17, classLoader19, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.MetaDataException; message: Could not locate metadata for the class using oid \"null\" of type \"?\".  Registered oid type mappings: \"{}\"");
        } catch (org.apache.openjpa.util.MetaDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray9);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray9, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping12);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray13);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray13, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray14);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray14, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test146");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        int int2 = mappingRepository0.getResolve();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test147");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.String> strCollection5 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository6 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository6.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller8 = mappingRepository6.getStrategyInstaller();
        mappingRepository0.setStrategyInstaller(strategyInstaller8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = mappingRepository0.getStrategyInstaller();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strategyInstaller8);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(strategyInstaller11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test148");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData4 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mappingRepository0.isUniMTo1JT(fieldMapping5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test149");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray9 = mappingRepository0.getQueryMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertNotNull(queryMetaDataArray9);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray9, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test150");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        mappingRepository0.setValidate(3);
        org.apache.openjpa.meta.ClassMetaData classMetaData8 = null;
        boolean boolean9 = mappingRepository0.removeMetaData(classMetaData8);
        mappingRepository0.setPreload(true);
        org.apache.openjpa.meta.ClassMetaData classMetaData12 = null;
        boolean boolean13 = mappingRepository0.removeMetaData(classMetaData12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test151");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData6 = null;
        boolean boolean7 = mappingRepository0.removeMetaData(classMetaData6);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        java.lang.String str10 = mappingRepository0.getClosestAliasName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test152");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        mappingRepository0.setValidate((int) (short) 0);
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection11 = mappingRepository0.loadPersistentTypes(false, classLoader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test153");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        java.lang.String str7 = mappingRepository0.getClosestAliasName("hi!");
        mappingRepository0.setSourceMode(0);
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository0.getCachedSequenceMetaData("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = mappingRepository0.isBi1To1JT(fieldMapping12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(sequenceMetaData11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test154");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = mappingRepository0.isNonDefaultMappingAllowed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test155");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        java.lang.Class class5 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping7 = mappingRepository0.addQueryResultMapping(class5, "");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray8 = mappingRepository0.getNonMappedInterfaces();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(queryResultMapping7);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray8);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray8, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test156");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        java.lang.Object obj10 = null;
        boolean boolean11 = mappingRepository0.removeSystemListener(obj10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test157");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository7.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray9 = mappingRepository7.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository7.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        java.lang.Class class16 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping18 = mappingRepository12.addQueryResultMapping(class16, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository19 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping20 = null;
        boolean boolean21 = mappingRepository19.removeQueryResultMapping(queryResultMapping20);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray22 = mappingRepository19.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller23 = null;
        mappingRepository19.setStrategyInstaller(strategyInstaller23);
        mappingRepository19.startConfiguration();
        java.lang.Class<?> wildcardClass26 = mappingRepository19.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping28 = mappingRepository12.getCachedQueryResultMapping((java.lang.Class) wildcardClass26, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping30 = mappingRepository7.getCachedQueryResultMapping((java.lang.Class) wildcardClass26, "");
        boolean boolean32 = mappingRepository0.removeQueryResultMapping((java.lang.Class) wildcardClass26, "hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = mappingRepository0.hasJoinColumn(fieldMapping33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getValueInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMappingArray9);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray9, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray22);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray22, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(queryResultMapping28);
        org.junit.Assert.assertNull(queryResultMapping30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test158");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData5 = mappingRepository0.getCachedMetaData("hi!");
        mappingRepository0.setResolve((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test159");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData7 = mappingRepository0.getCachedSequenceMetaData("hi!");
        mappingRepository0.setResolve((int) (byte) 100, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults11 = mappingRepository0.getMappingDefaults();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(sequenceMetaData7);
        org.junit.Assert.assertNull(mappingDefaults11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test160");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        int int3 = mappingRepository0.getResolve();
        boolean boolean4 = mappingRepository0.is_systemListenersActivated();
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData8 = mappingRepository0.getMetaData("", classLoader6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listenerList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test161");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData12 = mappingRepository0.addSequenceMetaData("hi!");
        java.lang.ClassLoader classLoader14 = null;
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData16 = mappingRepository0.getSequenceMetaData("hi!", classLoader14, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNotNull(sequenceMetaData12);
        org.junit.Assert.assertNotNull(sequenceMetaData16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test162");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.meta.QueryMetaData queryMetaData9 = mappingRepository0.getCachedQueryMetaData("hi!");
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup10 = null;
        mappingRepository0.setSchemaGroup(schemaGroup10);
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(classMetaData7);
        org.junit.Assert.assertNull(queryMetaData9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test163");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        java.lang.Class class5 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping7 = mappingRepository0.addQueryResultMapping(class5, "");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray8 = mappingRepository0.getPersistenceAwares();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(queryResultMapping7);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray8);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray8, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test164");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        mappingRepository0.setResolve((-1), false);
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory5 = mappingRepository0.getMetaDataFactory();
        org.junit.Assert.assertNull(metaDataFactory5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test165");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        mappingRepository0.setValidate(3);
        org.apache.openjpa.meta.ClassMetaData classMetaData8 = null;
        boolean boolean9 = mappingRepository0.removeMetaData(classMetaData8);
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test166");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray9 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setMetaDataFactory(metaDataFactory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.setRepository(org.apache.openjpa.meta.MetaDataRepository)\" because \"factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMappingArray9);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray9, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test167");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = mappingRepository0.isBi1To1JT(fieldMapping9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test168");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        mappingRepository0.setValidate(3);
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test169");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData4 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray5 = mappingRepository0.getQueryMetaDatas();
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection9 = mappingRepository0.loadPersistentTypes(false, classLoader7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData4);
        org.junit.Assert.assertNotNull(queryMetaDataArray5);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray5, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test170");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray3 = mappingRepository0.getNonMappedInterfaces();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration5 = mappingRepository0.getConfiguration();
        org.junit.Assert.assertNotNull(listenerList2);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray3);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray3, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test171");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listenerList2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test172");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        mappingRepository0.startConfiguration();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration11 = mappingRepository0.getConfiguration();
        boolean boolean12 = mappingRepository0.is_systemListenersActivated();
        mappingRepository0.setValidate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
        org.junit.Assert.assertNull(openJPAConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test173");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList9 = mappingRepository0.getSystemListeners();
        mappingRepository0.setValidate((-1), true);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults13 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults13);
        mappingRepository0.setValidate((-1), true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(listenerList9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test174");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        java.lang.String str7 = mappingRepository0.getClosestAliasName("hi!");
        mappingRepository0.setSourceMode(0);
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository0.getCachedSequenceMetaData("hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller16 = null;
        mappingRepository12.setStrategyInstaller(strategyInstaller16);
        mappingRepository12.startConfiguration();
        java.lang.String str20 = mappingRepository12.getClosestAliasName("");
        java.util.Collection<java.lang.String> strCollection21 = mappingRepository12.getAliasNames();
        boolean boolean22 = mappingRepository0.removeSystemListener((java.lang.Object) strCollection21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(sequenceMetaData11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test175");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray7 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(queryMetaDataArray7);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray7, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test176");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData12 = mappingRepository0.addSequenceMetaData("hi!");
        java.lang.ClassLoader classLoader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = mappingRepository0.getPersistentTypeNames(false, classLoader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNotNull(sequenceMetaData12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test177");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = mappingRepository0.isBi1To1JT(fieldMapping7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(openJPAConfiguration6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test178");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.meta.QueryMetaData queryMetaData9 = mappingRepository0.getCachedQueryMetaData("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = mappingRepository0.isNonDefaultMappingAllowed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(classMetaData7);
        org.junit.Assert.assertNull(queryMetaData9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test179");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData18 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray19 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration20 = mappingRepository0.getConfiguration();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNotNull(sequenceMetaData18);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray19);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray19, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration20);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test180");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = null;
        boolean boolean7 = mappingRepository5.removeQueryResultMapping(queryResultMapping6);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray8 = mappingRepository5.getQueryMetaDatas();
        java.lang.Class class9 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping11 = mappingRepository5.addQueryResultMapping(class9, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller16 = null;
        mappingRepository12.setStrategyInstaller(strategyInstaller16);
        mappingRepository12.startConfiguration();
        java.lang.Class<?> wildcardClass19 = mappingRepository12.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping21 = mappingRepository5.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping23 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        org.apache.openjpa.meta.ClassMetaData classMetaData25 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.jdbc.meta.ClassMapping[] classMappingArray26 = mappingRepository0.getMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList27 = mappingRepository0.getSystemListeners();
        mappingRepository0.setSourceMode((int) (byte) -1, false);
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray8);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray8, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(queryResultMapping21);
        org.junit.Assert.assertNull(queryResultMapping23);
        org.junit.Assert.assertNull(classMetaData25);
        org.junit.Assert.assertNotNull(classMappingArray26);
        org.junit.Assert.assertArrayEquals(classMappingArray26, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
        org.junit.Assert.assertNotNull(listenerList27);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test181");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        mappingRepository0.setResolve((int) '#');
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList5 = mappingRepository0.getSystemListeners();
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNotNull(listenerList5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test182");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray6 = mappingRepository5.getQueryMetaDatas();
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) mappingRepository5);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository8 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository8.startConfiguration();
        java.lang.ClassLoader classLoader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping12 = mappingRepository0.getMapping((java.lang.Object) mappingRepository8, classLoader10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray6);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray6, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test183");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        int int6 = mappingRepository0.getSourceMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test184");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        java.lang.Class class5 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping7 = mappingRepository0.addQueryResultMapping(class5, "");
        org.apache.openjpa.meta.ClassMetaData classMetaData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = mappingRepository0.getMetaModel(classMetaData8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(queryResultMapping7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test185");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray3 = mappingRepository0.getNonMappedInterfaces();
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray4 = mappingRepository0.getMetaDatas();
        org.junit.Assert.assertNotNull(listenerList2);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray3);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray3, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(classMetaDataArray4);
        org.junit.Assert.assertArrayEquals(classMetaDataArray4, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test186");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        java.lang.String str2 = mappingRepository0.getClosestAliasName("hi!");
        int int3 = mappingRepository0.getValidate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test187");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean6 = mappingRepository0.getPreload();
        org.apache.openjpa.meta.QueryMetaData queryMetaData7 = null;
        boolean boolean8 = mappingRepository0.removeQueryMetaData(queryMetaData7);
        int int9 = mappingRepository0.getSourceMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test188");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        boolean boolean10 = mappingRepository0.removeSequenceMetaData("hi!");
        java.lang.ClassLoader classLoader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection14 = mappingRepository0.loadPersistentTypes(false, classLoader12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test189");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray1 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray2 = mappingRepository0.getPersistenceAwares();
        java.lang.Class<?> wildcardClass3 = nonPersistentMetaDataArray2.getClass();
        org.junit.Assert.assertNotNull(queryMetaDataArray1);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray1, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray2);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray2, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test190");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setResolve((int) (short) 10);
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup5 = null;
        mappingRepository0.setSchemaGroup(schemaGroup5);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        java.lang.String str9 = mappingRepository7.getClosestAliasName("hi!");
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray10 = mappingRepository7.getMetaDatas();
        boolean boolean11 = mappingRepository0.removeSystemListener((java.lang.Object) mappingRepository7);
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(classMetaDataArray10);
        org.junit.Assert.assertArrayEquals(classMetaDataArray10, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test191");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray6 = mappingRepository0.getPersistenceAwares();
        mappingRepository0.setPreload(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray6);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray6, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test192");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData6 = null;
        boolean boolean7 = mappingRepository0.removeMetaData(classMetaData6);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray9 = mappingRepository0.getQueryMetaDatas();
        mappingRepository0.setSourceMode(8);
        mappingRepository0.preload();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository13 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping14 = null;
        boolean boolean15 = mappingRepository13.removeQueryResultMapping(queryResultMapping14);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray16 = mappingRepository13.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller17 = null;
        mappingRepository13.setStrategyInstaller(strategyInstaller17);
        mappingRepository13.startConfiguration();
        mappingRepository13.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData23 = mappingRepository13.getCachedMetaData("");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData25 = mappingRepository13.addSequenceMetaData("hi!");
        boolean boolean26 = mappingRepository0.removeSequenceMetaData(sequenceMetaData25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertNotNull(queryMetaDataArray9);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray9, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray16);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray16, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData23);
        org.junit.Assert.assertNotNull(sequenceMetaData25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test193");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        java.lang.String str7 = mappingRepository0.getClosestAliasName("hi!");
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test194");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        java.lang.Class class5 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping7 = mappingRepository0.addQueryResultMapping(class5, "");
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray8 = mappingRepository0.getMetaDatas();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(queryResultMapping7);
        org.junit.Assert.assertNotNull(classMetaDataArray8);
        org.junit.Assert.assertArrayEquals(classMetaDataArray8, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test195");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray9 = mappingRepository0.getMetaDatas();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository0.addSequenceMetaData("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup12 = mappingRepository0.getSchemaGroup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.conf.JDBCConfiguration.getSchemaFactoryInstance()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(classMetaDataArray9);
        org.junit.Assert.assertArrayEquals(classMetaDataArray9, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test196");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray1 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray2 = mappingRepository0.getPersistenceAwares();
        java.lang.String str4 = mappingRepository0.getClosestAliasName("");
        org.junit.Assert.assertNotNull(queryMetaDataArray1);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray1, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray2);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray2, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test197");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        mappingRepository0.preload();
        org.apache.openjpa.lib.conf.Configuration configuration16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setConfiguration(configuration16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.conf.OpenJPAConfiguration.getLog(String)\" because \"this._conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test198");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        boolean boolean2 = mappingRepository0.getPreload();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mappingRepository0.isBidirectional(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test199");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.QueryMetaData queryMetaData4 = mappingRepository0.searchQueryMetaDataByName("");
        mappingRepository0.setPreload(false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults7 = mappingRepository0.getMappingDefaults();
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNull(queryMetaData4);
        org.junit.Assert.assertNull(mappingDefaults7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test200");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.ClassMetaData classMetaData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.FieldMetaData fieldMetaData13 = mappingRepository0.getOrderByField(classMetaData11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getField(String)\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test201");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.QueryMetaData queryMetaData18 = mappingRepository0.getCachedQueryMetaData("");
        mappingRepository0.addSystemListener((java.lang.Object) (byte) 10);
        mappingRepository0.preload();
        org.apache.openjpa.lib.log.Log log22 = mappingRepository0.getLog();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = mappingRepository0.isBi1To1JT(fieldMapping23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNull(queryMetaData18);
        org.junit.Assert.assertNull(log22);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test202");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        mappingRepository0.preload();
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.endConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.conf.OpenJPAConfiguration.newMetaDataFactoryInstance()\" because \"this._conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test203");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setResolve((int) (short) 10);
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup5 = null;
        mappingRepository0.setSchemaGroup(schemaGroup5);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        java.lang.String str9 = mappingRepository7.getClosestAliasName("hi!");
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray10 = mappingRepository7.getMetaDatas();
        boolean boolean11 = mappingRepository0.removeSystemListener((java.lang.Object) mappingRepository7);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = mappingRepository0.isUni1To1JT(fieldMapping12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(classMetaDataArray10);
        org.junit.Assert.assertArrayEquals(classMetaDataArray10, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test204");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray1 = mappingRepository0.getQueryMetaDatas();
        int int2 = mappingRepository0.getSourceMode();
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray3 = mappingRepository0.getMetaDatas();
        org.junit.Assert.assertNotNull(queryMetaDataArray1);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray1, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(classMetaDataArray3);
        org.junit.Assert.assertArrayEquals(classMetaDataArray3, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test205");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        boolean boolean2 = mappingRepository0.removeSystemListener((java.lang.Object) '#');
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping4 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test206");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.ClassMetaData classMetaData3 = null;
        boolean boolean4 = mappingRepository0.removeMetaData(classMetaData3);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = mappingRepository0.getBi_1ToM_JoinTableField(fieldMapping5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test207");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData6 = mappingRepository0.addSequenceMetaData("");
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test208");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData4 = mappingRepository0.getCachedMetaData("hi!");
        mappingRepository0.startConfiguration();
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test209");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.QueryMetaData queryMetaData18 = mappingRepository0.getCachedQueryMetaData("");
        mappingRepository0.addSystemListener((java.lang.Object) (byte) 10);
        mappingRepository0.preload();
        org.apache.openjpa.lib.log.Log log22 = mappingRepository0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNull(queryMetaData18);
        org.junit.Assert.assertNull(log22);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test210");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setPreload(false);
        mappingRepository0.preload();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test211");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = mappingRepository0.getMetaModel(classMetaData7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test212");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData5 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults6 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test213");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        java.lang.String str8 = mappingRepository0.getClosestAliasName("");
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray9 = mappingRepository0.getQueryMetaDatas();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(queryMetaDataArray9);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray9, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test214");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        java.lang.ClassLoader classLoader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection8 = mappingRepository0.loadPersistentTypes(false, classLoader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test215");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults4);
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.meta.QueryMetaData queryMetaData9 = mappingRepository0.getCachedQueryMetaData("hi!");
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration10 = mappingRepository0.getConfiguration();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(classMetaData7);
        org.junit.Assert.assertNull(queryMetaData9);
        org.junit.Assert.assertNull(openJPAConfiguration10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test216");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults8 = mappingRepository0.getMappingDefaults();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData7);
        org.junit.Assert.assertNull(mappingDefaults8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test217");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults5 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test218");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.QueryMetaData queryMetaData4 = mappingRepository0.searchQueryMetaDataByName("");
        mappingRepository0.setPreload(false);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = mappingRepository0.isBi1To1JT(fieldMapping7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNull(queryMetaData4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test219");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray8 = mappingRepository0.getQueryMetaDatas();
        java.util.Collection<java.lang.String> strCollection9 = mappingRepository0.getAliasNames();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(queryMetaDataArray8);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray8, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(strCollection9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test220");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        mappingRepository0.startConfiguration();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration11 = mappingRepository0.getConfiguration();
        boolean boolean12 = mappingRepository0.is_systemListenersActivated();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults13 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
        org.junit.Assert.assertNull(openJPAConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test221");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        java.lang.Class class5 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping7 = mappingRepository0.addQueryResultMapping(class5, "");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults8 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults8);
        java.util.Collection<java.lang.String> strCollection10 = mappingRepository0.getAliasNames();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray11 = mappingRepository0.getNonMappedInterfaces();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(queryResultMapping7);
        org.junit.Assert.assertNotNull(strCollection10);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray11);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray11, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test222");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        mappingRepository0.setResolve((int) '#');
        mappingRepository0.setValidate((int) (short) 0, true);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults8 = mappingRepository0.getMappingDefaults();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = mappingRepository0.getBi_1ToM_JoinTableField(fieldMapping9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNull(mappingDefaults8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test223");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean6 = mappingRepository0.getPreload();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray7 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller8 = mappingRepository0.getStrategyInstaller();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(queryResultMappingArray7);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray7, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(strategyInstaller8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test224");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults15 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults15);
        java.util.Collection<java.lang.String> strCollection17 = mappingRepository0.getAliasNames();
        java.lang.Class<?> wildcardClass18 = mappingRepository0.getClass();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strCollection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test225");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        mappingRepository0.setResolve(31, false);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.endConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.conf.OpenJPAConfiguration.newMetaDataFactoryInstance()\" because \"this._conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test226");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults15 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults15);
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test227");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        mappingRepository0.setValidate(16, false);
        org.apache.openjpa.meta.QueryMetaData queryMetaData12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.QueryMetaData queryMetaData13 = mappingRepository0.addQueryMetaData(queryMetaData12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.QueryMetaData.getName()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test228");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList9 = mappingRepository0.getSystemListeners();
        mappingRepository0.setValidate((-1), true);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults13 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults13);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(listenerList9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test229");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        mappingRepository0.preload();
        int int10 = mappingRepository0.getSourceMode();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = mappingRepository0.hasJoinTable(fieldMapping11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappingInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test230");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setResolve((int) (byte) 1, true);
        int int6 = mappingRepository0.getResolve();
        boolean boolean7 = mappingRepository0.is_systemListenersActivated();
        org.junit.Assert.assertNotNull(sequenceMetaData2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test231");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        mappingRepository0.setValidate(16, false);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = mappingRepository0.isBiMTo1JT(fieldMapping12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test232");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        int int3 = mappingRepository0.getResolve();
        boolean boolean4 = mappingRepository0.is_systemListenersActivated();
        java.lang.Object obj5 = null;
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.ClassMapping classMapping8 = mappingRepository0.getMapping(obj5, classLoader6, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.MetaDataException; message: Could not locate metadata for the class using oid \"null\" of type \"?\".  Registered oid type mappings: \"{}\"");
        } catch (org.apache.openjpa.util.MetaDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(listenerList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test233");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean6 = mappingRepository0.getPreload();
        org.apache.openjpa.meta.QueryMetaData queryMetaData7 = null;
        boolean boolean8 = mappingRepository0.removeQueryMetaData(queryMetaData7);
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray9 = mappingRepository0.getNonMappedInterfaces();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray10 = mappingRepository0.getPersistenceAwares();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray9);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray9, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray10);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray10, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test234");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray1 = mappingRepository0.getSequenceMetaDatas();
        org.junit.Assert.assertNotNull(sequenceMetaDataArray1);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray1, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test235");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData12 = mappingRepository0.addSequenceMetaData("hi!");
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNotNull(sequenceMetaData12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test236");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.QueryMetaData queryMetaData18 = mappingRepository0.getCachedQueryMetaData("");
        mappingRepository0.addSystemListener((java.lang.Object) (byte) 10);
        mappingRepository0.startConfiguration();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNull(queryMetaData18);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test237");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults15 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults15);
        java.util.Collection<java.lang.String> strCollection17 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.schema.SchemaGroup schemaGroup18 = null;
        mappingRepository0.setSchemaGroup(schemaGroup18);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository20 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData22 = mappingRepository20.addSequenceMetaData("");
        boolean boolean23 = mappingRepository0.removeSequenceMetaData(sequenceMetaData22);
        org.apache.openjpa.lib.conf.Configuration configuration24 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setConfiguration(configuration24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.conf.OpenJPAConfiguration.getLog(String)\" because \"this._conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strCollection17);
        org.junit.Assert.assertNotNull(sequenceMetaData22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test238");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray6 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration7 = mappingRepository0.getConfiguration();
        boolean boolean8 = mappingRepository0.getPreload();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray6);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray6, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test239");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray4 = mappingRepository0.getNonMappedInterfaces();
        mappingRepository0.setSourceMode((int) ' ', true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray4);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray4, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test240");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        mappingRepository0.setValidate((int) (short) 0, false);
        java.lang.Class class10 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping12 = mappingRepository0.getCachedQueryResultMapping(class10, "hi!");
        mappingRepository0.startConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = mappingRepository0.isNonDefaultMappingAllowed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration6);
        org.junit.Assert.assertNull(queryResultMapping12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test241");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        boolean boolean11 = mappingRepository0.getPreload();
        java.lang.ClassLoader classLoader13 = null;
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData15 = mappingRepository0.getSequenceMetaData("", classLoader13, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(sequenceMetaData15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test242");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository3 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping4 = null;
        boolean boolean5 = mappingRepository3.removeQueryResultMapping(queryResultMapping4);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray6 = mappingRepository3.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller7 = null;
        mappingRepository3.setStrategyInstaller(strategyInstaller7);
        mappingRepository3.startConfiguration();
        java.lang.Class<?> wildcardClass10 = mappingRepository3.getClass();
        boolean boolean12 = mappingRepository0.removeQueryResultMapping((java.lang.Class) wildcardClass10, "hi!");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults13 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults13);
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory15 = mappingRepository0.getMetaDataFactory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray6);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray6, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(metaDataFactory15);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test243");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration17 = mappingRepository0.getConfiguration();
        org.apache.openjpa.lib.conf.Configuration configuration18 = null;
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.setConfiguration(configuration18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.conf.OpenJPAConfiguration.getLog(String)\" because \"this._conf\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNull(openJPAConfiguration17);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test244");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        boolean boolean2 = mappingRepository0.removeSystemListener((java.lang.Object) '#');
        int int3 = mappingRepository0.getValidate();
        mappingRepository0.setValidate((int) '4');
        int int6 = mappingRepository0.getSourceMode();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        boolean boolean11 = mappingRepository7.removeSystemListener((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.String> strCollection12 = mappingRepository7.getAliasNames();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository13 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository13.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller15 = mappingRepository13.getStrategyInstaller();
        mappingRepository7.setStrategyInstaller(strategyInstaller15);
        mappingRepository0.setStrategyInstaller(strategyInstaller15);
        org.apache.openjpa.jdbc.sql.DBDictionary dBDictionary18 = mappingRepository0.getDBDictionary();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNotNull(strategyInstaller15);
        org.junit.Assert.assertNull(dBDictionary18);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test245");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray6 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration7 = mappingRepository0.getConfiguration();
        mappingRepository0.setResolve((int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray6);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray6, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test246");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData7 = mappingRepository0.getCachedSequenceMetaData("hi!");
        mappingRepository0.setSourceMode(4);
        org.apache.openjpa.meta.ClassMetaData classMetaData11 = mappingRepository0.getCachedMetaData("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(sequenceMetaData7);
        org.junit.Assert.assertNull(classMetaData11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test247");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.QueryMetaData queryMetaData4 = mappingRepository0.searchQueryMetaDataByName("");
        mappingRepository0.setPreload(false);
        mappingRepository0.startConfiguration();
        mappingRepository0.preload();
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNull(queryMetaData4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test248");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository3 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping4 = null;
        boolean boolean5 = mappingRepository3.removeQueryResultMapping(queryResultMapping4);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray6 = mappingRepository3.getQueryMetaDatas();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository3.addQueryResultMapping(class7, "hi!");
        boolean boolean10 = mappingRepository0.removeQueryResultMapping(queryResultMapping9);
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray6);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray6, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test249");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        java.lang.String str2 = mappingRepository0.getClosestAliasName("hi!");
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray3 = mappingRepository0.getMetaDatas();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray4 = mappingRepository0.getQueryResultMappings();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(classMetaDataArray3);
        org.junit.Assert.assertArrayEquals(classMetaDataArray3, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
        org.junit.Assert.assertNotNull(queryResultMappingArray4);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray4, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test250");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.lib.log.Log log3 = mappingRepository0.getLog();
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(log3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test251");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mappingRepository0.hasJoinTable(fieldMapping3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappingInfo()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test252");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData5 = mappingRepository0.getCachedMetaData("hi!");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = mappingRepository0.isUni1ToMFK(fieldMapping6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test253");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.QueryMetaData queryMetaData4 = mappingRepository0.searchQueryMetaDataByName("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping6 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNull(queryMetaData4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test254");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        mappingRepository0.setValidate((int) (short) 0, false);
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection13 = mappingRepository0.loadPersistentTypes(true, classLoader11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test255");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults4 = mappingRepository0.getMappingDefaults();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.ClassMapping[] classMappingArray6 = mappingRepository0.getMappings();
        mappingRepository0.setValidate(31, true);
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertNull(mappingDefaults4);
        org.junit.Assert.assertNotNull(classMappingArray6);
        org.junit.Assert.assertArrayEquals(classMappingArray6, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test256");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setSourceMode((-1));
        org.apache.openjpa.meta.ClassMetaData classMetaData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = mappingRepository0.getMetaModel(classMetaData7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test257");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller2 = mappingRepository0.getStrategyInstaller();
        org.apache.openjpa.meta.QueryMetaData queryMetaData4 = mappingRepository0.searchQueryMetaDataByName("");
        mappingRepository0.setPreload(false);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = mappingRepository0.isUniMTo1JT(fieldMapping7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strategyInstaller2);
        org.junit.Assert.assertNull(queryMetaData4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test258");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList9 = mappingRepository0.getSystemListeners();
        java.lang.ClassLoader classLoader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.meta.ClassMetaData classMetaData13 = mappingRepository0.getMetaData("hi!", classLoader11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(listenerList9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test259");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList3 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository4 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping5 = null;
        boolean boolean6 = mappingRepository4.removeQueryResultMapping(queryResultMapping5);
        mappingRepository4.setResolve((int) (byte) 100, false);
        int int10 = mappingRepository4.getResolve();
        java.lang.Class class11 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = mappingRepository4.addQueryResultMapping(class11, "hi!");
        boolean boolean14 = mappingRepository0.removeQueryResultMapping(queryResultMapping13);
        java.lang.ClassLoader classLoader16 = null;
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData18 = mappingRepository0.getSequenceMetaData("", classLoader16, false);
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller19 = mappingRepository0.getStrategyInstaller();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(listenerList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(sequenceMetaData18);
        org.junit.Assert.assertNotNull(strategyInstaller19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test260");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData2 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setResolve((int) (byte) 1, true);
        int int6 = mappingRepository0.getResolve();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults7 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults7);
        org.junit.Assert.assertNotNull(sequenceMetaData2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test261");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray17 = mappingRepository0.getQueryResultMappings();
        java.lang.ClassLoader classLoader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet20 = mappingRepository0.getPersistentTypeNames(true, classLoader19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNotNull(queryResultMappingArray17);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test262");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData4 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository5 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = null;
        boolean boolean7 = mappingRepository5.removeQueryResultMapping(queryResultMapping6);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray8 = mappingRepository5.getQueryMetaDatas();
        java.lang.Class class9 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping11 = mappingRepository5.addQueryResultMapping(class9, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository12 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping13 = null;
        boolean boolean14 = mappingRepository12.removeQueryResultMapping(queryResultMapping13);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray15 = mappingRepository12.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller16 = null;
        mappingRepository12.setStrategyInstaller(strategyInstaller16);
        mappingRepository12.startConfiguration();
        java.lang.Class<?> wildcardClass19 = mappingRepository12.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping21 = mappingRepository5.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping23 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass19, "");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData25 = mappingRepository0.getCachedSequenceMetaData("hi!");
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray8);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray8, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray15);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray15, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(queryResultMapping21);
        org.junit.Assert.assertNull(queryResultMapping23);
        org.junit.Assert.assertNull(sequenceMetaData25);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test263");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository3 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping4 = null;
        boolean boolean5 = mappingRepository3.removeQueryResultMapping(queryResultMapping4);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray6 = mappingRepository3.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller7 = null;
        mappingRepository3.setStrategyInstaller(strategyInstaller7);
        mappingRepository3.startConfiguration();
        java.lang.Class<?> wildcardClass10 = mappingRepository3.getClass();
        boolean boolean12 = mappingRepository0.removeQueryResultMapping((java.lang.Class) wildcardClass10, "hi!");
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults13 = mappingRepository0.getMappingDefaults();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray6);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray6, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(mappingDefaults13);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test264");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.QueryMetaData queryMetaData18 = mappingRepository0.getCachedQueryMetaData("");
        mappingRepository0.addSystemListener((java.lang.Object) (byte) 10);
        mappingRepository0.setValidate((int) 'a', false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNull(queryMetaData18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test265");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        org.apache.openjpa.meta.QueryMetaData queryMetaData7 = null;
        boolean boolean8 = mappingRepository0.removeQueryMetaData(queryMetaData7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test266");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray5 = mappingRepository0.getSequenceMetaDatas();
        org.apache.openjpa.meta.ClassMetaData classMetaData6 = null;
        boolean boolean7 = mappingRepository0.removeMetaData(classMetaData6);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray9 = mappingRepository0.getQueryMetaDatas();
        mappingRepository0.setSourceMode(8);
        mappingRepository0.setResolve((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sequenceMetaDataArray5);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray5, new org.apache.openjpa.meta.SequenceMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertNotNull(queryMetaDataArray9);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray9, new org.apache.openjpa.meta.QueryMetaData[] {});
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test267");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        mappingRepository0.setValidate(3);
        org.apache.openjpa.meta.ClassMetaData classMetaData8 = null;
        boolean boolean9 = mappingRepository0.removeMetaData(classMetaData8);
        mappingRepository0.setPreload(true);
        org.apache.openjpa.jdbc.meta.ClassMapping[] classMappingArray12 = mappingRepository0.getMappings();
        mappingRepository0.setPreload(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(classMappingArray12);
        org.junit.Assert.assertArrayEquals(classMappingArray12, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test268");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.SequenceMetaData[] sequenceMetaDataArray8 = mappingRepository0.getSequenceMetaDatas();
        mappingRepository0.preload();
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = mappingRepository0.getBi_MTo1_JoinTableField(fieldMapping10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaDataArray8);
        org.junit.Assert.assertArrayEquals(sequenceMetaDataArray8, new org.apache.openjpa.meta.SequenceMetaData[] {});
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test269");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        mappingRepository0.setValidate((int) (short) -1);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData12 = mappingRepository0.addSequenceMetaData("hi!");
        boolean boolean13 = mappingRepository0.getPreload();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(classMetaData10);
        org.junit.Assert.assertNotNull(sequenceMetaData12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test270");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setResolve((int) (short) 10);
        mappingRepository0.setSourceMode(16);
        java.lang.ClassLoader classLoader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet9 = mappingRepository0.getPersistentTypeNames(false, classLoader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test271");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData18 = mappingRepository0.addSequenceMetaData("");
        mappingRepository0.setSourceMode(3, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNotNull(sequenceMetaData18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test272");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray5 = mappingRepository0.getPersistenceAwares();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray5);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray5, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test273");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        java.lang.String str7 = mappingRepository0.getClosestAliasName("hi!");
        java.lang.ClassLoader classLoader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Class<?>> wildcardClassCollection11 = mappingRepository0.loadPersistentTypes(false, classLoader9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getPersistentTypeNames(boolean, java.lang.ClassLoader)\" because \"this._factory\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test274");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray2 = mappingRepository0.getQueryMetaDatas();
        boolean boolean3 = mappingRepository0.getPreload();
        org.junit.Assert.assertNotNull(queryMetaDataArray2);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray2, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test275");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.meta.QueryResultMapping[] queryResultMappingArray2 = mappingRepository0.getQueryResultMappings();
        mappingRepository0.setValidate(0);
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller5 = mappingRepository0.getStrategyInstaller();
        org.junit.Assert.assertNotNull(queryResultMappingArray2);
        org.junit.Assert.assertArrayEquals(queryResultMappingArray2, new org.apache.openjpa.jdbc.meta.QueryResultMapping[] {});
        org.junit.Assert.assertNotNull(strategyInstaller5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test276");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray10 = mappingRepository7.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller11 = null;
        mappingRepository7.setStrategyInstaller(strategyInstaller11);
        mappingRepository7.startConfiguration();
        java.lang.Class<?> wildcardClass14 = mappingRepository7.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping16 = mappingRepository0.getCachedQueryResultMapping((java.lang.Class) wildcardClass14, "");
        org.apache.openjpa.meta.QueryMetaData queryMetaData18 = mappingRepository0.getCachedQueryMetaData("");
        mappingRepository0.addSystemListener((java.lang.Object) (byte) 10);
        mappingRepository0.preload();
        org.apache.openjpa.lib.log.Log log22 = mappingRepository0.getLog();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData24 = mappingRepository0.addSequenceMetaData("hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository25 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping26 = null;
        boolean boolean27 = mappingRepository25.removeQueryResultMapping(queryResultMapping26);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray28 = mappingRepository25.getQueryMetaDatas();
        java.lang.Class class29 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping31 = mappingRepository25.addQueryResultMapping(class29, "hi!");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository32 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping33 = null;
        boolean boolean34 = mappingRepository32.removeQueryResultMapping(queryResultMapping33);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray35 = mappingRepository32.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller36 = null;
        mappingRepository32.setStrategyInstaller(strategyInstaller36);
        mappingRepository32.startConfiguration();
        java.lang.Class<?> wildcardClass39 = mappingRepository32.getClass();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping41 = mappingRepository25.getCachedQueryResultMapping((java.lang.Class) wildcardClass39, "");
        org.apache.openjpa.meta.QueryMetaData queryMetaData43 = mappingRepository25.getCachedQueryMetaData("");
        mappingRepository25.addSystemListener((java.lang.Object) (byte) 10);
        mappingRepository25.preload();
        org.apache.openjpa.lib.log.Log log47 = mappingRepository25.getLog();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData49 = mappingRepository25.addSequenceMetaData("hi!");
        boolean boolean50 = mappingRepository0.removeSequenceMetaData(sequenceMetaData49);
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults51 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray10);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray10, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(queryResultMapping16);
        org.junit.Assert.assertNull(queryMetaData18);
        org.junit.Assert.assertNull(log22);
        org.junit.Assert.assertNotNull(sequenceMetaData24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray28);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray28, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray35);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray35, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(queryResultMapping41);
        org.junit.Assert.assertNull(queryMetaData43);
        org.junit.Assert.assertNull(log47);
        org.junit.Assert.assertNotNull(sequenceMetaData49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test277");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        boolean boolean7 = mappingRepository0.getPreload();
        boolean boolean8 = mappingRepository0.is_systemListenersActivated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test278");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        boolean boolean2 = mappingRepository0.removeSystemListener((java.lang.Object) '#');
        int int3 = mappingRepository0.getValidate();
        mappingRepository0.setValidate((int) '4');
        int int6 = mappingRepository0.getSourceMode();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository7 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping8 = null;
        boolean boolean9 = mappingRepository7.removeQueryResultMapping(queryResultMapping8);
        boolean boolean11 = mappingRepository7.removeSystemListener((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.String> strCollection12 = mappingRepository7.getAliasNames();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository13 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository13.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller15 = mappingRepository13.getStrategyInstaller();
        mappingRepository7.setStrategyInstaller(strategyInstaller15);
        mappingRepository0.setStrategyInstaller(strategyInstaller15);
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strCollection12);
        org.junit.Assert.assertNotNull(strategyInstaller15);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test279");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        boolean boolean7 = mappingRepository0.removeSystemListener((java.lang.Object) (byte) 10);
        org.apache.openjpa.meta.ClassMetaData classMetaData9 = mappingRepository0.getCachedMetaData("");
        org.apache.openjpa.meta.ClassMetaData[] classMetaDataArray10 = mappingRepository0.getMetaDatas();
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(classMetaData9);
        org.junit.Assert.assertNotNull(classMetaDataArray10);
        org.junit.Assert.assertArrayEquals(classMetaDataArray10, new org.apache.openjpa.jdbc.meta.ClassMapping[] {});
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test280");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        mappingRepository0.setValidate((int) (short) 0);
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = mappingRepository0.isBiMTo1JT(fieldMapping9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.meta.FieldMapping.getMappedByMapping()\" because \"field\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test281");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray8 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.meta.QueryMetaData queryMetaData10 = mappingRepository0.getCachedQueryMetaData("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping12 = mappingRepository0.getBi_1ToM_JoinTableField(fieldMapping11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(queryMetaDataArray8);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray8, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(queryMetaData10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test282");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        boolean boolean4 = mappingRepository0.removeSystemListener((java.lang.Object) 0.0d);
        java.util.Collection<java.lang.String> strCollection5 = mappingRepository0.getAliasNames();
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository6 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository6.startConfiguration();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller8 = mappingRepository6.getStrategyInstaller();
        mappingRepository0.setStrategyInstaller(strategyInstaller8);
        // The following exception was thrown during execution in test generation
        try {
            mappingRepository0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.log.Log.isTraceEnabled()\" because \"this._log\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(strategyInstaller8);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test283");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.ClassMetaData classMetaData3 = null;
        boolean boolean4 = mappingRepository0.removeMetaData(classMetaData3);
        mappingRepository0.setPreload(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test284");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        mappingRepository0.startConfiguration();
        org.apache.openjpa.event.LifecycleEventManager.ListenerList listenerList2 = mappingRepository0.getSystemListeners();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray3 = mappingRepository0.getNonMappedInterfaces();
        org.apache.openjpa.meta.QueryMetaData queryMetaData5 = mappingRepository0.getCachedQueryMetaData("");
        org.junit.Assert.assertNotNull(listenerList2);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray3);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray3, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(queryMetaData5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test285");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        org.apache.openjpa.jdbc.sql.DBDictionary dBDictionary7 = mappingRepository0.getDBDictionary();
        org.apache.openjpa.lib.log.Log log8 = mappingRepository0.getLog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(dBDictionary7);
        org.junit.Assert.assertNull(log8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test286");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray9 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.jdbc.meta.MappingDefaults mappingDefaults10 = null;
        mappingRepository0.setMappingDefaults(mappingDefaults10);
        mappingRepository0.setResolve(3, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray9);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray9, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test287");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory7 = mappingRepository0.getMetaDataFactory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(metaDataFactory7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test288");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        org.apache.openjpa.jdbc.meta.StrategyInstaller strategyInstaller4 = null;
        mappingRepository0.setStrategyInstaller(strategyInstaller4);
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration6 = mappingRepository0.getConfiguration();
        mappingRepository0.setValidate((int) (short) 0, false);
        java.lang.Class class10 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping12 = mappingRepository0.getCachedQueryResultMapping(class10, "hi!");
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData15 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.jdbc.meta.FieldMapping fieldMapping16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = mappingRepository0.isUniMTo1JT(fieldMapping16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.MetaDataFactory.getDefaults()\" because the return value of \"org.apache.openjpa.jdbc.meta.MappingRepository.getMetaDataFactory()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration6);
        org.junit.Assert.assertNull(queryResultMapping12);
        org.junit.Assert.assertNotNull(sequenceMetaData15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test289");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        org.apache.openjpa.meta.QueryMetaData[] queryMetaDataArray3 = mappingRepository0.getQueryMetaDatas();
        java.lang.Class class4 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping6 = mappingRepository0.addQueryResultMapping(class4, "hi!");
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray7 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.conf.OpenJPAConfiguration openJPAConfiguration8 = mappingRepository0.getConfiguration();
        org.apache.openjpa.meta.NonPersistentMetaData[] nonPersistentMetaDataArray9 = mappingRepository0.getPersistenceAwares();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData11 = mappingRepository0.addSequenceMetaData("");
        org.apache.openjpa.meta.MetaDataFactory metaDataFactory12 = mappingRepository0.getMetaDataFactory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(queryMetaDataArray3);
        org.junit.Assert.assertArrayEquals(queryMetaDataArray3, new org.apache.openjpa.meta.QueryMetaData[] {});
        org.junit.Assert.assertNotNull(queryResultMapping6);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray7);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray7, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNull(openJPAConfiguration8);
        org.junit.Assert.assertNotNull(nonPersistentMetaDataArray9);
        org.junit.Assert.assertArrayEquals(nonPersistentMetaDataArray9, new org.apache.openjpa.meta.NonPersistentMetaData[] {});
        org.junit.Assert.assertNotNull(sequenceMetaData11);
        org.junit.Assert.assertNull(metaDataFactory12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test290");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        int int6 = mappingRepository0.getResolve();
        java.lang.Class class7 = null;
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping9 = mappingRepository0.addQueryResultMapping(class7, "hi!");
        mappingRepository0.startConfiguration();
        org.apache.openjpa.meta.SequenceMetaData sequenceMetaData12 = mappingRepository0.getCachedSequenceMetaData("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(queryResultMapping9);
        org.junit.Assert.assertNull(sequenceMetaData12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MappingRepositoryRandoopC1Test0.test291");
        org.apache.openjpa.jdbc.meta.MappingRepository mappingRepository0 = new org.apache.openjpa.jdbc.meta.MappingRepository();
        org.apache.openjpa.jdbc.meta.QueryResultMapping queryResultMapping1 = null;
        boolean boolean2 = mappingRepository0.removeQueryResultMapping(queryResultMapping1);
        mappingRepository0.setResolve((int) (byte) 100, false);
        mappingRepository0.setValidate(3);
        org.apache.openjpa.meta.ClassMetaData classMetaData8 = null;
        boolean boolean9 = mappingRepository0.removeMetaData(classMetaData8);
        org.apache.openjpa.meta.ClassMetaData classMetaData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = mappingRepository0.getMetaModel(classMetaData10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.meta.ClassMetaData.getDescribedType()\" because \"meta\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

