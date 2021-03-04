package de.yiku.factorypattern;

import java.util.function.BiFunction;

public enum VehicleFactory {
    BUS(Bus::new),
    CAR(Car::new),
    TRUCK(Truck::new);

    private final BiFunction<Color, EngineType, Vehicle> factory;

    VehicleFactory(BiFunction<Color, EngineType, Vehicle> factory) {
        this.factory = factory;
    }

    public BiFunction<Color, EngineType, Vehicle> getFactory() {
        return factory;
    }
}
