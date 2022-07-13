import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişken oluştur
        int matematik,fizik,kimya,turkce,tarih,muzik;

       //Scanner sınıfı tanımladık
        Scanner input=new Scanner(System.in);

        //Kullanıcıdan değer al
        System.out.println("Matematik notunuz:");
        matematik=input.nextInt();

        System.out.println("fizik notunuz:");
        fizik=input.nextInt();

        System.out.println("kimya notunuz:");
        kimya=input.nextInt();

        System.out.println("turkce notunuz:");
        turkce=input.nextInt();

        System.out.println("tarih notunuz:");
        tarih=input.nextInt();

        System.out.println("muzik notunuz:");
        muzik=input.nextInt();

        int toplam=matematik+fizik+kimya+turkce+tarih+muzik;
        double sonuc=toplam/6.0;
        System.out.println("Ortalamaniz:"+sonuc);



    }
}
