package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int[] dizi = new int[7];
        Scanner oku = new Scanner(System.in);

        int toplam=0;
        for(int i=0;i<dizi.length;i++) // 0123456
        {
            System.out.print((i+1)+".Sayi=");
            dizi[i]=oku.nextInt();

            toplam=toplam+dizi[i];
        }

        int ort=toplam/dizi.length;

        int adet=0;
        for(int i=0;i< dizi.length;i++){

            if (dizi[i] > ort && dizi[i]%2 == 1) // hem ortalamadna büyük hem de tek 2 şart aynı anda geçerli olmalı &&
            {
                System.out.println(dizi[i]);
                adet++;
            }

        }

        System.out.println("ort = " + ort);
        System.out.println("adet = " + adet);

    }
}
