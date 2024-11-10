// 2.odev
import java.util.Scanner;
class Odev {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = 0;
        if(a>b){
            max = a;
            if(c>a){
                max = c;
            } 
        }else if(b>c){
            max = b;
        }else{
            max = c;
        }
        
        System.out.println("en buyuk sayi: " + max);
        
    }
} 
