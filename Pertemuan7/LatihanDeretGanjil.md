# Laporan Program LatihanDeretGanjil

## Deskripsi Program

Program **LatihanDeretGanjil** dibuat untuk menampilkan deret bilangan ganjil dari 1 sampai 15 menggunakan perulangan `while` pada Java. Program ini fokus pada konsep dasar looping dan manipulasi nilai variabel agar menghasilkan pola tertentu.

## Penjelasan Variabel

Program menggunakan satu variabel utama, yaitu:

* **int angka** → digunakan untuk menyimpan nilai awal deret dan sebagai pengontrol perulangan.

Variabel `angka` diinisialisasi dengan nilai **1** karena 1 merupakan bilangan ganjil pertama dalam rentang yang ingin ditampilkan.

## Konsep yang Digunakan

* **while loop** → digunakan untuk melakukan perulangan selama kondisi bernilai `true`.
* **Operator penjumlahan (`+=`)** → digunakan untuk menambah nilai sebesar 2 agar tetap menghasilkan bilangan ganjil berikutnya.
* **System.out.print()** → digunakan untuk menampilkan output dalam satu baris.

## Alur Program

1. Program menginisialisasi variabel `angka` dengan nilai 1.
2. Program menampilkan judul "BILANGAN GANJIL 1-15".
3. Program menjalankan perulangan `while` selama nilai `angka` kurang dari atau sama dengan 15.
4. Setiap iterasi:

   * Nilai `angka` ditampilkan ke layar.
   * Nilai `angka` ditambah 2 agar langsung menuju bilangan ganjil berikutnya.
5. Perulangan berhenti ketika nilai `angka` sudah lebih dari 15.

## Output Program

Program akan menampilkan deret bilangan ganjil sebagai berikut:

```
=== BILANGAN GANJIL 1-15 ===
1 3 5 7 9 11 13 15
```

## Kesimpulan

Program ini melatih pemahaman dasar tentang struktur perulangan `while` dan bagaimana mengontrol jalannya loop menggunakan variabel penghitung. Konsep seperti ini sering dipakai dalam pembuatan pola angka, filtering data, maupun logika perulangan lainnya dalam pemrograman.
