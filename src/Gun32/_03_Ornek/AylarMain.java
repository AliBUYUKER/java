package Gun32._03_Ornek;

import java.time.Month;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay=Aylar.AGUSTOS;

       // ayın kaç gün sürdüğünü metod gerekiyor
       // ayın türkçe yazılışı metod gerekiyor
       // ayın gerçek sıra nosu metod gerekiyor

        // Java diyorki bu şekilde tek bir kelime veya
        // sayı olan degerleri olacaksa, sana bir kolaylık

        System.out.println("ay = " + ay);
        System.out.println("ay.ayno = " + ay.ayno);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);

        // Month.DECEMBER
    }
}
