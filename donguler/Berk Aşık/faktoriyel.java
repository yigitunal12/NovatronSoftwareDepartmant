
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
    Scanner ekranOkuyucu = new Scanner(System.in);
    System.out.println("Bir sayı giriniz");
    int sayi = ekranOkuyucu.nextInt();
    int sonuc = 1;

    if(sayi < 1){
        sayi ++;
    }
    for (int sayac = 1; sayac <= sayi; sayac++){
        sonuc = sonuc * sayac;
    }
    System.out.println(sonuc);
}
}
//Berk Aşık