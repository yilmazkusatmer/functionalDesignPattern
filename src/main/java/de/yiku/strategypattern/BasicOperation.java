package de.yiku.strategypattern;

import java.util.function.BinaryOperator;

public enum BasicOperation implements Operation<Integer> {
    PLUS("+", Math::addExact),
    MINUS("-", Math::subtractExact),
    TIMES("*", Math::multiplyExact);

    private final String symbol;
    private final BinaryOperator<Integer> op;

    BasicOperation(String symbol, BinaryOperator<Integer> op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public Integer apply(Number num1, Number num2) {
        return op.apply(num1.intValue(), num2.intValue());
    }

    @Override
    public String toString() {
        return symbol;
    }
}
