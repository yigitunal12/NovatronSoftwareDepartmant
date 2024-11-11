import java.util.Scanner;

public class Odev9HarunEsadErcan {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= input.nextInt();
        input.close();
        String ssayi= Integer.toString(sayi);
        int toplam= 0;

        while(sayi>0){
            sayi = Math.abs(sayi);
            toplam += sayi%10;
            sayi = sayi/10;
        }

        System.out.println(toplam);
    }
}
