package Gun18;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka yeni diziye atayınız.

        int[] dizi=new int[10];  //100 elemanlı bir dizi

        for (int i = 0; i < dizi.length; i++)
            dizi[i]=  (int)(Math.random()*100);

        System.out.println("dizi="+ Arrays.toString(dizi));

        //sonra
        int[] tekler=new int[10]; //bir başka yeni dizi
        System.out.println("tekler="+Arrays.toString(tekler));
        int j=0;
        for(int i=0;i< dizi.length;i++)
        {
            if (dizi[i]%2 == 1) {
                tekler[j] = dizi[i];
                j++;
            }
        }

        System.out.println("tekler="+Arrays.toString(tekler));
    }
}

//dizi=  [24, 89, 57, 44, 54, 91, 31, 27, 18, 54, 27, 80]
//        tekler=[0,  89, 57,  0,  0, 91, 31, 27,  0,  0, 27,  0]
//
//        tekler[i]=dizi[i];
//
//        tekse  tekIndex=0
//        tekler[0]=dizi[0];   // teklerin indexi atıldıkça artması lazım diğeriyle aynı
//        // olmamalı
//        tekse
//        tekler[0]=dizi[1];  tekIndex=1
//
//        tekse
//        tekler[1]=dizi[2];  tekIndex=2
//
//        tekse
//        tekler[2]=dizi[3];