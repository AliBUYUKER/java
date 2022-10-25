package Gun26;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.

        Scanner oku=new Scanner(System.in);

        ArrayList<Ogrenci> liste=new ArrayList<>();   // öğrenci tipinde bir list

        for(int i=0;i<3;i++) {
            Ogrenci ogr = new Ogrenci(); // artık ogr bir varlık,  Ogrenci ise onun Tipi
                                         // insan bir tip,    ismet ise onun tipindne bir varlık
            System.out.print("Öğrencinin Adı=");
            ogr.adi = oku.nextLine();
            System.out.print("Öğrencinin Soyadi=");
            ogr.soyadi = oku.nextLine();
            System.out.print("Öğrencinin Sinifi=");
            ogr.sinifi = oku.nextLine();
            System.out.print("Öğrencinin Adresi=");
            ogr.adres = oku.nextLine();

            liste.add(ogr); // her bir kutuda bir öğrenci
        }

        for(Ogrenci ogr : liste) {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }
}

class Ogrenci{
    String adi;
    String soyadi;
    String sinifi;
    String adres;
}
