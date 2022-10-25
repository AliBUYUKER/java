package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayi =");
        int sayi1=oku.nextInt();

        System.out.print("2.Sayi =");
        int sayi2=oku.nextInt();

        System.out.println("Toplama T");
        System.out.println("Çıkarma Ç");
        System.out.println("Çarpma  P");
        System.out.println("Bölme   B");
        System.out.print("Seçiminz=");
        Scanner okuStr=new Scanner(System.in);
        String secim=okuStr.next();

        //ladder if, merdiven tipi if kullanımı
        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam="+ (sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("Farkı="+ (sayi1-sayi2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.println("Çarpımı="+ (sayi1*sayi2));
                else
                    if (secim.equalsIgnoreCase("B"))
                         System.out.println("Bölümü="+ (sayi1/sayi2));
                    else
                        System.out.println("Hatalı seçim");
    }
}
