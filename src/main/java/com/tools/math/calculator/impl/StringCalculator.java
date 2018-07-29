package com.tools.math.calculator.impl;

import com.tools.math.calculator.AddOperation;

public class StringCalculator
        implements AddOperation<String> {


    @Override
    public String add(String a, String b) {
        return a + b;
    }
}
