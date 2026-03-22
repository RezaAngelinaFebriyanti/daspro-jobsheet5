import java.util.Scanner;

public class PemilihanPercobaan126 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input26.nextInt();

        String hasil;
        if (angka % 2 == 0)
        System.out.println("Angka "+angka+" bilangan genap");
        else
        System.out.println("Angka "+angka+" bilangan ganjil");
        
    }
}
