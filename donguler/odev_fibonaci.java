import java.util.Scanner;

public class odev_fibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Terim sayısı giriniz:");
        int terimsayi = input.nextInt();

        long a = 0, b = 1;

        System.out.println("işte fibonaci seriniz");
        for (int i = 1; i <= terimsayi; i++) {
            System.out.print(a + " ");
            long siradakiterim = a + b;
            a = b;
            b = siradakiterim;
        }

    }
}
