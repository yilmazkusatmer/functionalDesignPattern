package de.yiku.strategypattern;

@FunctionalInterface
public interface Operation<T extends Number> {
    T apply(Number num1, Number num2);
}
