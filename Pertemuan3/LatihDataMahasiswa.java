package Pertemuan3;

public class LatihDataMahasiswa {
        public static void main (String[] args) {
        long nim = 2301010001L; 
        // NIM menggunakan tipe long karena angkanya besar (huruf L wajib di akhir)

        String nama = "Budi Santoso"; 
        // Nama mahasiswa bertipe String (teks)

        char kelas = 'A'; 
        // Kelas menggunakan tipe char karena hanya satu karakter

        boolean status = true; 
        // Status aktif atau tidak (true = aktif, false = tidak aktif)

        double ipk = 3.75; 
        // IPK menggunakan double karena memiliki angka desimal

        int sks = 72; 
        // Total SKS menggunakan tipe int karena berupa bilangan bulat

        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NIM               : " + nim);
        System.out.println("NAMA              : " + nama);
        System.out.println("KELAS             : " + kelas);
        System.out.println("Status Aktif      : " + status);
        System.out.println("IPK Semester      : " +  ipk);
        System.out.println("Total SKS         : " + sks);

    }
}
//Nama : Bintang Andhara Putra
//Nim : D1041241051
//Hari/tangggal : Kamis,5 Febuari 2026