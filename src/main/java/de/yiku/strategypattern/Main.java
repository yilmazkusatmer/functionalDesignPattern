package de.yiku.strategypattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Operation> operations = List.of(
                BasicOperation.PLUS, BasicOperation.TIMES,
                PowOperation.EXP, BasicOperation.MINUS);

        OperationStrategy strategy = new OperationStrategy(operations);
        strategy.applyOperations(14, 2).forEach(System.out::println);

    }
}
