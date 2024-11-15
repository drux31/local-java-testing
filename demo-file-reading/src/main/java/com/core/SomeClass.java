package com.core;

public class SomeClass {

    private static int staticField;
    private int instanceField;

    public static void staticMethod() {
   
    }
    
    public void instanceMethod() { /* Do something */ 
        System.out.println(staticField);
        System.out.println(instanceField);
    
    }

}