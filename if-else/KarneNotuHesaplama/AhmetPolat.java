import java.util.Scanner;
public class AhmetPolat {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double sonuc;
        float not1,not2,prf1,prf2;

        
        System.out.print("Lütfen ilk sınav puanını giriniz:");
        not1 = input.nextFloat();
        while(!((0 <= not1) && (not1 <= 100))){
            System.out.print("Geçersiz yanıt, lütfen tekrar giriniz:");
        not1 = input.nextFloat();
        }
        
        System.out.print("Lütfen ikinci sınav puanını giriniz:");
        not2 = input.nextFloat();
        while(!((0 <= not2) && (not2 <= 100))){
            System.out.print("Geçersiz yanıt, lütfen tekrar giriniz:");
        not2 = input.nextFloat();
        }
        
        System.out.print("Lütfen birinci perfonmans puanını giriniz:");
        prf1 = input.nextFloat();
        while(!((0 <= prf1) && (prf1 <= 100))){
        System.out.print("Geçersiz yanıt, lütfen tekrar giriniz:");
        prf1 = input.nextFloat();
        }
        
        System.out.print("Lütfen ikinci perfonmans puanını giriniz:");
        prf2 = input.nextFloat();
        while(!((0 <= prf2) && (prf2 <= 100))){
        System.out.print("Geçersiz yanıt, lütfen tekrar giriniz:");
        prf2 = input.nextFloat();
        }

        sonuc = ((not1 + not2 + prf1 + prf2) / 4);

        System.out.println("Ortalamanız: " + sonuc);

        if(sonuc >= 85){
            System.out.println("Tebrikler, taktir aldınız.");
        }
        else if((85 > sonuc)&&(sonuc >= 75)){
            System.out.println("Tebrikler, teşekkür aldınız.");
        }
        else if((75 > sonuc)&&(sonuc >= 50)){
            System.out.println("Tebrikler, geçtiniz.");
        }
        else if(50 > sonuc){
            System.out.println("Üzgünüz, kaldınız.");
        }
        else if(0 == 0){
            System.out.println("Hata.");
        }
    }
}
