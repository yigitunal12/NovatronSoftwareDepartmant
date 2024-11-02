import java.util.Scanner;

public class Odev2HarunEsadErcan {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println("Üçüncü Sayıyı Giriniz: ");
        int sayi3 = input.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3){
            System.out.println("Sayı 1 en büyüğüdür");
        }
        else if(sayi2>sayi1 && sayi2>sayi3){
            System.out.println("Sayı 2 en büyüğüdür");
        }
        else if(sayi3>sayi1 && sayi3> sayi2){
            System.out.println("Sayı 3 en büyüğüdür");
        }
        else{
            System.out.println("Sayılarda eşitlik vardır");
        }
    }
}
