import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class odev_basmaktoplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;

        while (sayi > 0) {
            int basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;

        }
        System.out.println(toplam);
    }
}
