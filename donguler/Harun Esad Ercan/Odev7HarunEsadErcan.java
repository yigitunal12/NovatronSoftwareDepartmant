import java.util.Scanner;

public class Odev7HarunEsadErcan {
    public void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int end= input.nextInt();
        int toplam = 1;
        for(int i = 1; i<=end;i++ ){
            toplam = i * toplam;
        }
        System.out.println(toplam);
    }
}
