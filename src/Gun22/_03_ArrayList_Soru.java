package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.

        int[] dizi=new int[6];
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayi=");
            dizi[i]=oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi));

           //1.Yöntem
        ArrayList<Integer> tekler=new ArrayList<>();
//        for (int i = 0; i < dizi.length; i++) {
//            if (dizi[i] %2 == 1)
//                tekler.add(dizi[i]);
//        }


        //2.Yöntem
        tekler = tekElemanlarAta(dizi);
        System.out.println("tekler = " + tekler);

        // TODO : Ödev : tek elemanlarını ayrı diziye bir metodda atayarak main de yazdırınız.
    }

    public static ArrayList<Integer> tekElemanlarAta(int[] dizi)
    {
        ArrayList<Integer> tekler=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] %2 == 1)
                tekler.add(dizi[i]);
        }
        return tekler;
    }
}
