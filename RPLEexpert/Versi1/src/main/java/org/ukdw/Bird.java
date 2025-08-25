package org.ukdw;

public class Bird extends Animal{
    private boolean canFly;

    public Bird(String name, int age, String species, boolean canFly) {
        super(name, age, species);
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Tweet!";
    }
}
