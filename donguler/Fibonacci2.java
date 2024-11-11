import java.util.Scanner;
public class Fibonacci2 {
    public static void main(String[] args) {
        int a = 1; 
        int b = 1;
        
        System.out.println(a);   
        System.out.println(b);         
        
        while (a + b < 720) { 
            a = a + b;
            System.out.println(a);
            b = a + b;
            System.out.println(b);
        }
    }
}
