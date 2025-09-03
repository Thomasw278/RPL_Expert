package org.carvehicle;

public class Car extends MotorVehicle{
    private int numPassenger;
    public Car(){};
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
