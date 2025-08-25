package org.ukdw;

public interface Pulsa {
    void topUp(double nominal);
    void pakai(double jumlah, String jenis);
    public default boolean isValidTopUp(double nominal) {
        if(nominal == 50000 || nominal == 100000 || nominal == 150000){
            return true;
        } else {
            return false;
        }
    }
}
