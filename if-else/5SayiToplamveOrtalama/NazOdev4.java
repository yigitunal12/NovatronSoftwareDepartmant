// 4.odev
import java.util.Scanner;
class Odev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int toplam = a+b+c+d+e;
        int ortalama = toplam/5;
        System.out.println("Sayilarin toplami: " + toplam);
        System.out.println("Sayilarin ortalamasi: " + ortalama);
    }
}
