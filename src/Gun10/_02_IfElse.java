package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("vize notu = ");
        int vizeNotu=oku.nextInt();

        System.out.print("final notu = ");
        int finalNotu=oku.nextInt();

        // 40/100 -> 0.4    ,   0.6

        double ort =  0.40 * vizeNotu + 0.60 * finalNotu;

        //int ort2 =  (int)(0.4 * vizeNotu) + (int)(0.6 * finalNotu);
        //int ort3 = vizeNotu * 40 / 100  +  finalNotu * 60 / 100 ;

        if (ort >= 60){
            System.out.println("tebrikler geçtiniz, ort="+ort);
        }
        else{
            System.out.println("kaldınız, ort="+ort);
        }

    }
}
