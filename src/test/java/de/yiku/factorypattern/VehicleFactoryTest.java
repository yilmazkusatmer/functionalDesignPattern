package de.yiku.factorypattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleFactoryTest {

    @Test
    void assembleBlackCarWithInlineEngine() {
        Vehicle givenVehicle = new Car(Color.BLACK, EngineType.INLINE);

        // when
        Vehicle assembleVehicle = VehicleFactory.assemble(VehicleType.CAR, Color.BLACK, EngineType.INLINE);

        // then
        assertThat(assembleVehicle).isEqualTo(givenVehicle);
    }

    @Test
    void assembleOrangeTruckWithVEngine() {
        Vehicle givenVehicle = new Truck(Color.ORANGE, EngineType.V);

        // when
        Vehicle assembleVehicle = VehicleFactory.assemble(VehicleType.TRUCK, Color.ORANGE, EngineType.V);

        // then
        assertThat(assembleVehicle).isEqualTo(givenVehicle);
    }

    @Test
    void assembleYellowBusWithStraightEngine() {
        Vehicle givenVehicle = new Bus(Color.YELLOW, EngineType.STRAIGHT);

        // when
        Vehicle assembleVehicle = VehicleFactory.assemble(VehicleType.TRUCK, Color.YELLOW, EngineType.STRAIGHT);

        // then
        assertThat(assembleVehicle).isNotEqualTo(givenVehicle);
    }
}