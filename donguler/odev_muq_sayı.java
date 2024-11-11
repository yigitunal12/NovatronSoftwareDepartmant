import java.util.Scanner;

public class odev_muq_sayı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");
        int sayi = input.nextInt();

        int toplamdeger = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplamdeger += i;
            }

        }

        if (toplamdeger == sayi) {
            System.out.println("girdiğiniz sayı mükemmel sayıdır.");
        } else {
            System.out.println("girdiğiniz sayı mükemmel sayı değildir.");
        }

    }

}