import java.util.Scanner;

public class Faktoriyel {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Bir sayi giriniz: ");
    
    int sayi = scanner.nextInt();
    
    long faktoriyel =1;
    
    if (sayi<0){
      System.out.println("Negatif sayilar icin faktoriyel hesaplanamaz.");
    } else {
        for (int i = 1; i <= sayi; i++) {
          faktoriyel *= i;
        }
        System.out.println(sayi + "! = " + faktoriyel);
     }
      scanner.close();
 }
}