import java.util.Scanner;
public class AhmetPolat {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float s1,s2,s3,s4,s5;
        
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        s1 = input.nextFloat();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        s2 = input.nextFloat();
        System.out.print("Lütfen 3. sayıyı giriniz: ");
        s3 = input.nextFloat();
        System.out.print("Lütfen 4. sayıyı giriniz: ");
        s4 = input.nextFloat();
        System.out.print("Lütfen 5. sayıyı giriniz: ");
        s5 = input.nextFloat();

        System.out.println("Girdiğiniz sayıarın toplamı: " + (s1+s2+s3+s4+s5));
        System.out.println("Girdiğiniz sayıarın ortalaması: " + ((s1+s2+s3+s4+s5) / 5));
    }
}