package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // dizi, array : Boyut sayısı belli ve sonradan boyutu değiştirilemez.
        int[] dizi=new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor

        // Boyutu dinamik olsa, eleman eklendikçe uzasa, sildikçe kısalsa.
        // ArrayList : boyutu başta vermene gerek yok, boyutu 0 başta,
        // eleman ekledikçe artar, sildikçe azalır.

        ArrayList<Integer> integerList=new ArrayList<>(); // tanımlama
        ArrayList<Boolean> booleanList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();

//        Integer s1=5; // hem sayı hem de içinde fonksiyonlar saklıyor. default null
//        int s2=6; // bu hazıfzada sadece rakam saklayabilen bir değişken.ilkel tip, primtive tip, default 0

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler); // hızlı yazdırma

        isimler.add("Ahmet"); // uzuluğu 1
        isimler.add("Ayşe"); // uzunluğu 2
        isimler.add("Kaya");
        isimler.add("Ali"); // hep sonuna ekliyor

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"Fatih"); // verılen ındex e ekliyor,  diğerleri 1 kayıyor sona doğru
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zeynep");// bellı bır ındextekı elemanı değiştirme
        System.out.println("isimler = " + isimler);

        isimler.remove("Zeynep"); // elemanı bulup siliyor.
        System.out.println("isimler = " + isimler);

        isimler.remove(0);  // 0 indexteki elemanı sil
        System.out.println("isimler = " + isimler);

        int indexOfKaya= isimler.indexOf("Kaya"); // // verilen elemanın indexini verir
        System.out.println("indexOfKaya = " + indexOfKaya);

        for(int i=0;i< isimler.size() ; i++)
            if ( isimler.get(i).equalsIgnoreCase("kaya"))
                isimler.remove(i);

        String ilkEleman=isimler.get(0); // indexdeki elemanı alma  sayi=dizi[0]

        isimler.clear();// tüm list boşaltıldı. ilk hale geldi.
        System.out.println("isimler = " + isimler);
    }
}
