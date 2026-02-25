# Laporan Program LatihanTabelPerkalian

## Deskripsi Program

Program **LatihanTabelPerkalian** dibuat untuk menampilkan tabel perkalian dari suatu angka menggunakan perulangan `for` dalam Java. Pada contoh ini, program menampilkan tabel perkalian angka **7** dari 1 sampai 12.

Program ini melatih pemahaman tentang perulangan terstruktur dan operasi aritmatika dalam satu kasus yang sederhana dan mudah dipahami.

---

## Penjelasan Variabel

Program menggunakan dua variabel utama:

* **int angka** → menyimpan angka yang akan dibuat tabel perkaliannya (nilai = 7).
* **int i** → variabel kontrol dalam perulangan `for` yang berjalan dari 1 sampai 12.

Variabel `i` berfungsi sebagai pengali yang berubah setiap iterasi.

---

## Konsep yang Digunakan

* **For Loop** → digunakan karena jumlah perulangan sudah jelas (1–12).
* **Operator Perkalian (`*`)** → digunakan untuk menghitung hasil perkalian antara `angka` dan `i`.
* **System.out.println()** → digunakan untuk menampilkan hasil ke layar dalam format tabel.

---

## Alur Program

1. Program mendeklarasikan variabel `angka` dengan nilai 7.
2. Program menjalankan perulangan `for` dari 1 sampai 12.
3. Pada setiap iterasi, program menghitung hasil `angka * i`.
4. Hasil ditampilkan dalam format:

   ```
   7 x i = hasil
   ```
5. Perulangan berhenti ketika nilai `i` lebih dari 12.

---

## Output Program

```
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
7 x 11 = 77
7 x 12 = 84
```

---

## Kesimpulan

Program ini menunjukkan penggunaan `for` loop untuk membuat pola perhitungan berulang secara terstruktur. Karena batas awal dan akhir sudah jelas, penggunaan `for` menjadi pilihan yang paling efektif dan rapi.

Latihan seperti ini penting untuk memperkuat pemahaman tentang perulangan dan operasi aritmatika sebelum masuk ke studi kasus yang lebih kompleks.
