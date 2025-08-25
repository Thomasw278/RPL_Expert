package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal3_PolymorphismTest {

    private static int score = 0;

    @Test
    void testMakeSoundOverride() {
        Animal generic = new Animal("Animal", 3, "Unknown");
        Bird bird = new Bird("Sparrow", 2, "Bird", true);
        Mammal mammal = new Mammal("Bear", 5, "Mammal", "Brown");

        if ("Unknown sound".equals(generic.makeSound())) score += 20;
        if ("Tweet!".equals(bird.makeSound())) score += 40;
        if ("Roar!".equals(mammal.makeSound())) score += 40;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 3 Score: " + score + "/100");
    }
}