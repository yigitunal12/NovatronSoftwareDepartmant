import java.util.Scanner;

public class Odev10HarunEsadErcan {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        input.close();
        boolean asal= true;
        for (int i=sayi;i>0;i--){
            if (sayi%i==0){
                asal=false;
            }
        }
        if(asal=false){
            System.out.println("Sayınız asal değildir.");
        }
        else{
            System.out.println("Sayınız asaldır.");
        }

    }
}
