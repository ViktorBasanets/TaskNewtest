package com.tools.math.calculator.impl;

import com.tools.math.calculator.CalculatorWithAddOperationOnly;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class StringCalculatorTest {

    private CalculatorWithAddOperationOnly<String> calculator;

    @Before
    public void init() {
        calculator = new StringCalculator();
    }

    @Test
    public void testAddOperationPositiveScenario() {

        String a = "6";
        String b = "4";

        String expectedResult = "64";
        String actualResult = calculator.add(a, b);

        assertEquals(expectedResult, actualResult);
    }
}
