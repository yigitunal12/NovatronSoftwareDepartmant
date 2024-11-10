import java.util.Scanner;

public class Faktoriyelhesaplama {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        int sayi = input.nextInt();
        
        int sonuc = 1;

        for(int sayi2 = 1; sayi2 <= sayi; sayi2++){
         sonuc = sonuc*sayi2;
         System.out.println(sonuc);
        }
    }
    
}
