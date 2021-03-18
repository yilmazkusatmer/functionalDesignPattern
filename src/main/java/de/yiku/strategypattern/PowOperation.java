package de.yiku.strategypattern;

import java.util.function.DoubleBinaryOperator;

public enum PowOperation implements Operation<Double> {
    EXP("^", Math::pow);

    private final String symbol;
    private final DoubleBinaryOperator op;

    PowOperation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public Double apply(Number num1, Number num2) {
        return op.applyAsDouble(num1.doubleValue(), num2.doubleValue());
    }

    @Override
    public String toString() {
        return symbol;
    }
}
