package pembayaran;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Soal4_StrukRiwayatTest {

    private static int score = 0;
    private static final PrintStream originalOut = System.out;

    @Test
    void testStrukOutput() {
        Pembayaran p = new PembayaranKredit(60000, "12345678");
        Kasir kasir = new Kasir();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        kasir.cetakStruk(p);

        String output = out.toString();
        if (output.contains("STRUK PEMBAYARAN") && output.contains("BERHASIL")) score += 50;

        System.setOut(originalOut); // Kembalikan System.out
    }

    @Test
    void testRiwayatTersimpan() {
        Pembayaran p = new PembayaranDebit(75000, "87654321");
        Kasir kasir = new Kasir();
        kasir.lakukanPembayaran(p);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        kasir.tampilkanRiwayat();

        String output = out.toString();
        if (output.contains("Kartu Debit") && output.contains("Rp 75000")) score += 50;

        System.setOut(originalOut); // Kembalikan System.out
    }

    @AfterAll
    static void printScore() {
        System.out.println("Soal 4 Score: " + score + "/100");
    }
}