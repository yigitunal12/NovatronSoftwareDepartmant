import java.util.Scanner;

public class Ters {
    public static void main(String[] args) throws Exception {
        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x = Math.abs(sc.nextInt());
        sc.close();

        for (; x != 0; x /= 10) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println(reverse);
    }
}