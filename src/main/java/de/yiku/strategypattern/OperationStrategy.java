package de.yiku.strategypattern;

import java.util.List;
import java.util.stream.Collectors;

public class OperationStrategy {
    private List<Operation> operations;

    public OperationStrategy(List<Operation> operations) {
        this.operations = operations;
    }

    List<String> operationResults(Number num1, Number num2) {
        return operations.stream()
                .map(op -> String.format("%d %s %d = ", num1.intValue(), op.toString(), num2.intValue())
                        + op.apply(num1, num2))
                .collect(Collectors.toList());
    }
}
