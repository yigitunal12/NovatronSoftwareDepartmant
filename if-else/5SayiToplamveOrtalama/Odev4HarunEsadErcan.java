import java.util.Scanner;

public class Odev4HarunEsadErcan {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz: ");
        int sayi2 = input.nextInt();
        
        System.out.println("Üçüncü Sayıyı Giriniz: ");
        int sayi3 = input.nextInt();

        System.out.println("Dördüncü Sayıyı Giriniz: ");
        int sayi4 = input.nextInt();

        System.out.println("Beşinci Sayıyı Giriniz: ");
        int sayi5 = input.nextInt();

        String toplam= Integer.toString(sayi1+sayi2+sayi3+sayi4+sayi5);
        String ortalama= Integer.toString((sayi1+sayi2+sayi3+sayi4+sayi5)/5);
        System.out.println("Sayıların Toplamı = "+ toplam);
        System.out.println("Sayıların Ortalaması = "+ ortalama);

        
    }
}
