import java.util.Scanner;
public class AhmetPolat {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int s1 = 1;

    while(s1 < 10){
        if(s1%2 == 0){
            System.out.println(s1);
        }
        s1 = s1 + 1;
    }
}
}