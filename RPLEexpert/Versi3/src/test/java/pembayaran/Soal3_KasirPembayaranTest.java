package pembayaran;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Soal3_KasirPembayaranTest {

    private static int score = 0;

    @Test
    void testPembayaranBerhasil() {
        Pembayaran p = new PembayaranDebit(50000, "12345678");
        Kasir kasir = new Kasir();
        try {
            kasir.lakukanPembayaran(p);
            score += 100;
        } catch (Exception e) {
            score = 0;
        }
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 3 Score: " + score + "/100");
    }
}