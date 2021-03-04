package de.yiku.factorypattern;

import java.util.function.BiFunction;

public enum VehicleType {
    BUS(Bus::new),
    CAR(Car::new),
    TRUCK(Truck::new);

    private final BiFunction<Color, EngineType, Vehicle> vehicle;

    VehicleType(BiFunction<Color, EngineType, Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public BiFunction<Color, EngineType, Vehicle> getVehicle() {
        return vehicle;
    }
}
