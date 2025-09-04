import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Logika BackEnd
        ProgramController pg = new ProgramController();
        boolean mulai = true;

            //Tampilan CLI awal program
            System.out.println("===============================================================");
            System.out.println("=============== PPDB SMA BANGUN WISNU NUSANTARA ===============");
            System.out.println("===============================================================");
            while(mulai){
            System.out.println("Daftar Pilihan Fitur Yang Tersedia");
            System.out.println("\t1. Pendaftaran Peserta Didik Baru");
            System.out.println("\t2. Edit Data Peserta Didik Baru");
            System.out.println("\t3. Melihat Data Peserta Didik");
            System.out.println("\t4. Menghapus Data Peserta Didik");
            System.out.println("\t5. Keluar Aplikasi");

            //Pemilihan Peserta
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan Pilihan : ");
            int pilihan = scan.nextInt();
            if (pilihan == 5){
                mulai = false;
                System.out.println("\n===============================================================");
                System.out.println("== Memilih Keluar Aplikasi - Terimakasih Dari Staff SMA SBWN ==");
                System.out.println("=============== PPDB SMA BANGUN WISNU NUSANTARA ===============");
                System.out.println("===============================================================");
            } else {
                pg.HandleProgram(pilihan);
            }
        }
    }
}
