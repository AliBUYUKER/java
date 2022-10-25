package Gun13;

import sun.plugin2.applet.StopListener;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Kullanıcı 0 degeri girene kadar, girdiği sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);

//        System.out.print("Sayi giriniz=");
//        int sayi=oku.nextInt();
//        int toplam=0;
//
//        while (sayi != 0)
//        {
//            toplam = toplam +sayi;
//
//            System.out.print("Sayi giriniz=");
//            sayi=oku.nextInt();
//        }
//        System.out.println("toplam = " + toplam);

        /******************************/
        int sayi;
        int toplam=0;
        do{ // bu döngüde donguye bir kere mutlaka girer ve kontrol sonda
            System.out.print("Sayi giriniz=");
            sayi=oku.nextInt();
            toplam=toplam+sayi;
        }while (sayi !=0);

        System.out.println("toplam = " + toplam);
    }
}
