package org.carvehicle;

public abstract class MotorVehicle implements Vehicle {
    private Wheel wheel;
    private Transmision transmision;
    private String vehicleName;
    private Tire tire;
    private Engine engine;

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void turnRight() {

    }

    @Override
    public void forward() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void backward() {

    }
    public MotorVehicle() {}
}
