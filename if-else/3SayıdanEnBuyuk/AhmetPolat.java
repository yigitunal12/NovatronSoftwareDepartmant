import java.util.Scanner;
public class AhmetPolat {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        double s1,s2,s3;

        
        System.out.print("Lütfen 1. sayıyı giriniz:");
        s1 = input.nextDouble();
        System.out.print("Lütfen 2. sayıyı giriniz:");
        s2 = input.nextDouble();
        System.out.print("Lütfen 3. sayıyı giriniz:");
        s3 = input.nextDouble();


        if((s1<s3)&&(s2<s3)){
            System.out.println(s3 + " sayısı girdiğiniz en büyük sayıdır.");
        }
        else if((s1<s2)&&(s3<s2)){
            System.out.println(s2 + " sayısı girdiğiniz en büyük sayıdır.");
        }
        else {
            System.out.println(s1 + " sayısı girdiğiniz en büyük sayıdır.");
        }
        
    }
}
