import java.util.Scanner;

public class odev_ters_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int ters = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;
            ters = ters * 10 + basamak;
            sayi = sayi / 10;
        }

        System.out.println("Sayının tersten yazılışı: " + ters);
    }
}
