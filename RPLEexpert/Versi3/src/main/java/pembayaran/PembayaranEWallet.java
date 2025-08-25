package pembayaran;

public class PembayaranEWallet extends Pembayaran {
    public PembayaranEWallet(int jumlah, String kartu) {
        this.setJumlah(jumlah);
        this.setKartu(kartu);
    }
}
