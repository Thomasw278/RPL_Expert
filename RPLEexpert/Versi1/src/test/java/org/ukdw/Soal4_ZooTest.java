package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal4_ZooTest {

    private static int score = 0;

    @Test
    void testAddAnimalAndCount() {
        Zoo zoo = new Zoo();
        if (zoo.getAnimalCount() == 0) score += 20;

        zoo.addAnimal(new Bird("Eagle", 3, "Bird", true));
        score += 30;

        zoo.addAnimal(new Mammal("Lion", 5, "Big Cat", "Golden"));
        score += 30;

        if (zoo.getAnimalCount() == 2) score += 20;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 4 Score: " + score + "/100");
    }
}