# Laporan Program LatihanRefleksi

## Deskripsi Program

Program **LatihanRefleksi** dibuat untuk membandingkan tiga jenis perulangan dalam Java, yaitu `while`, `do-while`, dan `for`. Ketiganya digunakan untuk menampilkan angka dari 1 sampai 5, tetapi dengan struktur penulisan dan mekanisme pengecekan kondisi yang berbeda.

Program ini bertujuan agar bisa melihat secara langsung perbedaan konsep dari masing-masing loop walaupun output yang dihasilkan sama.

---

## Konsep Perulangan yang Digunakan

### 1️⃣ While Loop

* Kondisi dicek di awal sebelum blok kode dijalankan.
* Perulangan hanya berjalan jika kondisi bernilai `true`.
* Cocok digunakan ketika jumlah perulangan belum pasti dan bergantung pada kondisi tertentu.

### 2️⃣ Do-While Loop

* Blok kode dijalankan terlebih dahulu, kemudian kondisi dicek di akhir.
* Minimal pasti berjalan satu kali walaupun kondisi bernilai `false`.
* Biasanya dipakai untuk validasi input atau proses yang memang harus dieksekusi setidaknya sekali.

### 3️⃣ For Loop

* Inisialisasi, kondisi, dan increment ditulis dalam satu baris.
* Cocok digunakan ketika jumlah perulangan sudah jelas dari awal.
* Lebih ringkas dan mudah dibaca untuk perulangan terstruktur.

---

## Alur Program

1. Variabel `angka` diinisialisasi dengan nilai 1.
2. Program menjalankan perulangan `while` untuk menampilkan angka 1–5.
3. Variabel di-reset kembali ke 1.
4. Program menjalankan perulangan `do-while` untuk menampilkan angka 1–5.
5. Variabel kembali di-reset.
6. Program menjalankan perulangan `for` untuk menampilkan angka 1–5.
7. Di akhir program terdapat komentar refleksi mengenai loop yang paling mudah dipahami.

---

## Output Program

```
=== MENGGUNAKAN WHILE ===
1 2 3 4 5

=== MENGGUNAKAN DO-WHILE ===
1 2 3 4 5

=== MENGGUNAKAN FOR ===
1 2 3 4 5
```

---

## Kesimpulan

Walaupun ketiga jenis perulangan menghasilkan output yang sama, cara kerjanya berbeda.

Untuk kasus dengan jumlah perulangan yang sudah jelas (seperti 1 sampai 5), `for` loop lebih ringkas dan mudah dipahami karena semua kontrol perulangan ditulis dalam satu baris.

Sedangkan `while` dan `do-while` lebih fleksibel jika digunakan pada kondisi yang belum pasti atau berbasis validasi.
