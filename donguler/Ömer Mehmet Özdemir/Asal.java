import java.util.Scanner;

public class Asal {
    static Boolean isPrime(int x) {
        int n = 0;

        if (x < 2) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                n += 1;
            }
        }

        return (n == 0) ? true : false;
    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int x = sc.nextInt();
        sc.close();
        
        if (isPrime(x) == true) {
            System.out.println("Asal sayıdır.");
        }
        else {
            System.out.println("Asal sayı değildir.");
        }
    }
}