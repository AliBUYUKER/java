package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        /***  Stringi sayıya çevirmek   ***/
        String ad="ismet";
        String kelimeSayi="65"; // şu anda bu aynı ad gibi simge yani rakam değil
        // fakat rakam, sayi görünümlü ise sayıya dönüştürebilirim.

        int intDeger= Integer.parseInt(kelimeSayi); // sayi görünümlü simgeyi , sayıya(int) dönüştürdü
        System.out.println("intDeger = " + intDeger);
        int toplam = intDeger+5;

        byte byteDeger= Byte.parseByte(kelimeSayi); // sayi görünümlü simgeyi , sayıya(Byte) dönüştürdü
        System.out.println("byteDeger = " + byteDeger);

        /*****   Sayıları String e çevirmek  *****/
        int sicaklik=18;
        // Bu gun hava sicaklığı 18 derece
        System.out.println("Bugün hava sıcaklığı "+sicaklik+" derece"); // otmatik stringe dönüştü

        String sicaklikKelimeHali = Integer.toString(sicaklik); // toplanamaz
        // int toplam2 = sicaklikKelimeHali + 5; yapılamaz çünkü artık string

        System.out.println("Bugün hava sıcaklığı " + sicaklikKelimeHali + " derece");


    }
}
