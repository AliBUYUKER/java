package Gun43;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        // 2 tarih arasındaki zaman farkı gosterir
        // LocalDate le için kullanılır.

        LocalDate dogumTarihi= LocalDate.of(1975, 3, 12);
        LocalDate buGun=LocalDate.now();

        Period fark = Period.between(dogumTarihi, buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" yaşındasın");

        /************************/

        Period period3Gun= Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        LocalDate ucGunSonra = buGun.plus(period3Gun); // zaman aralığı ekleme
        LocalDate ucAySonra = buGun.plus(period3Ay);

        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);

        /*****************************************/
        // örnek Kursun süresini ve bitiş gününü bulunuz(6 ay)
        // nekadar süre kaldı.
        LocalDate kursBaslangic= LocalDate.of(2022,7,25);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        //kursun bitmesine nekadar süre kaldı
        Period neKadarSureKaldi= Period.between(buGun, kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        //Kurs Ne kadar Süredir Devam Ediyor
        Period devamSuresi=Period.between(kursBaslangic,buGun);
        System.out.println("devamSuresi = " + devamSuresi);
    }
}
