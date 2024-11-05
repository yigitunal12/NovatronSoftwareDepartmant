import java.util.Scanner;

public class YusufEfe{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ilksinav, ikincisinav;
        double ortalama;

        System.out.println("İlk sınav sonucunuzu giriniz: ");
        ilksinav = input.nextInt();

        System.out.println("İkinci sınav sonucunuzu giriniz: ");    
        ikincisinav = input.nextInt();

        ortalama = (ilksinav + ikincisinav) / 2;


        if (ilksinav > 100 || ikincisinav > 100){
            System.out.println("Lütfen geçerli bir sınav sonucu giriniz.");
        }
        else if (ilksinav < 0 || ikincisinav < 0){
            System.out.println("Lütfen geçerli bir sınav sonucu giriniz.");
        }
        else if (ortalama >= 85){
            System.out.println("Takdir aldınız.");
            System.out.println("Sınav sonucu ortalamanız: "+ortalama);
        }
        else if (ortalama >= 75){
            System.out.println("Teşekkür aldınız.");
            System.out.println("Sınav sonucu ortalamanız: "+ortalama);
        }
        else if (ortalama >= 50){
            System.out.println("Geçtiniz.");
            System.out.println("Sınav sonucu ortalamanız: "+ortalama);
        }
        else if (ortalama >= 0){
            System.out.println("Kaldınız.");
            System.out.println("Sınav sonucu ortalamanız: "+ortalama);
        }
    }
}