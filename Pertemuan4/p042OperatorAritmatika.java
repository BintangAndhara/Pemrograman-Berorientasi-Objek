package Pertemuan4;

public class p042OperatorAritmatika {
public static void main(String[] args) {
int a = 10; 
// Deklarasi variabel a dengan nilai 10
int b = 3;  
// Deklarasi variabel b dengan nilai 3
System.out.println("a = " + a);// Menampilkan nilai a
System.out.println("b = " + b);// Menampilkan nilai b
System.out.println();
System.out.println("a + b = " + (a + b)); // Operasi Pertambahan
System.out.println("a - b = " + (a - b)); // Operasi Pengurangan
System.out.println("a * b = " + (a * b)); // Operasi Perkalian
System.out.println("a / b = " + (a / b)); // Operasi Pembagian
System.out.println("a % b = " + (a % b)); // Operasi Modulus
// Pembagian dengan desimal
double hasil = (double) a / b;
System.out.println("a / b (desimal) = " + hasil);
}
}