package org.carvehicle;

public class Engine {
    private String fuelType;
    private int capacity;

    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public Engine(String fuelType, int capacity){
        this.fuelType = fuelType;
        this.capacity = capacity;
    }
}
