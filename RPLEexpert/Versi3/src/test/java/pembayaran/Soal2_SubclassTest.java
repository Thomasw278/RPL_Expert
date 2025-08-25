package pembayaran;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal2_SubclassTest {

    private static int score = 0;

    @Test
    void testKreditValidasi() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new PembayaranKredit(20000, "1234");
        });
        if (ex.getMessage().contains("tidak valid")) score += 50;
    }

    @Test
    void testEWalletValidasi() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new PembayaranEWallet(30000, "abc");
        });
        if (ex.getMessage().contains("tidak valid")) score += 50;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 2 Score: " + score + "/100");
    }
}