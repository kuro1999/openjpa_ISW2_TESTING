package org.apache.openjpa.jdbc.identifier.randoopC2;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBIdentifierUtilImplRandoopC2ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC2ErrorTest0.test1");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = dBIdentifierUtilImpl0.removeHungarianNotation("lower", "hi!");
    }

    @Ignore("CI stuff")
    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC2ErrorTest0.test2");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = dBIdentifierUtilImpl0.canSplit(".", ".");
    }

    @Ignore("CI stuff")
    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DBIdentifierUtilImplRandoopC2ErrorTest0.test3");
        org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl dBIdentifierUtilImpl0 = new org.apache.openjpa.jdbc.identifier.DBIdentifierUtilImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = dBIdentifierUtilImpl0.delimit("", "");
    }
}

