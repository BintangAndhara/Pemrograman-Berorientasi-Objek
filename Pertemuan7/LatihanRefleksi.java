package Pertemuan7;

public class LatihanRefleksi {
    public static void main(String[] args) {
    int angka = 1;

    System.out.println("=== MENGGUNAKAN WHILE ===");
    // While loop: kondisi dicek di awal, cocok saat jumlah perulangan belum pasti
    while (angka <= 5) {
        System.out.print(angka + " ");
        angka++;
    }

    System.out.println();
    System.out.println();

    angka = 1;

    System.out.println("=== MENGGUNAKAN DO-WHILE ===");
    // Do-while: minimal dijalankan 1 kali karena pengecekan kondisi di akhir
    do {
        System.out.print(angka + " ");
        angka++;
    } while (angka <= 5);

    System.out.println();
    System.out.println();

    angka = 1;

    System.out.println("=== MENGGUNAKAN FOR ===");
    // For loop: jumlah perulangan sudah jelas dari awal (1-5)
    for (int i = 1; i <= 5; i++) {
        System.out.print(i + " ");
    }

    /*
     Menurut saya, untuk kasus ini for loop paling mudah dipahami.
     Karena batas awal, kondisi, dan increment langsung ditulis dalam satu baris.
     Lebih ringkas, hemat penulisan kode, dan enak dibaca.
     Kalau jumlah perulangannya sudah jelas seperti 1 sampai 5,
     for loop jadi pilihan yang paling simpel.
     */
    }
}
