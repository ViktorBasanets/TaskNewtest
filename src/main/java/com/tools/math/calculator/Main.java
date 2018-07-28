package com.tools.math.calculator;

import com.tools.math.calculator.impl.IntegerCalculator;
import com.tools.math.calculator.impl.StringCalculator;

public class Main {
    public static void main(String[] args) {

        Calculator<Integer> integerCalculator = new IntegerCalculator();
        CalculatorWithAddOperationOnly<String> stringCalculator = new StringCalculator();

        System.out.println("result is: " + integerCalculator.add(6,4));
        System.out.println("result is: " + integerCalculator.subtract(6,4));
        System.out.println("result is: " + integerCalculator.multiply(6,4));
        System.out.println("result is: " + integerCalculator.divide(6,4));
        System.out.println("result is: " + stringCalculator.add("6", "4"));
    }
}
