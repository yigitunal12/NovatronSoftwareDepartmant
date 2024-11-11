import java.util.Scanner;

public class Rakamlartoplami {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;

        while (sayi > 0) {
            int basamaksayi = sayi % 10;
            toplam += basamaksayi;
            sayi = sayi / 10;
        }
        
        System.out.println("Sayinin basamaklarindaki rakamlarin toplami: " + toplam);
        
        scanner.close();
 }
}