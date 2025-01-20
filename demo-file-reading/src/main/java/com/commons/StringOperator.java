package com.commons;

import java.util.Objects;

// a
/*
@FunctionalInterface
interface StringOperator {
    String apply(String value);
    boolean checkNotNull(String value);
}



// b
@FunctionalInterface
interface StringOperator {
    String apply(String value);
}


// c
@FunctionalInterface
interface StringOperator extends Function<String, String> {

}
*/

// d
@FunctionalInterface
interface StringOperator {
    String apply(String value);
    
    default boolean checkNotNull(String value) { 
        return !Objects.isNull(value);
    }
}
