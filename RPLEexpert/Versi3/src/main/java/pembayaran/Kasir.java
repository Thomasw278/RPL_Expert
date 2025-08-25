package pembayaran;

import java.util.ArrayList;
import java.util.List;

public class Kasir {
    private Pembayaran p;
    private List<String> riwayat = new ArrayList<>();

    public void lakukanPembayaran(Pembayaran p) {
        this.p = p;
    }

    public void cetakStruk(Pembayaran p) {
        String hasil = "STRUK PEMBAYARAN DENGAN NOMOR KARTU : " + p.getKartu() + " BERHASIL";
        riwayat.add(hasil);
        System.out.println(riwayat);
    }

    public void tampilkanRiwayat() {
        String hasil = p.getClass().getName();
        String akhir = "";
        if (hasil.equals("pembayaran.PembayaranDebit")) {
            akhir = "Pembayaran Kartu Debit dengan jumlah Rp " + p.getJumlah();
        } else if (hasil.equals("pembayaran.PembayaranEWallet")) {
            akhir = "Pembayaran E-Wallet dengan jumlah Rp " + p.getJumlah();
        } else if (hasil.equals("pembayaran.PembayaranKredit")) {
            akhir = "Pembayaran Kredit dengan jumlah Rp " + p.getJumlah();
        } else {
            System.out.println("Yagimana Ya");
        }
        riwayat.add(akhir);
        System.out.println(riwayat);
    }
}
