# 🦁 Ujian Tengah Semester: Sistem Manajemen Kebun Binatang (OOP Java)

## 📌 Deskripsi Umum
Proyek ini merupakan bagian dari Ujian Tengah Semester untuk mata kuliah PRak RPLBO. 
Aplikasi ini merupakan simulasi **manajemen kebun binatang** berbasis console, yang terdiri dari beberapa class yang mewakili hewan dan kebun binatang itu sendiri.

Ujian dikerjakan **berkelompok (4 orang per kelompok)**. Setiap anggota kelompok mengerjakan **satu soal**, yang berfokus pada satu konsep OOP utama, dan diuji menggunakan **unit test berbasis JUnit 5**.

---

## 👥 Pembagian Tugas

| Soal | Nama File | Konsep OOP | Deskripsi |
|------|-----------|-------------|-----------|
| 1 | `Animal.java` | Encapsulation | Buat class `Animal` dengan validasi dan method `toString()`. |
| 2 | `Bird.java` & `Mammal.java` | Inheritance | Buat subclass dari `Animal` dengan atribut tambahan. |
| 3 | Override `makeSound()` | Polymorphism | Implementasi method `makeSound()` berbeda untuk setiap subclass. |
| 4 | `Zoo.java` | Composition | Manajemen daftar hewan menggunakan List. |

---

## 📄 Detail Soal

### 🔹 Soal 1 – Encapsulation
Buat class `Animal` dengan:
- Atribut `name`, `age`, `species` (semua `private`)
- Getter dan setter untuk semua atribut
- Validasi:
  - `setAge(int age)` melempar `IllegalArgumentException` jika `age <= 0`
- Method `toString()` mengembalikan string seperti:
  ```
  Simba is a Lion, aged 5
  ```

---

### 🔹 Soal 2 – Inheritance
Buat subclass:
- `Bird` → tambah atribut `canFly` (boolean)
- `Mammal` → tambah atribut `furColor` (String)

Keduanya harus mewarisi `Animal` dan menggunakan constructor superclass. Buat getter dan setter.

---

### 🔹 Soal 3 – Polymorphism
Override method `makeSound()`:
- Di `Animal`: return `"Unknown sound"`
- Di `Bird`: return `"Tweet!"`
- Di `Mammal`: return `"Roar!"`

Pastikan method ini polymorphic (bisa dipanggil dari reference `Animal`).

---

### 🔹 Soal 4 – Composition
Buat class `Zoo` yang berisi:
- `List<Animal>` sebagai field
- Method `void addAnimal(Animal a)`
- Method `int getAnimalCount()`

Tidak perlu membuat tampilan atau fitur tambahan.

---

## 🛠️ Build & Jalankan
Eksekusi perintah berikut 
1. untuk mengetahui nilai soal 1
   ```bash mvn 
   mvn test -Dtest=Soal1_AnimalTest
   ``` 
2. untuk mengetahui nilai soal 2 
   ```bash 
   mvn test -Dtest=Soal2_InheritanceTest
   ``` 
3. untuk mengetahui nilai soal 3 
   ```bash
   mvn test -Dtest=Soal3_PolymorphismTest
   ```
4. untuk mengetahui nilai soal 4
   ```bash 
   mvn test -Dtest=Soal4_ZooTest
   ```
   

---

## ✍️ Catatan
- Boleh browsing. 
- No GPT
- No chit-chat
- Yang belum giliran mengerjakan, silahkan duduk diam dan memperhatikan.