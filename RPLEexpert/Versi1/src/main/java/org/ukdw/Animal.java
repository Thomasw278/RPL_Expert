package org.ukdw;

public class Animal {
    private String name;
    private int age;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new IllegalArgumentException("Age must be greater than 0");
        } else {
            this.age = age;
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Animal(String name, int age, String species) {
        this.name = name;
        this.setAge(age);
        this.species = species;
    }

    public String toString(){
        String hasil = this.name + " is a " + this.species + ", aged " + this.age;
//        System.out.println(hasil);
        return hasil;
    }

    public String makeSound(){
        return "Unknown sound";
    }
}