import java.util.Scanner;
public class Utku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayı = 1;

        while(sayı <= 10) {
            
            sayı++;
            if(sayı % 2 == 0){
                System.out.println(sayı);
            }
            
        }
        
      
    }
}
