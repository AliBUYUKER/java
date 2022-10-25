package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arası gibi ürettik, hep sıfırdan başladı
        // 4-9 arası üretsin nasıl derdim, nasıl yapardım
        // önce aralık kadar ürettirip , sonra ona min kısmı eklesem
        // 4-9 için : önce 0-5 üret : sonra çıkan sayıya 4 ekle.

        Scanner oku=new Scanner(System.in);

        System.out.print("min=");
        int min=oku.nextInt();

        System.out.print("max=");
        int max=oku.nextInt();

        int belirli_Aralikta_UretilenSayi =
                (int)(Math.random() * (max-min))  + min;

        System.out.println("belirli_Aralikta_UretilenSayi = " +
                belirli_Aralikta_UretilenSayi);

    }
}
