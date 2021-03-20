package de.yiku.fluentinterfacepattern;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FluentRandom extends Random {
    private int lower = 0;
    private int upper = Integer.MAX_VALUE;
    private int quantity = -1;

    public FluentRandom lowest(int lower) {
        this.lower = lower;
        return this;
    }

    public FluentRandom highest(int upper) {
        this.upper = upper;
        return this;
    }

    public FluentRandom quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int nextInt() {
        return super.nextInt(upper - lower + 1) + lower;
    }

    public List<Integer> randomNumbers() {
        if (quantity <= 0) {
            return Collections.emptyList();
        }
        return IntStream.rangeClosed(1, quantity)
                .mapToObj(r -> nextInt())
                .collect(Collectors.toList());
    }

    public void println(Consumer<Integer> consumer) {
        randomNumbers().forEach(consumer);
    }
}