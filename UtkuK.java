import java.util.Scanner;

public class UtkuK {
     public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        int sayı;

        System.out.println("sayı girin");
        sayı=input.nextInt();
        
        if(sayı>=0){
            System.out.println("bu sayı pozitif.");
        }
        else{
            System.out.println("bu sayı negative");
        }
        
    }
}
