package Pertemuan3;

public class  LatihPerhitungan {
    public static void main (String[] args) {
      int saldo = 1000000, SaldoAkhir; 
// Deklarasi saldo awal dan variabel untuk menyimpan saldo akhir

System.out.println("Saldo Awal             : " + saldo);
// Menampilkan saldo awal

int setoran = 500000; 
// Nominal uang yang disetor

System.out.println("Setoran                : " + setoran);
// Menampilkan jumlah setoran

SaldoAkhir = saldo + setoran; 
// Menghitung saldo setelah ditambah setoran

System.out.println("Saldo Setelah Setor    : " + SaldoAkhir);
// Menampilkan saldo setelah setor

int penarikan = 250000; 
// Nominal uang yang ditarik

System.out.println("Penarikan              : " + penarikan);
// Menampilkan jumlah penarikan

SaldoAkhir = SaldoAkhir - penarikan; 
// Mengurangi saldo dengan jumlah penarikan

System.out.println("Saldo Akhir            : " + SaldoAkhir);
// Menampilkan saldo akhir setelah semua transaksi

    }
}
//Nama : Bintang Andhara Putra
//Nim : D1041241051
//Hari/tangggal : Kamis,5 Febuari 2026