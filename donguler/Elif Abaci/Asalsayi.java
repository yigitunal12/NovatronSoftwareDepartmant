import java.util.Scanner;

public class Asalsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           
           System.out.print("Bir sayi giriniz: ");
           int sayi = scanner.nextInt();
           
           boolean asal = true;
           
           if (sayi <= 1) {
               asal = false;
           } else {
               for (int i = 2; i <= sayi / 2; i++) {
                   if (sayi % i == 0) {
                       asal = false;
                       break;
                   }
               }
           }
           
           if (asal) {
               System.out.println(sayi + " bir asal sayidir.");
           } else {
               System.out.println(sayi + " bir asal sayi degildir.");
           }
           
           scanner.close();
    }
}
