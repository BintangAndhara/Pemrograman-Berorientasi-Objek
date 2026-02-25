package Pertemuan8;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
    boolean pencarian = false; // Penanda apakah koordinat sudah ditemukan
    System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
    // Perulangan baris dari 1 sampai 3
    for (int baris = 1; baris <= 3; baris++) {
    // Perulangan kolom dari 1 sampai 5
    for (int kolom = 1; kolom <= 5; kolom++) {
        // Menampilkan koordinat yang sedang dicek
        System.out.println("Cek: [" + baris + "," + kolom + "]");
        // Mengecek apakah koordinat sesuai target (2,3)
        if (baris == 2 && kolom == 3) {
            System.out.print("✓ Koordinat ditemukan!\nPencarian selesai.");
            // Mengubah status menjadi true karena sudah ditemukan
            pencarian = true;
            // Keluar dari loop kolom
            break;
        }
    }
    // Jika sudah ditemukan, hentikan juga loop baris
    if (pencarian == true) {
        break;
      }
    }
  }
}
