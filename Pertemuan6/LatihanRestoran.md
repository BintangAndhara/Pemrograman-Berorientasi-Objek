# Laporan Program LatihanRestoran

## Deskripsi Program

Program **LatihanRestoran** dibuat untuk mensimulasikan sistem pemesanan menu sederhana di restoran menggunakan `switch-case`.

Program akan menentukan nama menu dan harga satuan berdasarkan kode menu yang dipilih, kemudian menghitung total pembayaran sesuai jumlah pesanan.

---

## Penjelasan Variabel

Program menggunakan beberapa variabel berikut:

* **int menuCode** → menyimpan kode menu yang dipilih.
* **int quantity** → menyimpan harga satuan menu (berdasarkan kode).
* **int jumlah** → menyimpan jumlah pesanan.
* **int totalBayar** → menyimpan total pembayaran (harga × jumlah).
* **String namaMenu** → menyimpan nama menu sesuai kode.

Pada contoh program:

* `menuCode = 4` → berarti memilih **Soto Ayam**
* `jumlah = 9` → jumlah pesanan sebanyak 9 porsi

---

## Konsep yang Digunakan

* **Switch-Case** → untuk menentukan nama menu dan harga berdasarkan kode.
* **Break** → mencegah eksekusi berlanjut ke case berikutnya.
* **Operasi Perkalian (`*`)** → untuk menghitung total bayar.
* **Default Case** → menangani jika kode menu tidak valid.

---

## Alur Program

1. Program menentukan kode menu dan jumlah pesanan.
2. `switch` digunakan untuk mencari nama menu dan harga satuan sesuai kode.
3. Program menampilkan detail pesanan (kode, nama menu, harga, dan jumlah).
4. Program menghitung total pembayaran dengan rumus:

   ```
   totalBayar = quantity × jumlah
   ```
5. Total pembayaran ditampilkan ke layar.

---

## Output Program (Jika menuCode = 4 dan jumlah = 9)

```id="rs7k3m"
=== MENU RESTORAN ===
Kode Menu: 4
Jumlah: 9

Pesanan Anda:
Nama Menu: Soto Ayam
Harga Satuan: Rp 13000
Jumlah: 9
---
Total Bayar: Rp 117000
```

---

## Kesimpulan

Program ini menunjukkan penerapan `switch-case` dalam simulasi sistem pemesanan sederhana. Konsep seperti ini sering digunakan dalam sistem kasir, aplikasi pemesanan makanan, atau sistem POS sederhana.

Latihan ini juga memperkuat pemahaman tentang pemilihan kondisi, pengolahan data numerik, dan perhitungan total dalam satu alur program.
