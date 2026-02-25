# Laporan Program LatihanCariKelipatan

## Deskripsi Program

Program **LatihanCariKelipatan** dibuat untuk mencari kelipatan 7 pertama dalam rentang angka 1 sampai 50 menggunakan perulangan `for`.

Program ini tidak hanya mencari angka yang memenuhi kondisi, tetapi juga langsung menghentikan proses pencarian setelah kelipatan pertama ditemukan dengan menggunakan `break`.

---

## Penjelasan Variabel

Program menggunakan satu variabel utama:

* **int i** → sebagai variabel kontrol perulangan yang berjalan dari 1 sampai 50.

Variabel ini juga digunakan untuk mengecek apakah suatu angka merupakan kelipatan 7.

---

## Konsep yang Digunakan

* **For Loop** → digunakan karena batas perulangan sudah jelas (1–50).
* **Operator Modulus (%)** → digunakan untuk mengecek apakah suatu angka habis dibagi 7.
* **Percabangan (if)** → untuk menentukan apakah angka termasuk kelipatan 7.
* **Break Statement** → untuk menghentikan perulangan setelah kondisi terpenuhi.

---

## Alur Program

1. Program menjalankan perulangan dari angka 1 sampai 50.
2. Setiap angka yang dicek ditampilkan ke layar dengan format `Cek: i`.
3. Program mengecek apakah `i % 7 == 0`.
4. Jika kondisi terpenuhi:

   * Program menampilkan bahwa angka tersebut adalah kelipatan 7 pertama.
   * Program menghentikan perulangan menggunakan `break`.
5. Jika belum memenuhi kondisi, perulangan tetap berjalan sampai menemukan angka yang sesuai.

---

## Output Program

```id="kq3m91"
Cek: 1
Cek: 2
Cek: 3
Cek: 4
Cek: 5
Cek: 6
Cek: 7
✓ Kelipatan 7 pertama: 7
Pencarian selesai
```

---

## Kesimpulan

Program ini menunjukkan cara menggabungkan perulangan, percabangan, dan `break` untuk membuat proses pencarian lebih efisien.

Daripada mengecek sampai angka 50, program langsung berhenti ketika kelipatan pertama ditemukan. Konsep seperti ini sering dipakai dalam proses pencarian data agar program tidak melakukan iterasi yang tidak perlu.
