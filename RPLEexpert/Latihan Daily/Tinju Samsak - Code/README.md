[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/15_r_kfz)
<h1 style="text-align: center;">Minggu 3: Enkapsulasi dan Konstruktor</h1>

<div style="display: flex; justify-content: center; align-items: center; flex-direction: column;">
    <div style="
        text-align: center;
        border: 1px solid black;
        border-radius: 10px;
        width: 75%;
        padding: 10px;
        ">
        <h2>Class</h2>
        <img src="./Class.png">
    </div>
</div>

Kalian akan diberikan 3 buah class: Main, Petinju, dan Samsak.

- Petinju

  Lengkapilah class Petinju. Class ini mempunyai komponen - komponen yang bisa dilihat di diagram di atas.  
  <br>
  Buat sebuah konstruktor Petinju yang menerima parameter :
    - name : String
    - kekuatan : int

  Properti <b>nama</b> pada class Petinju memiliki inputan gabungan antara nama dan stamina yang digabung dalam sebuah string, contohnya "Paquito200" dengan nama "Paquito" dan stamina "200"
  <br>
  <br>
  Method <b>tinju</b> menerima parameter :
    - samsak : Samsak

  Method ini nantinya akan digunakan untuk melakukan tinju kepada object samsak yang telah dibuat, namun perlu diperhatikan tinju pada samsak dilakukan dengan syarat petinju harus memiliki stamina yang cukup untuk melakukan tinjuan, setelah melakukan tinjuan kepada samsak, maka stamina petinju akan berkurang sebanyak kekuatan yang dikeluarkan untuk meninju, kekuatan petinju juga harus lebih dari tingkat kekerasan samsak untuk dapat memberikan sejumlah kerusakan, dan ketika daya tahan samsak sudah habis maka status samsak dinyatakan rusak.
  Buatlah juga getter dan setternya juga.
  <br>
  <br>
- Samsak

  Lengkapilah class Samsak. Class ini mempunyai komponen - komponen yang bisa dilihat di diagram di atas.  
  <br>
  Buat sebuah konstruktor Ternak yang menerima parameter :
    - dayaTahan : int
    - tingkatKerusakan : int
    - rusak : boolean

  <br>
  Buatlah juga getter dan setternya juga.
  <br>
  <br>
- Main
  Untuk kelas ini, tujuan utama kalian adalah membuat object yang dibutuhkan, kemudian tinggal memanggil fungsi tinju yang telah dibuat untuk memulai program

## OUTPUT
Output berhasil meninju hingga samsak hancur
<br>
![Contoh Output Berhasil Meninju hingga samsak hancur](Output1.png)
<br>
Contoh output ketika stamina petinju habis
<br>
![Contoh Output stamina petinju habis](Output2.png)
<br>
Contoh output ketika samsak yang dipukul terlalu keras
<br>
![Contoh Output samsak terlalu keras](Output3.png)

