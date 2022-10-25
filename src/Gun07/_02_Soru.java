package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp, ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve soyadınız=");
        String tamAd=oku.nextLine();

        // ismet temur -> boslugun indexini bulurum buna göre ayırırım
        int boslukIndex=tamAd.indexOf(" "); // 5
        String ad=tamAd.substring(0,boslukIndex); // ismet 0,5
        String soyad=tamAd.substring(boslukIndex+1); // temur

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
    }
}
