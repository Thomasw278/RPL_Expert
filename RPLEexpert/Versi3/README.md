# 💳 UTS Prak RPLBO - Aplikasi Sistem Pembayaran

## 📝 Deskripsi Umum 
Buatlah sistem pembayaran yang mendukung metode pembayaran: Kartu Kredit, Kartu Debit, dan E-Wallet.
Aplikasi juga harus mencetak struk, melakukan validasi input, dan menyimpan riwayat transaksi.

---

## 💡 Spesifikasi Fitur

### 🔹 Validasi
- Jumlah pembayaran harus **≥ 10.000**
- Nomor kartu, rekening, atau akun harus **≥ 8 karakter**

### 🔹 Cetak Struk
```
=== STRUK PEMBAYARAN ===
Metode  : Kartu Kredit
Jumlah  : Rp 150000
Info    : 12345678
Status  : BERHASIL
========================
```

### 🔹 Riwayat Transaksi
- Disimpan di `List<String>` dalam class `Kasir`
- Dapat ditampilkan melalui `tampilkanRiwayat()`

---

## 👥 Pembagian Soal

| Soal | Konsep OOP | Deskripsi |
|------|-------------|-----------|
| **1** | Abstraction + Encapsulation | Buat class `Pembayaran` (abstract) dengan field `jumlah` dan validasi jumlah minimal 10.000. |
| **2** | Inheritance + Polymorphism | Implementasikan subclass `PembayaranKredit`, `PembayaranDebit`, `PembayaranEWallet` dengan override `prosesPembayaran()` dan validasi input masing-masing. |
| **3** | Composition | Buat class `Kasir` dengan method `lakukanPembayaran(Pembayaran)` dan simpan riwayat transaksi. |
| **4** | Output Formatting + List | Tambahkan fitur `cetakStruk()` dan `tampilkanRiwayat()` di `Kasir`. Format output harus jelas dan rapi. |

---

## 🧪 Penilaian
Setiap soal bernilai maksimal **100 poin** dan diuji melalui unit test berbasis **JUnit 5**.

### 📥 Jalankan Pengujian Per Soal:
1. untuk mengetahui nilai soal 1
   ```bash 
   mvn -Dtest=Soal1_AbstraksiTest test
   ```
2. untuk mengetahui nilai soal 2
   ```bash 
   mvn -Dtest=Soal2_SubclassTest test
   ```
3. untuk mengetahui nilai soal 3
   ```bash
   mvn -Dtest=Soal3_KasirPembayaranTest test
   ```
4. untuk mengetahui nilai soal 4
   ```bash
   mvn -Dtest=Soal4_StrukRiwayatTest test 
   ```

---
## 🙋‍♂️ Catatan
- Boleh browsing.
- No GPT
- No chit-chat
- Yang belum giliran mengerjakan, silahkan duduk diam dan memperhatikan.