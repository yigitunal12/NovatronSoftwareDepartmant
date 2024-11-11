import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç terimlik Fibonacci serisi istiyorsunuz? ");
        int terimSayisi = scanner.nextInt();
        
        int ilkSayi = 0, ikinciSayi = 1;

        System.out.print("Fibonacci Serisi: " + ilkSayi);

        for (int i = 1; i < terimSayisi; i++) {
            System.out.print(", " + ikinciSayi);
            int sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
    }
}
//Berk Aşık