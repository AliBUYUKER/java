package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar(girilen sayı dahil) olan sayıların
        // toplamını bularak yazdırınız.
        // 6 girildiyse ->  1+2+3+4+5+6

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar sayılar toplanacak=");
        int sinir=oku.nextInt();

        int sayac=0;
        int toplam=0;

        while (sayac <= sinir)
        {
            toplam=toplam+sayac;
            sayac++;
        }

        System.out.println("toplam = " + toplam);

        //2.yöntem, sayac kullanmadan
        toplam=0;
        while (sinir >0)
        {
            toplam=toplam+sinir;
            sinir--;
        }
        System.out.println("toplam2 = " + toplam);
    }
}
