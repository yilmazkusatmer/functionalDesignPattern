package de.yiku.strategypattern;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OperationStrategyTest {

    @Test
    void applyOperations() {
        // given
        List<Operation> operations = List.of(BasicOperation.TIMES, PowOperation.EXP);
        OperationStrategy operationStrategy = new OperationStrategy(operations);
        List<String> givenResults = List.of("10 * 4 = 40", "10 ^ 4 = 10000.0");

        // when
        List<String> results = operationStrategy.operationResults(10, 4);

        // then
        assertThat(results).isEqualTo(givenResults);
    }
}