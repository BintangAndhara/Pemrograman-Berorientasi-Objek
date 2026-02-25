# Laporan Program LatihanValidasi

## Deskripsi Program

Program **LatihanValidasi** dibuat untuk mensimulasikan proses validasi nilai menggunakan perulangan `do-while` dalam Java. Program ini mengecek apakah nilai yang diinput berada pada rentang **0 sampai 100**.

Karena ini latihan, input tidak menggunakan `Scanner`, tetapi disimulasikan langsung melalui perubahan nilai pada setiap percobaan.

---

## Penjelasan Variabel

Program menggunakan dua variabel utama:

* **int nilai** → menyimpan nilai yang akan divalidasi.
* **int perulangan** → berfungsi sebagai penghitung jumlah percobaan input.

Nilai awal diset ke `-10` sebagai simulasi input pertama yang tidak valid.

---

## Konsep yang Digunakan

* **Do-While Loop** → digunakan untuk mensimulasikan proses input yang minimal dijalankan satu kali.
* **Percabangan (if-else)** → digunakan untuk:

  * Mengganti nilai sesuai percobaan.
  * Mengecek apakah nilai valid atau tidak.
* **Operator Logika (&&)** → memastikan nilai berada dalam rentang 0 sampai 100.

---

## Alur Program

1. Program menginisialisasi `nilai = -10` dan `perulangan = 1`.
2. Program masuk ke blok `do-while`.
3. Pada setiap percobaan:

   * Jika percobaan ke-2, nilai diganti menjadi 150.
   * Jika percobaan ke-3, nilai diganti menjadi 85.
4. Program menampilkan nilai yang sedang diuji.
5. Program melakukan validasi:

   * Jika 0 ≤ nilai ≤ 100 → tampilkan pesan valid.
   * Jika tidak → tampilkan pesan error.
6. Variabel `perulangan` ditambah 1.
7. Perulangan berhenti setelah 3 kali percobaan.

---

## Output Program

```
Percobaan input: -10
Error: Nilai harus antara 0-100!

Percobaan input: 150
Error: Nilai harus antara 0-100!

Percobaan input: 85
✓ Nilai valid: 85
```

---

## Kesimpulan

Program ini menunjukkan bagaimana proses validasi data bisa dilakukan menggunakan kombinasi perulangan dan percabangan.

Penggunaan `do-while` cocok untuk kasus validasi karena program tetap berjalan minimal satu kali sebelum pengecekan kondisi dilakukan. Konsep seperti ini sering digunakan dalam sistem input nilai, form pendaftaran, maupun validasi data lainnya dalam aplikasi nyata.
