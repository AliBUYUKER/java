package Gun27._01_Ornek;

public class Kampus {
    // Bir kampus programı için asagıdaki özellikte bilgilerin
    // kaydedileceği clasları yazınız.
    // Okul :  adı, mudurAdi, ucreti(double)  -> tip
    // Ogrenci : okulNo, tamAd, okulu  -> Tip

    // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
    // yazdırınız.

    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1;
        ogr1.tamAd="ismet temur";
        ogr1.okulu = new Okul(); // nesne oldugu ıcın new
        ogr1.okulu.adi = "Atatürk okulu";
        ogr1.okulu.mudurAdi="Hasan ayana";
        ogr1.okulu.ucreti=1000;

        System.out.println("ogr1.tamAd = " + ogr1.tamAd);
        System.out.println("ogr1.okulNo = " + ogr1.okulNo);
        System.out.println("okul adi = " + ogr1.okulu.adi);
        System.out.println("mudurAdi = " + ogr1.okulu.mudurAdi);
        System.out.println("okul ucreti = " + ogr1.okulu.ucreti);
    }
}
