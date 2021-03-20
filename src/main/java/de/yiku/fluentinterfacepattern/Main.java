package de.yiku.fluentinterfacepattern;

public class Main {
    public static void main(String[] args) {
        new FluentRandom()
                .lowest(1)
                .highest(20)
                .quantity(10)
                .println(x -> System.out.println("Random number is: " + x));
    }
}
