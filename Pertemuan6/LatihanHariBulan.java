package Pertemuan6;

public class LatihanHariBulan {
    public static void main (String[] args) {
          // Menentukan bulan (contoh: 2 = Februari)
        int month = 2, hari;
        // Variabel untuk menyimpan nama bulan
        String namaBulan;
        // Percabangan untuk menentukan nama bulan dan jumlah hari
        switch (month) {

            // Bulan dengan 31 hari
            case 1:
                namaBulan = "Januari";
                hari = 31;
                break;
            case 3:
                namaBulan = "Maret";
                hari = 31;
                break;
            case 5:
                namaBulan = "Mei";
                hari = 31;
                break;
            case 7:
                namaBulan = "Juli";
                hari = 31;
                break;
            case 8:
                namaBulan = "Agustus";
                hari = 31;
                break;
            case 10:
                namaBulan = "Oktober";
                hari = 31;
                break;
            case 12:
                namaBulan = "Desember";
                hari = 31;
                break;

            // Bulan dengan 30 hari
            case 4:
                namaBulan = "April";
                hari = 30;
                break;
            case 6:
                namaBulan = "Juni";
                hari = 30;
                break;
            case 9:
                namaBulan = "September";
                hari = 30;
                break;
            case 11:
                namaBulan = "November";
                hari = 30;
                break;

            // Februari (tidak menghitung tahun kabisat)
            case 2:
                namaBulan = "Februari";
                hari = 28;
                break;

            // Jika angka bulan tidak valid
            default:
                namaBulan = null;
                hari = 0;
        }
      if (hari != 0) {
            System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
            System.out.println("Jumlah hari: " + hari + " hari");
        } else {
            System.out.println("Error: Angka bulan tidak valid (1-12)");
        }
      }
    }
