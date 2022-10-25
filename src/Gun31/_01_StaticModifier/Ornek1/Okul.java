package Gun31._01_StaticModifier.Ornek1;


public class Okul {
    public static void main(String[] args) {
        //Ogrenci ogr1=new Ogrenci("ismet","temur","Yıldırım Ilkokulu");
        //Aynı veriyi 500 kez giriş yapılıyordu, bunu engellemek için, once cons. atıldı.

        Ogrenci ogr1=new Ogrenci("ismet","temur");
        Ogrenci ogr2=new Ogrenci("Mehmet","Demir");
        Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız");

        //.....
        //.....

        Ogrenci ogr499=new Ogrenci("Ugur","Çolak");
        Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak");

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi
    }
}
