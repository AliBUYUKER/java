package Gun07;

import java.util.Scanner;

public class _10_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz
        // orneğin 01.02.20   bu strinde kaç tane nokta vardır

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen bilgi giriniz=");
        String girilen=oku.nextLine();  // 12..a.

        int uzunluk1=girilen.length();  // 6
        girilen=girilen.replace(".",""); // 12a
        int uzunluk2=girilen.length();  // 3

        int noktaSayisi=uzunluk1-uzunluk2; // 3
        System.out.println("noktaSayisi = " + noktaSayisi);
    }
}
