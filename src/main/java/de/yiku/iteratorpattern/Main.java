package de.yiku.iteratorpattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Items<String> list = new Items<>(List.of("bread", "calculator", "bag", "tv"));
        Items<Integer> numbers = new Items<>(List.of(1, 2, 3, 4, 5));

        list.forEach(x -> System.out.println(x.toUpperCase()));
        numbers.forEach(System.out::print);
    }
}
