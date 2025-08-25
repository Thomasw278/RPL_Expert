module mahasiswa.pemisah_jurusan_berdasarkan_nim {
    requires javafx.controls;
    requires javafx.fxml;


    opens mahasiswa.pemisah_jurusan_berdasarkan_nim to javafx.fxml;
    exports mahasiswa.pemisah_jurusan_berdasarkan_nim;
}