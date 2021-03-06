package de.yiku.decoratorpattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoffeeDecoratorTest {

    @Test
    void coffeeWithSojaMilk() {
        // given
        Coffee givenCoffee = new Coffee("Cappucino, soja milk, hot chocolate", 5.19);

        // when
        Coffee coffee = new CoffeeDecorator(
                c -> c.with("soja milk", 0.50),
                c -> c.with("hot chocolate", 0.70)
        ).use(new Coffee("Cappucino", 3.99));

        // then
        assertThat(coffee).isEqualTo(givenCoffee);
    }

}