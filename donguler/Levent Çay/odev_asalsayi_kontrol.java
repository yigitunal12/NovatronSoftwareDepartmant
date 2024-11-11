import java.util.Scanner;

public class odev_asalsayi_kontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();

        int kontrol_sayisi = 2;
        int sorgu = 1;

        while (kontrol_sayisi < sayi && sorgu == 1) {
            if (sayi % kontrol_sayisi != 0) {
                kontrol_sayisi += 1;
            } else {
                System.out.println("Girdiğiniz değer asal sayı değildir.");
                sorgu = 0;
                break;
            }
        }

        if (sorgu == 1) {
            System.out.println("Girdiğiniz değer asal sayıdır.");
        }
    }
}
