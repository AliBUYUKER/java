package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        int ogrNot;  // 1 tane sayı saklayabilir.

        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
      //...
        int ogrNot100;

        // bana bir tanımlamada BIRDEN FAZLA değer tutabilecek bir DEĞİŞKENE
        // ihtiyacım var.
        // ÇÖZÜM :
        int not=0;
        int[] notlar=new int[250]; // 250 tane not tutabilen INT tipinde değişken

        notlar[0]=60;  // 0.kutudaki değer 60  ogrNot1
        notlar[1]=70;  // 1.kutudaki değer 70
        //...
        //...
        notlar[249]=80; // 249.kutudaki değer 80;

        System.out.println("notlar[0] = " + notlar[0]);

        Scanner oku=new Scanner(System.in);
        for(int i=0;i<250;i++)
        {
            System.out.print("not giriniz=");
            notlar[i]=oku.nextInt();
        }

        for(int i=0;i<250;i++)
            System.out.println(notlar[i]);
    }
}
