import java.util.Scanner;

public class OmerMehmet {
    public static void main(String[] args) throws Exception {
        
        double max;

        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        double sayi_bir = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi_iki = sc.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz: ");
        double sayi_uc = sc.nextDouble();
        sc.close();

        if (sayi_bir == sayi_iki && sayi_iki == sayi_uc) {
            System.out.println("Bütün sayılar eşittir.");
            System.exit(0);
        }

        max = sayi_bir;
        if (max < sayi_iki || max < sayi_uc) {
            max = sayi_iki;
            if (max < sayi_uc) {
                max = sayi_uc;
            }
        }

        System.out.println("En büyük sayı: " + max);
    }
}