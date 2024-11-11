
import java.util.Scanner;

public class YusufEfe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMerhabalar. Toplamlarını ve ortalamalarını bulabilmemiz için 5 sayı giriniz.");
        int sayi1, sayi2, sayi3, sayi4, sayi5;
        double ortalama, toplam;

        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3 = scanner.nextInt();

        System.out.println("Dördüncü sayıyı giriniz: ");
        sayi4 = scanner.nextInt();

        System.out.println("Beşinci sayıyı giriniz: ");
        sayi5 = scanner.nextInt();

        toplam = sayi1 + sayi2 + sayi3 + sayi4 + sayi5;
        ortalama = toplam/5;
        
        System.out.println("Girdiğiniz sayıların toplamı: "+toplam);
        System.out.println("Girdiğiniz sayıların ortalaması: "+ortalama);
    }
}
