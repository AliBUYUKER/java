package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int[] dizi=new int[5];

        Scanner oku=new Scanner(System.in);

        for(int i=0;i<dizi.length;i++) {
            System.out.print(i+".Sayi=");
            dizi[i]=oku.nextInt();
        }

        enKucukYaz(dizi);
//        enBuyukYaz(dizi);
//        ortalamaBulYaz(dizi);
    }

    public static void enKucukYaz(int[] sayilar)
    {
        int enk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]<enk)
                enk=sayilar[i];
        }
        System.out.println("enk = " + enk);

        //2.Yol
        Arrays.sort(sayilar);
        System.out.println("sayilar = " + sayilar[0]);
    }
















}
