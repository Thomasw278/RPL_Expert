package mahasiswa.pemisah_jurusan_berdasarkan_nim;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MahasiswaController {

    @FXML
    private Button btnNIM;

    @FXML
    private Label txtHasil;

    @FXML
    private TextField txtNIM;

    @FXML
    void btnCariNIM(ActionEvent event) {
        String nim = txtNIM.getText();
        txtNIM.clear();

        //Ambil Jurusan dan Angkatan
        String Jurusan = nim.substring(0,2);
        String Angkatan = nim.substring(2,4);

        //Proses Coding Logika Jurusan
        String Hasil = "";
        if(Jurusan.equals("71")){
            Hasil = "Informatika";
        } else if(Jurusan.equals("72")){
            Hasil = "Sistem Informasi";
        } else if(Jurusan.equals("61")){
            Hasil = "Arsitektur";
        } else if(Jurusan.equals("41")){
            Hasil = "Kedokteran";
        } else if(Jurusan.equals("51")){
            Hasil = "Akutansi";
        } else {
            Hasil = "Jurusan Tidak Diketahui";
        }
        txtHasil.setText("Mahasiswa Jurusan " + Hasil + " Angkatan " + Angkatan);

        //Cek Maintenance Terminal
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jurusan Mahasiswa: " + Jurusan);
        System.out.println("Angkatan Mahasiswa: " + Angkatan);

    }

}
