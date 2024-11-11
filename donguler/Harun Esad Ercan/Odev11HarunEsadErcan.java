import java.util.Scanner;

public class Odev11HarunEsadErcan {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        input.close();
        int toplam = 0;
        for (int i = 1; i<sayi; i++){
            if(sayi%i==0){
                toplam=toplam + i;
            }
        }
        if (toplam==sayi){
            System.out.println("Sayınız mükemmel bir sayıdır.");
        }
        else{
            System.out.println("Sayınız mükemmel sayı değildir.");
        }
    }
}
