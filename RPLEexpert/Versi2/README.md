# 📱 UTS OOP - Aplikasi Top-Up Pulsa Telkomsel

## 📝 Deskripsi Umum
Buatlah aplikasi top-up pulsa berbasis console dengan menerapkan prinsip-prinsip OOP seperti
interface, inheritance, method overloading, dan composition. Dengan spesifikasi sebagai berikut.

---

## 💡 Spesifikasi Fitur

### 🔹 topUp(nominal)
- Nominal valid: 50.000, 100.000, 150.000
- Bonus 5% jika top-up >= 100.000
- Masa berlaku:
  - 50rb = 30 hari
  - 100rb = 60 hari
  - 150rb = 90 hari

### 🔹 pakai(jumlah, jenis)
- `jenis = "kuota"` → 1 GB = 5000 pulsa
- `jenis = "pulsa"` → 15 menit = 5000 pulsa
- Tampilkan sisa pulsa setelah pemakaian

### 🔹 printLog()
- Mencetak seluruh riwayat transaksi dari top-up dan pemakaian

---

## 👨‍👩‍👧‍👦 Pembagian Soal

| Soal | Konsep OOP | Deskripsi |
|------|-------------|-----------|
| **1** | Interface + Default Method | Buat interface `Pulsa` dengan method `topUp(double)` dan `pakai(double, String)` |
| **2** | Inheritance + Bonus Logic | Buat class `PulsaTelkomsel` yang mengimplementasikan bonus dan masa aktif |
| **3** | Overloading (pakai) | Hitung pemakaian berdasarkan `kuota` (GB) atau `pulsa` (menit) |
| **4** | Composition + Logging | Catat log transaksi ke dalam `List<String>` dan tampilkan dengan `printLog()` |

---

## 🧪 Penilaian
Setiap soal memiliki skor maksimal 100. Skor akan dicetak melalui unit test saat dijalankan.

### 📥 Jalankan test Per Soal:
1. untuk mengetahui nilai soal 1  
   ```bash 
   mvn -Dtest=Soal1_InterfaceTest test
   ```
2. untuk mengetahui nilai soal 2  
   ```bash 
   mvn -Dtest=Soal2_TopUpLogicTest test
   ```
3. untuk mengetahui nilai soal 3  
   ```bash
   mvn -Dtest=Soal3_OverloadTest test
   ```
4. untuk mengetahui nilai soal 4  
   ```bash
   mvn -Dtest=Soal4_LogTest test 
   ```

---

## 🙋‍♂️ Catatan
- Boleh browsing.
- No GPT
- No chit-chat
- Yang belum giliran mengerjakan, silahkan duduk diam dan memperhatikan.