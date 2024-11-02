import java.util.Scanner;

public class Odev1HarunEsadErcan {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi>0){
            System.out.println("Sayınız Pozitif");
        }
        else if(sayi<0){
            System.out.println("Sayınız Negatif");
        }
        else{
            System.out.println("Sayınız 0'dır");
        }
    }
}
