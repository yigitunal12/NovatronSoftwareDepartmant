import java.util.Scanner;

public class Faktoriyel {
    static int factorial(int x) {
        return (x == 1) ? 1 : x * factorial(x-1);
    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayınız giriniz: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(factorial(n));      
    }
}
