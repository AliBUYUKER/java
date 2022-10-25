package Gun36._04_Poly_Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("Ayşe","Yılmaz","Öğrenci","5A");
        Calisan cal=new Calisan("ismet","temur","Öğretmen","Yazilim");

        Kisi.KimlikBelgesiYaz(ogr);
        Kisi.KimlikBelgesiYaz(cal);
    }
}
