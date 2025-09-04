import java.sql.SQLOutput;
import java.util.Scanner;

public class ProgramController {
    private DatabaseController db = new DatabaseController();
    Scanner scan = new Scanner(System.in);

    public void HandleProgram(int pilihan){
        if(pilihan == 1){
            //Input Peserta - nama, alamat , no hp , umur
            System.out.println("\n============ MEMILIH REGISTRASI PESERTA ============");
            System.out.print("Masukkan Nama Lengkap Peserta Didik Baru : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan Alamat Tempat Tinggal Peserta Didik Baru : ");
            String alamat = scan.nextLine();
            System.out.print("Masukkan Nomor HP Peserta Didik Baru : ");
            String nomor = scan.nextLine();
            System.out.print("Masukkan Umur Peserta Didik Baru : ");
            int umur = scan.nextInt();
            System.out.println("====================================================");
            if(db.InputPeserta(nama, alamat, nomor, umur) == true){
                System.out.println("====================================================");
                System.out.println("Berhasil Input Peserta Didik Baru");
                System.out.println("====================================================");
                System.out.println("");
            } else {
                System.out.println("====================================================");
                System.out.println("Gagal Input Peserta Didik Baru");
                System.out.println("====================================================");
                System.out.println("");
            }

        } else if(pilihan == 2){
            //Edit Peserta
            System.out.println("\n================ MEMILIH EDIT PESERTA =================");
            System.out.print("Masukkan Nomor Handphone Peserta Didik Yang Ingin Diedit : ");
            String nomor = scan.nextLine();
            System.out.println("=======================================================");
            System.out.println("");
            if(db.SelectDataPeserta(nomor) == true){
                System.out.println("====================================================");
                System.out.println("============= NOMOR HANDPHONE DITEMUKAN ============");
                System.out.println("====================================================");

                System.out.println("\n===============================================");
                System.out.println("===== PEMBAHARUAN DATA PESERTA DIDIK BARU =====");
                System.out.println("===============================================");

                System.out.print("Masukkan Nama Peserta Didik Yang Ingin Diedit : ");
                String namabaru = scan.nextLine();
                System.out.print("Masukkan Alamat Peserta Didik Yang Ingin Diedit : ");
                String alamatbaru = scan.nextLine();
                System.out.print("Masukkan Usia Peserta Didik Yang Ingin Diedit : ");
                int umurbaru = scan.nextInt();
                if(db.UpdateDataPeserta(nomor,namabaru,alamatbaru,umurbaru) == true){
                    System.out.println("\n===================================================");
                    System.out.println("===== BERHASIL UPDATE DATA PESERTA DIDIK BARU =====");
                    System.out.println("===================================================\n");
                } else {
                    System.out.println("\n================================================");
                    System.out.println("===== GAGAL UPDATE DATA PESERTA DIDIK BARU =====");
                    System.out.println("================================================\n");
                }

            } else {
                System.out.println("====================================================");
                System.out.println("========== NOMOR HANDPHONE TIDAK DITEMUKAN =========");
                System.out.println("====================================================");
            }
            System.out.println();
        } else if(pilihan == 3){
            //Melihat Peserta
            db.LihatPeserta();
        } else if(pilihan == 4){
            //Delete Peserta
            System.out.println("\n=========================================================");
            System.out.println("================ MEMILIH DELETE PESERTA =================");
            System.out.println("=========================================================");

            System.out.print("Masukkan Nomor Handphone Peserta Didik Baru : ");
            String hapusnomor = scan.nextLine();

            if(db.DeleteDataPeserta(hapusnomor) == true){
                System.out.println("\n===================================================");
                System.out.println("===== BERHASIL DELETE DATA PESERTA DIDIK BARU =====");
                System.out.println("===================================================\n");
            } else {
                System.out.println("\n================================================");
                System.out.println("===== GAGAL DELETE DATA PESERTA DIDIK BARU =====");
                System.out.println("================================================\n");
            }

        }
    }
}
