package org.ukdw;

import java.util.ArrayList;
import java.util.List;

public class PulsaTelkomsel implements Pulsa {
    private int SisaPulsa;
    private int MasaAktif;
    private List<String> LogTransaksi = new ArrayList<>();

    public List<String> getLogTransaksi() {
        return LogTransaksi;
    }

    public int getSisaPulsa() {
        return SisaPulsa;
    }

    public void setSisaPulsa(int SisaPulsa) {
        this.SisaPulsa = SisaPulsa;
    }

    public int getMasaAktif() {
        return MasaAktif;
    }

    public void setMasaAktif(int MasaAktif) {
        this.MasaAktif = MasaAktif;
    }

    public void printLog(){
        System.out.println(LogTransaksi);
    }

    @Override
    public void topUp(double nominal) {
        double bonus = 0;
        double tampungnominal = nominal;
        if (isValidTopUp(nominal)) {
            if (nominal >= 100000) {
                bonus = (5.0 / 100) * nominal;
                nominal = nominal + bonus;
                SisaPulsa = (int) nominal;
                LogTransaksi.add("TopUp " + tampungnominal + " (+bonus " + bonus + ")");
            } else {
                SisaPulsa = (int) nominal;
            }
            if(tampungnominal == 50000){
                MasaAktif = 30;
            } else if (tampungnominal == 100000){
                MasaAktif = 60;
            } else {
                MasaAktif = 90;
            }
        } else {
            return;
        }
    }

    @Override
    public void pakai(double jumlah, String jenis) {
        double hitung = 0;
        if(jenis.equals("kuota")){
            hitung = jumlah * 5000;
            SisaPulsa = SisaPulsa - (int) hitung;
            LogTransaksi.add("Pakai " + jumlah + " kuota (-" + hitung + ")");
        } else {
            hitung = (jumlah / 15) * 5000;
            SisaPulsa = SisaPulsa - (int) hitung;
            LogTransaksi.add("Pakai " + jumlah + " pulsa (-" + hitung + ")");
        }
    }

    @Override
    public boolean isValidTopUp(double nominal) {
        return Pulsa.super.isValidTopUp(nominal);
    }
}
