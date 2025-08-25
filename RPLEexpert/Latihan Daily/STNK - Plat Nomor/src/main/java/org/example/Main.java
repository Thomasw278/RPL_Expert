package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Pemilik Kendaraan: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Plat Nomor Kendaraan: ");
        String nomor = sc.nextLine();
        STNK stnk = new STNK(nama,nomor);
        printSTNK(stnk);
    }
    public static void printSTNK (STNK stnk) {
        System.out.println("Nama\t\t: " + stnk.getPemilik());
        System.out.println("Kode Plat\t: " + stnk.getKodePlat());
        System.out.println("Lokasi\t\t: " + stnk.getLokasi());

    }
}
