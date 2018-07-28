package com.tools.math.calculator;

public interface Calculator<T>
        extends CalculatorWithAddOperationOnly<T> {

    T subtract(T a, T b);
    T multiply(T a, T b);
    T divide(T a, T b);
}
