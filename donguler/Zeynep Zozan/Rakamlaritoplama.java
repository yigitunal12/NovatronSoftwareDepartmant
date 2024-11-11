import java.util.Scanner;
public class Rakamlaritoplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        int sayi = input.nextInt();

        int toplam = (sayi % 10 + sayi /10);
        System.out.println(toplam);

    }
        
 }
    

