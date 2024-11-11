import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class odev_faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sayınızı giriniz:");
        int n = input.nextInt();

        long faktoriyel = 1;

        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        System.out.println(faktoriyel);
    }
}
