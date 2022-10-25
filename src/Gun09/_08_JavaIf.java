package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı 1 = ");
        int s1=oku.nextInt();

        System.out.print("sayı 2 = ");
        int s2=oku.nextInt();

        System.out.print("sayı 3 = ");
        int s3=oku.nextInt();

        int enb=s1;

        if (s2>enb){
            enb=s2;
        }

        if (s3>enb){
            enb=s3;
        }

        System.out.println("enb = " + enb);
    }
}
