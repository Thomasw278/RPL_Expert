package pembayaran;


public class PembayaranDebit extends Pembayaran {
    public PembayaranDebit(int jumlah, String kartu) {
        this.setJumlah(jumlah);
        this.setKartu(kartu);
    }
}
