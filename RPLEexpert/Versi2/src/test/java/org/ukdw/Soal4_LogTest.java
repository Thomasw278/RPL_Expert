package org.ukdw;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class Soal4_LogTest {

    private static int score = 0;

    @Test
    void testLogTransaksiTopUpDanPakai() {
        PulsaTelkomsel p = new PulsaTelkomsel();
        p.topUp(100000);  // +5000 bonus
        p.pakai(30, "pulsa");      // 10000
        p.pakai(1.0, "kuota");     // 5000

        List<String> log = p.getLogTransaksi();

        if (log.contains("TopUp 100000.0 (+bonus 5000.0)")) score += 30;
        if (log.contains("Pakai 30.0 pulsa (-10000.0)")) score += 30;
        if (log.contains("Pakai 1.0 kuota (-5000.0)")) score += 30;
    }

    @Test
    void testLogPrint() {
        PulsaTelkomsel p = new PulsaTelkomsel();
        p.topUp(150000);
        p.pakai(15, "kuota");
        p.printLog(); // manual check
        score += 10;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 4 Score: " + score + "/100");
    }
}