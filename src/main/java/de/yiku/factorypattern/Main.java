package de.yiku.factorypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Vehicle blackCar = VehicleFactory.assemble(VehicleType.CAR, Color.BLACK, EngineType.INLINE);
        Vehicle orangeBus = VehicleFactory.assemble(VehicleType.BUS, Color.ORANGE, EngineType.V);
        Vehicle blackTruck = VehicleFactory.assemble(VehicleType.TRUCK, Color.BLACK, EngineType.FLAT);


        logger.info("assemble {}", blackCar);
        logger.info("assemble {}", orangeBus);
        logger.info("assemble {}", blackTruck);

    }
}
