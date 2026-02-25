# Laporan Program LatihanMenuHarian

## Deskripsi Program

Program **LatihanMenuHarian** dibuat untuk menampilkan daftar menu makan selama 3 hari menggunakan kombinasi perulangan `for` dan percabangan `switch-case`.

Program ini mensimulasikan pemilihan menu berdasarkan nomor hari, lalu menampilkannya dalam format yang terstruktur.

---

## Penjelasan Variabel

Program menggunakan dua variabel bertipe `String`, yaitu:

* **pagi** → menyimpan menu sarapan.
* **siang** → menyimpan menu makan siang.

Selain itu, terdapat variabel:

* **int hari** → sebagai variabel kontrol dalam perulangan dari hari ke-1 sampai hari ke-3.

---

## Konsep yang Digunakan

* **For Loop** → digunakan untuk mengulang proses sebanyak 3 kali (3 hari).
* **Switch-Case** → digunakan untuk menentukan menu berdasarkan nilai variabel `hari`.
* **Break** → untuk menghentikan eksekusi pada setiap case agar tidak masuk ke case berikutnya.
* **System.out.print()** → untuk menampilkan output dengan format yang rapi.

---

## Alur Program

1. Program menampilkan judul "MENU MAKAN 3 HARI".
2. Program menjalankan perulangan dari hari ke-1 sampai hari ke-3.
3. Pada setiap iterasi:

   * `switch` akan menentukan menu pagi dan siang sesuai nomor hari.
4. Setelah menu ditentukan, program menampilkan daftar menu untuk hari tersebut.
5. Proses berulang sampai hari ke-3 selesai ditampilkan.

---

## Output Program

```id="mn2x7q"
=== MENU MAKAN 3 HARI ===
Hari 1:
 Pagi: Nasi Goreng
 Siang: Soto Ayam
Hari 2:
 Pagi: Bubur Ayam
 Siang: Mie Goreng
Hari 3:
 Pagi: Roti Bakar
 Siang: Nasi Uduk
```

---

## Kesimpulan

Program ini menunjukkan bagaimana perulangan dan percabangan bisa digabungkan untuk menghasilkan output yang dinamis berdasarkan kondisi tertentu.

Penggunaan `switch-case` cocok ketika pilihan kondisi sudah jelas dan terbatas, seperti nomor hari atau kode tertentu. Latihan ini membantu memahami struktur kontrol program sebelum masuk ke studi kasus yang lebih kompleks seperti sistem menu atau manajemen data berbasis pilihan.
