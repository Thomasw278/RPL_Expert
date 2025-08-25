package pembayaran;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal1_AbstraksiTest {
    private static int score = 0;

    @Test
    void testJumlahValidasi() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new PembayaranKredit(5000, "12345678");
        });
        if (ex.getMessage().contains("minimal")) score += 50;
    }

    @Test
    void testGetterJumlah() {
        Pembayaran p = new PembayaranKredit(20000, "12345678");
        if (p.getJumlah() == 20000) score += 50;
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 1 Score: " + score + "/100");
    }
}