package de.yiku.factorypattern;

public class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle assemble(VehicleType type, Color color, EngineType engineType) {
        return type.getVehicle().apply(color, engineType);
    }
}
