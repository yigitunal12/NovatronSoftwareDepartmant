import java.util.Scanner;

public class OdevHesaplama{
  public static void main(String[] args){
    //Girdi almak için scanner sınıfından bir nesne oluşturulur.
    Scanner input = new Scanner(System.in);

    //İlk not kullanıcıdan istenir.
    System.out.println("Lütfen, ilk notunuzu giriniz: ");
    double not1 = input.nextDouble();

    //İkinci not kullanıcıdan istenir.
    System.out.("Lütfen, ikinci notunuzu giriniz");
    double not2 = input.nextDouble();

    double ortalama = (not1 + not2) / 2.0;
    
    if(ortalama <= 100 && ortalama >= 85){
      System.out.println("Takdir");
  }
    else if(ortalama <= 100 && ortalama >= 75){
      System.out.println("Teşekkür");
    }
    else if(ortalama <= 100 && ortalama >= 50){
      System.out.println("Geçti");
    }
    else if(ortalama <= 100 && ortalama >= 0){
      System.out.println("KAldı");
    }
    else{
      System.out.println("Hata.");
    }
  }
}
