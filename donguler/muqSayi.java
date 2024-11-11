import java.util.Scanner;

public class muqSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) toplam += i;
        }

        System.out.println(sayi + (toplam == sayi ? " bir mükemmel sayıdır." : " bir mükemmel sayı değildir."));
    //Buraya soru işaretini kendi ekledi ve dieğr türlü de kabul etmiyor neden?//
    }
}
//Berk Aşık