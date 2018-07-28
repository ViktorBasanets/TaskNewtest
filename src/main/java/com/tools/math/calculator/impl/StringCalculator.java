package com.tools.math.calculator.impl;

import com.tools.math.calculator.CalculatorWithAddOperationOnly;

public class StringCalculator
        implements CalculatorWithAddOperationOnly<String> {


    @Override
    public String add(String a, String b) {
        return a + b;
    }
}
