package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {
    //metodların yazılabildiği yer
    public static void main(String[] args) {
        //programın başladığı yer , ilk bu noktadan sonra çalışmaya başlar
        int sayi=5;
        Scanner oku=new Scanner(System.in);

        Araba benimArabam=new Araba(); // Araba : TİPİ,   benimArabam: değişken adı

        benimArabam.renk="kırmızı";
        benimArabam.modelYili=2022;
        benimArabam.motorHacmi=1500;
        benimArabam.plaka="55NK1234";

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.plaka = " + benimArabam.plaka);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.modelYili = " + benimArabam.modelYili);
    }
    //metodların yazılabildiği yer
}

class Araba{ // bu bölüme class diyoruz bu bizim bize özgü tipimiz.
    int modelYili;
    String renk;
    double motorHacmi;
    String plaka;
}
