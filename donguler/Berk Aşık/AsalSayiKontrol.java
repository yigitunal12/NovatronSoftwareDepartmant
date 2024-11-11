import java.util.Scanner;

public class AsalSayiKontrol {
    public static void main(String[] args) {
        Scanner sayiAlici = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        int girdi = sayiAlici.nextInt();
        boolean asal = true;

        if (girdi <= 1) {
            asal = false;
        } else {
            for (int i = 2; i <= Math.sqrt(girdi); i++) {
                if (girdi % i == 0) {
                    asal = false;
                    
                }
            }
        }

        if (asal) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal değil.");
        }
    }
}
//Berk Aşık