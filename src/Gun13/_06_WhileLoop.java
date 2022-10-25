package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
        // toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar sayılar toplanacak=");
        int sinir=oku.nextInt();

        int sayac=0;
        int toplam=0;

        while (sayac <= sinir) // 5 için 1 3 5
        {
            if (sayac %2 == 1)
              toplam=toplam+sayac;

            sayac++;
        }

        System.out.println("toplam = " + toplam);
    }
}
