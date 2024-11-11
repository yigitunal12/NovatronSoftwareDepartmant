import java.util.Scanner;

public class YusufEfe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.println("\nMerhabalar. Negatif mi yoksa pozitif mi olduğunu bulmak için bir sayı giriniz: ");
        sayi = scanner.nextInt();

        if (sayi>0) {
            System.out.println("Girdiğiniz sayı pozitif.");
        }
        else if (sayi<0) {
            System.out.println("Girdiğiniz sayı negatif.");
        } 
        else {
            System.out.println("Girdiğiniz sayı sıfırdır.");
        }        
    }
}
