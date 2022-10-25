package Gun31._01_StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yıldırım Ilkokulu"; //sen bitanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

        //this.okulAd="Yıldırım Ilkokulu";
        //500 ken aynı veri hafızada yer alıyordu, kotu hafıza kullanımı
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
