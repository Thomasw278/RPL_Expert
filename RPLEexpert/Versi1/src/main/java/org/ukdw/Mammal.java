package org.ukdw;

public class Mammal extends Animal {
    public String furColor;

    public String getFurColor(){
        return furColor;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    public Mammal(String name, int age,String species, String furColor) {
        super(name, age, species);
        this.furColor = furColor;
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
}
