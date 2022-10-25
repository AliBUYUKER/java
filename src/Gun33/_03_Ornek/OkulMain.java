package Gun33._03_Ornek;

//  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar
//     kullanıcıdan alarak öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin
//     yaşı 15 i geçmemeli. bu yaşı geçen bir öğrenci eklenmek istenir ise
//     yerine başka öğrenci isteyiniz.

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        //bir okulumuz olmalı, max kontenjanı olan adı olan
        Okul yeniOkul=new Okul("Kabataş ilkokul", 3);

        do{
            //scanner işlemleri, kullanıcıdan veri alma, öğrenci bilg. alma kısmı
            System.out.print("Öğrenci Adı=");String ad= okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");String soyad= okuStr.nextLine();
            System.out.print("Öğrenci Yaşı=");int yas= okuInt.nextInt();

            //yaş kontrol
            if ( yas < 15) { //ise öğrenci ekle
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                yeniOkul.ogrenciler.add(ogr);
            }
            else
            {
                System.out.println("Öğrenci yaşı okul için uygun değil");
            }

        }while(yeniOkul.ogrenciler.size() < yeniOkul.getKontenjan());

        System.out.println("yeniOkul = " + yeniOkul);
        System.out.println("yeniOkul.ogrenciler = " + yeniOkul.ogrenciler);
    }
}
