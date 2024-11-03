import java.util.Scanner;

public class ElifAbaci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a,b,c,max = 0;
        
        System.out.println("1. Sayiyi Giriniz");

        a = scanner.nextInt();
        
        System.out.println("2. Sayiyi Giriniz");

        b = scanner.nextInt();

        System.out.println("3. Sayiyi Giriniz");

        c = scanner.nextInt();

        if (a>b && a>c){
            max = a;
        }
        else if (b>a && b>c){
            max = b;
        }
        else if (c>a && c>b){
            max = c;
        }
        System.out.println("En Büyük Sayi " + max);

        scanner.close();
    }
}
