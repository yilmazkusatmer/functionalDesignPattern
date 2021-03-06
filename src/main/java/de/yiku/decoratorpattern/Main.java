package de.yiku.decoratorpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Coffee coffee = new CoffeeDecorator(
                c -> c.with("soja milk", 0.50),
                c -> c.with("hot chocolate", 0.70)
        ).use(new Coffee("Cappucino", 3.99));

        logger.info("{}", coffee);
    }
}
