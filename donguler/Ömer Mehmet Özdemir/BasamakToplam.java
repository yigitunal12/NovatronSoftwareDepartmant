import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int remainder;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x = Math.abs(sc.nextInt());
        sc.close();

        while (x > 0) {
            remainder = x % 10;
            sum += remainder;
            x /= 10;
        }

        System.out.println(sum);
    }
}