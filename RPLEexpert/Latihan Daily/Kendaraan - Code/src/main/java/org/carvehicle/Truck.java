package org.carvehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Truck(Engine engine, Transmision transmision, Tire tire,Wheel wheel, int capacity) {
        this.setEngine(engine);
        this.setTransmision(transmision);
        this.setWheel(wheel);
        this.setTire(tire);
        this.capacity = capacity;
    }
    @Override
    public void turnLeft() {
        super.turnLeft();
    }
    @Override
    public void forward() {
        super.forward();
    }
    @Override
    public void turnRight() {
        super.turnRight();
    }
    @Override
    public void backward() {
        super.backward();
    }
    @Override
    public void brake() {
        super.brake();
    }
}
