package Gun37._07_Soru;

import Utility.MyFunc;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        System.out.println(d.alani(4,5));
        System.out.println(d.cevresi(4,5));

        Kare k=new Kare();
        System.out.println(k.alani(4));
        System.out.println(k.cevresi(4));

        Daire dr=new Daire();
        System.out.println("dr.cevresi(3) = " + dr.cevresi(3));
        System.out.println("dr.alani(3) = " + dr.alani(3));


        double yeniSayi= MyFunc.yuvarla(dr.cevresi(3));
        System.out.println("dr.cevresi(3) = " + yeniSayi);


        System.out.printf("%-8.2f",   dr.cevresi(3)  );
        // printf : formatlı (toplam kaç hane ye yaz, noktadan sonra kaç hane kullan) yazdırma
        //  % : virgülden sonraki değişkeni gösteriyor
        // .  : ondalıklı bölümü gösteriyor
        // -  : sola dayalı , eklenmezse , sağa dayalı
        // 8  : toplamda ekrandan kaç digit kullanılacak
        // 2  : ondalıklı kısmından kaç hane alınacağını gösteriyor
        // f  : double veya float için kullanılıyor, tam sayılar için d kullanılır
        //      stringler için s kullanılır.

    }
}
