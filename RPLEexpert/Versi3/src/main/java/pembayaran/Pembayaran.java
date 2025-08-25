package pembayaran;

public abstract class Pembayaran {
    private int jumlah;
    private String kartu;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        if(jumlah < 10000){
            throw new IllegalArgumentException("Jumlah minimal adalah Rp 10.000");
        } else {
            this.jumlah = jumlah;
        }
    }

    public String getKartu() {
        return kartu;
    }

    public void setKartu(String kartu) {
        if(kartu.length() < 8){
            throw new IllegalArgumentException("Kartu tidak valid");
        } else {
            this.kartu = kartu;
        }
    }
}
