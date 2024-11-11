import java.util.Scanner;

public class Mukemmelsayi {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        
        if (toplam == sayi) {
            System.out.println(sayi + " bir mukemmel sayidir.");
        } else {
            System.out.println(sayi + " bir mukemmel sayi degildir.");
        }
        
        scanner.close();
 }
}