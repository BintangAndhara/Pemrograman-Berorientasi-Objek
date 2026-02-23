package Pertemuan6;

public class LatihanRestoran {
    public static void main (String[] args) {
 // Kode menu yang dipilih dan jumlah pesanan
        int menuCode = 4, quantity, jumlah = 9, totalBayar;
        // Variabel untuk menyimpan nama menu
        String namaMenu;
        // Percabangan untuk menentukan menu dan harga satuan
        switch (menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                quantity = 15000; // harga satuan
                break;
            case 2:
                namaMenu = "Mie Ayam";
                quantity = 12000;
                break;
            case 3:
                namaMenu = "Bakso";
                quantity = 10000;
                break;
            case 4:
                namaMenu = "Soto Ayam";
                quantity = 13000;
                break;
            case 5:
                namaMenu = "Es Teh";
                quantity = 3000;
                break;
            default:
                namaMenu = null;
                quantity = 0;
                break;
        }
System.out.println("=== MENU RESTORAN ===");
System.out.println("Kode Menu: " + menuCode);
System.out.println("Jumlah: " + jumlah);
System.out.println();
System.out.println("Pesanan Anda:");
System.out.println("Nama Menu: " + namaMenu);
System.out.println("Harga Satuan: Rp " + quantity);
System.out.println("Jumlah: " + jumlah);
System.out.println("---");
  // Menghitung total pembayaran
totalBayar = quantity * jumlah;
System.out.println("Total Bayar: Rp " + totalBayar);


}


}
