# Laporan Program LatihanHariBulan

## Deskripsi Program

Program **LatihanHariBulan** dibuat untuk menentukan nama bulan sekaligus jumlah hari dalam bulan tersebut berdasarkan angka yang diinput.

Program ini menggunakan `switch-case` untuk mengelompokkan bulan yang memiliki jumlah hari sama (30 atau 31 hari), serta menangani Februari secara khusus.

---

## Penjelasan Variabel

Program menggunakan beberapa variabel berikut:

* **int month** → menyimpan angka bulan yang ingin dicek.
* **String namaBulan** → menyimpan nama bulan hasil konversi.
* **int hari** → menyimpan jumlah hari dalam bulan tersebut.

Pada contoh program, `month` diisi dengan nilai **2**, sehingga hasilnya adalah bulan Februari dengan 28 hari (tanpa perhitungan tahun kabisat).

---

## Konsep yang Digunakan

* **Switch-Case** → untuk menentukan nama bulan dan jumlah hari berdasarkan angka bulan.
* **Pengelompokan Case** → bulan dengan jumlah hari yang sama ditulis terpisah tetapi memiliki pola nilai yang sama.
* **Default Case** → menangani input di luar rentang 1–12.
* **If-Else** → untuk memastikan output hanya ditampilkan jika bulan valid.

---

## Alur Program

1. Program menentukan nilai `month`.
2. Struktur `switch` mencocokkan angka bulan dengan:

   * Bulan 31 hari
   * Bulan 30 hari
   * Februari (28 hari, tanpa kabisat)
3. Jika angka bulan valid:

   * Program menampilkan nama bulan dan jumlah harinya.
4. Jika tidak valid:

   * Program menampilkan pesan error.

---

## Output Program (Jika month = 2)

```id="hr4n2k"
Bulan: Februari (bulan ke-2)
Jumlah hari: 28 hari
```

---

## Kesimpulan

Program ini menunjukkan bagaimana `switch-case` dapat digunakan untuk menangani banyak kondisi dengan struktur yang lebih rapi dibandingkan `if-else` bertingkat.

Selain itu, program juga memperlihatkan bagaimana satu variabel bisa digunakan untuk menentukan lebih dari satu informasi (nama bulan dan jumlah hari). Konsep seperti ini sering dipakai dalam sistem kalender, penjadwalan, atau pengolahan data berbasis tanggal.
