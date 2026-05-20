package org.apache.openjpa.jdbc.identifier.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBIdentifierUtilImplRandoopTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test501");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        java.lang.String str10 = dBIdentifierUtilImpl1.shorten(" ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test502");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray23 = dBIdentifierUtilImpl1.splitName(" ", "%", "%");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
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
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test503");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl12 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration11);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        boolean boolean16 = dBIdentifierUtilImpl12.canSplit(identifierRule13, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        dBIdentifierUtilImpl12.setIdentifierConfiguration(identifierConfiguration17);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl22 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration21);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = null;
        org.apache.openjpa.jdbc.schema.Schema schema24 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = dBIdentifierUtilImpl22.getValidTableIdentifier(dBIdentifier23, schema24, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration27 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray30 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule29 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        boolean boolean36 = dBIdentifierUtilImpl32.canSplit(identifierRule33, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        java.lang.String[] strArray40 = dBIdentifierUtilImpl32.splitName(identifierRule37, "", ".");
        java.lang.String str41 = dBIdentifierUtilImpl22.combineNames(identifierConfiguration27, identifierRule28, identifierRuleArray30, strArray40);
        java.lang.String str42 = dBIdentifierUtilImpl12.combineNames(identifierConfiguration19, identifierRule20, strArray40);
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl43 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier44 = null;
        org.apache.openjpa.jdbc.schema.Schema schema45 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier47 = dBIdentifierUtilImpl43.getValidSequenceIdentifier(dBIdentifier44, schema45, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier48 = null;
        java.lang.String str49 = dBIdentifierUtilImpl43.toDBName(dBIdentifier48);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration50 = dBIdentifierUtilImpl43.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration51 = null;
        java.lang.String str54 = dBIdentifierUtilImpl43.convert(identifierConfiguration51, "lower", "preserve");
        dBIdentifierUtilImpl43.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        java.lang.String[] strArray59 = dBIdentifierUtilImpl43.splitName(identifierRule56, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = dBIdentifierUtilImpl1.joinNames(strArray40, strArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dBIdentifier26);
        org.junit.Assert.assertNotNull(identifierRuleArray30);
        org.junit.Assert.assertArrayEquals(identifierRuleArray30, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(dBIdentifier47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(identifierConfiguration50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "preserve" + "'", str54, "preserve");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "" });
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test504");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl3 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration2);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration4 = dBIdentifierUtilImpl3.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str6 = dBIdentifierUtilImpl3.appendColumns(columnArray5);
        java.lang.String str7 = dBIdentifierUtilImpl0.appendColumns(columnArray5);
        dBIdentifierUtilImpl0.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.toDBName(dBIdentifier9, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl0.toDBName("\"", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getDefaultIdentifierRule()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration4);
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test505");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.schema.Table table22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier20, table21, table22, (int) '_');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration25 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray28 = dBIdentifierUtilImpl1.splitName(identifierConfiguration25, identifierRule26, "upper");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dBIdentifier24);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test506");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray9 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule8 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray19 = dBIdentifierUtilImpl11.splitName(identifierRule16, "", ".");
        java.lang.String str20 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration6, identifierRule7, identifierRuleArray9, strArray19);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        java.lang.String str24 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration21, "upper", "upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        org.apache.openjpa.jdbc.schema.Table table26 = null;
        org.apache.openjpa.jdbc.schema.Table table27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier25, table26, table27, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray33 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule32 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl35 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration34);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier36 = null;
        org.apache.openjpa.jdbc.schema.Schema schema37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = dBIdentifierUtilImpl35.getValidTableIdentifier(dBIdentifier36, schema37, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl41 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration40);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration42 = dBIdentifierUtilImpl41.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray43 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str44 = dBIdentifierUtilImpl41.appendColumns(columnArray43);
        java.lang.String str45 = dBIdentifierUtilImpl35.appendColumns(columnArray43);
        java.lang.String str47 = dBIdentifierUtilImpl35.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule48 = null;
        java.lang.String str50 = dBIdentifierUtilImpl35.removeHungarianNotation(identifierRule48, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier51 = null;
        org.apache.openjpa.jdbc.schema.Table table52 = null;
        org.apache.openjpa.jdbc.schema.Table table53 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier55 = dBIdentifierUtilImpl35.getValidForeignKeyIdentifier(dBIdentifier51, table52, table53, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        boolean boolean59 = dBIdentifierUtilImpl35.canSplit(identifierRule56, "upper", ".");
        java.lang.String str61 = dBIdentifierUtilImpl35.convertAlias("preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule62 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration63 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl64 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration63);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule65 = null;
        boolean boolean68 = dBIdentifierUtilImpl64.canSplit(identifierRule65, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule69 = null;
        java.lang.String[] strArray72 = dBIdentifierUtilImpl64.splitName(identifierRule69, "", ".");
        java.lang.String str73 = dBIdentifierUtilImpl35.combineNames(identifierRule62, strArray72);
        java.lang.String str74 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration30, identifierRule31, identifierRuleArray33, strArray72);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier75 = null;
        java.lang.String str77 = dBIdentifierUtilImpl1.toDBName(dBIdentifier75, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier78 = null;
        org.apache.openjpa.jdbc.schema.NameSet nameSet79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier82 = dBIdentifierUtilImpl1.makeIdentifierValid(dBIdentifier78, nameSet79, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"sname\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNotNull(identifierRuleArray9);
        org.junit.Assert.assertArrayEquals(identifierRuleArray9, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "upper" + "'", str24, "upper");
        org.junit.Assert.assertNull(dBIdentifier29);
        org.junit.Assert.assertNotNull(identifierRuleArray33);
        org.junit.Assert.assertArrayEquals(identifierRuleArray33, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertNull(dBIdentifier39);
        org.junit.Assert.assertNull(jDBCConfiguration42);
        org.junit.Assert.assertNotNull(columnArray43);
        org.junit.Assert.assertArrayEquals(columnArray43, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "%" + "'", str50, "%");
        org.junit.Assert.assertNull(dBIdentifier55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "preserve" + "'", str61, "preserve");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test507");
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
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(dBIdentifier13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dBIdentifier20);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test508");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dBIdentifierUtilImpl1.canSplit(identifierRule8, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(identifierConfiguration7);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test509");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier20, table21, (int) (short) 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = null;
        java.lang.String str25 = dBIdentifierUtilImpl1.toDBName(dBIdentifier24);
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
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test510");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl3 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration2);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration4 = dBIdentifierUtilImpl3.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str6 = dBIdentifierUtilImpl3.appendColumns(columnArray5);
        java.lang.String str7 = dBIdentifierUtilImpl0.appendColumns(columnArray5);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str9 = dBIdentifierUtilImpl0.toDBName(dBIdentifier8);
        org.junit.Assert.assertNull(jDBCConfiguration4);
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test511");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier8, schema9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.removeDelimiters("\"", "lower");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test512");
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
        java.lang.String str27 = dBIdentifierUtilImpl1.convertAlias("preserve");
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = null;
        org.apache.openjpa.jdbc.schema.Schema schema30 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier29, schema30, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray36 = dBIdentifierUtilImpl1.splitName("hi!", " ", "\"");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "preserve" + "'", str27, "preserve");
        org.junit.Assert.assertNull(dBIdentifier32);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test513");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl3 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration2);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration4 = dBIdentifierUtilImpl3.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str6 = dBIdentifierUtilImpl3.appendColumns(columnArray5);
        java.lang.String str7 = dBIdentifierUtilImpl0.appendColumns(columnArray5);
        dBIdentifierUtilImpl0.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.toDBName(dBIdentifier9, true);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration14 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl15 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration14);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        org.apache.openjpa.jdbc.schema.Schema schema17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = dBIdentifierUtilImpl15.getValidTableIdentifier(dBIdentifier16, schema17, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray23 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule22 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl25 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration24);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        boolean boolean29 = dBIdentifierUtilImpl25.canSplit(identifierRule26, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule30 = null;
        java.lang.String[] strArray33 = dBIdentifierUtilImpl25.splitName(identifierRule30, "", ".");
        java.lang.String str34 = dBIdentifierUtilImpl15.combineNames(identifierConfiguration20, identifierRule21, identifierRuleArray23, strArray33);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        java.lang.String str38 = dBIdentifierUtilImpl15.convertFull(identifierConfiguration35, "upper", "upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = null;
        org.apache.openjpa.jdbc.schema.Table table40 = null;
        org.apache.openjpa.jdbc.schema.Table table41 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = dBIdentifierUtilImpl15.getValidForeignKeyIdentifier(dBIdentifier39, table40, table41, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration44 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule45 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration46 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl47 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration46);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule48 = null;
        boolean boolean51 = dBIdentifierUtilImpl47.canSplit(identifierRule48, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration52 = null;
        dBIdentifierUtilImpl47.setIdentifierConfiguration(identifierConfiguration52);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration54 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule55 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration56 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl57 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration56);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier58 = null;
        org.apache.openjpa.jdbc.schema.Schema schema59 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier61 = dBIdentifierUtilImpl57.getValidTableIdentifier(dBIdentifier58, schema59, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration62 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule63 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule64 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray65 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule64 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration66 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl67 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration66);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule68 = null;
        boolean boolean71 = dBIdentifierUtilImpl67.canSplit(identifierRule68, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule72 = null;
        java.lang.String[] strArray75 = dBIdentifierUtilImpl67.splitName(identifierRule72, "", ".");
        java.lang.String str76 = dBIdentifierUtilImpl57.combineNames(identifierConfiguration62, identifierRule63, identifierRuleArray65, strArray75);
        java.lang.String str77 = dBIdentifierUtilImpl47.combineNames(identifierConfiguration54, identifierRule55, strArray75);
        java.lang.String str78 = dBIdentifierUtilImpl15.combineNames(identifierConfiguration44, identifierRule45, strArray75);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = dBIdentifierUtilImpl0.joinNames(identifierConfiguration12, identifierRule13, strArray75, "%");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration4);
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dBIdentifier19);
        org.junit.Assert.assertNotNull(identifierRuleArray23);
        org.junit.Assert.assertArrayEquals(identifierRuleArray23, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "upper" + "'", str38, "upper");
        org.junit.Assert.assertNull(dBIdentifier43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(dBIdentifier61);
        org.junit.Assert.assertNotNull(identifierRuleArray65);
        org.junit.Assert.assertArrayEquals(identifierRuleArray65, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test514");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration8, "lower", "\"");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = dBIdentifierUtilImpl1.splitName(identifierRule12, "|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"" + "'", str11, "\"");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test515");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration8, "lower", "\"");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = dBIdentifierUtilImpl1.splitName(identifierConfiguration12, "lower", "_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"" + "'", str11, "\"");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test516");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.schema.Table table22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier20, table21, table22, (int) '_');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration25 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration25);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule27 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray28 = new org.apache.openjpa.lib.identifier.IdentifierRule[] {};
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl30 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration29);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        boolean boolean34 = dBIdentifierUtilImpl30.canSplit(identifierRule31, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        java.lang.String[] strArray38 = dBIdentifierUtilImpl30.splitName(identifierRule35, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl41 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration40);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration42 = dBIdentifierUtilImpl41.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = null;
        java.lang.String str45 = dBIdentifierUtilImpl41.toDBName(dBIdentifier43, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule46 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration47 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl48 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration47);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule49 = null;
        boolean boolean52 = dBIdentifierUtilImpl48.canSplit(identifierRule49, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        java.lang.String[] strArray56 = dBIdentifierUtilImpl48.splitName(identifierRule53, "", ".");
        java.lang.String str57 = dBIdentifierUtilImpl41.combineNames(identifierRule46, strArray56);
        java.lang.String str58 = dBIdentifierUtilImpl30.combineNames(identifierRule39, strArray56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = dBIdentifierUtilImpl1.combineNames(identifierRule27, identifierRuleArray28, strArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dBIdentifier24);
        org.junit.Assert.assertNotNull(identifierRuleArray28);
        org.junit.Assert.assertArrayEquals(identifierRuleArray28, new org.apache.openjpa.lib.identifier.IdentifierRule[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test517");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        java.lang.String str9 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration6, " ", "_");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dBIdentifierUtilImpl1.truncateName(identifierRule10, "upper", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test518");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = dBIdentifierUtilImpl1.isDelimited(" ", ".");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test519");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Table table10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier9, table10, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration14 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl15 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration14);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl15.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        java.lang.String str20 = dBIdentifierUtilImpl15.convertFull(identifierConfiguration17, "hi!", "preserve");
        java.lang.String str22 = dBIdentifierUtilImpl15.convertAlias("%");
        dBIdentifierUtilImpl15.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration25 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl26 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration25);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier27 = null;
        org.apache.openjpa.jdbc.schema.Schema schema28 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier30 = dBIdentifierUtilImpl26.getValidTableIdentifier(dBIdentifier27, schema28, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray34 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule33 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl36 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration35);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        boolean boolean40 = dBIdentifierUtilImpl36.canSplit(identifierRule37, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        java.lang.String[] strArray44 = dBIdentifierUtilImpl36.splitName(identifierRule41, "", ".");
        java.lang.String str45 = dBIdentifierUtilImpl26.combineNames(identifierConfiguration31, identifierRule32, identifierRuleArray34, strArray44);
        java.lang.String str46 = dBIdentifierUtilImpl15.combineNames(identifierRule24, strArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = dBIdentifierUtilImpl1.combineNames(".", strArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(dBIdentifier12);
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "preserve" + "'", str20, "preserve");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "%" + "'", str22, "%");
        org.junit.Assert.assertNull(dBIdentifier30);
        org.junit.Assert.assertNotNull(identifierRuleArray34);
        org.junit.Assert.assertArrayEquals(identifierRuleArray34, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test520");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier7, table8, (int) (byte) 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        java.lang.String str12 = dBIdentifierUtilImpl1.toDBName(dBIdentifier11);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test521");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        boolean boolean21 = dBIdentifierUtilImpl17.canSplit(identifierRule18, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        java.lang.String[] strArray25 = dBIdentifierUtilImpl17.splitName(identifierRule22, "", ".");
        java.lang.String str26 = dBIdentifierUtilImpl1.combineNames(identifierRule15, strArray25);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule27 = null;
        java.lang.String str30 = dBIdentifierUtilImpl1.truncateName(identifierRule27, "", (int) (short) 100);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = dBIdentifierUtilImpl1.requiresDelimiters(identifierConfiguration31, identifierRule32, "\"");
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
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test522");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        dBIdentifierUtilImpl1.endConfiguration();
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test523");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        java.lang.String[] strArray9 = dBIdentifierUtilImpl1.splitName(identifierRule6, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl12 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration11);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration13 = dBIdentifierUtilImpl12.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl12.toDBName(dBIdentifier14, false);
        dBIdentifierUtilImpl12.endConfiguration();
        java.lang.String str19 = dBIdentifierUtilImpl12.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = dBIdentifierUtilImpl12.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration24 = dBIdentifierUtilImpl23.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration25 = dBIdentifierUtilImpl23.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        java.lang.String str29 = dBIdentifierUtilImpl23.truncateName(identifierRule26, "", (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule30 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        boolean boolean36 = dBIdentifierUtilImpl32.canSplit(identifierRule33, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration37 = null;
        dBIdentifierUtilImpl32.setIdentifierConfiguration(identifierConfiguration37);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration39 = null;
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
        java.lang.String str62 = dBIdentifierUtilImpl32.combineNames(identifierConfiguration39, identifierRule40, strArray60);
        java.lang.String str63 = dBIdentifierUtilImpl23.combineNames(identifierRule30, strArray60);
        java.lang.String str64 = dBIdentifierUtilImpl12.combineNames(identifierRule21, strArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = dBIdentifierUtilImpl1.combineNames(".", strArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(identifierConfiguration20);
        org.junit.Assert.assertNull(jDBCConfiguration24);
        org.junit.Assert.assertNull(jDBCConfiguration25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(dBIdentifier46);
        org.junit.Assert.assertNotNull(identifierRuleArray50);
        org.junit.Assert.assertArrayEquals(identifierRuleArray50, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test524");
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test525");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl13.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        java.lang.String str17 = dBIdentifierUtilImpl13.toDBName(dBIdentifier15, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl20 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration19);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        boolean boolean24 = dBIdentifierUtilImpl20.canSplit(identifierRule21, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        java.lang.String[] strArray28 = dBIdentifierUtilImpl20.splitName(identifierRule25, "", ".");
        java.lang.String str29 = dBIdentifierUtilImpl13.combineNames(identifierRule18, strArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dBIdentifierUtilImpl1.combineNames("", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test526");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dBIdentifierUtilImpl1.removeDelimiters(identifierConfiguration9, identifierRule10, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test527");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Table table10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier9, table10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = dBIdentifier12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(dBIdentifier12);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test528");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration3, "\"", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        java.lang.String str8 = dBIdentifierUtilImpl1.toDBName(dBIdentifier7);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dBIdentifierUtilImpl1.delimit(identifierConfiguration9, identifierRule10, "%");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test529");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dBIdentifierUtilImpl0.requiresDelimiters(identifierRule1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test530");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration8, "", "%");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dBIdentifierUtilImpl1.canSplit(" ", "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%" + "'", str11, "%");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test531");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        boolean boolean8 = dBIdentifierUtilImpl1.isDelimited(identifierRule6, "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl10 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration9);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration11 = dBIdentifierUtilImpl10.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        java.lang.String str15 = dBIdentifierUtilImpl10.combineFull(identifierConfiguration12, "\"", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        org.apache.openjpa.jdbc.schema.Schema schema17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = dBIdentifierUtilImpl10.getValidSequenceIdentifier(dBIdentifier16, schema17, (int) 'a');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray23 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule22 };
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
        java.lang.String str45 = dBIdentifierUtilImpl10.combineNames(identifierConfiguration20, identifierRule21, identifierRuleArray23, strArray43);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration46 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl47 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration46);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier48 = null;
        org.apache.openjpa.jdbc.schema.Schema schema49 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier51 = dBIdentifierUtilImpl47.getValidTableIdentifier(dBIdentifier48, schema49, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration52 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl53 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration52);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration54 = dBIdentifierUtilImpl53.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str56 = dBIdentifierUtilImpl53.appendColumns(columnArray55);
        java.lang.String str57 = dBIdentifierUtilImpl47.appendColumns(columnArray55);
        java.lang.String str59 = dBIdentifierUtilImpl47.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration60 = dBIdentifierUtilImpl47.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule61 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration62 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl63 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration62);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration64 = dBIdentifierUtilImpl63.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier65 = null;
        java.lang.String str67 = dBIdentifierUtilImpl63.toDBName(dBIdentifier65, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule68 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration69 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl70 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration69);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule71 = null;
        boolean boolean74 = dBIdentifierUtilImpl70.canSplit(identifierRule71, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule75 = null;
        java.lang.String[] strArray78 = dBIdentifierUtilImpl70.splitName(identifierRule75, "", ".");
        java.lang.String str79 = dBIdentifierUtilImpl63.combineNames(identifierRule68, strArray78);
        java.lang.String str80 = dBIdentifierUtilImpl47.combineNames(identifierRule61, strArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = dBIdentifierUtilImpl1.joinNames(identifierRuleArray23, strArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jDBCConfiguration11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(dBIdentifier19);
        org.junit.Assert.assertNotNull(identifierRuleArray23);
        org.junit.Assert.assertArrayEquals(identifierRuleArray23, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertNull(dBIdentifier29);
        org.junit.Assert.assertNotNull(identifierRuleArray33);
        org.junit.Assert.assertArrayEquals(identifierRuleArray33, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(dBIdentifier51);
        org.junit.Assert.assertNull(jDBCConfiguration54);
        org.junit.Assert.assertNotNull(columnArray55);
        org.junit.Assert.assertArrayEquals(columnArray55, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration60);
        org.junit.Assert.assertNull(jDBCConfiguration64);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test532");
        boolean boolean1 = org.apache.openjpa.lib.identifier.IdentifierUtilImpl.isDoubleQuoted(".");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test533");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        java.lang.String str9 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration6, " ", "_");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl13.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        java.lang.String str17 = dBIdentifierUtilImpl13.toDBName(dBIdentifier15, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl20 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration19);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        boolean boolean24 = dBIdentifierUtilImpl20.canSplit(identifierRule21, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        java.lang.String[] strArray28 = dBIdentifierUtilImpl20.splitName(identifierRule25, "", ".");
        java.lang.String str29 = dBIdentifierUtilImpl13.combineNames(identifierRule18, strArray28);
        java.lang.String str30 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration10, identifierRule11, strArray28);
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test534");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str9 = dBIdentifierUtilImpl0.convertAlias("upper");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        boolean boolean13 = dBIdentifierUtilImpl0.isDelimited(identifierConfiguration10, identifierRule11, ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dBIdentifierUtilImpl0.combineNames(identifierRule14, "upper", "lower");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "upper" + "'", str9, "upper");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test535");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration5 = dBIdentifierUtilImpl0.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray9 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule8 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration12 = dBIdentifierUtilImpl11.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = null;
        java.lang.String str15 = dBIdentifierUtilImpl11.toDBName(dBIdentifier13, false);
        dBIdentifierUtilImpl11.endConfiguration();
        java.lang.String str18 = dBIdentifierUtilImpl11.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = dBIdentifierUtilImpl11.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl22 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration21);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration23 = dBIdentifierUtilImpl22.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration24 = dBIdentifierUtilImpl22.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        java.lang.String str28 = dBIdentifierUtilImpl22.truncateName(identifierRule25, "", (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl31 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration30);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        boolean boolean35 = dBIdentifierUtilImpl31.canSplit(identifierRule32, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        dBIdentifierUtilImpl31.setIdentifierConfiguration(identifierConfiguration36);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl41 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration40);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier42 = null;
        org.apache.openjpa.jdbc.schema.Schema schema43 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier45 = dBIdentifierUtilImpl41.getValidTableIdentifier(dBIdentifier42, schema43, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration46 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule47 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule48 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray49 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule48 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration50 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl51 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration50);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        boolean boolean55 = dBIdentifierUtilImpl51.canSplit(identifierRule52, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        java.lang.String[] strArray59 = dBIdentifierUtilImpl51.splitName(identifierRule56, "", ".");
        java.lang.String str60 = dBIdentifierUtilImpl41.combineNames(identifierConfiguration46, identifierRule47, identifierRuleArray49, strArray59);
        java.lang.String str61 = dBIdentifierUtilImpl31.combineNames(identifierConfiguration38, identifierRule39, strArray59);
        java.lang.String str62 = dBIdentifierUtilImpl22.combineNames(identifierRule29, strArray59);
        java.lang.String str63 = dBIdentifierUtilImpl11.combineNames(identifierRule20, strArray59);
        java.lang.String str64 = dBIdentifierUtilImpl0.combineNames(identifierConfiguration6, identifierRule7, identifierRuleArray9, strArray59);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(jDBCConfiguration5);
        org.junit.Assert.assertNotNull(identifierRuleArray9);
        org.junit.Assert.assertArrayEquals(identifierRuleArray9, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertNull(jDBCConfiguration12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(identifierConfiguration19);
        org.junit.Assert.assertNull(jDBCConfiguration23);
        org.junit.Assert.assertNull(jDBCConfiguration24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(dBIdentifier45);
        org.junit.Assert.assertNotNull(identifierRuleArray49);
        org.junit.Assert.assertArrayEquals(identifierRuleArray49, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test536");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        java.lang.String str13 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration10, "upper", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.toDBName(dBIdentifier14, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.schema.Table table19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier17, table18, table19, (int) '4');
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dBIdentifier21);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test537");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = dBIdentifierUtilImpl1.splitName(identifierRule10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test538");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Schema schema20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = dBIdentifierUtilImpl18.getValidTableIdentifier(dBIdentifier19, schema20, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray26 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule25 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl28 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration27);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        boolean boolean32 = dBIdentifierUtilImpl28.canSplit(identifierRule29, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        java.lang.String[] strArray36 = dBIdentifierUtilImpl28.splitName(identifierRule33, "", ".");
        java.lang.String str37 = dBIdentifierUtilImpl18.combineNames(identifierConfiguration23, identifierRule24, identifierRuleArray26, strArray36);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl39 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration38);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        boolean boolean43 = dBIdentifierUtilImpl39.canSplit(identifierRule40, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        java.lang.String[] strArray47 = dBIdentifierUtilImpl39.splitName(identifierRule44, "", ".");
        java.lang.String str48 = dBIdentifierUtilImpl11.combineNames(identifierRule16, identifierRuleArray26, strArray47);
        java.lang.String str49 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration8, identifierRule9, strArray47);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule50 = null;
        java.lang.String str52 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule50, " ");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = dBIdentifierUtilImpl1.removeDelimiters(identifierConfiguration53, "hi!", "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dBIdentifier22);
        org.junit.Assert.assertNotNull(identifierRuleArray26);
        org.junit.Assert.assertArrayEquals(identifierRuleArray26, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " " + "'", str52, " ");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test539");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Schema schema21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier20, schema21, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl25 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration24);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        boolean boolean29 = dBIdentifierUtilImpl25.canSplit(identifierRule26, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        dBIdentifierUtilImpl25.setIdentifierConfiguration(identifierConfiguration30);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration32 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl33 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration32);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration34 = dBIdentifierUtilImpl33.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray35 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str36 = dBIdentifierUtilImpl33.appendColumns(columnArray35);
        java.lang.String str37 = dBIdentifierUtilImpl25.appendColumns(columnArray35);
        java.lang.String str38 = dBIdentifierUtilImpl1.appendColumns(columnArray35);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl41 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration40);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier42 = null;
        org.apache.openjpa.jdbc.schema.Schema schema43 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier45 = dBIdentifierUtilImpl41.getValidTableIdentifier(dBIdentifier42, schema43, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration46 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl47 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration46);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration48 = dBIdentifierUtilImpl47.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray49 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str50 = dBIdentifierUtilImpl47.appendColumns(columnArray49);
        java.lang.String str51 = dBIdentifierUtilImpl41.appendColumns(columnArray49);
        java.lang.String str53 = dBIdentifierUtilImpl41.convertAlias("hi!");
        java.lang.String str55 = dBIdentifierUtilImpl41.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration56 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule57 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration58 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl59 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration58);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier60 = null;
        org.apache.openjpa.jdbc.schema.Schema schema61 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier63 = dBIdentifierUtilImpl59.getValidTableIdentifier(dBIdentifier60, schema61, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration64 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl65 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration64);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration66 = dBIdentifierUtilImpl65.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray67 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str68 = dBIdentifierUtilImpl65.appendColumns(columnArray67);
        java.lang.String str69 = dBIdentifierUtilImpl59.appendColumns(columnArray67);
        java.lang.String str71 = dBIdentifierUtilImpl59.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration72 = dBIdentifierUtilImpl59.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule73 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration74 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl75 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration74);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule76 = null;
        boolean boolean79 = dBIdentifierUtilImpl75.canSplit(identifierRule76, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule80 = null;
        java.lang.String[] strArray83 = dBIdentifierUtilImpl75.splitName(identifierRule80, "", ".");
        java.lang.String str84 = dBIdentifierUtilImpl59.combineNames(identifierRule73, strArray83);
        java.lang.String str85 = dBIdentifierUtilImpl41.combineNames(identifierConfiguration56, identifierRule57, strArray83);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = dBIdentifierUtilImpl1.joinNames("upper", strArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dBIdentifier23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jDBCConfiguration34);
        org.junit.Assert.assertNotNull(columnArray35);
        org.junit.Assert.assertArrayEquals(columnArray35, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(dBIdentifier45);
        org.junit.Assert.assertNull(jDBCConfiguration48);
        org.junit.Assert.assertNotNull(columnArray49);
        org.junit.Assert.assertArrayEquals(columnArray49, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "|" + "'", str55, "|");
        org.junit.Assert.assertNull(dBIdentifier63);
        org.junit.Assert.assertNull(jDBCConfiguration66);
        org.junit.Assert.assertNotNull(columnArray67);
        org.junit.Assert.assertArrayEquals(columnArray67, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test540");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dBIdentifierUtilImpl1.delimit(identifierRule8, "upper", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test541");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl8 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration7);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Schema schema10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl8.getValidTableIdentifier(dBIdentifier9, schema10, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str17 = dBIdentifierUtilImpl14.appendColumns(columnArray16);
        java.lang.String str18 = dBIdentifierUtilImpl8.appendColumns(columnArray16);
        java.lang.String str19 = dBIdentifierUtilImpl1.appendColumns(columnArray16);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl21 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration20);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        boolean boolean25 = dBIdentifierUtilImpl21.canSplit(identifierRule22, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        dBIdentifierUtilImpl21.setIdentifierConfiguration(identifierConfiguration26);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier28 = null;
        java.lang.String str30 = dBIdentifierUtilImpl21.toDBName(dBIdentifier28, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier31 = null;
        org.apache.openjpa.jdbc.schema.Table table32 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl21.getValidColumnIdentifier(dBIdentifier31, table32, (int) (short) 0, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        boolean boolean39 = dBIdentifierUtilImpl21.isDelimited(identifierConfiguration36, identifierRule37, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier40 = null;
        org.apache.openjpa.jdbc.schema.Schema schema41 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = dBIdentifierUtilImpl21.getValidSequenceIdentifier(dBIdentifier40, schema41, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration44 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl45 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration44);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule46 = null;
        boolean boolean49 = dBIdentifierUtilImpl45.canSplit(identifierRule46, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration50 = null;
        dBIdentifierUtilImpl45.setIdentifierConfiguration(identifierConfiguration50);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration52 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl53 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration52);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration54 = dBIdentifierUtilImpl53.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray55 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str56 = dBIdentifierUtilImpl53.appendColumns(columnArray55);
        java.lang.String str57 = dBIdentifierUtilImpl45.appendColumns(columnArray55);
        java.lang.String str58 = dBIdentifierUtilImpl21.appendColumns(columnArray55);
        java.lang.String str59 = dBIdentifierUtilImpl1.appendColumns(columnArray55);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier12);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNotNull(columnArray16);
        org.junit.Assert.assertArrayEquals(columnArray16, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(dBIdentifier43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jDBCConfiguration54);
        org.junit.Assert.assertNotNull(columnArray55);
        org.junit.Assert.assertArrayEquals(columnArray55, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test542");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = dBIdentifierUtilImpl1.splitName(identifierConfiguration12, identifierRule13, "|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test543");
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
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier32, schema33, (int) '_');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl38 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration37);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration39 = dBIdentifierUtilImpl38.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration40 = dBIdentifierUtilImpl38.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration41 = null;
        java.lang.String str44 = dBIdentifierUtilImpl38.convert(identifierConfiguration41, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier45 = null;
        org.apache.openjpa.jdbc.schema.Schema schema46 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier48 = dBIdentifierUtilImpl38.getValidTableIdentifier(dBIdentifier45, schema46, (int) (byte) 100);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier49 = null;
        java.lang.String str51 = dBIdentifierUtilImpl38.toDBName(dBIdentifier49, true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray54 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule53 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration55 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl56 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration55);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule57 = null;
        boolean boolean60 = dBIdentifierUtilImpl56.canSplit(identifierRule57, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule61 = null;
        java.lang.String[] strArray64 = dBIdentifierUtilImpl56.splitName(identifierRule61, "", ".");
        java.lang.String str65 = dBIdentifierUtilImpl38.combineNames(identifierRule52, identifierRuleArray54, strArray64);
        java.lang.String[] strArray70 = new java.lang.String[] { "_", ".", "upper", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = dBIdentifierUtilImpl1.combineNames("upper", strArray64, strArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertNull(jDBCConfiguration39);
        org.junit.Assert.assertNull(jDBCConfiguration40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(dBIdentifier48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(identifierRuleArray54);
        org.junit.Assert.assertArrayEquals(identifierRuleArray54, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "_", ".", "upper", "" });
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test544");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.conf.Configuration configuration4 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration4);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(".", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getDefaultIdentifierRule()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test545");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, true);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        java.lang.String str20 = dBIdentifierUtilImpl14.convert(identifierConfiguration17, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = null;
        org.apache.openjpa.jdbc.schema.Schema schema22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl14.getValidTableIdentifier(dBIdentifier21, schema22, (int) (byte) 100);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        java.lang.String str27 = dBIdentifierUtilImpl14.toDBName(dBIdentifier25, true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray30 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule29 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        boolean boolean36 = dBIdentifierUtilImpl32.canSplit(identifierRule33, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        java.lang.String[] strArray40 = dBIdentifierUtilImpl32.splitName(identifierRule37, "", ".");
        java.lang.String str41 = dBIdentifierUtilImpl14.combineNames(identifierRule28, identifierRuleArray30, strArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = dBIdentifierUtilImpl1.joinNames(identifierConfiguration11, identifierRule12, strArray40, "_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(dBIdentifier24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(identifierRuleArray30);
        org.junit.Assert.assertArrayEquals(identifierRuleArray30, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test546");
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
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "%" + "'", str15, "%");
        org.junit.Assert.assertNull(dBIdentifier19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "lr" + "'", str22, "lr");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test547");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, false);
        dBIdentifierUtilImpl1.endConfiguration();
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = null;
        java.lang.String str14 = dBIdentifierUtilImpl1.toDBName(dBIdentifier13);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test548");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration3, "\"", "");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        boolean boolean10 = dBIdentifierUtilImpl1.canSplit(identifierRule7, ".", "\"");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        org.apache.openjpa.jdbc.schema.Schema schema15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = dBIdentifierUtilImpl13.getValidTableIdentifier(dBIdentifier14, schema15, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray21 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule20 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        boolean boolean27 = dBIdentifierUtilImpl23.canSplit(identifierRule24, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        java.lang.String[] strArray31 = dBIdentifierUtilImpl23.splitName(identifierRule28, "", ".");
        java.lang.String str32 = dBIdentifierUtilImpl13.combineNames(identifierConfiguration18, identifierRule19, identifierRuleArray21, strArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dBIdentifierUtilImpl1.joinNames(identifierRule11, strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dBIdentifier17);
        org.junit.Assert.assertNotNull(identifierRuleArray21);
        org.junit.Assert.assertArrayEquals(identifierRuleArray21, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test549");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray19 = null;
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule34 = null;
        java.lang.String str36 = dBIdentifierUtilImpl21.removeHungarianNotation(identifierRule34, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier37 = null;
        org.apache.openjpa.jdbc.schema.Table table38 = null;
        org.apache.openjpa.jdbc.schema.Table table39 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier41 = dBIdentifierUtilImpl21.getValidForeignKeyIdentifier(dBIdentifier37, table38, table39, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule42 = null;
        boolean boolean45 = dBIdentifierUtilImpl21.canSplit(identifierRule42, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = null;
        java.lang.String str48 = dBIdentifierUtilImpl21.toDBName(dBIdentifier46, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier49 = null;
        java.lang.String str51 = dBIdentifierUtilImpl21.toDBName(dBIdentifier49, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier52 = null;
        org.apache.openjpa.jdbc.schema.Schema schema53 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier55 = dBIdentifierUtilImpl21.getValidTableIdentifier(dBIdentifier52, schema53, (int) (byte) 10);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier56 = null;
        org.apache.openjpa.jdbc.schema.Table table57 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier59 = dBIdentifierUtilImpl21.getValidIndexIdentifier(dBIdentifier56, table57, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration60 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule61 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration62 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl63 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration62);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier64 = null;
        org.apache.openjpa.jdbc.schema.Schema schema65 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier67 = dBIdentifierUtilImpl63.getValidTableIdentifier(dBIdentifier64, schema65, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration68 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule69 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule70 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray71 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule70 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration72 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl73 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration72);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule74 = null;
        boolean boolean77 = dBIdentifierUtilImpl73.canSplit(identifierRule74, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule78 = null;
        java.lang.String[] strArray81 = dBIdentifierUtilImpl73.splitName(identifierRule78, "", ".");
        java.lang.String str82 = dBIdentifierUtilImpl63.combineNames(identifierConfiguration68, identifierRule69, identifierRuleArray71, strArray81);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration83 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl84 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration83);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule85 = null;
        boolean boolean88 = dBIdentifierUtilImpl84.canSplit(identifierRule85, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule89 = null;
        java.lang.String[] strArray92 = dBIdentifierUtilImpl84.splitName(identifierRule89, "", ".");
        java.lang.String str93 = dBIdentifierUtilImpl21.combineNames(identifierConfiguration60, identifierRule61, identifierRuleArray71, strArray92);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration17, identifierRule18, identifierRuleArray19, strArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"rules\" is null");
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
        org.junit.Assert.assertNull(dBIdentifier25);
        org.junit.Assert.assertNull(jDBCConfiguration28);
        org.junit.Assert.assertNotNull(columnArray29);
        org.junit.Assert.assertArrayEquals(columnArray29, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "%" + "'", str36, "%");
        org.junit.Assert.assertNull(dBIdentifier41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(dBIdentifier55);
        org.junit.Assert.assertNull(dBIdentifier59);
        org.junit.Assert.assertNull(dBIdentifier67);
        org.junit.Assert.assertNotNull(identifierRuleArray71);
        org.junit.Assert.assertArrayEquals(identifierRuleArray71, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test550");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl0.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.convert(identifierConfiguration8, "lower", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        org.apache.openjpa.jdbc.schema.Schema schema13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl0.getValidTableIdentifier(dBIdentifier12, schema13, (int) (short) 0);
        java.lang.String str18 = dBIdentifierUtilImpl0.shorten(" ", (int) '#');
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(identifierConfiguration7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "preserve" + "'", str11, "preserve");
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " " + "'", str18, " ");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test551");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl3 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration2);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration4 = dBIdentifierUtilImpl3.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str6 = dBIdentifierUtilImpl3.appendColumns(columnArray5);
        java.lang.String str7 = dBIdentifierUtilImpl0.appendColumns(columnArray5);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dBIdentifierUtilImpl0.requiresDelimiters(identifierConfiguration8, identifierRule9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration4);
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test552");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl0.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.convert(identifierConfiguration8, "lower", "preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean14 = dBIdentifierUtilImpl0.isDelimited(identifierRule12, " ");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl17 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration16);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = null;
        org.apache.openjpa.jdbc.schema.Schema schema19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl17.getValidTableIdentifier(dBIdentifier18, schema19, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration24 = dBIdentifierUtilImpl23.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray25 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str26 = dBIdentifierUtilImpl23.appendColumns(columnArray25);
        java.lang.String str27 = dBIdentifierUtilImpl17.appendColumns(columnArray25);
        java.lang.String str29 = dBIdentifierUtilImpl17.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule30 = null;
        java.lang.String str32 = dBIdentifierUtilImpl17.removeHungarianNotation(identifierRule30, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier33 = null;
        org.apache.openjpa.jdbc.schema.Table table34 = null;
        org.apache.openjpa.jdbc.schema.Table table35 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier37 = dBIdentifierUtilImpl17.getValidForeignKeyIdentifier(dBIdentifier33, table34, table35, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule38 = null;
        boolean boolean41 = dBIdentifierUtilImpl17.canSplit(identifierRule38, "upper", ".");
        java.lang.String str43 = dBIdentifierUtilImpl17.convertAlias("preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration45 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl46 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration45);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule47 = null;
        boolean boolean50 = dBIdentifierUtilImpl46.canSplit(identifierRule47, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule51 = null;
        java.lang.String[] strArray54 = dBIdentifierUtilImpl46.splitName(identifierRule51, "", ".");
        java.lang.String str55 = dBIdentifierUtilImpl17.combineNames(identifierRule44, strArray54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = dBIdentifierUtilImpl0.joinNames(identifierRule15, strArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(identifierConfiguration7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "preserve" + "'", str11, "preserve");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertNull(jDBCConfiguration24);
        org.junit.Assert.assertNotNull(columnArray25);
        org.junit.Assert.assertArrayEquals(columnArray25, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "%" + "'", str32, "%");
        org.junit.Assert.assertNull(dBIdentifier37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "preserve" + "'", str43, "preserve");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test553");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        java.lang.String str18 = dBIdentifierUtilImpl1.toDBName(dBIdentifier16, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(identifierConfiguration15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test554");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        java.lang.String[] strArray9 = dBIdentifierUtilImpl1.splitName(identifierRule6, "", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = null;
        org.apache.openjpa.jdbc.schema.Table table11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier10, table11, (int) 'a', false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl16 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl16.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        java.lang.String[] strArray21 = dBIdentifierUtilImpl16.splitName(identifierRule18, "|", "%");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dBIdentifierUtilImpl1.joinNames(identifierRule15, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(dBIdentifier14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "|" });
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test555");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.convert(identifierConfiguration12, "", "upper");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dBIdentifierUtilImpl1.delimit(identifierConfiguration16, identifierRule17, "%", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "upper" + "'", str15, "upper");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test556");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl8 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration7);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Schema schema10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl8.getValidTableIdentifier(dBIdentifier9, schema10, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str17 = dBIdentifierUtilImpl14.appendColumns(columnArray16);
        java.lang.String str18 = dBIdentifierUtilImpl8.appendColumns(columnArray16);
        java.lang.String str19 = dBIdentifierUtilImpl1.appendColumns(columnArray16);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        boolean boolean22 = dBIdentifierUtilImpl1.isDelimited(identifierRule20, "%");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier12);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNotNull(columnArray16);
        org.junit.Assert.assertArrayEquals(columnArray16, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test557");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl8 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration7);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Schema schema10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl8.getValidTableIdentifier(dBIdentifier9, schema10, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str17 = dBIdentifierUtilImpl14.appendColumns(columnArray16);
        java.lang.String str18 = dBIdentifierUtilImpl8.appendColumns(columnArray16);
        java.lang.String str19 = dBIdentifierUtilImpl1.appendColumns(columnArray16);
        org.apache.openjpa.jdbc.schema.NameSet nameSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = dBIdentifierUtilImpl1.makeNameValid("upper", nameSet21, (int) (byte) 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.delimitAll()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier12);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNotNull(columnArray16);
        org.junit.Assert.assertArrayEquals(columnArray16, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test558");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration1 = null;
        dBIdentifierUtilImpl0.setIdentifierConfiguration(identifierConfiguration1);
        org.apache.openjpa.jdbc.schema.Column[] columnArray3 = null;
        java.lang.String str4 = dBIdentifierUtilImpl0.appendColumns(columnArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dBIdentifierUtilImpl0.removeHungarianNotation("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test559");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        java.lang.String[] strArray5 = dBIdentifierUtilImpl0.splitName(identifierRule2, "|", "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier6 = null;
        org.apache.openjpa.jdbc.schema.Table table7 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = dBIdentifierUtilImpl0.getValidColumnIdentifier(dBIdentifier6, table7, (int) (short) -1, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dBIdentifierUtilImpl0.removeDelimiters(identifierRule11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "|" });
        org.junit.Assert.assertNull(dBIdentifier10);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test560");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Schema schema20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = dBIdentifierUtilImpl18.getValidTableIdentifier(dBIdentifier19, schema20, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray26 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule25 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl28 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration27);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        boolean boolean32 = dBIdentifierUtilImpl28.canSplit(identifierRule29, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        java.lang.String[] strArray36 = dBIdentifierUtilImpl28.splitName(identifierRule33, "", ".");
        java.lang.String str37 = dBIdentifierUtilImpl18.combineNames(identifierConfiguration23, identifierRule24, identifierRuleArray26, strArray36);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl39 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration38);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        boolean boolean43 = dBIdentifierUtilImpl39.canSplit(identifierRule40, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        java.lang.String[] strArray47 = dBIdentifierUtilImpl39.splitName(identifierRule44, "", ".");
        java.lang.String str48 = dBIdentifierUtilImpl11.combineNames(identifierRule16, identifierRuleArray26, strArray47);
        java.lang.String str49 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration8, identifierRule9, strArray47);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier50 = null;
        org.apache.openjpa.jdbc.schema.Table table51 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier53 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier50, table51, (-1));
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration54 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule55 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration56 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl57 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration56);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier58 = null;
        org.apache.openjpa.jdbc.schema.Schema schema59 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier61 = dBIdentifierUtilImpl57.getValidTableIdentifier(dBIdentifier58, schema59, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration62 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule63 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule64 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray65 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule64 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration66 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl67 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration66);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule68 = null;
        boolean boolean71 = dBIdentifierUtilImpl67.canSplit(identifierRule68, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule72 = null;
        java.lang.String[] strArray75 = dBIdentifierUtilImpl67.splitName(identifierRule72, "", ".");
        java.lang.String str76 = dBIdentifierUtilImpl57.combineNames(identifierConfiguration62, identifierRule63, identifierRuleArray65, strArray75);
        java.lang.String str77 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration54, identifierRule55, strArray75);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dBIdentifier22);
        org.junit.Assert.assertNotNull(identifierRuleArray26);
        org.junit.Assert.assertArrayEquals(identifierRuleArray26, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(dBIdentifier53);
        org.junit.Assert.assertNull(dBIdentifier61);
        org.junit.Assert.assertNotNull(identifierRuleArray65);
        org.junit.Assert.assertArrayEquals(identifierRuleArray65, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test561");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration5 = null;
        java.lang.String str8 = dBIdentifierUtilImpl0.convertFull(identifierConfiguration5, "upper", ".");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        java.lang.String str12 = dBIdentifierUtilImpl0.combineFull(identifierConfiguration9, "hi!", "lower");
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "lower" + "'", str12, "lower");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test562");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration35, identifierRule36, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test563");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration14 = null;
        java.lang.String str17 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration14, "preserve", "_");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_" + "'", str17, "_");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test564");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        boolean boolean18 = dBIdentifierUtilImpl1.isDelimited(identifierRule16, ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Table table20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier19, table20, table21, (int) ' ');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl27 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration26);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        boolean boolean31 = dBIdentifierUtilImpl27.canSplit(identifierRule28, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        java.lang.String[] strArray35 = dBIdentifierUtilImpl27.splitName(identifierRule32, "", ".");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dBIdentifierUtilImpl1.joinNames(identifierConfiguration24, identifierRule25, strArray35, "lr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dBIdentifier23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test565");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        java.lang.String str13 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration10, "upper", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        org.apache.openjpa.jdbc.schema.Table table15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier14, table15, 10, true);
        org.apache.openjpa.jdbc.schema.NameSet nameSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.makeNameValid("preserve", nameSet20, (int) (byte) 0, 2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(dBIdentifier18);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test566");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        boolean boolean19 = dBIdentifierUtilImpl1.canSplit(identifierRule16, "", "|");
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "|" + "'", str15, "|");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test567");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        org.apache.openjpa.jdbc.schema.NameSet nameSet17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = dBIdentifierUtilImpl1.makeIdentifierValid(dBIdentifier16, nameSet17, 2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"sname\" is null");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "|" + "'", str15, "|");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test568");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "", "");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.conf.Configuration configuration15 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration15);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        java.lang.String str20 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration17, "_", " ");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test569");
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
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl21 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl21.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule23 = null;
        java.lang.String[] strArray26 = dBIdentifierUtilImpl21.splitName(identifierRule23, "|", "%");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dBIdentifierUtilImpl1.combineNames("hi!", strArray26);
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
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(dBIdentifier18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "|" });
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test570");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray3 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str4 = dBIdentifierUtilImpl1.appendColumns(columnArray3);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule5 = null;
        boolean boolean8 = dBIdentifierUtilImpl1.canSplit(identifierRule5, "preserve", "upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dBIdentifierUtilImpl1.delimit(dBIdentifier9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"name\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNotNull(columnArray3);
        org.junit.Assert.assertArrayEquals(columnArray3, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test571");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier8, schema9, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        org.apache.openjpa.jdbc.schema.Table table13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier12, table13, (int) (short) -1);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        java.lang.String str19 = dBIdentifierUtilImpl1.toDBName(dBIdentifier17, false);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test572");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        boolean boolean11 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration8, identifierRule9, " ");
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test573");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.removeHungarianNotation("upper", "_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test574");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dBIdentifierUtilImpl1.removeDelimiters(identifierConfiguration20, " ", ".");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
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
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test575");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "." + "'", str17, ".");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test576");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.combineNames("|", "", "lr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test577");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier7, table8, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.appendNames(identifierRule11, "%", "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test578");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray9 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule8 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray19 = dBIdentifierUtilImpl11.splitName(identifierRule16, "", ".");
        java.lang.String str20 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration6, identifierRule7, identifierRuleArray9, strArray19);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = null;
        org.apache.openjpa.jdbc.schema.Schema schema25 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier27 = dBIdentifierUtilImpl23.getValidTableIdentifier(dBIdentifier24, schema25, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration28 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl29 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration28);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration30 = dBIdentifierUtilImpl29.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray31 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str32 = dBIdentifierUtilImpl29.appendColumns(columnArray31);
        java.lang.String str33 = dBIdentifierUtilImpl23.appendColumns(columnArray31);
        java.lang.String str35 = dBIdentifierUtilImpl23.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        java.lang.String str38 = dBIdentifierUtilImpl23.removeHungarianNotation(identifierRule36, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = null;
        org.apache.openjpa.jdbc.schema.Table table40 = null;
        org.apache.openjpa.jdbc.schema.Table table41 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = dBIdentifierUtilImpl23.getValidForeignKeyIdentifier(dBIdentifier39, table40, table41, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        boolean boolean47 = dBIdentifierUtilImpl23.canSplit(identifierRule44, "upper", ".");
        java.lang.String str49 = dBIdentifierUtilImpl23.convertAlias("preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule50 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration51 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl52 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration51);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        boolean boolean56 = dBIdentifierUtilImpl52.canSplit(identifierRule53, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule57 = null;
        java.lang.String[] strArray60 = dBIdentifierUtilImpl52.splitName(identifierRule57, "", ".");
        java.lang.String str61 = dBIdentifierUtilImpl23.combineNames(identifierRule50, strArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = dBIdentifierUtilImpl1.joinNames("upper", strArray60, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNotNull(identifierRuleArray9);
        org.junit.Assert.assertArrayEquals(identifierRuleArray9, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(dBIdentifier27);
        org.junit.Assert.assertNull(jDBCConfiguration30);
        org.junit.Assert.assertNotNull(columnArray31);
        org.junit.Assert.assertArrayEquals(columnArray31, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "%" + "'", str38, "%");
        org.junit.Assert.assertNull(dBIdentifier43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "preserve" + "'", str49, "preserve");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test579");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule26, ".");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dBIdentifierUtilImpl1.combineNames("|", "upper", "");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test580");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        java.lang.String str39 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration36, "upper", "lower");
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier41 = null;
        org.apache.openjpa.jdbc.schema.Table table42 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier45 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier41, table42, (int) (byte) 100, true);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "lower" + "'", str39, "lower");
        org.junit.Assert.assertNull(dBIdentifier45);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test581");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dBIdentifierUtilImpl1.isDelimited(identifierRule11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test582");
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
        java.lang.String str27 = dBIdentifierUtilImpl1.convertAlias("preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl30 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration29);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        boolean boolean34 = dBIdentifierUtilImpl30.canSplit(identifierRule31, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        java.lang.String[] strArray38 = dBIdentifierUtilImpl30.splitName(identifierRule35, "", ".");
        java.lang.String str39 = dBIdentifierUtilImpl1.combineNames(identifierRule28, strArray38);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray43 = dBIdentifierUtilImpl1.splitName(identifierConfiguration40, "upper", "%");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "preserve" + "'", str27, "preserve");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test583");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration8, "", "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        org.apache.openjpa.jdbc.schema.Schema schema13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier12, schema13, (int) (short) -1);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%" + "'", str11, "%");
        org.junit.Assert.assertNull(dBIdentifier15);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test584");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test585");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        java.lang.String str22 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule20, ".");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test586");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration12 = dBIdentifierUtilImpl11.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = null;
        java.lang.String str15 = dBIdentifierUtilImpl11.toDBName(dBIdentifier13, false);
        dBIdentifierUtilImpl11.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Schema schema20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = dBIdentifierUtilImpl18.getValidTableIdentifier(dBIdentifier19, schema20, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl24 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration23);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration25 = dBIdentifierUtilImpl24.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray26 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str27 = dBIdentifierUtilImpl24.appendColumns(columnArray26);
        java.lang.String str28 = dBIdentifierUtilImpl18.appendColumns(columnArray26);
        java.lang.String str29 = dBIdentifierUtilImpl11.appendColumns(columnArray26);
        java.lang.String str30 = dBIdentifierUtilImpl1.appendColumns(columnArray26);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(identifierConfiguration9);
        org.junit.Assert.assertNull(jDBCConfiguration12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dBIdentifier22);
        org.junit.Assert.assertNull(jDBCConfiguration25);
        org.junit.Assert.assertNotNull(columnArray26);
        org.junit.Assert.assertArrayEquals(columnArray26, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test587");
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
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier32, schema33, (int) '_');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration36, identifierRule37, "lower");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(dBIdentifier35);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test588");
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
        java.lang.String str27 = dBIdentifierUtilImpl1.convertAlias("preserve");
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = null;
        org.apache.openjpa.jdbc.schema.Table table30 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier33 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier29, table30, (int) '#', false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration34, identifierRule35, "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "preserve" + "'", str27, "preserve");
        org.junit.Assert.assertNull(dBIdentifier33);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test589");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier.DBIdentifierType dBIdentifierType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = dBIdentifierUtilImpl1.fromDBName("_", dBIdentifierType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getSupportsDelimitedIdentifiers()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(identifierConfiguration7);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test590");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl17 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration16);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = null;
        org.apache.openjpa.jdbc.schema.Schema schema19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl17.getValidTableIdentifier(dBIdentifier18, schema19, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration24 = dBIdentifierUtilImpl23.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray25 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str26 = dBIdentifierUtilImpl23.appendColumns(columnArray25);
        java.lang.String str27 = dBIdentifierUtilImpl17.appendColumns(columnArray25);
        java.lang.String str28 = dBIdentifierUtilImpl1.appendColumns(columnArray25);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl31 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration30);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration32 = dBIdentifierUtilImpl31.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration33 = dBIdentifierUtilImpl31.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        java.lang.String str37 = dBIdentifierUtilImpl31.convert(identifierConfiguration34, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration38 = null;
        dBIdentifierUtilImpl31.setConfiguration(configuration38);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        java.lang.String[] strArray43 = dBIdentifierUtilImpl31.splitName(identifierRule40, "%", "lower");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = dBIdentifierUtilImpl1.joinNames("lr", strArray43, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "%" + "'", str15, "%");
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertNull(jDBCConfiguration24);
        org.junit.Assert.assertNotNull(columnArray25);
        org.junit.Assert.assertArrayEquals(columnArray25, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(jDBCConfiguration32);
        org.junit.Assert.assertNull(jDBCConfiguration33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "%" });
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test591");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.truncateName(identifierRule4, "", (int) (byte) 0);
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        java.lang.String str13 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration10, "|", "");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test592");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        java.lang.String str9 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration6, " ", "_");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = dBIdentifierUtilImpl1.isReservedWord(identifierRule10, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Naming rule is null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test593");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Schema schema21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier20, schema21, (int) (byte) 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl25 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        org.apache.openjpa.jdbc.schema.Schema schema27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = dBIdentifierUtilImpl25.getValidSequenceIdentifier(dBIdentifier26, schema27, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier30 = null;
        java.lang.String str31 = dBIdentifierUtilImpl25.toDBName(dBIdentifier30);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration32 = dBIdentifierUtilImpl25.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration33 = null;
        java.lang.String str36 = dBIdentifierUtilImpl25.convert(identifierConfiguration33, "lower", "preserve");
        dBIdentifierUtilImpl25.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule38 = null;
        java.lang.String[] strArray41 = dBIdentifierUtilImpl25.splitName(identifierRule38, "", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration42 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl43 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration42);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration44 = dBIdentifierUtilImpl43.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration45 = null;
        java.lang.String str48 = dBIdentifierUtilImpl43.convertFull(identifierConfiguration45, "hi!", "preserve");
        java.lang.String str50 = dBIdentifierUtilImpl43.convertAlias("%");
        dBIdentifierUtilImpl43.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration53 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl54 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration53);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier55 = null;
        org.apache.openjpa.jdbc.schema.Schema schema56 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier58 = dBIdentifierUtilImpl54.getValidTableIdentifier(dBIdentifier55, schema56, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration59 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule60 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule61 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray62 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule61 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration63 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl64 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration63);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule65 = null;
        boolean boolean68 = dBIdentifierUtilImpl64.canSplit(identifierRule65, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule69 = null;
        java.lang.String[] strArray72 = dBIdentifierUtilImpl64.splitName(identifierRule69, "", ".");
        java.lang.String str73 = dBIdentifierUtilImpl54.combineNames(identifierConfiguration59, identifierRule60, identifierRuleArray62, strArray72);
        java.lang.String str74 = dBIdentifierUtilImpl43.combineNames(identifierRule52, strArray72);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = dBIdentifierUtilImpl1.combineNames("", strArray41, strArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dBIdentifier23);
        org.junit.Assert.assertNull(dBIdentifier29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(identifierConfiguration32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "preserve" + "'", str36, "preserve");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "preserve" + "'", str48, "preserve");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "%" + "'", str50, "%");
        org.junit.Assert.assertNull(dBIdentifier58);
        org.junit.Assert.assertNotNull(identifierRuleArray62);
        org.junit.Assert.assertArrayEquals(identifierRuleArray62, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test594");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Schema schema10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier9, schema10, (int) '$');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = dBIdentifierUtilImpl1.splitName("lower", "\"", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(dBIdentifier12);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test595");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        boolean boolean18 = dBIdentifierUtilImpl1.isDelimited(identifierRule16, ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Table table20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier19, table20, table21, (int) ' ');
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray26 = dBIdentifierUtilImpl1.splitName(identifierRule24, "%");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dBIdentifier23);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test596");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration5 = null;
        java.lang.String str8 = dBIdentifierUtilImpl0.convertFull(identifierConfiguration5, "upper", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dBIdentifierUtilImpl0.requiresDelimiters(identifierRule9, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test597");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray9 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule8 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray19 = dBIdentifierUtilImpl11.splitName(identifierRule16, "", ".");
        java.lang.String str20 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration6, identifierRule7, identifierRuleArray9, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dBIdentifierUtilImpl1.delimit(" ", "|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNotNull(identifierRuleArray9);
        org.junit.Assert.assertArrayEquals(identifierRuleArray9, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test598");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.NameSet nameSet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl0.makeIdentifierValid(dBIdentifier7, nameSet8, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"sname\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test599");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Schema schema20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = dBIdentifierUtilImpl18.getValidTableIdentifier(dBIdentifier19, schema20, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray26 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule25 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl28 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration27);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        boolean boolean32 = dBIdentifierUtilImpl28.canSplit(identifierRule29, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        java.lang.String[] strArray36 = dBIdentifierUtilImpl28.splitName(identifierRule33, "", ".");
        java.lang.String str37 = dBIdentifierUtilImpl18.combineNames(identifierConfiguration23, identifierRule24, identifierRuleArray26, strArray36);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl39 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration38);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        boolean boolean43 = dBIdentifierUtilImpl39.canSplit(identifierRule40, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        java.lang.String[] strArray47 = dBIdentifierUtilImpl39.splitName(identifierRule44, "", ".");
        java.lang.String str48 = dBIdentifierUtilImpl11.combineNames(identifierRule16, identifierRuleArray26, strArray47);
        java.lang.String str49 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration8, identifierRule9, strArray47);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier50 = null;
        org.apache.openjpa.jdbc.schema.Table table51 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier53 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier50, table51, (int) (byte) -1);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dBIdentifier22);
        org.junit.Assert.assertNotNull(identifierRuleArray26);
        org.junit.Assert.assertArrayEquals(identifierRuleArray26, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(dBIdentifier53);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test600");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl10 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration9);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        boolean boolean14 = dBIdentifierUtilImpl10.canSplit(identifierRule11, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        dBIdentifierUtilImpl10.setIdentifierConfiguration(identifierConfiguration15);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl20 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration19);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = null;
        org.apache.openjpa.jdbc.schema.Schema schema22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl20.getValidTableIdentifier(dBIdentifier21, schema22, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration25 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule27 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray28 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule27 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl30 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration29);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        boolean boolean34 = dBIdentifierUtilImpl30.canSplit(identifierRule31, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        java.lang.String[] strArray38 = dBIdentifierUtilImpl30.splitName(identifierRule35, "", ".");
        java.lang.String str39 = dBIdentifierUtilImpl20.combineNames(identifierConfiguration25, identifierRule26, identifierRuleArray28, strArray38);
        java.lang.String str40 = dBIdentifierUtilImpl10.combineNames(identifierConfiguration17, identifierRule18, strArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = dBIdentifierUtilImpl1.joinNames(identifierRule8, strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dBIdentifier24);
        org.junit.Assert.assertNotNull(identifierRuleArray28);
        org.junit.Assert.assertArrayEquals(identifierRuleArray28, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test601");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "%", "lower");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dBIdentifierUtilImpl1.removeDelimiters(identifierRule14, "|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "%" });
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test602");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        java.lang.String str4 = dBIdentifierUtilImpl0.toDBName(dBIdentifier2, true);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration5 = null;
        java.lang.String str8 = dBIdentifierUtilImpl0.convertFull(identifierConfiguration5, "%", "upper");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dBIdentifierUtilImpl0.delimit("lr", "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "upper" + "'", str8, "upper");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test603");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dBIdentifierUtilImpl0.removeDelimiters(identifierConfiguration2, identifierRule3, "lr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test604");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        java.lang.String[] strArray9 = dBIdentifierUtilImpl1.splitName(identifierRule6, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        boolean boolean13 = dBIdentifierUtilImpl1.canSplit(identifierRule10, "hi!", "\"");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dBIdentifierUtilImpl1.isReservedWord(identifierRule14, "_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Naming rule is null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test605");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration39 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration41 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl42 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration41);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier43 = null;
        org.apache.openjpa.jdbc.schema.Schema schema44 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = dBIdentifierUtilImpl42.getValidTableIdentifier(dBIdentifier43, schema44, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration47 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl48 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration47);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration49 = dBIdentifierUtilImpl48.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray50 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str51 = dBIdentifierUtilImpl48.appendColumns(columnArray50);
        java.lang.String str52 = dBIdentifierUtilImpl42.appendColumns(columnArray50);
        java.lang.String str54 = dBIdentifierUtilImpl42.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule55 = null;
        java.lang.String str57 = dBIdentifierUtilImpl42.removeHungarianNotation(identifierRule55, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier58 = null;
        org.apache.openjpa.jdbc.schema.Table table59 = null;
        org.apache.openjpa.jdbc.schema.Table table60 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier62 = dBIdentifierUtilImpl42.getValidForeignKeyIdentifier(dBIdentifier58, table59, table60, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule63 = null;
        boolean boolean66 = dBIdentifierUtilImpl42.canSplit(identifierRule63, "upper", ".");
        java.lang.String str68 = dBIdentifierUtilImpl42.convertAlias("preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule69 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration70 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl71 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration70);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule72 = null;
        boolean boolean75 = dBIdentifierUtilImpl71.canSplit(identifierRule72, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule76 = null;
        java.lang.String[] strArray79 = dBIdentifierUtilImpl71.splitName(identifierRule76, "", ".");
        java.lang.String str80 = dBIdentifierUtilImpl42.combineNames(identifierRule69, strArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration39, "preserve", strArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(dBIdentifier46);
        org.junit.Assert.assertNull(jDBCConfiguration49);
        org.junit.Assert.assertNotNull(columnArray50);
        org.junit.Assert.assertArrayEquals(columnArray50, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "%" + "'", str57, "%");
        org.junit.Assert.assertNull(dBIdentifier62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "preserve" + "'", str68, "preserve");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test606");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dBIdentifierUtilImpl1.delimit(identifierConfiguration10, identifierRule11, "upper");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test607");
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
        org.apache.openjpa.jdbc.schema.Schema schema33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier32, schema33, (int) '_');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = dBIdentifierUtilImpl1.delimit("preserve", "lower");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(dBIdentifier35);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test608");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        org.apache.openjpa.jdbc.schema.Table table16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier15, table16, (int) (byte) 10);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Table table20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier19, table20, 0, false);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_" + "'", str14, "_");
        org.junit.Assert.assertNull(dBIdentifier18);
        org.junit.Assert.assertNull(dBIdentifier23);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test609");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl3 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration2);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration4 = dBIdentifierUtilImpl3.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str6 = dBIdentifierUtilImpl3.appendColumns(columnArray5);
        java.lang.String str7 = dBIdentifierUtilImpl0.appendColumns(columnArray5);
        dBIdentifierUtilImpl0.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.toDBName(dBIdentifier9, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl0.delimit(dBIdentifier12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"name\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration4);
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test610");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        org.apache.openjpa.jdbc.schema.Schema schema16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier15, schema16, (int) (byte) 1);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration19 = dBIdentifierUtilImpl1.getConfiguration();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dBIdentifier18);
        org.junit.Assert.assertNull(jDBCConfiguration19);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test611");
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
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test612");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        boolean boolean8 = dBIdentifierUtilImpl1.isDelimited(identifierRule6, "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dBIdentifierUtilImpl1.delimit(identifierRule9, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test613");
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
        java.lang.String str14 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration11, ".", "|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dBIdentifierUtilImpl1.toDBName(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getDefaultIdentifierRule()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "|" + "'", str14, "|");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test614");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl15 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        org.apache.openjpa.jdbc.schema.Schema schema17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = dBIdentifierUtilImpl15.getValidSequenceIdentifier(dBIdentifier16, schema17, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        java.lang.String str21 = dBIdentifierUtilImpl15.toDBName(dBIdentifier20);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = dBIdentifierUtilImpl15.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        java.lang.String str26 = dBIdentifierUtilImpl15.convert(identifierConfiguration23, "lower", "preserve");
        dBIdentifierUtilImpl15.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        java.lang.String[] strArray31 = dBIdentifierUtilImpl15.splitName(identifierRule28, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dBIdentifierUtilImpl1.combineNames("", strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(dBIdentifier19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(identifierConfiguration22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "preserve" + "'", str26, "preserve");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test615");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray38 = dBIdentifierUtilImpl1.splitName(identifierConfiguration35, "", "%");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test616");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.convert(identifierConfiguration12, "", "upper");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = dBIdentifierUtilImpl1.splitName("%", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "upper" + "'", str15, "upper");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test617");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        java.lang.String str13 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration10, "upper", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        java.lang.String str16 = dBIdentifierUtilImpl1.toDBName(dBIdentifier14, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = dBIdentifierUtilImpl1.splitName(".", "_", ".");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test618");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dBIdentifierUtilImpl1.isReservedWord(identifierRule14, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Naming rule is null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jDBCConfiguration10);
        org.junit.Assert.assertNotNull(columnArray11);
        org.junit.Assert.assertArrayEquals(columnArray11, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test619");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray3 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str4 = dBIdentifierUtilImpl1.appendColumns(columnArray3);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule5 = null;
        boolean boolean8 = dBIdentifierUtilImpl1.canSplit(identifierRule5, "preserve", "upper");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration33 = dBIdentifierUtilImpl32.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration34 = dBIdentifierUtilImpl32.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        java.lang.String str38 = dBIdentifierUtilImpl32.convert(identifierConfiguration35, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration39 = null;
        dBIdentifierUtilImpl32.setConfiguration(configuration39);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        java.lang.String[] strArray44 = dBIdentifierUtilImpl32.splitName(identifierRule41, "%", "lower");
        java.lang.String str45 = dBIdentifierUtilImpl1.combineNames(identifierRule9, identifierRuleArray19, strArray44);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = null;
        org.apache.openjpa.jdbc.schema.Table table47 = null;
        org.apache.openjpa.jdbc.schema.Table table48 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier50 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier46, table47, table48, (int) 'a');
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNotNull(columnArray3);
        org.junit.Assert.assertArrayEquals(columnArray3, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jDBCConfiguration33);
        org.junit.Assert.assertNull(jDBCConfiguration34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "%" });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "%" + "'", str45, "%");
        org.junit.Assert.assertNull(dBIdentifier50);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test620");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier7, table8, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.appendNames(identifierRule11, "hi!", "lr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test621");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dBIdentifierUtilImpl1.appendNames("%", "%", "|");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test622");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration9);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        org.apache.openjpa.jdbc.schema.Table table12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier11, table12, (int) '$', true);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration18);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        boolean boolean23 = dBIdentifierUtilImpl19.canSplit(identifierRule20, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        dBIdentifierUtilImpl19.setIdentifierConfiguration(identifierConfiguration24);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule27 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration28 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl29 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration28);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier30 = null;
        org.apache.openjpa.jdbc.schema.Schema schema31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier33 = dBIdentifierUtilImpl29.getValidTableIdentifier(dBIdentifier30, schema31, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray37 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule36 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl39 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration38);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        boolean boolean43 = dBIdentifierUtilImpl39.canSplit(identifierRule40, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule44 = null;
        java.lang.String[] strArray47 = dBIdentifierUtilImpl39.splitName(identifierRule44, "", ".");
        java.lang.String str48 = dBIdentifierUtilImpl29.combineNames(identifierConfiguration34, identifierRule35, identifierRuleArray37, strArray47);
        java.lang.String str49 = dBIdentifierUtilImpl19.combineNames(identifierConfiguration26, identifierRule27, strArray47);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier50 = null;
        java.lang.String str52 = dBIdentifierUtilImpl19.toDBName(dBIdentifier50, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        java.lang.String[] strArray56 = dBIdentifierUtilImpl19.splitName(identifierRule53, "upper", ".");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration16, identifierRule17, strArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dBIdentifier33);
        org.junit.Assert.assertNotNull(identifierRuleArray37);
        org.junit.Assert.assertArrayEquals(identifierRuleArray37, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "upper" });
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test623");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        java.lang.String str6 = dBIdentifierUtilImpl0.convertAlias("lower");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dBIdentifierUtilImpl0.removeHungarianNotation("lower", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "lower" + "'", str6, "lower");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test624");
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
        org.apache.openjpa.jdbc.schema.Schema schema15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier14, schema15, (int) '#');
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dBIdentifier17);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test625");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl13.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl13.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        org.apache.openjpa.jdbc.schema.Table table17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = dBIdentifierUtilImpl13.getValidIndexIdentifier(dBIdentifier16, table17, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        boolean boolean27 = dBIdentifierUtilImpl23.canSplit(identifierRule24, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl30 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration29);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier31 = null;
        org.apache.openjpa.jdbc.schema.Schema schema32 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier34 = dBIdentifierUtilImpl30.getValidTableIdentifier(dBIdentifier31, schema32, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray38 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule37 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration39 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl40 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration39);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        boolean boolean44 = dBIdentifierUtilImpl40.canSplit(identifierRule41, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule45 = null;
        java.lang.String[] strArray48 = dBIdentifierUtilImpl40.splitName(identifierRule45, "", ".");
        java.lang.String str49 = dBIdentifierUtilImpl30.combineNames(identifierConfiguration35, identifierRule36, identifierRuleArray38, strArray48);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration50 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl51 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration50);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        boolean boolean55 = dBIdentifierUtilImpl51.canSplit(identifierRule52, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        java.lang.String[] strArray59 = dBIdentifierUtilImpl51.splitName(identifierRule56, "", ".");
        java.lang.String str60 = dBIdentifierUtilImpl23.combineNames(identifierRule28, identifierRuleArray38, strArray59);
        java.lang.String str61 = dBIdentifierUtilImpl13.combineNames(identifierConfiguration20, identifierRule21, strArray59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = dBIdentifierUtilImpl1.combineNames("%", strArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNull(dBIdentifier19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(dBIdentifier34);
        org.junit.Assert.assertNotNull(identifierRuleArray38);
        org.junit.Assert.assertArrayEquals(identifierRuleArray38, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test626");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dBIdentifierUtilImpl1.isReservedWord(identifierRule9, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Naming rule is null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(identifierConfiguration7);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test627");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "%", "lower");
        java.lang.String str16 = dBIdentifierUtilImpl1.shorten("_", 100);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "%" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_" + "'", str16, "_");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test628");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dBIdentifierUtilImpl1.canSplit(identifierRule8, "lower");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test629");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl8 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration7);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        boolean boolean12 = dBIdentifierUtilImpl8.canSplit(identifierRule9, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        java.lang.String[] strArray16 = dBIdentifierUtilImpl8.splitName(identifierRule13, "", ".");
        java.lang.String str17 = dBIdentifierUtilImpl1.combineNames(identifierRule6, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dBIdentifierUtilImpl1.combineNames(" ", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test630");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration18);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration20 = dBIdentifierUtilImpl19.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration21 = dBIdentifierUtilImpl19.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        java.lang.String str25 = dBIdentifierUtilImpl19.convert(identifierConfiguration22, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        org.apache.openjpa.jdbc.schema.Schema schema27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = dBIdentifierUtilImpl19.getValidTableIdentifier(dBIdentifier26, schema27, (int) (byte) 100);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier30 = null;
        java.lang.String str32 = dBIdentifierUtilImpl19.toDBName(dBIdentifier30, true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule34 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray35 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule34 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl37 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration36);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule38 = null;
        boolean boolean41 = dBIdentifierUtilImpl37.canSplit(identifierRule38, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule42 = null;
        java.lang.String[] strArray45 = dBIdentifierUtilImpl37.splitName(identifierRule42, "", ".");
        java.lang.String str46 = dBIdentifierUtilImpl19.combineNames(identifierRule33, identifierRuleArray35, strArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = dBIdentifierUtilImpl1.joinNames(identifierConfiguration16, identifierRule17, strArray45, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jDBCConfiguration20);
        org.junit.Assert.assertNull(jDBCConfiguration21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(dBIdentifier29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(identifierRuleArray35);
        org.junit.Assert.assertArrayEquals(identifierRuleArray35, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test631");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = dBIdentifierUtilImpl1.canSplit("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test632");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dBIdentifierUtilImpl0.toDBName("\"", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getDefaultIdentifierRule()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "upper" + "'", str9, "upper");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test633");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl10 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration9);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        org.apache.openjpa.jdbc.schema.Schema schema12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = dBIdentifierUtilImpl10.getValidTableIdentifier(dBIdentifier11, schema12, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl16 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration15);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration17 = dBIdentifierUtilImpl16.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray18 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str19 = dBIdentifierUtilImpl16.appendColumns(columnArray18);
        java.lang.String str20 = dBIdentifierUtilImpl10.appendColumns(columnArray18);
        java.lang.String str22 = dBIdentifierUtilImpl10.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule23 = null;
        java.lang.String str25 = dBIdentifierUtilImpl10.removeHungarianNotation(identifierRule23, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier26 = null;
        org.apache.openjpa.jdbc.schema.Table table27 = null;
        org.apache.openjpa.jdbc.schema.Table table28 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier30 = dBIdentifierUtilImpl10.getValidForeignKeyIdentifier(dBIdentifier26, table27, table28, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        boolean boolean34 = dBIdentifierUtilImpl10.canSplit(identifierRule31, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = null;
        java.lang.String str37 = dBIdentifierUtilImpl10.toDBName(dBIdentifier35, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier38 = null;
        java.lang.String str40 = dBIdentifierUtilImpl10.toDBName(dBIdentifier38, true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier41 = null;
        org.apache.openjpa.jdbc.schema.Schema schema42 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier44 = dBIdentifierUtilImpl10.getValidTableIdentifier(dBIdentifier41, schema42, (int) (byte) 10);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier45 = null;
        org.apache.openjpa.jdbc.schema.Table table46 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier48 = dBIdentifierUtilImpl10.getValidIndexIdentifier(dBIdentifier45, table46, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration49 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule50 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration51 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl52 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration51);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier53 = null;
        org.apache.openjpa.jdbc.schema.Schema schema54 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier56 = dBIdentifierUtilImpl52.getValidTableIdentifier(dBIdentifier53, schema54, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration57 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule58 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule59 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray60 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule59 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration61 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl62 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration61);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule63 = null;
        boolean boolean66 = dBIdentifierUtilImpl62.canSplit(identifierRule63, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule67 = null;
        java.lang.String[] strArray70 = dBIdentifierUtilImpl62.splitName(identifierRule67, "", ".");
        java.lang.String str71 = dBIdentifierUtilImpl52.combineNames(identifierConfiguration57, identifierRule58, identifierRuleArray60, strArray70);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration72 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl73 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration72);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule74 = null;
        boolean boolean77 = dBIdentifierUtilImpl73.canSplit(identifierRule74, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule78 = null;
        java.lang.String[] strArray81 = dBIdentifierUtilImpl73.splitName(identifierRule78, "", ".");
        java.lang.String str82 = dBIdentifierUtilImpl10.combineNames(identifierConfiguration49, identifierRule50, identifierRuleArray60, strArray81);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = dBIdentifierUtilImpl1.combineNames(".", strArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(dBIdentifier14);
        org.junit.Assert.assertNull(jDBCConfiguration17);
        org.junit.Assert.assertNotNull(columnArray18);
        org.junit.Assert.assertArrayEquals(columnArray18, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "%" + "'", str25, "%");
        org.junit.Assert.assertNull(dBIdentifier30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(dBIdentifier44);
        org.junit.Assert.assertNull(dBIdentifier48);
        org.junit.Assert.assertNull(dBIdentifier56);
        org.junit.Assert.assertNotNull(identifierRuleArray60);
        org.junit.Assert.assertArrayEquals(identifierRuleArray60, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test634");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier8, schema9, (int) (byte) 100);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration12 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = dBIdentifierUtilImpl1.splitName(identifierRule13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertNull(jDBCConfiguration12);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test635");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule6 = null;
        java.lang.String[] strArray9 = dBIdentifierUtilImpl1.splitName(identifierRule6, "", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = null;
        org.apache.openjpa.jdbc.schema.Table table11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier10, table11, (int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dBIdentifierUtilImpl1.combineNames("", "lower", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(dBIdentifier14);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test636");
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
        org.apache.openjpa.jdbc.schema.Column column29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier31 = dBIdentifierUtilImpl1.getGeneratedKeySequenceName(column29, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.schema.Column.getTableIdentifier()\" because \"col\" is null");
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
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test637");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl3 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration2);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration4 = dBIdentifierUtilImpl3.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str6 = dBIdentifierUtilImpl3.appendColumns(columnArray5);
        java.lang.String str7 = dBIdentifierUtilImpl0.appendColumns(columnArray5);
        dBIdentifierUtilImpl0.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.toDBName(dBIdentifier9, true);
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dBIdentifierUtilImpl0.delimit(identifierRule13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration4);
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test638");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration42 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl43 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration42);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier44 = null;
        org.apache.openjpa.jdbc.schema.Schema schema45 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier47 = dBIdentifierUtilImpl43.getValidTableIdentifier(dBIdentifier44, schema45, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration48 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule49 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule50 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray51 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule50 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration52 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl53 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration52);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule54 = null;
        boolean boolean57 = dBIdentifierUtilImpl53.canSplit(identifierRule54, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule58 = null;
        java.lang.String[] strArray61 = dBIdentifierUtilImpl53.splitName(identifierRule58, "", ".");
        java.lang.String str62 = dBIdentifierUtilImpl43.combineNames(identifierConfiguration48, identifierRule49, identifierRuleArray51, strArray61);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration63 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl64 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration63);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule65 = null;
        boolean boolean68 = dBIdentifierUtilImpl64.canSplit(identifierRule65, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule69 = null;
        java.lang.String[] strArray72 = dBIdentifierUtilImpl64.splitName(identifierRule69, "", ".");
        java.lang.String str73 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration40, identifierRule41, identifierRuleArray51, strArray72);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration74 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule75 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = dBIdentifierUtilImpl1.delimit(identifierConfiguration74, identifierRule75, "%", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
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
        org.junit.Assert.assertNull(dBIdentifier47);
        org.junit.Assert.assertNotNull(identifierRuleArray51);
        org.junit.Assert.assertArrayEquals(identifierRuleArray51, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test639");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        boolean boolean21 = dBIdentifierUtilImpl17.canSplit(identifierRule18, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        java.lang.String[] strArray25 = dBIdentifierUtilImpl17.splitName(identifierRule22, "", ".");
        java.lang.String str26 = dBIdentifierUtilImpl1.combineNames(identifierRule15, strArray25);
        java.lang.Class<?> wildcardClass27 = strArray25.getClass();
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test640");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.conf.Configuration configuration4 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration4);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration8, "lower", "lr");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "lr" + "'", str11, "lr");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test641");
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
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dBIdentifierUtilImpl1.delimit(identifierConfiguration23, identifierRule24, "lr");
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
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test642");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl8 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration7);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Schema schema10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl8.getValidTableIdentifier(dBIdentifier9, schema10, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray16 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str17 = dBIdentifierUtilImpl14.appendColumns(columnArray16);
        java.lang.String str18 = dBIdentifierUtilImpl8.appendColumns(columnArray16);
        java.lang.String str19 = dBIdentifierUtilImpl1.appendColumns(columnArray16);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.NameSet nameSet21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.makeIdentifierValid(dBIdentifier20, nameSet21, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"sname\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier12);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNotNull(columnArray16);
        org.junit.Assert.assertArrayEquals(columnArray16, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test643");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        boolean boolean18 = dBIdentifierUtilImpl1.isDelimited(identifierRule16, ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Table table20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier19, table20, table21, (int) ' ');
        org.apache.openjpa.jdbc.identifier.DBIdentifier.DBIdentifierType dBIdentifierType24 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier[] dBIdentifierArray26 = new org.apache.openjpa.jdbc.identifier.DBIdentifier[] { dBIdentifier25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier27 = dBIdentifierUtilImpl1.append(dBIdentifierType24, dBIdentifierArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier$DBIdentifierType.ordinal()\" because \"id\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dBIdentifier23);
        org.junit.Assert.assertNotNull(dBIdentifierArray26);
        org.junit.Assert.assertArrayEquals(dBIdentifierArray26, new org.apache.openjpa.jdbc.identifier.DBIdentifier[] { null });
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test644");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        boolean boolean18 = dBIdentifierUtilImpl1.isDelimited(identifierConfiguration15, identifierRule16, "\"");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Table table20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier19, table20, table21, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dBIdentifier23);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test645");
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
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test646");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray3 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str4 = dBIdentifierUtilImpl1.appendColumns(columnArray3);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule5 = null;
        boolean boolean8 = dBIdentifierUtilImpl1.canSplit(identifierRule5, "preserve", "upper");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration33 = dBIdentifierUtilImpl32.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration34 = dBIdentifierUtilImpl32.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        java.lang.String str38 = dBIdentifierUtilImpl32.convert(identifierConfiguration35, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration39 = null;
        dBIdentifierUtilImpl32.setConfiguration(configuration39);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        java.lang.String[] strArray44 = dBIdentifierUtilImpl32.splitName(identifierRule41, "%", "lower");
        java.lang.String str45 = dBIdentifierUtilImpl1.combineNames(identifierRule9, identifierRuleArray19, strArray44);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = null;
        org.apache.openjpa.jdbc.schema.Schema schema47 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier49 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier46, schema47, (int) (short) 10);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNotNull(columnArray3);
        org.junit.Assert.assertArrayEquals(columnArray3, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jDBCConfiguration33);
        org.junit.Assert.assertNull(jDBCConfiguration34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "%" });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "%" + "'", str45, "%");
        org.junit.Assert.assertNull(dBIdentifier49);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test647");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl3 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration2);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration4 = dBIdentifierUtilImpl3.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray5 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str6 = dBIdentifierUtilImpl3.appendColumns(columnArray5);
        java.lang.String str7 = dBIdentifierUtilImpl0.appendColumns(columnArray5);
        dBIdentifierUtilImpl0.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.toDBName(dBIdentifier9, true);
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dBIdentifierUtilImpl0.requiresDelimiters(identifierConfiguration13, identifierRule14, "|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration4);
        org.junit.Assert.assertNotNull(columnArray5);
        org.junit.Assert.assertArrayEquals(columnArray5, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test648");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray3 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str4 = dBIdentifierUtilImpl1.appendColumns(columnArray3);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule5 = null;
        boolean boolean8 = dBIdentifierUtilImpl1.canSplit(identifierRule5, "preserve", "upper");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration33 = dBIdentifierUtilImpl32.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration34 = dBIdentifierUtilImpl32.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration35 = null;
        java.lang.String str38 = dBIdentifierUtilImpl32.convert(identifierConfiguration35, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration39 = null;
        dBIdentifierUtilImpl32.setConfiguration(configuration39);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        java.lang.String[] strArray44 = dBIdentifierUtilImpl32.splitName(identifierRule41, "%", "lower");
        java.lang.String str45 = dBIdentifierUtilImpl1.combineNames(identifierRule9, identifierRuleArray19, strArray44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = dBIdentifierUtilImpl1.isDelimited("lower", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNotNull(columnArray3);
        org.junit.Assert.assertArrayEquals(columnArray3, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNotNull(identifierRuleArray19);
        org.junit.Assert.assertArrayEquals(identifierRuleArray19, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jDBCConfiguration33);
        org.junit.Assert.assertNull(jDBCConfiguration34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "%" });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "%" + "'", str45, "%");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test649");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration3, "\"", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        java.lang.String str8 = dBIdentifierUtilImpl1.toDBName(dBIdentifier7);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = dBIdentifierUtilImpl1.splitName(identifierConfiguration9, identifierRule10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test650");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "", "");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        org.apache.openjpa.jdbc.schema.Table table16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier15, table16, (int) (byte) 0);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(dBIdentifier18);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test651");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Schema schema21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidSequenceIdentifier(dBIdentifier20, schema21, (int) (byte) 0);
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dBIdentifierUtilImpl1.requiresDelimiters(identifierRule25, "_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dBIdentifier23);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test652");
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
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.conf.Configuration configuration27 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration27);
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
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test653");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        java.lang.String str29 = dBIdentifierUtilImpl1.convert(identifierConfiguration26, " ", " ");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier30 = null;
        org.apache.openjpa.jdbc.schema.Table table31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier34 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier30, table31, 0, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray37 = dBIdentifierUtilImpl1.splitName(identifierRule35, "|");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " " + "'", str29, " ");
        org.junit.Assert.assertNull(dBIdentifier34);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test654");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str9 = dBIdentifierUtilImpl0.convertAlias("upper");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        boolean boolean13 = dBIdentifierUtilImpl0.isDelimited(identifierConfiguration10, identifierRule11, ".");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl16 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration15);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Schema schema18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = dBIdentifierUtilImpl16.getValidTableIdentifier(dBIdentifier17, schema18, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl22 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration21);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration23 = dBIdentifierUtilImpl22.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray24 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str25 = dBIdentifierUtilImpl22.appendColumns(columnArray24);
        java.lang.String str26 = dBIdentifierUtilImpl16.appendColumns(columnArray24);
        java.lang.String str28 = dBIdentifierUtilImpl16.convertAlias("hi!");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration29 = dBIdentifierUtilImpl16.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule30 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        boolean boolean36 = dBIdentifierUtilImpl32.canSplit(identifierRule33, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        java.lang.String[] strArray40 = dBIdentifierUtilImpl32.splitName(identifierRule37, "", ".");
        java.lang.String str41 = dBIdentifierUtilImpl16.combineNames(identifierRule30, strArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = dBIdentifierUtilImpl0.joinNames("_", strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "upper" + "'", str9, "upper");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dBIdentifier20);
        org.junit.Assert.assertNull(jDBCConfiguration23);
        org.junit.Assert.assertNotNull(columnArray24);
        org.junit.Assert.assertArrayEquals(columnArray24, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(jDBCConfiguration29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test655");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        java.lang.String str6 = dBIdentifierUtilImpl0.convertAlias("lower");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        java.lang.String str10 = dBIdentifierUtilImpl0.combineFull(identifierConfiguration7, " ", "lower");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        java.lang.String str13 = dBIdentifierUtilImpl0.removeHungarianNotation(identifierRule11, "|");
        org.apache.openjpa.jdbc.identifier.DBIdentifier.DBIdentifierType dBIdentifierType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = dBIdentifierUtilImpl0.fromDBName(".", dBIdentifierType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getSupportsDelimitedIdentifiers()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "lower" + "'", str6, "lower");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "lower" + "'", str10, "lower");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|" + "'", str13, "|");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test656");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        boolean boolean11 = dBIdentifierUtilImpl0.canSplit(identifierRule8, " ", "|");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = dBIdentifierUtilImpl14.getValidIndexIdentifier(dBIdentifier17, table18, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl24 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration23);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        boolean boolean28 = dBIdentifierUtilImpl24.canSplit(identifierRule25, "", "%");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration51 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl52 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration51);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        boolean boolean56 = dBIdentifierUtilImpl52.canSplit(identifierRule53, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule57 = null;
        java.lang.String[] strArray60 = dBIdentifierUtilImpl52.splitName(identifierRule57, "", ".");
        java.lang.String str61 = dBIdentifierUtilImpl24.combineNames(identifierRule29, identifierRuleArray39, strArray60);
        java.lang.String str62 = dBIdentifierUtilImpl14.combineNames(identifierConfiguration21, identifierRule22, strArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = dBIdentifierUtilImpl0.joinNames(identifierRule12, strArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertNull(dBIdentifier20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertNotNull(identifierRuleArray39);
        org.junit.Assert.assertArrayEquals(identifierRuleArray39, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test657");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str10 = dBIdentifierUtilImpl0.shorten("_", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dBIdentifierUtilImpl0.toDBName("preserve", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getDefaultIdentifierRule()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test658");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier11, table12, 3);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dBIdentifierUtilImpl1.truncateName(identifierRule15, "upper", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier14);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test659");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration8, "", "%");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dBIdentifierUtilImpl1.appendNames("", "%", "%");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%" + "'", str11, "%");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test660");
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
        java.lang.String str14 = dBIdentifierUtilImpl1.combineFull(identifierConfiguration11, ".", "|");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = null;
        org.apache.openjpa.jdbc.schema.Table table16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier15, table16, (int) '$', true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dBIdentifierUtilImpl1.delimit(identifierRule20, "_", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "|" + "'", str14, "|");
        org.junit.Assert.assertNull(dBIdentifier19);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test661");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.delimit(dBIdentifier12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"name\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test662");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray9 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule8 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray19 = dBIdentifierUtilImpl11.splitName(identifierRule16, "", ".");
        java.lang.String str20 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration6, identifierRule7, identifierRuleArray9, strArray19);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        java.lang.String str24 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration21, "upper", "upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        org.apache.openjpa.jdbc.schema.Table table26 = null;
        org.apache.openjpa.jdbc.schema.Table table27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier25, table26, table27, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray33 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule32 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl35 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration34);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier36 = null;
        org.apache.openjpa.jdbc.schema.Schema schema37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier39 = dBIdentifierUtilImpl35.getValidTableIdentifier(dBIdentifier36, schema37, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl41 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration40);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration42 = dBIdentifierUtilImpl41.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray43 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str44 = dBIdentifierUtilImpl41.appendColumns(columnArray43);
        java.lang.String str45 = dBIdentifierUtilImpl35.appendColumns(columnArray43);
        java.lang.String str47 = dBIdentifierUtilImpl35.convertAlias("hi!");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule48 = null;
        java.lang.String str50 = dBIdentifierUtilImpl35.removeHungarianNotation(identifierRule48, "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier51 = null;
        org.apache.openjpa.jdbc.schema.Table table52 = null;
        org.apache.openjpa.jdbc.schema.Table table53 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier55 = dBIdentifierUtilImpl35.getValidForeignKeyIdentifier(dBIdentifier51, table52, table53, (-1));
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        boolean boolean59 = dBIdentifierUtilImpl35.canSplit(identifierRule56, "upper", ".");
        java.lang.String str61 = dBIdentifierUtilImpl35.convertAlias("preserve");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule62 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration63 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl64 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration63);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule65 = null;
        boolean boolean68 = dBIdentifierUtilImpl64.canSplit(identifierRule65, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule69 = null;
        java.lang.String[] strArray72 = dBIdentifierUtilImpl64.splitName(identifierRule69, "", ".");
        java.lang.String str73 = dBIdentifierUtilImpl35.combineNames(identifierRule62, strArray72);
        java.lang.String str74 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration30, identifierRule31, identifierRuleArray33, strArray72);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration75 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule76 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration75, identifierRule76, "|", "lr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierConcatenator()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNotNull(identifierRuleArray9);
        org.junit.Assert.assertArrayEquals(identifierRuleArray9, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "upper" + "'", str24, "upper");
        org.junit.Assert.assertNull(dBIdentifier29);
        org.junit.Assert.assertNotNull(identifierRuleArray33);
        org.junit.Assert.assertArrayEquals(identifierRuleArray33, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertNull(dBIdentifier39);
        org.junit.Assert.assertNull(jDBCConfiguration42);
        org.junit.Assert.assertNotNull(columnArray43);
        org.junit.Assert.assertArrayEquals(columnArray43, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "%" + "'", str50, "%");
        org.junit.Assert.assertNull(dBIdentifier55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "preserve" + "'", str61, "preserve");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test663");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule9 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray19 = dBIdentifierUtilImpl11.splitName(identifierRule16, "", ".");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dBIdentifierUtilImpl1.joinNames(identifierConfiguration8, identifierRule9, strArray19, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test664");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.startConfiguration();
        java.lang.String str9 = dBIdentifierUtilImpl0.convertAlias("upper");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        boolean boolean13 = dBIdentifierUtilImpl0.isDelimited(identifierConfiguration10, identifierRule11, ".");
        dBIdentifierUtilImpl0.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl17 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration16);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        boolean boolean21 = dBIdentifierUtilImpl17.canSplit(identifierRule18, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        java.lang.String[] strArray25 = dBIdentifierUtilImpl17.splitName(identifierRule22, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl28 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration27);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration29 = dBIdentifierUtilImpl28.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier30 = null;
        java.lang.String str32 = dBIdentifierUtilImpl28.toDBName(dBIdentifier30, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl35 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration34);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule36 = null;
        boolean boolean39 = dBIdentifierUtilImpl35.canSplit(identifierRule36, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        java.lang.String[] strArray43 = dBIdentifierUtilImpl35.splitName(identifierRule40, "", ".");
        java.lang.String str44 = dBIdentifierUtilImpl28.combineNames(identifierRule33, strArray43);
        java.lang.String str45 = dBIdentifierUtilImpl17.combineNames(identifierRule26, strArray43);
        java.lang.String str46 = dBIdentifierUtilImpl0.combineNames(identifierRule15, strArray43);
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "upper" + "'", str9, "upper");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test665");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dBIdentifierUtilImpl1.delimit(identifierRule16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(dBIdentifier13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test666");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dBIdentifierUtilImpl1.delimit(identifierConfiguration11, identifierRule12, "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test667");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration8, "", "%");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        java.lang.String str13 = dBIdentifierUtilImpl1.toDBName(dBIdentifier12);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration14 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%" + "'", str11, "%");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(identifierConfiguration14);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test668");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration7, "", "upper");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        boolean boolean17 = dBIdentifierUtilImpl13.canSplit(identifierRule14, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        java.lang.String[] strArray21 = dBIdentifierUtilImpl13.splitName(identifierRule18, "", ".");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dBIdentifierUtilImpl1.joinNames("hi!", strArray21, "\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "upper" + "'", str10, "upper");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test669");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        dBIdentifierUtilImpl0.endConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dBIdentifierUtilImpl0.toDBName("\"", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getDefaultIdentifierRule()\" because the return value of \"org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl.getIdentifierConfiguration()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test670");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        org.apache.openjpa.lib.conf.Configuration configuration6 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration6);
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.conf.Configuration configuration10 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration10);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test671");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray3 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str4 = dBIdentifierUtilImpl1.appendColumns(columnArray3);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        org.apache.openjpa.jdbc.schema.Table table6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier5, table6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = dBIdentifierUtilImpl1.splitName("|", "upper");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNotNull(columnArray3);
        org.junit.Assert.assertArrayEquals(columnArray3, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(dBIdentifier8);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test672");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier8, schema9, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        org.apache.openjpa.jdbc.schema.Table table13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier12, table13, (int) (short) -1);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration18);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration20 = dBIdentifierUtilImpl19.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        java.lang.String str24 = dBIdentifierUtilImpl19.combineFull(identifierConfiguration21, "\"", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        org.apache.openjpa.jdbc.schema.Schema schema26 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier28 = dBIdentifierUtilImpl19.getValidSequenceIdentifier(dBIdentifier25, schema26, (int) 'a');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule30 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray32 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule31 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl34 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration33);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = null;
        org.apache.openjpa.jdbc.schema.Schema schema36 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier38 = dBIdentifierUtilImpl34.getValidTableIdentifier(dBIdentifier35, schema36, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration39 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule40 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray42 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule41 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration43 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl44 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration43);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule45 = null;
        boolean boolean48 = dBIdentifierUtilImpl44.canSplit(identifierRule45, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule49 = null;
        java.lang.String[] strArray52 = dBIdentifierUtilImpl44.splitName(identifierRule49, "", ".");
        java.lang.String str53 = dBIdentifierUtilImpl34.combineNames(identifierConfiguration39, identifierRule40, identifierRuleArray42, strArray52);
        java.lang.String str54 = dBIdentifierUtilImpl19.combineNames(identifierConfiguration29, identifierRule30, identifierRuleArray32, strArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = dBIdentifierUtilImpl1.joinNames(identifierRule17, strArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertNull(jDBCConfiguration20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(dBIdentifier28);
        org.junit.Assert.assertNotNull(identifierRuleArray32);
        org.junit.Assert.assertArrayEquals(identifierRuleArray32, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertNull(dBIdentifier38);
        org.junit.Assert.assertNotNull(identifierRuleArray42);
        org.junit.Assert.assertArrayEquals(identifierRuleArray42, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test673");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier23 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier20, table21, (int) (short) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration24 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dBIdentifierUtilImpl1.requiresDelimiters(identifierConfiguration24, identifierRule25, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(dBIdentifier23);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test674");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = dBIdentifierUtilImpl1.combineNames(identifierRule35, "lr", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test675");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        dBIdentifierUtilImpl1.startConfiguration();
        java.lang.Class<?> wildcardClass13 = dBIdentifierUtilImpl1.getClass();
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test676");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration9);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = null;
        org.apache.openjpa.jdbc.schema.Table table12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier11, table12, (int) '$', true);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = null;
        java.lang.String str17 = dBIdentifierUtilImpl1.toDBName(dBIdentifier16);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test677");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration9 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = dBIdentifierUtilImpl1.isReservedWord(".", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(identifierConfiguration9);
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
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test678");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.Schema schema9 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier8, schema9, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        org.apache.openjpa.jdbc.schema.Table table13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier15 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier12, table13, (int) (short) -1);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl1.getConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dBIdentifierUtilImpl1.delimit("_", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertNull(jDBCConfiguration16);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test679");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dBIdentifierUtilImpl1.removeHungarianNotation(" ", "lr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test680");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.conf.Configuration configuration5 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration5);
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test681");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dBIdentifierUtilImpl1.requiresDelimiters(identifierRule16, "%");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(identifierConfiguration15);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test682");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule2 = null;
        boolean boolean5 = dBIdentifierUtilImpl1.canSplit(identifierRule2, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration6);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        org.apache.openjpa.jdbc.schema.NameSet nameSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl1.makeIdentifierValid(dBIdentifier8, nameSet9, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"sname\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test683");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier11, table12, (int) (byte) 100);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration15);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl19.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule21 = null;
        java.lang.String[] strArray24 = dBIdentifierUtilImpl19.splitName(identifierRule21, "|", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl27 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration26);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier28 = null;
        org.apache.openjpa.jdbc.schema.Schema schema29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier31 = dBIdentifierUtilImpl27.getValidTableIdentifier(dBIdentifier28, schema29, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration32 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule34 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray35 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule34 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl37 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration36);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule38 = null;
        boolean boolean41 = dBIdentifierUtilImpl37.canSplit(identifierRule38, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule42 = null;
        java.lang.String[] strArray45 = dBIdentifierUtilImpl37.splitName(identifierRule42, "", ".");
        java.lang.String str46 = dBIdentifierUtilImpl27.combineNames(identifierConfiguration32, identifierRule33, identifierRuleArray35, strArray45);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration47 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl48 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration47);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration49 = dBIdentifierUtilImpl48.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray50 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str51 = dBIdentifierUtilImpl48.appendColumns(columnArray50);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        boolean boolean55 = dBIdentifierUtilImpl48.canSplit(identifierRule52, "preserve", "upper");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration57 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl58 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration57);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier59 = null;
        org.apache.openjpa.jdbc.schema.Schema schema60 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier62 = dBIdentifierUtilImpl58.getValidTableIdentifier(dBIdentifier59, schema60, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration63 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule64 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule65 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray66 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule65 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration67 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl68 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration67);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule69 = null;
        boolean boolean72 = dBIdentifierUtilImpl68.canSplit(identifierRule69, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule73 = null;
        java.lang.String[] strArray76 = dBIdentifierUtilImpl68.splitName(identifierRule73, "", ".");
        java.lang.String str77 = dBIdentifierUtilImpl58.combineNames(identifierConfiguration63, identifierRule64, identifierRuleArray66, strArray76);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration78 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl79 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration78);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration80 = dBIdentifierUtilImpl79.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration81 = dBIdentifierUtilImpl79.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration82 = null;
        java.lang.String str85 = dBIdentifierUtilImpl79.convert(identifierConfiguration82, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration86 = null;
        dBIdentifierUtilImpl79.setConfiguration(configuration86);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule88 = null;
        java.lang.String[] strArray91 = dBIdentifierUtilImpl79.splitName(identifierRule88, "%", "lower");
        java.lang.String str92 = dBIdentifierUtilImpl48.combineNames(identifierRule56, identifierRuleArray66, strArray91);
        java.lang.String str93 = dBIdentifierUtilImpl19.combineNames(identifierRule25, identifierRuleArray35, strArray91);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str95 = dBIdentifierUtilImpl1.joinNames(identifierConfiguration17, identifierRule18, strArray91, "lower");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier14);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "|" });
        org.junit.Assert.assertNull(dBIdentifier31);
        org.junit.Assert.assertNotNull(identifierRuleArray35);
        org.junit.Assert.assertArrayEquals(identifierRuleArray35, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(jDBCConfiguration49);
        org.junit.Assert.assertNotNull(columnArray50);
        org.junit.Assert.assertArrayEquals(columnArray50, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(dBIdentifier62);
        org.junit.Assert.assertNotNull(identifierRuleArray66);
        org.junit.Assert.assertArrayEquals(identifierRuleArray66, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNull(jDBCConfiguration80);
        org.junit.Assert.assertNull(jDBCConfiguration81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertArrayEquals(strArray91, new java.lang.String[] { "%" });
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "%" + "'", str92, "%");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "%" + "'", str93, "%");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test684");
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
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration20 = null;
        java.lang.String str23 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration20, "preserve", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray26 = dBIdentifierUtilImpl1.splitName("upper", "lr");
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
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(dBIdentifier18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test685");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "", "");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.conf.Configuration configuration15 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration15);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule17 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl19 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration18);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        boolean boolean23 = dBIdentifierUtilImpl19.canSplit(identifierRule20, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        java.lang.String[] strArray27 = dBIdentifierUtilImpl19.splitName(identifierRule24, "", ".");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl30 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration29);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration31 = dBIdentifierUtilImpl30.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        java.lang.String str34 = dBIdentifierUtilImpl30.toDBName(dBIdentifier32, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration36 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl37 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration36);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule38 = null;
        boolean boolean41 = dBIdentifierUtilImpl37.canSplit(identifierRule38, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule42 = null;
        java.lang.String[] strArray45 = dBIdentifierUtilImpl37.splitName(identifierRule42, "", ".");
        java.lang.String str46 = dBIdentifierUtilImpl30.combineNames(identifierRule35, strArray45);
        java.lang.String str47 = dBIdentifierUtilImpl19.combineNames(identifierRule28, strArray45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = dBIdentifierUtilImpl1.joinNames(identifierRule17, strArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test686");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = null;
        java.lang.String str6 = dBIdentifierUtilImpl0.toDBName(dBIdentifier5);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl0.getIdentifierConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration8 = null;
        java.lang.String str11 = dBIdentifierUtilImpl0.convert(identifierConfiguration8, "lower", "preserve");
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        java.lang.String[] strArray16 = dBIdentifierUtilImpl0.splitName(identifierRule13, "", "");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration17 = dBIdentifierUtilImpl0.getConfiguration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dBIdentifierUtilImpl0.removeHungarianNotation(".", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(identifierConfiguration7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "preserve" + "'", str11, "preserve");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration17);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test687");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration8 = null;
        dBIdentifierUtilImpl1.setConfiguration(configuration8);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "%", "lower");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule14 = null;
        boolean boolean17 = dBIdentifierUtilImpl1.canSplit(identifierRule14, "upper", "\"");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "%" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test688");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl4 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration3);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration5 = dBIdentifierUtilImpl4.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration6 = dBIdentifierUtilImpl4.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        java.lang.String str10 = dBIdentifierUtilImpl4.convert(identifierConfiguration7, "", "");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        boolean boolean14 = dBIdentifierUtilImpl4.canSplit(identifierRule11, " ", "preserve");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier19 = null;
        org.apache.openjpa.jdbc.schema.Schema schema20 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = dBIdentifierUtilImpl18.getValidTableIdentifier(dBIdentifier19, schema20, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray26 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule25 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl28 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration27);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        boolean boolean32 = dBIdentifierUtilImpl28.canSplit(identifierRule29, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        java.lang.String[] strArray36 = dBIdentifierUtilImpl28.splitName(identifierRule33, "", ".");
        java.lang.String str37 = dBIdentifierUtilImpl18.combineNames(identifierConfiguration23, identifierRule24, identifierRuleArray26, strArray36);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        java.lang.String str41 = dBIdentifierUtilImpl18.convertFull(identifierConfiguration38, "upper", "upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier42 = null;
        org.apache.openjpa.jdbc.schema.Table table43 = null;
        org.apache.openjpa.jdbc.schema.Table table44 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = dBIdentifierUtilImpl18.getValidForeignKeyIdentifier(dBIdentifier42, table43, table44, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration47 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule48 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration49 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl50 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration49);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule51 = null;
        boolean boolean54 = dBIdentifierUtilImpl50.canSplit(identifierRule51, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration55 = null;
        dBIdentifierUtilImpl50.setIdentifierConfiguration(identifierConfiguration55);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration57 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule58 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration59 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl60 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration59);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier61 = null;
        org.apache.openjpa.jdbc.schema.Schema schema62 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier64 = dBIdentifierUtilImpl60.getValidTableIdentifier(dBIdentifier61, schema62, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration65 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule66 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule67 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray68 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule67 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration69 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl70 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration69);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule71 = null;
        boolean boolean74 = dBIdentifierUtilImpl70.canSplit(identifierRule71, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule75 = null;
        java.lang.String[] strArray78 = dBIdentifierUtilImpl70.splitName(identifierRule75, "", ".");
        java.lang.String str79 = dBIdentifierUtilImpl60.combineNames(identifierConfiguration65, identifierRule66, identifierRuleArray68, strArray78);
        java.lang.String str80 = dBIdentifierUtilImpl50.combineNames(identifierConfiguration57, identifierRule58, strArray78);
        java.lang.String str81 = dBIdentifierUtilImpl18.combineNames(identifierConfiguration47, identifierRule48, strArray78);
        java.lang.String str82 = dBIdentifierUtilImpl4.combineNames(identifierConfiguration15, identifierRule16, strArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = dBIdentifierUtilImpl0.joinNames("|", strArray78, "%");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration5);
        org.junit.Assert.assertNull(jDBCConfiguration6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dBIdentifier22);
        org.junit.Assert.assertNotNull(identifierRuleArray26);
        org.junit.Assert.assertArrayEquals(identifierRuleArray26, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "upper" + "'", str41, "upper");
        org.junit.Assert.assertNull(dBIdentifier46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(dBIdentifier64);
        org.junit.Assert.assertNotNull(identifierRuleArray68);
        org.junit.Assert.assertArrayEquals(identifierRuleArray68, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test689");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier10 = dBIdentifierUtilImpl1.getValidUniqueIdentifier(dBIdentifier7, table8, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = dBIdentifierUtilImpl1.getClass();
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dBIdentifier10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test690");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        java.lang.String str15 = dBIdentifierUtilImpl1.convert(identifierConfiguration12, "", "upper");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl18 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration17);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        boolean boolean22 = dBIdentifierUtilImpl18.canSplit(identifierRule19, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        dBIdentifierUtilImpl18.setIdentifierConfiguration(identifierConfiguration23);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration25 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl28 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration27);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = null;
        org.apache.openjpa.jdbc.schema.Schema schema30 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = dBIdentifierUtilImpl28.getValidTableIdentifier(dBIdentifier29, schema30, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration33 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule34 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray36 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule35 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration37 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl38 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration37);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        boolean boolean42 = dBIdentifierUtilImpl38.canSplit(identifierRule39, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule43 = null;
        java.lang.String[] strArray46 = dBIdentifierUtilImpl38.splitName(identifierRule43, "", ".");
        java.lang.String str47 = dBIdentifierUtilImpl28.combineNames(identifierConfiguration33, identifierRule34, identifierRuleArray36, strArray46);
        java.lang.String str48 = dBIdentifierUtilImpl18.combineNames(identifierConfiguration25, identifierRule26, strArray46);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier49 = null;
        java.lang.String str51 = dBIdentifierUtilImpl18.toDBName(dBIdentifier49, false);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        java.lang.String[] strArray55 = dBIdentifierUtilImpl18.splitName(identifierRule52, "upper", ".");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = dBIdentifierUtilImpl1.joinNames(identifierRule16, strArray55, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "upper" + "'", str15, "upper");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dBIdentifier32);
        org.junit.Assert.assertNotNull(identifierRuleArray36);
        org.junit.Assert.assertArrayEquals(identifierRuleArray36, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "upper" });
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test691");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = null;
        org.apache.openjpa.jdbc.schema.Table table13 = null;
        org.apache.openjpa.jdbc.schema.Table table14 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier12, table13, table14, 2);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.NameSet nameSet18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl1.makeIdentifierValid(dBIdentifier17, nameSet18, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"sname\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNull(jDBCConfiguration8);
        org.junit.Assert.assertNotNull(columnArray9);
        org.junit.Assert.assertArrayEquals(columnArray9, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(dBIdentifier16);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test692");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = null;
        org.apache.openjpa.jdbc.schema.Table table8 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier11 = dBIdentifierUtilImpl1.getValidColumnIdentifier(dBIdentifier7, table8, (int) (byte) 10, false);
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = dBIdentifierUtilImpl1.splitName(identifierRule13, "_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierDelimiter()\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertNull(dBIdentifier11);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test693");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl7 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration6);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        boolean boolean11 = dBIdentifierUtilImpl7.canSplit(identifierRule8, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        dBIdentifierUtilImpl7.setIdentifierConfiguration(identifierConfiguration12);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration14 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule15 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration16 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl17 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration16);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier18 = null;
        org.apache.openjpa.jdbc.schema.Schema schema19 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = dBIdentifierUtilImpl17.getValidTableIdentifier(dBIdentifier18, schema19, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule23 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray25 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule24 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl27 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration26);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        boolean boolean31 = dBIdentifierUtilImpl27.canSplit(identifierRule28, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule32 = null;
        java.lang.String[] strArray35 = dBIdentifierUtilImpl27.splitName(identifierRule32, "", ".");
        java.lang.String str36 = dBIdentifierUtilImpl17.combineNames(identifierConfiguration22, identifierRule23, identifierRuleArray25, strArray35);
        java.lang.String str37 = dBIdentifierUtilImpl7.combineNames(identifierConfiguration14, identifierRule15, strArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration4, "_", strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dBIdentifier21);
        org.junit.Assert.assertNotNull(identifierRuleArray25);
        org.junit.Assert.assertArrayEquals(identifierRuleArray25, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test694");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration3 = null;
        java.lang.String str6 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration3, "hi!", "preserve");
        java.lang.String str8 = dBIdentifierUtilImpl1.convertAlias("%");
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl12 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration11);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = null;
        org.apache.openjpa.jdbc.schema.Schema schema14 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier16 = dBIdentifierUtilImpl12.getValidTableIdentifier(dBIdentifier13, schema14, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule18 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray20 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule19 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl22 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration21);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule23 = null;
        boolean boolean26 = dBIdentifierUtilImpl22.canSplit(identifierRule23, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule27 = null;
        java.lang.String[] strArray30 = dBIdentifierUtilImpl22.splitName(identifierRule27, "", ".");
        java.lang.String str31 = dBIdentifierUtilImpl12.combineNames(identifierConfiguration17, identifierRule18, identifierRuleArray20, strArray30);
        java.lang.String str32 = dBIdentifierUtilImpl1.combineNames(identifierRule10, strArray30);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration34 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl35 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration34);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration36 = dBIdentifierUtilImpl35.getConfiguration();
        org.apache.openjpa.jdbc.schema.Column[] columnArray37 = new org.apache.openjpa.jdbc.schema.Column[] {};
        java.lang.String str38 = dBIdentifierUtilImpl35.appendColumns(columnArray37);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        boolean boolean42 = dBIdentifierUtilImpl35.canSplit(identifierRule39, "preserve", "upper");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule43 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration44 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl45 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration44);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = null;
        org.apache.openjpa.jdbc.schema.Schema schema47 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier49 = dBIdentifierUtilImpl45.getValidTableIdentifier(dBIdentifier46, schema47, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration50 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule51 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray53 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule52 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration54 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl55 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration54);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        boolean boolean59 = dBIdentifierUtilImpl55.canSplit(identifierRule56, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule60 = null;
        java.lang.String[] strArray63 = dBIdentifierUtilImpl55.splitName(identifierRule60, "", ".");
        java.lang.String str64 = dBIdentifierUtilImpl45.combineNames(identifierConfiguration50, identifierRule51, identifierRuleArray53, strArray63);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration65 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl66 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration65);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration67 = dBIdentifierUtilImpl66.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration68 = dBIdentifierUtilImpl66.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration69 = null;
        java.lang.String str72 = dBIdentifierUtilImpl66.convert(identifierConfiguration69, "", "");
        org.apache.openjpa.lib.conf.Configuration configuration73 = null;
        dBIdentifierUtilImpl66.setConfiguration(configuration73);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule75 = null;
        java.lang.String[] strArray78 = dBIdentifierUtilImpl66.splitName(identifierRule75, "%", "lower");
        java.lang.String str79 = dBIdentifierUtilImpl35.combineNames(identifierRule43, identifierRuleArray53, strArray78);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = dBIdentifierUtilImpl1.combineNames("preserve", strArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "preserve" + "'", str6, "preserve");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%" + "'", str8, "%");
        org.junit.Assert.assertNull(dBIdentifier16);
        org.junit.Assert.assertNotNull(identifierRuleArray20);
        org.junit.Assert.assertArrayEquals(identifierRuleArray20, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(jDBCConfiguration36);
        org.junit.Assert.assertNotNull(columnArray37);
        org.junit.Assert.assertArrayEquals(columnArray37, new org.apache.openjpa.jdbc.schema.Column[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dBIdentifier49);
        org.junit.Assert.assertNotNull(identifierRuleArray53);
        org.junit.Assert.assertArrayEquals(identifierRuleArray53, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(jDBCConfiguration67);
        org.junit.Assert.assertNull(jDBCConfiguration68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "%" });
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "%" + "'", str79, "%");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test695");
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
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = null;
        org.apache.openjpa.jdbc.schema.Table table21 = null;
        org.apache.openjpa.jdbc.schema.Table table22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier20, table21, table22, (int) '_');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration25 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration25);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier27 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.toDBName(dBIdentifier27);
        java.lang.String str31 = dBIdentifierUtilImpl1.shorten("lr", 0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier32 = null;
        org.apache.openjpa.jdbc.schema.Table table33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier35 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier32, table33, 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dBIdentifier24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(dBIdentifier35);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test696");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule20, "ppr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dBIdentifier15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test697");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule26 = null;
        java.lang.String str28 = dBIdentifierUtilImpl1.removeHungarianNotation(identifierRule26, ".");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration29 = null;
        dBIdentifierUtilImpl1.setIdentifierConfiguration(identifierConfiguration29);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "." + "'", str28, ".");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test698");
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
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = dBIdentifierUtilImpl1.isDelimited(identifierRule39, "ppr");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getLeadingDelimiter()\" because \"config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test699");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = dBIdentifierUtilImpl1.getIdentifierConfiguration();
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.Table table10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier12 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier9, table10, (int) (byte) 0);
        java.lang.String str15 = dBIdentifierUtilImpl1.shorten("upper", 3);
        java.lang.String str17 = dBIdentifierUtilImpl1.convertAlias("upper");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(identifierConfiguration7);
        org.junit.Assert.assertNull(dBIdentifier12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ppr" + "'", str15, "ppr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "upper" + "'", str17, "upper");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test700");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName("%", "upper", "_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test701");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        dBIdentifierUtilImpl1.startConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl6 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration5);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        boolean boolean10 = dBIdentifierUtilImpl6.canSplit(identifierRule7, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule11 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration12 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl13 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration12);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier14 = null;
        org.apache.openjpa.jdbc.schema.Schema schema15 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = dBIdentifierUtilImpl13.getValidTableIdentifier(dBIdentifier14, schema15, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration18 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule19 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray21 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule20 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl23 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration22);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule24 = null;
        boolean boolean27 = dBIdentifierUtilImpl23.canSplit(identifierRule24, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        java.lang.String[] strArray31 = dBIdentifierUtilImpl23.splitName(identifierRule28, "", ".");
        java.lang.String str32 = dBIdentifierUtilImpl13.combineNames(identifierConfiguration18, identifierRule19, identifierRuleArray21, strArray31);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration33 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl34 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration33);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule35 = null;
        boolean boolean38 = dBIdentifierUtilImpl34.canSplit(identifierRule35, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule39 = null;
        java.lang.String[] strArray42 = dBIdentifierUtilImpl34.splitName(identifierRule39, "", ".");
        java.lang.String str43 = dBIdentifierUtilImpl6.combineNames(identifierRule11, identifierRuleArray21, strArray42);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration44 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl45 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration44);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier46 = null;
        org.apache.openjpa.jdbc.schema.Schema schema47 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier49 = dBIdentifierUtilImpl45.getValidTableIdentifier(dBIdentifier46, schema47, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration50 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule51 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule52 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray53 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule52 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration54 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl55 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration54);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule56 = null;
        boolean boolean59 = dBIdentifierUtilImpl55.canSplit(identifierRule56, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule60 = null;
        java.lang.String[] strArray63 = dBIdentifierUtilImpl55.splitName(identifierRule60, "", ".");
        java.lang.String str64 = dBIdentifierUtilImpl45.combineNames(identifierConfiguration50, identifierRule51, identifierRuleArray53, strArray63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = dBIdentifierUtilImpl1.joinNames(identifierRuleArray21, strArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dBIdentifier17);
        org.junit.Assert.assertNotNull(identifierRuleArray21);
        org.junit.Assert.assertArrayEquals(identifierRuleArray21, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(dBIdentifier49);
        org.junit.Assert.assertNotNull(identifierRuleArray53);
        org.junit.Assert.assertArrayEquals(identifierRuleArray53, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test702");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray9 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule8 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray19 = dBIdentifierUtilImpl11.splitName(identifierRule16, "", ".");
        java.lang.String str20 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration6, identifierRule7, identifierRuleArray9, strArray19);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        java.lang.String str24 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration21, "upper", "upper");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        org.apache.openjpa.jdbc.schema.Table table26 = null;
        org.apache.openjpa.jdbc.schema.Table table27 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier29 = dBIdentifierUtilImpl1.getValidForeignKeyIdentifier(dBIdentifier25, table26, table27, (int) (byte) 0);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration30 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule31 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration32 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl33 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration32);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule34 = null;
        boolean boolean37 = dBIdentifierUtilImpl33.canSplit(identifierRule34, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration38 = null;
        dBIdentifierUtilImpl33.setIdentifierConfiguration(identifierConfiguration38);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration40 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule41 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration42 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl43 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration42);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier44 = null;
        org.apache.openjpa.jdbc.schema.Schema schema45 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier47 = dBIdentifierUtilImpl43.getValidTableIdentifier(dBIdentifier44, schema45, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration48 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule49 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule50 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray51 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule50 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration52 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl53 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration52);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule54 = null;
        boolean boolean57 = dBIdentifierUtilImpl53.canSplit(identifierRule54, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule58 = null;
        java.lang.String[] strArray61 = dBIdentifierUtilImpl53.splitName(identifierRule58, "", ".");
        java.lang.String str62 = dBIdentifierUtilImpl43.combineNames(identifierConfiguration48, identifierRule49, identifierRuleArray51, strArray61);
        java.lang.String str63 = dBIdentifierUtilImpl33.combineNames(identifierConfiguration40, identifierRule41, strArray61);
        java.lang.String str64 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration30, identifierRule31, strArray61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str67 = dBIdentifierUtilImpl1.removeHungarianNotation("|", "preserve");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNotNull(identifierRuleArray9);
        org.junit.Assert.assertArrayEquals(identifierRuleArray9, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "upper" + "'", str24, "upper");
        org.junit.Assert.assertNull(dBIdentifier29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(dBIdentifier47);
        org.junit.Assert.assertNotNull(identifierRuleArray51);
        org.junit.Assert.assertArrayEquals(identifierRuleArray51, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test703");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier8 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.toDBName(dBIdentifier8, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier17 = null;
        org.apache.openjpa.jdbc.schema.Table table18 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier20 = dBIdentifierUtilImpl14.getValidIndexIdentifier(dBIdentifier17, table18, (int) '4');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration21 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule22 = null;
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration23 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl24 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration23);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule25 = null;
        boolean boolean28 = dBIdentifierUtilImpl24.canSplit(identifierRule25, "", "%");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration51 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl52 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration51);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule53 = null;
        boolean boolean56 = dBIdentifierUtilImpl52.canSplit(identifierRule53, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule57 = null;
        java.lang.String[] strArray60 = dBIdentifierUtilImpl52.splitName(identifierRule57, "", ".");
        java.lang.String str61 = dBIdentifierUtilImpl24.combineNames(identifierRule29, identifierRuleArray39, strArray60);
        java.lang.String str62 = dBIdentifierUtilImpl14.combineNames(identifierConfiguration21, identifierRule22, strArray60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = dBIdentifierUtilImpl1.joinNames(".", strArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertNull(dBIdentifier20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dBIdentifier35);
        org.junit.Assert.assertNotNull(identifierRuleArray39);
        org.junit.Assert.assertArrayEquals(identifierRuleArray39, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test704");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier3 = null;
        java.lang.String str5 = dBIdentifierUtilImpl1.toDBName(dBIdentifier3, false);
        dBIdentifierUtilImpl1.endConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration7 = null;
        java.lang.String str10 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration7, "", "upper");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration11 = null;
        java.lang.String str14 = dBIdentifierUtilImpl1.convertFull(identifierConfiguration11, "%", ".");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        java.lang.String str18 = dBIdentifierUtilImpl1.convert(identifierConfiguration15, "", "%");
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "upper" + "'", str10, "upper");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "%" + "'", str18, "%");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test705");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dBIdentifierUtilImpl0.requiresDelimiters(identifierRule1, "|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localized message key: no-rules-provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test706");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration1 = null;
        dBIdentifierUtilImpl0.setIdentifierConfiguration(identifierConfiguration1);
        dBIdentifierUtilImpl0.endConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dBIdentifierUtilImpl0.delimit(dBIdentifier4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"name\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test707");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier1 = null;
        org.apache.openjpa.jdbc.schema.Schema schema2 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = dBIdentifierUtilImpl0.getValidSequenceIdentifier(dBIdentifier1, schema2, (int) 'a');
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration5 = null;
        java.lang.String str8 = dBIdentifierUtilImpl0.convertFull(identifierConfiguration5, "upper", ".");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier9 = null;
        org.apache.openjpa.jdbc.schema.NameSet nameSet10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier13 = dBIdentifierUtilImpl0.makeIdentifierValid(dBIdentifier9, nameSet10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier.getType()\" because \"sname\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "." + "'", str8, ".");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test708");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier4 = null;
        org.apache.openjpa.jdbc.schema.Table table5 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier7 = dBIdentifierUtilImpl1.getValidIndexIdentifier(dBIdentifier4, table5, (int) '4');
        java.lang.String str9 = dBIdentifierUtilImpl1.convertAlias("|");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule10 = null;
        java.lang.String[] strArray13 = dBIdentifierUtilImpl1.splitName(identifierRule10, "", "");
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration14 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration15 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray17 = null;
        java.lang.String str19 = dBIdentifierUtilImpl1.joinNames(identifierConfiguration15, identifierRule16, strArray17, "upper");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dBIdentifierUtilImpl1.delimit(identifierRule20, "lower", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertNull(dBIdentifier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(jDBCConfiguration14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test709");
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
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration26 = null;
        java.lang.String str29 = dBIdentifierUtilImpl1.convert(identifierConfiguration26, " ", " ");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dBIdentifierUtilImpl1.delimit(identifierRule30, ".");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierRule.getCanDelimit()\" because \"rule\" is null");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " " + "'", str29, " ");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test710");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier2 = null;
        org.apache.openjpa.jdbc.schema.Schema schema3 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier5 = dBIdentifierUtilImpl1.getValidTableIdentifier(dBIdentifier2, schema3, (int) (byte) 10);
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration6 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule7 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray9 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule8 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration10 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl11 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration10);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule12 = null;
        boolean boolean15 = dBIdentifierUtilImpl11.canSplit(identifierRule12, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule16 = null;
        java.lang.String[] strArray19 = dBIdentifierUtilImpl11.splitName(identifierRule16, "", ".");
        java.lang.String str20 = dBIdentifierUtilImpl1.combineNames(identifierConfiguration6, identifierRule7, identifierRuleArray9, strArray19);
        org.apache.openjpa.jdbc.identifier.DBIdentifier.DBIdentifierType dBIdentifierType21 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier[] dBIdentifierArray23 = new org.apache.openjpa.jdbc.identifier.DBIdentifier[] { dBIdentifier22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl1.append(dBIdentifierType21, dBIdentifierArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.jdbc.identifier.DBIdentifier$DBIdentifierType.ordinal()\" because \"id\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dBIdentifier5);
        org.junit.Assert.assertNotNull(identifierRuleArray9);
        org.junit.Assert.assertArrayEquals(identifierRuleArray9, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(dBIdentifierArray23);
        org.junit.Assert.assertArrayEquals(dBIdentifierArray23, new org.apache.openjpa.jdbc.identifier.DBIdentifier[] { null });
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopTest1.test711");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration0 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl1 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration0);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration2 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration3 = dBIdentifierUtilImpl1.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration4 = null;
        java.lang.String str7 = dBIdentifierUtilImpl1.convert(identifierConfiguration4, "", "");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule8 = null;
        boolean boolean11 = dBIdentifierUtilImpl1.canSplit(identifierRule8, " ", "preserve");
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration13 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl14 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration13);
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration15 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.jdbc.conf.JDBCConfiguration jDBCConfiguration16 = dBIdentifierUtilImpl14.getConfiguration();
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration17 = null;
        java.lang.String str20 = dBIdentifierUtilImpl14.convert(identifierConfiguration17, "", "");
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier21 = null;
        org.apache.openjpa.jdbc.schema.Schema schema22 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier24 = dBIdentifierUtilImpl14.getValidTableIdentifier(dBIdentifier21, schema22, (int) (byte) 100);
        org.apache.openjpa.jdbc.identifier.DBIdentifier dBIdentifier25 = null;
        java.lang.String str27 = dBIdentifierUtilImpl14.toDBName(dBIdentifier25, true);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule28 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule29 = null;
        org.apache.openjpa.lib.identifier.IdentifierRule[] identifierRuleArray30 = new org.apache.openjpa.lib.identifier.IdentifierRule[] { identifierRule29 };
        org.apache.openjpa.lib.identifier.IdentifierConfiguration identifierConfiguration31 = null;
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl32 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl(identifierConfiguration31);
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule33 = null;
        boolean boolean36 = dBIdentifierUtilImpl32.canSplit(identifierRule33, "", "%");
        org.apache.openjpa.lib.identifier.IdentifierRule identifierRule37 = null;
        java.lang.String[] strArray40 = dBIdentifierUtilImpl32.splitName(identifierRule37, "", ".");
        java.lang.String str41 = dBIdentifierUtilImpl14.combineNames(identifierRule28, identifierRuleArray30, strArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = dBIdentifierUtilImpl1.combineNames("", strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.openjpa.lib.identifier.IdentifierConfiguration.getIdentifierRule(Object)\" because \"this._config\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jDBCConfiguration2);
        org.junit.Assert.assertNull(jDBCConfiguration3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jDBCConfiguration15);
        org.junit.Assert.assertNull(jDBCConfiguration16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(dBIdentifier24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(identifierRuleArray30);
        org.junit.Assert.assertArrayEquals(identifierRuleArray30, new org.apache.openjpa.lib.identifier.IdentifierRule[] { null });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }
}

