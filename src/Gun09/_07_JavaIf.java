package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının birler ve onlar
        // basamağının eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi=oku.nextInt();

        // Yöntem: istediğin rakam sonda kalacak şekilde sayıyı böl.
        // sonra %10 yaparak son rakamı al.

        int birler=sayi % 10;  // 456 nın 6 rakamı şu an birler değişkeninde
        int onlar = (sayi/10) % 10;  // 456  ->  456/10  -> 45 -> %10 -> 5

        if (birler == onlar){
            System.out.println("Eşit");
        }

        if (birler != onlar){
            System.out.println("Eşit Değil");
        }






    }
}
