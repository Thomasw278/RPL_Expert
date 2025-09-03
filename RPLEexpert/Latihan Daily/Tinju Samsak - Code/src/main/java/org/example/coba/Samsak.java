package org.example.coba;

public class Samsak {
    private int dayaTahan,tingkatKekerasan;
    private boolean rusak;

    //Constructor
    public Samsak(int dayaTahan, int tingkatKekerasan) {
        this.dayaTahan = dayaTahan;
        this.tingkatKekerasan = tingkatKekerasan;
    }

    //Getter & Setter
    public int getDayaTahan() {
        return dayaTahan;
    }
    public void setDayaTahan(int dayaTahan) {
        this.dayaTahan = dayaTahan;
    }
    public int getTingkatKekerasan() {
        return tingkatKekerasan;
    }
    public void setTingkatKekerasan(int tingkatKekerasan) {
        this.tingkatKekerasan = tingkatKekerasan;
    }
    public boolean isRusak() {
        return rusak;
    }
    public void setRusak(boolean rusak) {
        this.rusak = rusak;
    }
}