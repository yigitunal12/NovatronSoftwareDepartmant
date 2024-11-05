import java.util.Scanner;


public class YusufEfe{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, sayi3;

        System.out.println("\nMerhabalar. Aralarından en büyüğünü seçebilmemiz için 3 sayı giriniz.");

        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3 = scanner.nextInt();

        int enBuyukSayi = sayi1; //öncelikle en büyük sayıyı ilk aldığımız sayı olarak tanımlıyoruz

        if (sayi2 > enBuyukSayi) {
            enBuyukSayi = sayi2;     
        } //eğer 2. aldığımız sayı en büyük sayı diye belirttiğimiz değerden büyükse onu en büyük sayı olarak tanımlıyoruz

        if (sayi3 > enBuyukSayi) {
            enBuyukSayi = sayi3;
        } //üstteki işlemi tekrarlıyoruz

        System.out.println("En büyük sayı: "+ enBuyukSayi);
   }
}
