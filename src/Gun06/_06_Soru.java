package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Ismet Temur"  I.T.  şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınız ve Soyadınız=");
        String tamAd=oku.nextLine();

        char ilkHarf=tamAd.charAt(0);
        int boslukIndex=tamAd.indexOf(" ");
        char soyadIlkHarf= tamAd.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");
    }
}
