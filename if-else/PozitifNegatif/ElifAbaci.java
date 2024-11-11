import java.util.Scanner;

public class ElifAbaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi = scanner.nextInt();
        if (sayi >= 0) {
            System.out.println("Sayiniz Pozitif");
        } else {
            System.out.println("Sayiniz Negatif");
        }
        scanner.close();
    }
}