import java.util.Scanner;

public class OmerMehmet {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. sınav notunu gir: ");
        double not_bir = sc.nextDouble();
        System.out.print("2. sınav notunu gir: ");
        double not_iki = sc.nextDouble();
        sc.close();

        if (not_bir > 100 || not_bir < 0 || not_iki > 100 || not_iki < 0) {
            System.out.println("Hata. Not değeri yanlış girilmiştir.");
            System.exit(0);
        }

        double not = (not_bir + not_iki) / 2;
        System.out.println("Not: " + not);

        if (not >= 85) {
            System.out.println("Takdir.");
        }
        else if (not >= 75) {
            System.out.println("Teşekkür.");
        }
        else if (not >= 50) {
            System.out.println("Geçti.");
        }
        else {
            System.out.println("Kaldı.");
        }
    }
}