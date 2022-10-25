package Gun45._02_ExceptionHandling;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");

        try { // dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2022, Month.FEBRUARY, 30);

        }// hata olduğu zaman programı kırma
        catch (Exception ex) // ex isimli değişkende oluşan hataların bilgisi atanıyor
        {  //hata oldugunda yapılması istenenler buraya yazılıyor
            System.out.println("Hata oluştu lütfen tekrar deneyiniz");
            //  System.out.println("ex.toString() = " + ex.toString());
            //  kendine mail att: gelen datatyı ve hatayı
            //  Veritabanın kalıcı yer yaz
        }

        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");

        try{
             // Java çalışmaya devam
             // konuları öğrenmeye devam

        } // anlamadığın yer mi oldu ? kırılmadan DEVAM
        catch (Exception ex)
        {
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları tekrar izle
            // arkadaşlarına hocana mutlaka sor
            // öğren ve kırılmadan devm et
        }

        //sonunda seni güzel bir meslek bekliyor.
    }
}
