package com.commons;

public class A {


    private static int field = 1;

    static  {
        field = Integer.MAX_VALUE;
    }

    public A(int val) {
        field = val;
    }

    public static int getField() {
        return field;
    }
}