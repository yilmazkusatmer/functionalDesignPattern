package de.yiku.decoratorpattern;

import java.util.function.Function;
import java.util.stream.Stream;

public class CoffeeDecorator {
    private final Function<Coffee, Coffee> decorator;

    @SafeVarargs
    public CoffeeDecorator(Function<Coffee, Coffee>... decorations) {
        this.decorator = reduceDecorations(decorations);
    }

    public Coffee use(Coffee coffee) {
        return decorator.apply(coffee);
    }

    @SafeVarargs
    private Function<Coffee, Coffee> reduceDecorations(Function<Coffee, Coffee>... decorations) {
        return Stream.of(decorations).reduce(Function.identity(), Function::andThen);
    }

}
