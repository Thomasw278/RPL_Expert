package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal3_OverloadTest {

    private static int score = 0;

    @Test
    void testPulsaUsage() {
        PulsaTelkomsel p = new PulsaTelkomsel();
        p.topUp(100000);
        p.pakai(30, "pulsa"); // 2 * 5000 = 10000
        if (p.getSisaPulsa() == 95000) score += 50;
    }

    @Test
    void testKuotaUsage() {
        PulsaTelkomsel p = new PulsaTelkomsel();
        p.topUp(100000);
        p.pakai(2.0, "kuota"); // 2 * 5000 = 10000
        if (p.getSisaPulsa() == 95000) score += 50;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 3 Score: " + score + "/100");
    }
}