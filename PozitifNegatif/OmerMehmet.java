import java.util.Scanner;

public class OmerMehmet {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        double sayi = sc.nextDouble();
        sc.close();

        if (sayi > 0) {
            System.out.println("Sayınız pozitiftir.");
        }
        else if (sayi < 0) {
            System.out.println("Sayınız negatiftir.");
        }
        else {
            System.out.println("Sayınız sıfırdır.");
        }
    } 
}