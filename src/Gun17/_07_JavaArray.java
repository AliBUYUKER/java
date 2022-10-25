package Gun17;

import java.util.Arrays;

public class _07_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka yeni diziye atayınız.

        int[] dizi=new int[100];  //100 elemanlı bir dizi

        for (int i = 0; i < dizi.length; i++)
            dizi[i]=  (int)(Math.random()*100); //random (0-100 arası) doldur

        System.out.println("dizi="+Arrays.toString(dizi));

        //sonra
        int[] tekler=new int[100]; //bir başka yeni dizi
        System.out.println("tekler="+Arrays.toString(tekler));
        for(int i=0;i< dizi.length;i++)
        {
            if (dizi[i]%2 == 1) //sadece tek elemanlarını bir başka yeni diziye atayınız
               tekler[i]=dizi[i];
        }

        System.out.println("tekler="+Arrays.toString(tekler));
    }
}
