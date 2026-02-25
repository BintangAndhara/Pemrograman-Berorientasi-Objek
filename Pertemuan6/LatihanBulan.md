# Laporan Program LatihanBulan

## Deskripsi Program

Program **LatihanBulan** dibuat untuk mengonversi angka bulan (1–12) menjadi nama bulan menggunakan percabangan `switch-case` dalam Java.

Program ini mensimulasikan proses mapping dari data numerik ke bentuk teks yang lebih informatif.

---

## Penjelasan Variabel

Program menggunakan beberapa variabel berikut:

* **int month** → menyimpan angka bulan yang akan dikonversi.
* **String namaBulan** → menyimpan hasil konversi angka menjadi nama bulan.

Variabel `month` diisi dengan nilai 12 sebagai contoh, yang seharusnya menghasilkan output "Desember".

---

## Konsep yang Digunakan

* **Switch-Case** → digunakan untuk memilih nama bulan berdasarkan angka.
* **Break** → berfungsi untuk menghentikan eksekusi setiap case agar tidak terjadi fall-through.
* **If-Else** → digunakan untuk mengecek apakah hasil konversi valid atau tidak.
* **Null Checking** → untuk menangani input di luar rentang 1–12.

---

## Alur Program

1. Program menentukan nilai `month`.
2. Program menampilkan judul "KONVERSI BULAN".
3. Struktur `switch` digunakan untuk mencocokkan angka bulan dengan nama bulan yang sesuai.
4. Jika angka tidak berada dalam rentang 1–12, maka `namaBulan` akan bernilai `null`.
5. Program menampilkan angka bulan.
6. Jika `namaBulan` tidak `null`, maka nama bulan ditampilkan.
7. Jika `null`, maka muncul pesan error.

---

## Catatan Penting

Pada bagian `case 2` tidak terdapat `break`, sehingga ketika `month = 2`, program akan langsung lanjut ke `case 3` (fall-through) dan menghasilkan "Maret".

Hal ini menunjukkan pentingnya penggunaan `break` pada setiap case agar hasil sesuai dengan yang diharapkan.

---

## Output Program (Jika month = 12)

```id="lb9x4p"
=== KONVERSI BULAN ===
Angka Bulan: 12
Nama Bulan: Desember
```

---

## Kesimpulan

Program ini melatih pemahaman tentang penggunaan `switch-case` untuk konversi nilai dan pentingnya penggunaan `break` agar tidak terjadi kesalahan logika.

Konsep seperti ini sering digunakan dalam sistem yang membutuhkan pengubahan kode numerik menjadi informasi teks, seperti konversi bulan, hari, status, atau kategori tertentu.
