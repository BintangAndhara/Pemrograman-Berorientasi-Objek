package Pertemuan7;

public class LatihanValidasi {
    public static void main(String[] args) {
    int nilai = -10;        // Nilai awal (simulasi input pertama)
int perulangan = 1;     // Penanda jumlah percobaan

// Perulangan do-while untuk simulasi 3 kali input
do {

    // Mengganti nilai sesuai percobaan ke-2 dan ke-3
    if (perulangan == 2) {
        nilai = 150;    // Simulasi input kedua (tidak valid)
    } else if (perulangan == 3) {
        nilai = 85;     // Simulasi input ketiga (valid)
    }

    // Menampilkan nilai yang diinput
    System.out.println("Percobaan input: " + nilai);

    // Validasi nilai harus antara 0 sampai 100
    if (nilai >= 0 && nilai <= 100) {
        System.out.println("✓ Nilai valid: " + nilai);
    } else {
        System.out.println("Error: Nilai harus antara 0-100!");
    }

    // Menambah counter percobaan
    perulangan++;
    System.out.println();

} while (perulangan <= 3); // Berhenti setelah 3 percobaan
    }
}
