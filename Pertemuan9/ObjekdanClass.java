package Pertemuan9;
 public class ObjekdanClass {
    static class Mobil {
        String merk;
        String warna;
        int tahun;
        int kecepatan;
    }
        public static void main(String[] args) {
        Mobil mobils = new Mobil();
        mobils.merk = "Lamborghini";
        mobils.warna = "Biru";
        mobils.tahun = 2026;
        mobils.kecepatan = 500;

        System.out.println("Mobil: " + mobils.merk);
        System.out.println("Warna: " + mobils.warna);
        System.out.println("Tahun: " + mobils.tahun);
        System.out.println("Kecepatan: " + mobils.kecepatan);
    }
}
