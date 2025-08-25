package org.ukdw;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public int getAnimalCount(){
        return animals.size();
    }
}