# Laporan Program LatihanTotalGenap

## Deskripsi Program

Program **LatihanTotalGenap** dibuat untuk menghitung total (penjumlahan) bilangan genap dari angka 1 sampai 20 menggunakan perulangan `for`.

Program ini juga menampilkan proses penjumlahan secara bertahap, sehingga bisa terlihat bagaimana nilai total bertambah setiap menemukan angka genap.

---

## Penjelasan Variabel

Program menggunakan dua variabel utama:

* **int total** → menyimpan hasil akumulasi penjumlahan bilangan genap.
* **int i** → variabel kontrol dalam perulangan dari 1 sampai 20.

Variabel `total` diinisialisasi dengan nilai 0 karena akan digunakan untuk menjumlahkan angka secara bertahap.

---

## Konsep yang Digunakan

* **For Loop** → digunakan untuk melakukan perulangan dari 1 sampai 20.
* **Operator Modulus (%)** → digunakan untuk mengecek apakah angka genap (`i % 2 == 0`).
* **Continue** → digunakan untuk melewati angka yang bukan bilangan genap.
* **Operator Assignment (+=)** → digunakan untuk menambahkan nilai ke variabel `total`.

---

## Alur Program

1. Program menampilkan judul "TOTAL BILANGAN GENAP 1-20".
2. Perulangan berjalan dari angka 1 sampai 20.
3. Pada setiap iterasi:

   * Jika angka ganjil (`i % 2 != 0`), maka program melewati proses dan lanjut ke angka berikutnya.
   * Jika angka genap, maka angka tersebut ditambahkan ke variabel `total`.
4. Program menampilkan proses penambahan dan nilai total sementara.
5. Setelah perulangan selesai, program menampilkan total akhir.

---

## Output Program

```id="vg8p1t"
=== TOTAL BILANGAN GENAP 1-20 ===
Tambah: 2 → Total: 2
Tambah: 4 → Total: 6
Tambah: 6 → Total: 12
Tambah: 8 → Total: 20
Tambah: 10 → Total: 30
Tambah: 12 → Total: 42
Tambah: 14 → Total: 56
Tambah: 16 → Total: 72
Tambah: 18 → Total: 90
Tambah: 20 → Total: 110
Total Akhir: 110
```

---

## Kesimpulan

Program ini menunjukkan cara melakukan filtering dalam perulangan menggunakan `continue`, serta bagaimana konsep akumulasi nilai bekerja dalam pemrograman.

Teknik seperti ini sering digunakan dalam pengolahan data, misalnya menghitung total transaksi tertentu, menjumlahkan data dengan kriteria khusus, atau melakukan perhitungan statistik sederhana.
