import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int x = 1;
        int y = x;
        int z;

        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisi için terim sayısını giriniz: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 1) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            System.exit(0);
        }
        
        System.out.println(x);

        if (n > 1) {
            for (int i = 0; i < n-1; i++) {
                z = x + y; 

                System.out.println(z);

                x = y;
                y = z;
            }
        }
    }
}
