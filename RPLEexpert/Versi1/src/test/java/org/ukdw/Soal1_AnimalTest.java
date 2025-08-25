package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal1_AnimalTest {

    private static int score = 0;

    @Test
    void testGetterSetterAndToString() {
        Animal animal = new Animal("Leo", 5, "Lion");
        if ("Leo".equals(animal.getName())) score += 20;
        if (5 == animal.getAge()) score += 20;
        if ("Lion".equals(animal.getSpecies())) score += 20;
        if ("Leo is a Lion, aged 5".equals(animal.toString())) score += 20;
    }

    @Test
    void testAgeValidation() {
        try {
            new Animal("Cub", 0, "Tiger");
        } catch (IllegalArgumentException e) {
            if ("Age must be greater than 0".equals(e.getMessage())) {
                score += 20;
            }
        }
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 1 Score: " + score + "/100");
    }
}