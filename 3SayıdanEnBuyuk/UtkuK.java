import java.util.Scanner;

public class UtkuK {
     public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        int sayı1 ,sayı2,sayı3,enbuyuk;

       System.out.println("1.sayıyı giriniz:");
       sayı1=input.nextInt();
       

       System.out.println("2.sayıyı giriniz:");
       sayı2=input.nextInt();

       System.out.println("3.sayıyı giriniz:");
       sayı3=input.nextInt();
       if(sayı1 > sayı2  && sayı1>sayı2){
        System.out.println("1. sayı en büyük  " + sayı1);

       }
       else if(sayı2>sayı3 && sayı2 >sayı3){
        System.out.println("2. sayı daha büyük " + sayı2);
       }
       else if(sayı3>sayı2 && sayı3>sayı1){
        System.out.println("sayı3 daha büyük" + sayı3);
       }
       
    }
}
