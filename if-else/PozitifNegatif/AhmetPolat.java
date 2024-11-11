import java.util.Scanner;
public class AhmetPolat {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double Sayı;

        
        System.out.print("Lütfen bir sayı giriniz:");
        Sayı = input.nextDouble();

        System.out.println("Girdiğiniz sayı: " + Sayı);

        if(0 < Sayı){
            System.out.println("Pozitif bir sayı girdiniz");
        }
        else if(0 == Sayı){
            System.out.println("Nötr bir sayı girdiniz");
        }
        else {
            System.out.println("Negatif bir sayı girdiniz");
        }
        
    }
}