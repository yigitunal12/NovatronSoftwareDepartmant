import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner girilenSayi = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        int sayi = girilenSayi.nextInt();
        boolean mukemmlesayi = false;
        
        if(sayi <= -1) {
            mukemmlesayi = false;
        } else {
            int c = 1;
            if (sayi % c == 0){
                System.out.println(c);
            } else{
                c++;
                return;
            }
        }
    }
}
//Berk Aşık