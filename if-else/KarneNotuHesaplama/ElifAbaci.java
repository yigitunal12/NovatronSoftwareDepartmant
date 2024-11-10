import java.util.Scanner;

public class ElifAbaci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1. notu giriniz: ");
        
        int not1 = scanner.nextInt();

         System.out.print("2. notu giriniz: ");
        
         int not2 = scanner.nextInt();

         double ortalama = (not1+not2)/2;

         if (ortalama>=85 && ortalama<=100){

            System.out.println("Takdir");
         }
        else if (ortalama<85 && ortalama>=75){
            System.out.println("Tesekkür");
        }
        else if (ortalama<75 && ortalama>=50){
            System.out.println("Geçti");
        }
        else if (ortalama<50){
            System.out.println("Kaldı");
        }
        scanner.close();
    }
}