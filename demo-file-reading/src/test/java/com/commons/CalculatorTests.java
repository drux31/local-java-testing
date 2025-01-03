package com.commons;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {

    @ParameterizedTest
    @CsvSource({"2, 1, 2", "1, 2, 2", "1, 1, 1"})
    void testMax(int first, int second, int expected) {
        Calculator calculator = new Calculator();
        int result = calculator.maxOf(first, second);
        
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 1000})
    void testIsEven(int arg) {
        assertTrue(new Calculator().isEven(arg));
    }
    
}
