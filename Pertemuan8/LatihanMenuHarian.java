package Pertemuan8;

public class LatihanMenuHarian {
    public static void main(String[] args) {
        // Variabel untuk menyimpan menu pagi dan siang
        String pagi, siang;
        System.out.println("=== MENU MAKAN 3 HARI ===");
        // Perulangan untuk menampilkan menu selama 3 hari
        for (int hari = 1; hari <= 3; hari++) {
            // Percabangan untuk menentukan menu berdasarkan hari
            switch (hari) {
                case 1:
                    pagi = "Nasi Goreng";
                    siang = "Soto Ayam";
                    break;
                case 2:
                    pagi = "Bubur Ayam";
                    siang = "Mie Goreng";
                    break;
                case 3:
                    pagi = "Roti Bakar";
                    siang = "Nasi Uduk";
                    break;
                default:
                    pagi = null;
                    siang = null;
                    break;
            }
            System.out.print("Hari " + hari + ":\n Pagi: " + pagi +"\n Siang: " + siang + "\n");
        }
    }
}
