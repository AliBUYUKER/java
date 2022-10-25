package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal (Lojik) ifadeler
        // && (shift 6) , ||  (alt <)  veya

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        // hem tek hem pozitif  ->  (sayi%2 == 1) && (sayi > 0)

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi=oku.nextInt();

        if ( sayi%2==1  && sayi > 0){  // hem tek hem pozitif
            System.out.println("uygun sayı girildi");
        }
        else{ // yukarıdaki şart değilse
            System.out.println("uygun sayi GİRİLMEDİ");
        }

    }
}
