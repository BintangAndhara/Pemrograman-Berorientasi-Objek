package Pertemuan6;

public class LatihanBulan {
    public static void main (String[] args) {
  
        // Menentukan angka bulan
        int month = 12;

        // Variabel untuk menyimpan nama bulan
        String namaBulan;

        System.out.println("=== KONVERSI BULAN ===");

        // Percabangan untuk mengubah angka menjadi nama bulan
        switch (month) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;

            // Jika angka tidak sesuai 1–12
            default:
                namaBulan = null;
                break;
        }
    System.out.println("Angka Bulan: " + month);
    if (namaBulan != null){
        System.out.println("Nama Bulan: " + namaBulan);
} else {
    System.out.println("Error: Angka bulan tidak valid (1-12)");
}

    }
}
