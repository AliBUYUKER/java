package Gun03;

public class _06_JavaString {
    public static void main(String[] args) {
        String ad="Ismet";  // String : kelime veya kelimeleri tutmak için kullanılır.
                            // sınırlarını " " ile belirleriz.
        String soyad="Temur";

        System.out.println("ad = " + ad); //ad = Ismet
        System.out.println("soyad = " + soyad); //soyad = Temur
        System.out.println("ad ve soyad = " + ad+" "+soyad); // ad ve soyad = Ismet Temur

        String tamAd= "ismet"+" "+" temur";
        String tamAd2 = ad+" "+soyad;
        System.out.println("tamAd = " + tamAd);
        System.out.println("tamAd2 = " + tamAd2);

        int sayiYas=45; // int tanımlandı yani gerçekten sayı , toplamalarda kullanabiliriz
        String kelimeSas="45"; // String türü bir değişken , simge durumunda , toplama işlemlerinde kullanılamaz



    }
}
