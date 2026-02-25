package Pertemuan8;

public class LatihanCariKelipatan {
    public static void main(String[] args) {
         // Perulangan dari 1 sampai 50
        for (int i = 1; i <= 50; i++) {
        // Menampilkan angka yang sedang dicek
        System.out.println("Cek: " + i);
        // Mengecek apakah angka merupakan kelipatan 7
        if (i % 7 == 0) {
            // Jika habis dibagi 7, tampilkan pesan
            System.out.print("✓ Kelipatan 7 pertama: " + i + "\nPencarian selesai");
            // Menghentikan perulangan setelah ditemukan
            break;
        }
    }
    }
}
