import java.util.Scanner;
public class Utku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayı1 ,sayı2 ,sayı3 ,sayı4 ,sayı5,ort,top;

        System.out.println("1. sayıyı gir");
        sayı1=input.nextInt();

        System.out.println("2. sayıyı gir");
        sayı2=input.nextInt();

        System.out.println("3. sayıyı gir");
        sayı3=input.nextInt();

        System.out.println("4. sayıyı gir");
        sayı4=input.nextInt();

        System.out.println("5. sayıyı gir");
        sayı5=input.nextInt();

        ort=(sayı1+sayı2+sayı3+sayı4+sayı5)/5;
        top=(sayı1+sayı2+sayı3+sayı4+sayı5);
        System.out.println("bu 5 sayının ortalaması  " + ort  );
        System.out.print("toplamları  " + top);
    }
}
