package org.carvehicle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompleteTest {

    private Engine engine;
    private Transmision transmision;
    private Tire tire;
    private Wheel wheel;
    private Car car;
    private Truck truck;
    private Bus bus;
    private static int totalScore = 0;

    @BeforeEach
    void setUp() {
        engine = new Engine("Diesel", 2000);
        transmision = new Transmision("Automatic", 6);
        tire = new Tire("All-Season", 205, 55, 16);
        wheel = new Wheel(7, 16);

        car = new Car();
        truck = new Truck(engine, transmision, tire, wheel, 5000);
        bus = new Bus();
    }

    @Test
    void testClassInheritance() {
        assertTrue(car instanceof MotorVehicle, "Car should inherit from MotorVehicle");
        assertTrue(truck instanceof MotorVehicle, "Truck should inherit from MotorVehicle");
        assertTrue(bus instanceof MotorVehicle, "Bus should inherit from MotorVehicle");
        assertTrue(car instanceof Vehicle, "Car should implement Vehicle");
        assertTrue(truck instanceof Vehicle, "Truck should implement Vehicle");
        assertTrue(bus instanceof Vehicle, "Bus should implement Vehicle");
        totalScore += 20;
        System.out.println("Test Class Inheritance: 20/100");
    }

    @Test
    void testMotorVehicleExtendsVehicle() {
        MotorVehicle motorVehicle = new MotorVehicle() {
            @Override
            public void brake() {}
            @Override
            public void turnRight() {}
            @Override
            public void turnLeft() {}
            @Override
            public void forward() {}
            @Override
            public void backward() {}
        };
        assertTrue(motorVehicle instanceof Vehicle, "MotorVehicle should extend Vehicle");
        totalScore += 15;
        System.out.println("Test MotorVehicle Extends Vehicle: 15/100");
    }

    @Test
    void testWagonExtendsVehicle() {
        Wagon wagon = new Wagon() {
            @Override
            public void brake() {}
            @Override
            public void turnRight() {}
            @Override
            public void turnLeft() {}
            @Override
            public void forward() {}
            @Override
            public void backward() {}
        };
        assertTrue(wagon instanceof Vehicle, "Wagon should extend Vehicle");
        totalScore += 15;
        System.out.println("Test Wagon Extends Vehicle: 15/100");
    }

    @Test
    void testCarHasEngine() {
        car.setEngine(engine);
        assertNotNull(car.getEngine(), "Car should have an engine");
        totalScore += 15;
        System.out.println("Test Car Has Engine: 15/100");
    }

    @Test
    void testTruckHasComponents() {
        assertNotNull(truck.getEngine(), "Truck should have an engine");
        assertNotNull(truck.getTransmision(), "Truck should have a transmission");
        assertNotNull(truck.getTire(), "Truck should have tires");
        assertNotNull(truck.getWheel(), "Truck should have wheels");
        totalScore += 20;
        System.out.println("Test Truck Has Components: 20/100");
    }

    @Test
    void testWagonHasWheel() {
        Wagon wagon = new Wagon() {
            @Override
            public void brake() {}
            @Override
            public void turnRight() {}
            @Override
            public void turnLeft() {}
            @Override
            public void forward() {}
            @Override
            public void backward() {}
        };
        wagon.setWheel(wheel);
        assertNotNull(wagon.getWheel(), "Wagon should have wheels");
        totalScore += 15;
        System.out.println("Test Wagon Has Wheel: 15/100");
    }

    @AfterAll
    static void printFinalScore() {
        System.out.println("Total Score: " + totalScore + "/100");
    }
}
