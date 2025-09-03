package org.carvehicle;

public class Wagon implements Vehicle{
    public String pullers;
    public Wheel wheel;

    public String getPullers(){
        return pullers;
    }

    public void setPullers(String pullers){
        this.pullers = pullers;
    }

    public Wheel getWheel(){
        return wheel;
    }

    public void setWheel(Wheel wheel){
        this.wheel = wheel;
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
}
