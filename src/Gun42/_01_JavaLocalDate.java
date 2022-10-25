package Gun42;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate Sadece gun,Ay,Yıl bilgisi tutar

        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // Kendisindeki default var olan formatlar
        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n**************");
        //Localde aldığım tarihi istediğim ülkenin formatına gore, diline göre nasıl gösteririm?
        // örneğin localdeki saati Almanya ya nasıl gosteririz.

        System.out.println("FULL locale.GEMRMANY = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        //en-US : birincisi DİLİ , ikncisi Ülkeyi temsil ediyor, US United States Amerika
        //en-UK :                                                UK United Kingdom
        //fr-CA : Kanada fransızca
        //en-CA : Kanada ingilizce

        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();
        for (Locale l : kullanilabilirLokaller) {

            if (l.getDisplayCountry().toLowerCase().contains("chi")) // istenen ülke ye göre süzüldü
                System.out.println(" Dil=" + l.getDisplayLanguage() + " Ulke=" + l.getDisplayCountry()
                        + " " + l.getLanguage() + " " + l.getCountry());
        }

        Locale lokalCince = new Locale("zh", "CN");

        System.out.println("FULL local Çince = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));
        /********************************************************************************/

        System.out.println("\n*************İstediğim formatta gösterim**************");
        // İstediğim formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2= DateTimeFormatter.ofPattern("dd.MM yy");
        System.out.println("tarih dd.MM yy = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3= DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4= DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(ozelFormat4));

        DateTimeFormatter ozelFormat5= DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(ozelFormat5));

        System.out.println("Ozel Format ve Dil= " + tarih.format(ozelFormat5.withLocale(Locale.UK)));

        System.out.println("\n***************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2020, 6, 1);
        LocalDate tarih2= LocalDate.of(2021, Month.DECEMBER, 6);
        System.out.println("tarih1 = " + tarih1.format(ozelFormat1));

    }
}
