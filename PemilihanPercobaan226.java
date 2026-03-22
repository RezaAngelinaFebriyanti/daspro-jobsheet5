import java.util.Scanner;

public class PemilihanPercobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.println("Nilai uas : ");
        float uas = input26.nextFloat();
        System.out.println("Nilai uts : ");
        float uts = input26.nextFloat();
        System.out.println("Niali kuis : ");
        float kuis = input26.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input26.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
        
    }
}