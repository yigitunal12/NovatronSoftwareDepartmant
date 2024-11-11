import java.util.Scanner;

public class Fibonacci {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Fibonacci serisi için terim sayisini giriniz: ");
    int terimler = scanner.nextInt();
    
    int ilk = 0, ikinci = 1;
    
    if (terimler == 1) {
        System.out.println(ilk);
    } else if (terimler == 2) {
    } else {
        System.out.print(ilk + " " + ikinci);
        
        for (int i = 3; i <= terimler; i++) {
            System.out.print(" " + (ilk + ikinci));
            
            ikinci = ilk + ikinci;
            ilk = ikinci - ilk;
        }
    }
    scanner.close();
 }
 }