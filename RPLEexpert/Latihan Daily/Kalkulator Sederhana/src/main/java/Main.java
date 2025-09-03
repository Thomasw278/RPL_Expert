import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== KALKULATOR SEDERHANA ==========");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama : ");
        double angkaPertama = input.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        double angkaKedua = input.nextDouble();
        System.out.print("Masukkan Angka Ketiga : ");
        double angkaKetiga = input.nextDouble();
        System.out.print("Pilih Operator Yang Tersedia (+,-,*,/) : ");
        String operator =  input.next();
        Kalkulator kalkulator = new Kalkulator(angkaPertama,angkaKedua,angkaKetiga,operator);
        System.out.println("Hasil Dari Operasi Adalah " + kalkulator.getHasil());
        System.out.println("\n============== Terima Kasih ==============");
    }
}
