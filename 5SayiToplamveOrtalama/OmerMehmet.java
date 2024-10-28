import java.util.Scanner;

public class OmerMehmet {
    public static void main(String[] args) throws Exception {

        double sayi_bir, sayi_iki, sayi_uc, sayi_dort, sayi_bes, ort, top;

        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        sayi_bir = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi_iki = sc.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz: ");
        sayi_uc = sc.nextDouble();
        System.out.print("Dördüncü sayıyı giriniz: ");
        sayi_dort = sc.nextDouble();
        System.out.print("Beşinci sayıyı giriniz: ");
        sayi_bes = sc.nextDouble();
        sc.close();

        top = sayi_bir + sayi_iki + sayi_uc + sayi_dort + sayi_bes;
        ort = top / 5;

        System.out.println("Toplam: " + top);
        System.out.println("Ortalama: " + ort);
    }
}
