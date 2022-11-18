package com.kodilla.basic_assertion;

import org.testng.annotations.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
        public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int subtract = calculator.subtract(a, b);
        assertEquals(-3, subtract);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        
        int square = calculator.square(a, b);
        assertEquals(25, square);
    }
}
