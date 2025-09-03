package org.carvehicle;

public class Tire {
    public String tireType;
    public int width;
    public int wheelDiameter;
    public int aspectRatio;

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public int getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(int aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public Tire(String tireType, int width, int wheelDiameter, int aspectRatio) {
        this.tireType = tireType;
        this.width = width;
        this.wheelDiameter = wheelDiameter;
        this.aspectRatio = aspectRatio;
    }

}
