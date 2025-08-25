package pembayaran;

public class PembayaranKredit extends Pembayaran {

    public PembayaranKredit(int jumlah, String kartu) {
        this.setJumlah(jumlah);
        this.setKartu(kartu);
    }
}
