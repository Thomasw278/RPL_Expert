import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] args) {
        //Awal Program
        System.out.println("========================================");
        System.out.println("========== PROGRAM KALKULATOR ==========");
        System.out.println("========================================");

        //Input Detection
        Scanner input = new Scanner(System.in);
        System.out.print("Mau Melakukan Operasi Berapa Kali : ");
        int langkah =  input.nextInt();
        ArrayList<Double> AngkaList = new ArrayList<>();

        for(int i=1 ; i <= langkah ; i++){
            System.out.print("Masukkan Angka ke -" + i + " : ");
            AngkaList.add(input.nextDouble());
        }

        System.out.print("Pilih Operator (+,-,*,/) : ");
        String Operator = input.next();

        //Eksekusi Program
        Kalkulator Hitung = new Kalkulator(AngkaList, Operator);
        System.out.println("");
        System.out.println("Hasil Operasi Adalah " + Hitung.getHasil());
        System.out.println("");

        //Closing Program
        System.out.println("========================================");
        System.out.println("============= TERIMA KASIH =============");
        System.out.println("========================================");

    }
}
