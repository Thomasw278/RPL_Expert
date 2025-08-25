package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal1_InterfaceTest {

    private static int score = 0;

    @Test
    void testInterfaceMethodsExist() {
        PulsaTelkomsel p = new PulsaTelkomsel();
        p.topUp(50000); // should be accepted
        score += 30;
        p.pakai(15, "pulsa");    // should deduct
        score += 30;
    }

    @Test
    void testDefaultValidation() {
        PulsaTelkomsel p = new PulsaTelkomsel();
        if (p.isValidTopUp(100000) && !p.isValidTopUp(20000)) {
            score += 40;
        }
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 1 Score: " + score + "/100");
    }
}