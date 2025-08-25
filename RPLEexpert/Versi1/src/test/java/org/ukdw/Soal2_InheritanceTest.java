package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal2_InheritanceTest {

    private static int score = 0;

    @Test
    void testBirdInheritance() {
        Bird bird = new Bird("Parrot", 2, "Bird", true);
        if ("Parrot".equals(bird.getName())) score += 20;
        if (2 == bird.getAge()) score += 20;
        if (bird.isCanFly()) score += 20;
    }

    @Test
    void testMammalInheritance() {
        Mammal mammal = new Mammal("Tiger", 4, "Big Cat", "Orange");
        if ("Tiger".equals(mammal.getName())) score += 20;
        if ("Orange".equals(mammal.getFurColor())) score += 20;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 2 Score: " + score + "/100");
    }
}