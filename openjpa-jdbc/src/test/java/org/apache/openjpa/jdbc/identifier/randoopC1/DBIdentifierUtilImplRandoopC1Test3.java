package org.apache.openjpa.jdbc.identifier.randoopC1;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBIdentifierUtilImplRandoopC1Test3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1501");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.truncateName(identifierRule4, "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dBIdentifierUtilImpl1.delimit("", "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1502");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl8 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration7);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration9 = dBIdentifierUtilImpl8.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration10 = dBIdentifierUtilImpl8.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        org.apache.openjpa.jdbc.schema.Table table12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = dBIdentifierUtilImpl8.getValidIndexIdentifier(dBIdentifier11, table12, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        boolean boolean22 = dBIdentifierUtilImpl18.canSplit(identifierRule19, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule23 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl25 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration24);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        org.apache.openjpa.jdbc.schema.Schema schema27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = dBIdentifierUtilImpl25.getValidTableIdentifier(dBIdentifier26, schema27, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray33 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule32 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl35 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration34);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        boolean boolean39 = dBIdentifierUtilImpl35.canSplit(identifierRule36, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        java.lang.String[] strArray43 = dBIdentifierUtilImpl35.splitName(identifierRule40, "", ".");
        java.lang.String str44 = dBIdentifierUtilImpl25.combineNames(identifierConfiguration30, identifierRule31, identifierRuleArray33, strArray43);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration45 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl46 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration45);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule47 = null;
        boolean boolean50 = dBIdentifierUtilImpl46.canSplit(identifierRule47, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule51 = null;
        java.lang.String[] strArray54 = dBIdentifierUtilImpl46.splitName(identifierRule51, "", ".");
        java.lang.String str55 = dBIdentifierUtilImpl18.combineNames(identifierRule23, identifierRuleArray33, strArray54);
        java.lang.String str56 = dBIdentifierUtilImpl8.combineNames(identifierConfiguration15, identifierRule16, strArray54);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier57 = null;
        org.apache.openjpa.jdbc.schema.Table table58 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier60 = dBIdentifierUtilImpl8.getValidIndexIdentifier(dBIdentifier57, table58, (-1));
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration61 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule62 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration63 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl64 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration63);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier65 = null;
        org.apache.openjpa.jdbc.schema.Schema schema66 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier68 = dBIdentifierUtilImpl64.getValidTableIdentifier(dBIdentifier65, schema66, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration69 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule70 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule71 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray72 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule71 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration73 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl74 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration73);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule75 = null;
        boolean boolean78 = dBIdentifierUtilImpl74.canSplit(identifierRule75, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule79 = null;
        java.lang.String[] strArray82 = dBIdentifierUtilImpl74.splitName(identifierRule79, "", ".");
        java.lang.String str83 = dBIdentifierUtilImpl64.combineNames(identifierConfiguration69, identifierRule70, identifierRuleArray72, strArray82);
        java.lang.String str84 = dBIdentifierUtilImpl8.combineNames(identifierConfiguration61, identifierRule62, strArray82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = dBIdentifierUtilImpl1.joinNames("pv", strArray82, "_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration9);
        org.junit.Assert.assertNull(jDBCConfiguration10);
        org.junit.Assert.assertNull(dBIdentifier14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dBIdentifier29);
        org.junit.Assert.assertNotNull(identifierRuleArray33);
        org.junit.Assert.assertArrayEquals(identifierRuleArray33, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(dBIdentifier60);
        org.junit.Assert.assertNull(dBIdentifier68);
        org.junit.Assert.assertNotNull(identifierRuleArray72);
        org.junit.Assert.assertArrayEquals(identifierRuleArray72, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1503");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl10 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl10.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl13.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str16 = dBIdentifierUtilImpl13.appendColumns(columnArray15);
        java.lang.String str17 = dBIdentifierUtilImpl10.appendColumns(columnArray15);
        java.lang.String str18 = dBIdentifierUtilImpl1.appendColumns(columnArray15);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier20, table21, 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = null;
        java.lang.String str25 = dBIdentifierUtilImpl1.toDBName(dBIdentifier24);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        java.lang.String str29 = dBIdentifierUtilImpl1.truncateName(identifierRule26, "|", (int) (byte) 0);
        dBIdentifierUtilImpl1.startConfiguration();
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(identifierConfiguration19);
        org.junit.Assert.assertNull(dBIdentifier23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "|" + "'", str29, "|");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1504");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl9 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration8);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration10 = dBIdentifierUtilImpl9.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str12 = dBIdentifierUtilImpl9.appendColumns(columnArray11);
        java.lang.String str13 = dBIdentifierUtilImpl1.appendColumns(columnArray11);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        org.apache.openjpa.jdbc.schema.Schema schema15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier14, schema15, 3);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = dBIdentifierUtilImpl1.splitName(identifierRule18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jDBCConfiguration10);
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(dBIdentifier17);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1505");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        org.apache.openjpa.jdbc.schema.Schema schema13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl11.getValidTableIdentifier(dBIdentifier12, schema13, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray19 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule18 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl21 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration20);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl21.canSplit(identifierRule22, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        java.lang.String[] strArray29 = dBIdentifierUtilImpl21.splitName(identifierRule26, "", ".");
        java.lang.String str30 = dBIdentifierUtilImpl11.combineNames(identifierConfiguration16, identifierRule17, identifierRuleArray19, strArray29);
        java.lang.String str31 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration8, identifierRule9, strArray29);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        java.lang.String str34 = dBIdentifierUtilImpl1.toDBName(dBIdentifier32, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        java.lang.String[] strArray38 = dBIdentifierUtilImpl1.splitName(identifierRule35, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = null;
        org.apache.openjpa.jdbc.schema.Table table40 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier39, table40, (int) '$', false);
        java.lang.String str46 = dBIdentifierUtilImpl1.shorten("|", (int) (byte) 1);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration47 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration47);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "upper" });
        org.junit.Assert.assertNull(dBIdentifier43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "|" + "'", str46, "|");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1506");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration5 = dBIdentifierUtilImpl0.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dBIdentifierUtilImpl0.combineNames(identifierConfiguration6, identifierRule7, "pv", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierConcatenator()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(jDBCConfiguration5);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1507");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration8, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration12, " ", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration16);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%" + "'", str11, "%");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1508");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule14, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier17, table18, table19, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl1.canSplit(identifierRule22, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.toDBName(dBIdentifier26, true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dBIdentifierUtilImpl1.removeDelimiters(identifierRule29, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1509");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl1.canSplit(identifierRule12, "ppr", "preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dBIdentifierUtilImpl1.appendNames(identifierRule16, "_", "|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1510");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Table table10 = null;
        org.apache.openjpa.jdbc.schema.Table table11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier9, table10, table11, (int) '$');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        org.apache.openjpa.jdbc.schema.Table table15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier14, table15, (int) (byte) -1);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier18, table19, 100);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        java.lang.String str25 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration22, "upper", "");
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dBIdentifierUtilImpl1.appendNames(identifierRule27, "", "pv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(dBIdentifier13);
        org.junit.Assert.assertNull(dBIdentifier17);
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1511");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("|");
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl12 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration11);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration13 = dBIdentifierUtilImpl12.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl12.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        java.lang.String str18 = dBIdentifierUtilImpl12.truncateName(identifierRule15, "", (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl21 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration20);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl21.canSplit(identifierRule22, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        dBIdentifierUtilImpl21.setIdentifierConfiguration(identifierConfiguration26);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration28 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl31 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration30);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl31.getValidTableIdentifier(dBIdentifier32, schema33, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule38 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray39 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule38 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl41 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration40);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule42 = null;
        boolean boolean45 = dBIdentifierUtilImpl41.canSplit(identifierRule42, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule46 = null;
        java.lang.String[] strArray49 = dBIdentifierUtilImpl41.splitName(identifierRule46, "", ".");
        java.lang.String str50 = dBIdentifierUtilImpl31.combineNames(identifierConfiguration36, identifierRule37, identifierRuleArray39, strArray49);
        java.lang.String str51 = dBIdentifierUtilImpl21.combineNames(identifierConfiguration28, identifierRule29, strArray49);
        java.lang.String str52 = dBIdentifierUtilImpl12.combineNames(identifierRule19, strArray49);
        java.lang.String str53 = dBIdentifierUtilImpl1.combineNames(identifierRule10, strArray49);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule54, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNull(jDBCConfiguration13);
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertNotNull(identifierRuleArray39);
        org.junit.Assert.assertArrayEquals(identifierRuleArray39, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1512");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dBIdentifierUtilImpl1.toDBName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getDefaultIdentifierRule()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1513");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        org.apache.openjpa.jdbc.schema.Schema schema16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier15, schema16, (int) ' ');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        java.lang.String str20 = dBIdentifierUtilImpl1.toDBName(dBIdentifier19);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = null;
        org.apache.openjpa.jdbc.schema.Table table22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier21, table22, (int) 'a', true);
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(dBIdentifier18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dBIdentifier25);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1514");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl10 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl10.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl13.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str16 = dBIdentifierUtilImpl13.appendColumns(columnArray15);
        java.lang.String str17 = dBIdentifierUtilImpl10.appendColumns(columnArray15);
        java.lang.String str18 = dBIdentifierUtilImpl1.appendColumns(columnArray15);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        java.lang.String str23 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration20, "_", "pv");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dBIdentifierUtilImpl1.removeDelimiters(identifierRule24, "upper");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(identifierConfiguration19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "pv" + "'", str23, "pv");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1515");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl1.canSplit(identifierRule12, ".", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        boolean boolean19 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration16, identifierRule17, "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration20);
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1516");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration3, "\"", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.convert(identifierConfiguration7, ".", "\"");
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("|");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"" + "'", str10, "\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|" + "'", str13, "|");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1517");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl17 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration16);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration18 = dBIdentifierUtilImpl17.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        java.lang.String str21 = dBIdentifierUtilImpl17.toDBName(dBIdentifier19, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl24 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration23);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        boolean boolean28 = dBIdentifierUtilImpl24.canSplit(identifierRule25, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        java.lang.String[] strArray32 = dBIdentifierUtilImpl24.splitName(identifierRule29, "", ".");
        java.lang.String str33 = dBIdentifierUtilImpl17.combineNames(identifierRule22, strArray32);
        java.lang.String str34 = dBIdentifierUtilImpl1.combineNames(identifierRule15, strArray32);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = null;
        org.apache.openjpa.jdbc.schema.Table table36 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier38 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier35, table36, (int) (byte) 1);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = dBIdentifierUtilImpl1.removeDelimiters(identifierRule39, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(jDBCConfiguration18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(dBIdentifier38);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1518");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, false);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        java.lang.String str13 = dBIdentifierUtilImpl1.toDBName(dBIdentifier11, false);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        org.apache.openjpa.jdbc.schema.Table table15 = null;
        org.apache.openjpa.jdbc.schema.Table table16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier14, table15, table16, 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        boolean boolean22 = dBIdentifierUtilImpl1.canSplit(identifierRule19, "upper", " ");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl25 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration24);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration26 = dBIdentifierUtilImpl25.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration27 = dBIdentifierUtilImpl25.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier28 = null;
        org.apache.openjpa.jdbc.schema.Table table29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier31 = dBIdentifierUtilImpl25.getValidIndexIdentifier(dBIdentifier28, table29, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration32 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl35 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration34);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        boolean boolean39 = dBIdentifierUtilImpl35.canSplit(identifierRule36, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration41 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl42 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration41);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = null;
        org.apache.openjpa.jdbc.schema.Schema schema44 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = dBIdentifierUtilImpl42.getValidTableIdentifier(dBIdentifier43, schema44, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration47 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule48 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule49 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray50 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule49 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration51 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl52 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration51);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        boolean boolean56 = dBIdentifierUtilImpl52.canSplit(identifierRule53, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule57 = null;
        java.lang.String[] strArray60 = dBIdentifierUtilImpl52.splitName(identifierRule57, "", ".");
        java.lang.String str61 = dBIdentifierUtilImpl42.combineNames(identifierConfiguration47, identifierRule48, identifierRuleArray50, strArray60);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration62 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl63 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration62);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule64 = null;
        boolean boolean67 = dBIdentifierUtilImpl63.canSplit(identifierRule64, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule68 = null;
        java.lang.String[] strArray71 = dBIdentifierUtilImpl63.splitName(identifierRule68, "", ".");
        java.lang.String str72 = dBIdentifierUtilImpl35.combineNames(identifierRule40, identifierRuleArray50, strArray71);
        java.lang.String str73 = dBIdentifierUtilImpl25.combineNames(identifierConfiguration32, identifierRule33, strArray71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = dBIdentifierUtilImpl1.joinNames("\"", strArray71, "_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dBIdentifier18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jDBCConfiguration26);
        org.junit.Assert.assertNull(jDBCConfiguration27);
        org.junit.Assert.assertNull(dBIdentifier31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(dBIdentifier46);
        org.junit.Assert.assertNotNull(identifierRuleArray50);
        org.junit.Assert.assertArrayEquals(identifierRuleArray50, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1519");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl7.getValidSequenceIdentifier(dBIdentifier8, schema9, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        java.lang.String str13 = dBIdentifierUtilImpl7.toDBName(dBIdentifier12);
        dBIdentifierUtilImpl7.startConfiguration();
        java.lang.String str16 = dBIdentifierUtilImpl7.convertAlias("upper");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        boolean boolean20 = dBIdentifierUtilImpl7.isDelimited(identifierConfiguration17, identifierRule18, ".");
        dBIdentifierUtilImpl7.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration24 = dBIdentifierUtilImpl23.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        java.lang.String str27 = dBIdentifierUtilImpl23.toDBName(dBIdentifier25, false);
        dBIdentifierUtilImpl23.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl30 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration29);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier31 = null;
        org.apache.openjpa.jdbc.schema.Schema schema32 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier34 = dBIdentifierUtilImpl30.getValidTableIdentifier(dBIdentifier31, schema32, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl36 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration35);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration37 = dBIdentifierUtilImpl36.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray38 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str39 = dBIdentifierUtilImpl36.appendColumns(columnArray38);
        java.lang.String str40 = dBIdentifierUtilImpl30.appendColumns(columnArray38);
        java.lang.String str41 = dBIdentifierUtilImpl23.appendColumns(columnArray38);
        java.lang.String str42 = dBIdentifierUtilImpl7.appendColumns(columnArray38);
        org.apache.openjpa.lib.conf.Configuration configuration43 = null;
        dBIdentifierUtilImpl7.setConfiguration(configuration43);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule45 = null;
        java.lang.String[] strArray48 = dBIdentifierUtilImpl7.splitName(identifierRule45, "|", ".");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = dBIdentifierUtilImpl1.joinNames(" ", strArray48, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "upper" + "'", str16, "upper");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jDBCConfiguration24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dBIdentifier34);
        org.junit.Assert.assertNull(jDBCConfiguration37);
        org.junit.Assert.assertNotNull(columnArray38);
        org.junit.Assert.assertArrayEquals(columnArray38, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "|" });
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1520");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("|");
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.toDBName(dBIdentifier10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration12, "pv", "upper");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "upper" + "'", str15, "upper");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1521");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl0.getIdentifierConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl0.getValidTableIdentifier(dBIdentifier8, schema9, (int) (short) -1);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(identifierConfiguration7);
        org.junit.Assert.assertNull(dBIdentifier11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1522");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        org.apache.openjpa.jdbc.schema.Schema schema16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier15, schema16, (int) ' ');
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl21 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration20);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = null;
        org.apache.openjpa.jdbc.schema.Schema schema23 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = dBIdentifierUtilImpl21.getValidTableIdentifier(dBIdentifier22, schema23, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl27 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration26);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration28 = dBIdentifierUtilImpl27.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray29 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str30 = dBIdentifierUtilImpl27.appendColumns(columnArray29);
        java.lang.String str31 = dBIdentifierUtilImpl21.appendColumns(columnArray29);
        java.lang.String str33 = dBIdentifierUtilImpl21.convertAlias("hi!");
        java.lang.String str35 = dBIdentifierUtilImpl21.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl39 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration38);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier40 = null;
        org.apache.openjpa.jdbc.schema.Schema schema41 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = dBIdentifierUtilImpl39.getValidTableIdentifier(dBIdentifier40, schema41, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration44 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl45 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration44);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration46 = dBIdentifierUtilImpl45.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray47 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str48 = dBIdentifierUtilImpl45.appendColumns(columnArray47);
        java.lang.String str49 = dBIdentifierUtilImpl39.appendColumns(columnArray47);
        java.lang.String str51 = dBIdentifierUtilImpl39.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration52 = dBIdentifierUtilImpl39.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration54 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl55 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration54);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        boolean boolean59 = dBIdentifierUtilImpl55.canSplit(identifierRule56, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule60 = null;
        java.lang.String[] strArray63 = dBIdentifierUtilImpl55.splitName(identifierRule60, "", ".");
        java.lang.String str64 = dBIdentifierUtilImpl39.combineNames(identifierRule53, strArray63);
        java.lang.String str65 = dBIdentifierUtilImpl21.combineNames(identifierConfiguration36, identifierRule37, strArray63);
        java.lang.String str66 = dBIdentifierUtilImpl1.combineNames(identifierRule19, strArray63);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier67 = null;
        org.apache.openjpa.jdbc.schema.Schema schema68 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier70 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier67, schema68, (int) '#');
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(dBIdentifier18);
        org.junit.Assert.assertNull(dBIdentifier25);
        org.junit.Assert.assertNull(jDBCConfiguration28);
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "|" + "'", str35, "|");
        org.junit.Assert.assertNull(dBIdentifier43);
        org.junit.Assert.assertNull(jDBCConfiguration46);
        org.junit.Assert.assertNotNull(columnArray47);
        org.junit.Assert.assertArrayEquals(columnArray47, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNull(dBIdentifier70);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1523");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule14, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier17, table18, table19, (-1));
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = null;
        java.lang.String str24 = dBIdentifierUtilImpl1.toDBName(dBIdentifier22, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.truncateName(identifierRule25, "", 0);
        dBIdentifierUtilImpl1.startConfiguration();
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1524");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        boolean boolean14 = dBIdentifierUtilImpl1.canSplit(identifierRule11, " ", " ");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration19 = dBIdentifierUtilImpl18.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        java.lang.String str22 = dBIdentifierUtilImpl18.toDBName(dBIdentifier20, false);
        dBIdentifierUtilImpl18.endConfiguration();
        java.lang.String str25 = dBIdentifierUtilImpl18.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = dBIdentifierUtilImpl18.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule27 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration28 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl29 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration28);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration30 = dBIdentifierUtilImpl29.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration31 = dBIdentifierUtilImpl29.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        java.lang.String str35 = dBIdentifierUtilImpl29.truncateName(identifierRule32, "", (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl38 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration37);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        boolean boolean42 = dBIdentifierUtilImpl38.canSplit(identifierRule39, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration43 = null;
        dBIdentifierUtilImpl38.setIdentifierConfiguration(identifierConfiguration43);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration45 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule46 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration47 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl48 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration47);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier49 = null;
        org.apache.openjpa.jdbc.schema.Schema schema50 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier52 = dBIdentifierUtilImpl48.getValidTableIdentifier(dBIdentifier49, schema50, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration53 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule54 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule55 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray56 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule55 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration57 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl58 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration57);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule59 = null;
        boolean boolean62 = dBIdentifierUtilImpl58.canSplit(identifierRule59, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule63 = null;
        java.lang.String[] strArray66 = dBIdentifierUtilImpl58.splitName(identifierRule63, "", ".");
        java.lang.String str67 = dBIdentifierUtilImpl48.combineNames(identifierConfiguration53, identifierRule54, identifierRuleArray56, strArray66);
        java.lang.String str68 = dBIdentifierUtilImpl38.combineNames(identifierConfiguration45, identifierRule46, strArray66);
        java.lang.String str69 = dBIdentifierUtilImpl29.combineNames(identifierRule36, strArray66);
        java.lang.String str70 = dBIdentifierUtilImpl18.combineNames(identifierRule27, strArray66);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration71 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl72 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration71);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier73 = null;
        org.apache.openjpa.jdbc.schema.Schema schema74 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier76 = dBIdentifierUtilImpl72.getValidTableIdentifier(dBIdentifier73, schema74, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration77 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl78 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration77);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration79 = dBIdentifierUtilImpl78.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray80 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str81 = dBIdentifierUtilImpl78.appendColumns(columnArray80);
        java.lang.String str82 = dBIdentifierUtilImpl72.appendColumns(columnArray80);
        java.lang.String str84 = dBIdentifierUtilImpl72.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration85 = dBIdentifierUtilImpl72.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule86 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration87 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl88 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration87);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule89 = null;
        boolean boolean92 = dBIdentifierUtilImpl88.canSplit(identifierRule89, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule93 = null;
        java.lang.String[] strArray96 = dBIdentifierUtilImpl88.splitName(identifierRule93, "", ".");
        java.lang.String str97 = dBIdentifierUtilImpl72.combineNames(identifierRule86, strArray96);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str98 = dBIdentifierUtilImpl1.joinNames(strArray66, strArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(identifierConfiguration15);
        org.junit.Assert.assertNull(jDBCConfiguration19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(identifierConfiguration26);
        org.junit.Assert.assertNull(jDBCConfiguration30);
        org.junit.Assert.assertNull(jDBCConfiguration31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dBIdentifier52);
        org.junit.Assert.assertNotNull(identifierRuleArray56);
        org.junit.Assert.assertArrayEquals(identifierRuleArray56, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(dBIdentifier76);
        org.junit.Assert.assertNull(jDBCConfiguration79);
        org.junit.Assert.assertNotNull(columnArray80);
        org.junit.Assert.assertArrayEquals(columnArray80, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration85);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1525");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        org.apache.openjpa.lib.conf.Configuration configuration10 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration10);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1526");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Table table10 = null;
        org.apache.openjpa.jdbc.schema.Table table11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier9, table10, table11, (int) '$');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        org.apache.openjpa.jdbc.schema.Table table15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier14, table15, (int) (byte) -1);
        java.lang.String str20 = dBIdentifierUtilImpl1.shorten("\"", (int) (byte) 100);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = null;
        org.apache.openjpa.jdbc.schema.Table table22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier21, table22, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dBIdentifierUtilImpl1.isDelimited(identifierRule25, "ppr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(dBIdentifier13);
        org.junit.Assert.assertNull(dBIdentifier17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"" + "'", str20, "\"");
        org.junit.Assert.assertNull(dBIdentifier24);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1527");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl10 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl10.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl13.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray15 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str16 = dBIdentifierUtilImpl13.appendColumns(columnArray15);
        java.lang.String str17 = dBIdentifierUtilImpl10.appendColumns(columnArray15);
        java.lang.String str18 = dBIdentifierUtilImpl1.appendColumns(columnArray15);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dBIdentifierUtilImpl1.delimit(identifierConfiguration19, identifierRule20, "ppr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNotNull(columnArray15);
        org.junit.Assert.assertArrayEquals(columnArray15, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1528");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str9 = dBIdentifierUtilImpl0.convertAlias("upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = null;
        java.lang.String str12 = dBIdentifierUtilImpl0.toDBName(dBIdentifier10, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        dBIdentifierUtilImpl14.setIdentifierConfiguration(identifierConfiguration15);
        org.apache.openjpa.jdbc.schema.Column[] columnArray17 = null;
        java.lang.String str18 = dBIdentifierUtilImpl14.appendColumns(columnArray17);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        java.lang.String[] strArray22 = dBIdentifierUtilImpl14.splitName(identifierRule19, "preserve", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dBIdentifierUtilImpl0.combineNames(identifierRule13, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "upper" + "'", str9, "upper");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "preserve" });
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1529");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule14, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier17, table18, table19, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl1.canSplit(identifierRule22, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.toDBName(dBIdentifier26, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = null;
        java.lang.String str31 = dBIdentifierUtilImpl1.toDBName(dBIdentifier29, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier32, schema33, (int) (byte) 10);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier36 = null;
        org.apache.openjpa.jdbc.schema.Table table37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier36, table37, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        boolean boolean43 = dBIdentifierUtilImpl1.canSplit(identifierRule40, " ", "preserve");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration44 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = dBIdentifierUtilImpl1.requiresDelimiters(identifierConfiguration44, identifierRule45, "|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertNull(dBIdentifier39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1530");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        java.lang.String[] strArray9 = dBIdentifierUtilImpl1.splitName(identifierRule6, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        boolean boolean13 = dBIdentifierUtilImpl1.canSplit(identifierRule10, "hi!", "\"");
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        java.lang.String str17 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule15, ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = null;
        java.lang.String str19 = dBIdentifierUtilImpl1.toDBName(dBIdentifier18);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier20, table21, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dBIdentifierUtilImpl1.removeHungarianNotation("_", "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dBIdentifier23);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1531");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        java.lang.String[] strArray9 = dBIdentifierUtilImpl1.splitName(identifierRule6, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl12 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration11);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration13 = dBIdentifierUtilImpl12.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl12.toDBName(dBIdentifier14, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration18);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        boolean boolean23 = dBIdentifierUtilImpl19.canSplit(identifierRule20, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        java.lang.String[] strArray27 = dBIdentifierUtilImpl19.splitName(identifierRule24, "", ".");
        java.lang.String str28 = dBIdentifierUtilImpl12.combineNames(identifierRule17, strArray27);
        java.lang.String str29 = dBIdentifierUtilImpl1.combineNames(identifierRule10, strArray27);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration30);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier32, schema33, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(dBIdentifier35);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1532");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule14, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier17, table18, table19, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl1.canSplit(identifierRule22, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.toDBName(dBIdentifier26, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = null;
        java.lang.String str31 = dBIdentifierUtilImpl1.toDBName(dBIdentifier29, true);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration32 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        boolean boolean35 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration32, identifierRule33, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier36 = null;
        org.apache.openjpa.jdbc.schema.Table table37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier36, table37, (int) (byte) -1);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        boolean boolean43 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration40, identifierRule41, "\"");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration44 = null;
        java.lang.String[] strArray46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration44, "lower", strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(dBIdentifier39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1533");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier8, schema9, (int) (byte) 100);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration12, " ", "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        org.apache.openjpa.jdbc.schema.Table table17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier16, table17, 0);
        java.lang.String str22 = dBIdentifierUtilImpl1.shorten("lower", 2);
        java.lang.String str24 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "%" + "'", str15, "%");
        org.junit.Assert.assertNull(dBIdentifier19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "lr" + "'", str22, "lr");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1534");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str10 = dBIdentifierUtilImpl0.shorten("_", (int) (short) 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        java.lang.String str12 = dBIdentifierUtilImpl0.toDBName(dBIdentifier11);
        java.lang.String str15 = dBIdentifierUtilImpl0.shorten(" ", (int) (byte) 1);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl0.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        java.lang.String str19 = dBIdentifierUtilImpl0.toDBName(dBIdentifier17, true);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1535");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.truncateName(identifierRule4, "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dBIdentifierUtilImpl1.combineNames("pv", " ", "lr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1536");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str9 = dBIdentifierUtilImpl0.convertAlias("upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = null;
        org.apache.openjpa.jdbc.schema.Table table11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = dBIdentifierUtilImpl0.getValidIndexIdentifier(dBIdentifier10, table11, 10);
        java.lang.String str16 = dBIdentifierUtilImpl0.shorten("%", 1);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        java.lang.String str20 = dBIdentifierUtilImpl0.combineFull(identifierConfiguration17, "ppr", "\"");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        boolean boolean27 = dBIdentifierUtilImpl23.canSplit(identifierRule24, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration28 = null;
        dBIdentifierUtilImpl23.setIdentifierConfiguration(identifierConfiguration28);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration32 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl33 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration32);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier34 = null;
        org.apache.openjpa.jdbc.schema.Schema schema35 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier37 = dBIdentifierUtilImpl33.getValidTableIdentifier(dBIdentifier34, schema35, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray41 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule40 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration42 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl43 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration42);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        boolean boolean47 = dBIdentifierUtilImpl43.canSplit(identifierRule44, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule48 = null;
        java.lang.String[] strArray51 = dBIdentifierUtilImpl43.splitName(identifierRule48, "", ".");
        java.lang.String str52 = dBIdentifierUtilImpl33.combineNames(identifierConfiguration38, identifierRule39, identifierRuleArray41, strArray51);
        java.lang.String str53 = dBIdentifierUtilImpl23.combineNames(identifierConfiguration30, identifierRule31, strArray51);
        java.lang.String str54 = dBIdentifierUtilImpl0.combineNames(identifierRule21, strArray51);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "upper" + "'", str9, "upper");
        org.junit.Assert.assertNull(dBIdentifier13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"" + "'", str20, "\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dBIdentifier37);
        org.junit.Assert.assertNotNull(identifierRuleArray41);
        org.junit.Assert.assertArrayEquals(identifierRuleArray41, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1537");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        org.apache.openjpa.jdbc.schema.Table table6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = dBIdentifierUtilImpl0.getValidColumnIdentifier(dBIdentifier5, table6, (int) (byte) 0, false);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(dBIdentifier9);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1538");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Table table10 = null;
        org.apache.openjpa.jdbc.schema.Table table11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier9, table10, table11, (int) '$');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.toDBName(dBIdentifier14);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        org.apache.openjpa.jdbc.schema.Table table17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier16, table17, 2, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = null;
        org.apache.openjpa.jdbc.schema.Schema schema22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier21, schema22, (int) (byte) 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier.DBIdentifierType dBIdentifierType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier27 = dBIdentifierUtilImpl1.fromDBName("_", dBIdentifierType26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getSupportsDelimitedIdentifiers()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(dBIdentifier13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dBIdentifier20);
        org.junit.Assert.assertNull(dBIdentifier24);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1539");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        org.apache.openjpa.jdbc.schema.Table table12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier11, table12, (int) (short) 0, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        boolean boolean19 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration16, identifierRule17, "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dBIdentifierUtilImpl1.delimit(identifierConfiguration20, identifierRule21, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1540");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule14, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier17, table18, table19, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl1.canSplit(identifierRule22, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.toDBName(dBIdentifier26, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = null;
        java.lang.String str31 = dBIdentifierUtilImpl1.toDBName(dBIdentifier29, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier32, schema33, (int) (byte) 10);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier36 = null;
        org.apache.openjpa.jdbc.schema.Table table37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier36, table37, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        boolean boolean43 = dBIdentifierUtilImpl1.canSplit(identifierRule40, " ", "preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration45 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl46 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration45);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier47 = null;
        org.apache.openjpa.jdbc.schema.Schema schema48 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier50 = dBIdentifierUtilImpl46.getValidTableIdentifier(dBIdentifier47, schema48, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration51 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray54 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule53 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration55 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl56 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration55);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule57 = null;
        boolean boolean60 = dBIdentifierUtilImpl56.canSplit(identifierRule57, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule61 = null;
        java.lang.String[] strArray64 = dBIdentifierUtilImpl56.splitName(identifierRule61, "", ".");
        java.lang.String str65 = dBIdentifierUtilImpl46.combineNames(identifierConfiguration51, identifierRule52, identifierRuleArray54, strArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = dBIdentifierUtilImpl1.joinNames(identifierRule44, strArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertNull(dBIdentifier39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(dBIdentifier50);
        org.junit.Assert.assertNotNull(identifierRuleArray54);
        org.junit.Assert.assertArrayEquals(identifierRuleArray54, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1541");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        java.lang.String[] strArray9 = dBIdentifierUtilImpl1.splitName(identifierRule6, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl12 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration11);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration13 = dBIdentifierUtilImpl12.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl12.toDBName(dBIdentifier14, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration18);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        boolean boolean23 = dBIdentifierUtilImpl19.canSplit(identifierRule20, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        java.lang.String[] strArray27 = dBIdentifierUtilImpl19.splitName(identifierRule24, "", ".");
        java.lang.String str28 = dBIdentifierUtilImpl12.combineNames(identifierRule17, strArray27);
        java.lang.String str29 = dBIdentifierUtilImpl1.combineNames(identifierRule10, strArray27);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration30);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl34 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration33);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration35 = dBIdentifierUtilImpl34.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration36 = dBIdentifierUtilImpl34.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        java.lang.String str40 = dBIdentifierUtilImpl34.truncateName(identifierRule37, "", (int) (byte) 0);
        org.apache.openjpa.lib.conf.Configuration configuration41 = null;
        dBIdentifierUtilImpl34.setConfiguration(configuration41);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration43 = null;
        java.lang.String str46 = dBIdentifierUtilImpl34.convertFull(identifierConfiguration43, "|", "");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule47 = null;
        java.lang.String[] strArray50 = dBIdentifierUtilImpl34.splitName(identifierRule47, "", "%");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = dBIdentifierUtilImpl1.joinNames("", strArray50, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(jDBCConfiguration35);
        org.junit.Assert.assertNull(jDBCConfiguration36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "" });
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1542");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl9 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration8);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration10 = dBIdentifierUtilImpl9.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray11 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str12 = dBIdentifierUtilImpl9.appendColumns(columnArray11);
        java.lang.String str13 = dBIdentifierUtilImpl1.appendColumns(columnArray11);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.toDBName(dBIdentifier14);
        org.apache.openjpa.jdbc.identifier.DBIdentifier.DBIdentifierType dBIdentifierType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.fromDBName("pv", dBIdentifierType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getSupportsDelimitedIdentifiers()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jDBCConfiguration10);
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1543");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration5 = dBIdentifierUtilImpl0.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl0.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Table table9 = null;
        org.apache.openjpa.jdbc.schema.Table table10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl0.getValidForeignKeyIdentifier(dBIdentifier8, table9, table10, 10);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(jDBCConfiguration5);
        org.junit.Assert.assertNull(dBIdentifier12);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1544");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str9 = dBIdentifierUtilImpl0.convertAlias("upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = null;
        org.apache.openjpa.jdbc.schema.Table table11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = dBIdentifierUtilImpl0.getValidIndexIdentifier(dBIdentifier10, table11, 10);
        java.lang.String str16 = dBIdentifierUtilImpl0.shorten("%", 1);
        java.lang.String str19 = dBIdentifierUtilImpl0.shorten("pv", (int) (byte) 0);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "upper" + "'", str9, "upper");
        org.junit.Assert.assertNull(dBIdentifier13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1545");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.truncateName(identifierRule4, "", (int) (byte) 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        org.apache.openjpa.jdbc.schema.Table table12 = null;
        org.apache.openjpa.jdbc.schema.Table table13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier11, table12, table13, (int) (byte) 100);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        java.lang.String str18 = dBIdentifierUtilImpl1.toDBName(dBIdentifier16, false);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1546");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier7, table8, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        java.lang.String str14 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration11, "upper", "preserve");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "preserve" + "'", str14, "preserve");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1547");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.toDBName(dBIdentifier13, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration16, identifierRule17, "%", "lower");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1548");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        java.lang.String str15 = dBIdentifierUtilImpl1.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration18);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Schema schema21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl19.getValidTableIdentifier(dBIdentifier20, schema21, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl25 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration24);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration26 = dBIdentifierUtilImpl25.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray27 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str28 = dBIdentifierUtilImpl25.appendColumns(columnArray27);
        java.lang.String str29 = dBIdentifierUtilImpl19.appendColumns(columnArray27);
        java.lang.String str31 = dBIdentifierUtilImpl19.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration32 = dBIdentifierUtilImpl19.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl35 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration34);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        boolean boolean39 = dBIdentifierUtilImpl35.canSplit(identifierRule36, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        java.lang.String[] strArray43 = dBIdentifierUtilImpl35.splitName(identifierRule40, "", ".");
        java.lang.String str44 = dBIdentifierUtilImpl19.combineNames(identifierRule33, strArray43);
        java.lang.String str45 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration16, identifierRule17, strArray43);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule46 = null;
        boolean boolean49 = dBIdentifierUtilImpl1.canSplit(identifierRule46, "preserve", "\"");
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "|" + "'", str15, "|");
        org.junit.Assert.assertNull(dBIdentifier23);
        org.junit.Assert.assertNull(jDBCConfiguration26);
        org.junit.Assert.assertNotNull(columnArray27);
        org.junit.Assert.assertArrayEquals(columnArray27, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1549");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        boolean boolean8 = dBIdentifierUtilImpl1.isDelimited(identifierRule6, " ");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Schema schema10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier9, schema10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dBIdentifier12);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1550");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        java.lang.String[] strArray9 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.joinNames(identifierRule8, strArray9, "upper");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        java.lang.String str14 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule12, "_");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dBIdentifierUtilImpl1.appendNames("|", "lr", "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_" + "'", str14, "_");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1551");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration8 = dBIdentifierUtilImpl7.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray9 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str10 = dBIdentifierUtilImpl7.appendColumns(columnArray9);
        java.lang.String str11 = dBIdentifierUtilImpl1.appendColumns(columnArray9);
        java.lang.String str13 = dBIdentifierUtilImpl1.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule14, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier17, table18, table19, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl1.canSplit(identifierRule22, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.toDBName(dBIdentifier26, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = null;
        java.lang.String str31 = dBIdentifierUtilImpl1.toDBName(dBIdentifier29, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier32, schema33, (int) (byte) 10);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier36 = null;
        org.apache.openjpa.jdbc.schema.Table table37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier36, table37, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        boolean boolean43 = dBIdentifierUtilImpl1.canSplit(identifierRule40, " ", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier44 = null;
        org.apache.openjpa.jdbc.schema.Table table45 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier48 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier44, table45, (int) (byte) 1, false);
        java.lang.String str50 = dBIdentifierUtilImpl1.convertAlias("lower");
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "%" + "'", str16, "%");
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertNull(dBIdentifier39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(dBIdentifier48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "lower" + "'", str50, "lower");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC1Test3.test1552");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.truncateName(identifierRule4, "", (int) (byte) 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.combineNames(identifierRule11, "|", "pv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierConcatenator()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
    }
}

