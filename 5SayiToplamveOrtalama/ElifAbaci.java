import java.util.Scanner;

public class ElifAbaci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    int sum = 0;   
    System.out.println("1. Sayiyi Girin");
    sum += scanner.nextInt();

    System.out.println("2. Sayiyi Girin");
    sum += scanner.nextInt();
    
    System.out.println("3. Sayiyi Girin");
    sum += scanner.nextInt();

    System.out.println("4. Sayiyi Girin");
    sum += scanner.nextInt();

    System.out.println("5. Sayiyi Girin");
    sum += scanner.nextInt();

    System.out.println("Sayilarin Toplami="+sum);

    System.out.println("Sayilarin Ortalamasi="+(sum/5));
    
        scanner.close();
    }
}
