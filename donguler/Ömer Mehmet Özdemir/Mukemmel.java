import java.util.Scanner;

public class Mukemmel {
    public static void main(String[] args) throws Exception {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int x = sc.nextInt();
        sc.close();

        for (int i = 1; i <= x/2; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        if (sum == x) {
            System.out.println("Mükemmel sayıdır.");
        }
        else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }
}