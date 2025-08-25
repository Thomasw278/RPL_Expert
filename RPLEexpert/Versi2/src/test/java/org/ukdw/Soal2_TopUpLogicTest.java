package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal2_TopUpLogicTest {

    private static int score = 0;

    @Test
    void testTopUpBonusAndActivePeriod() {
        PulsaTelkomsel p = new PulsaTelkomsel();
        p.topUp(100000); // should give bonus 5% and +2 months
        if (p.getSisaPulsa() == 105000) score += 50;
        if (p.getMasaAktif() == 60) score += 50;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 2 Score: " + score + "/100");
    }
}