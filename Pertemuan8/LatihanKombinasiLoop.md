# Laporan Program LatihanKombinasiLoop

## Deskripsi Program

Program **LatihanKombinasiLoop** dibuat untuk mensimulasikan proses pencarian sebuah koordinat dalam bentuk grid menggunakan nested loop (perulangan bersarang).

Target yang dicari adalah koordinat **[2,3]** dalam rentang baris 1–3 dan kolom 1–5. Ketika koordinat ditemukan, program langsung menghentikan proses pencarian.

---

## Penjelasan Variabel

Program menggunakan beberapa komponen utama:

* **boolean pencarian** → sebagai penanda apakah koordinat sudah ditemukan atau belum.
* **int baris** → variabel kontrol untuk perulangan baris (1–3).
* **int kolom** → variabel kontrol untuk perulangan kolom (1–5).

Variabel `pencarian` digunakan agar kedua loop bisa dihentikan dengan rapi ketika target sudah ditemukan.

---

## Konsep yang Digunakan

* **Nested Loop (Perulangan Bersarang)** → `for` di dalam `for`, digunakan untuk merepresentasikan baris dan kolom.
* **Percabangan (if)** → untuk mengecek apakah koordinat sesuai target.
* **Operator Logika (&&)** → memastikan baris dan kolom sama dengan target secara bersamaan.
* **Break Statement** → untuk menghentikan loop ketika kondisi terpenuhi.
* **Boolean Flag** → digunakan untuk menghentikan loop luar setelah loop dalam dihentikan.

---

## Alur Program

1. Program menampilkan judul pencarian koordinat.
2. Loop pertama berjalan untuk baris (1–3).
3. Di dalamnya terdapat loop kedua untuk kolom (1–5).
4. Setiap kombinasi koordinat ditampilkan dengan format `[baris, kolom]`.
5. Program mengecek apakah koordinat sama dengan `[2,3]`.
6. Jika ditemukan:

   * Menampilkan pesan bahwa koordinat ditemukan.
   * Mengubah variabel `pencarian` menjadi `true`.
   * Menghentikan loop kolom dengan `break`.
7. Setelah keluar dari loop kolom, program mengecek nilai `pencarian`.
8. Jika `true`, loop baris juga dihentikan.

---

## Output Program

```id="pl9x2s"
=== PENCARIAN KOORDINAT [2,3] ===
Cek: [1,1]
Cek: [1,2]
Cek: [1,3]
Cek: [1,4]
Cek: [1,5]
Cek: [2,1]
Cek: [2,2]
Cek: [2,3]
✓ Koordinat ditemukan!
Pencarian selesai.
```

---

## Kesimpulan

Program ini memperlihatkan bagaimana nested loop bisa digunakan untuk merepresentasikan struktur dua dimensi seperti matriks atau koordinat.

Penggunaan boolean flag dan `break` membuat pencarian lebih efisien karena program langsung berhenti setelah target ditemukan. Konsep ini sering digunakan dalam pencarian data pada array 2 dimensi, tabel, atau sistem berbasis grid.
