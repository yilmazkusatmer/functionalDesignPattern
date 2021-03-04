package de.yiku.factorypattern;

public class VehicleFactory {

    private VehicleFactory() {
    }

    public static Vehicle assemble(VehicleType vehicleType, Color color, EngineType engineType) {
        return vehicleType.getVehicle().apply(color, engineType);
    }
}
