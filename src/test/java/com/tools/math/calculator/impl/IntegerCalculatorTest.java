package com.tools.math.calculator.impl;

import com.tools.math.calculator.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class IntegerCalculatorTest {

    private Calculator<Integer> calculator;

    @Before
    public void init() {
        calculator = new IntegerCalculator();
    }

    @Test
    public void testAddOperationHappyPath() {

        int a = 6;
        int b = 4;

        int expectedResult = 10;
        int actualResult = calculator.add(a, b);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAddTwoLargeNumbersOverflowCorrectly() {

        int a = 2000000000;
        int b = 2000000000;

        int expectedResult = -294967296;
        int actualResult = calculator.add(a, b);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtractOperationHappyPath() {

        int a = 6;
        int b = 4;

        int expectedResult = 2;
        int actualResult = calculator.subtract(a, b);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyOperationHappyPath() {

        int a = 6;
        int b = 4;

        int expectedResult = 24;
        int actualResult = calculator.multiply(a, b);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivideOperationHappyPath() {

        int a = 6;
        int b = 4;

        int expectedResult = 1;
        int actualResult = calculator.divide(a, b);

        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideOperationByZero() {

        int a = 6;
        int b = 0;

        calculator.divide(a, b);
    }
}
