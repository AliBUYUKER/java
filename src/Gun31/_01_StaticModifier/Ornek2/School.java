package Gun31._01_StaticModifier.Ornek2;

public class School {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir id si olmalı.(otomatik artan)
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

    public static void main(String[] args) {
        Student ogr1 = new Student("ismet Yıldız");
        Student ogr2 = new Student("Ahmet Demir");
        Student ogr3 = new Student("Ayşe Yılmaz");
        //problem: hem id yi takip etmek zorunda kalıyorum
        //hata olasılığı yüksek ve gereksiz veri girişi

        //ID lere verilecek numaraları takip eden ve her NESNE
        // oluşturuldukça ARTAN bir SAYAC olmalı
        //BU SAYAC kime AIT OLMALI , NESNE yemi CLASS a mı
        System.out.println("ogr1 = " + ogr1); // id=1
        System.out.println("ogr2 = " + ogr2); // id=2
        System.out.println("ogr3 = " + ogr3); // id=3

        System.out.println("Öğrenci sayısı=" + Student.sayac);
        //TODO: burada 1 fazla öğrenci gösteriyor -1 yapmadan nasıl çözerdiniz
    }
}
