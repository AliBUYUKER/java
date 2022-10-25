package Gun23;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        /***************************/
        int sayi=5;   // tek bir rakam tutabilen değişken
        int[] dizi=new int[20];  // 20 adet sayi tutabilen değişken, uzunluk sabit
        int[][] tablo=new int[20][2];  // 20x2 lik sayı saklayabilen değişken, uzunluk sabit

        ArrayList<Integer> liste=new ArrayList<>(); // istenildiği kadar sayı eklenebilen değişken, uzunluk değişken
        /***************************/

        // 3 öğrencinin ders notlarını bir değişkende nasıl birleştiririz.
        ArrayList<Integer> matNotlari = new ArrayList<>(); // tek bir dersin notları // 1 yaprak
        ArrayList<Integer> fizNotlari = new ArrayList<>(); // fiz dersinin notları  // 1 yaprak
        ArrayList<Integer> kimNotlari = new ArrayList<>(); // kim dersinin notları // 1 yaprak

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayListi nasıl yaparım.
        ArrayList<  ArrayList<Integer>  > notlarListesi =new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);
        //bütün ders notları notlar listesinde şu anda, yani Arraylistlerin listesi

        notlarListesi.get(0);  // matnotları her bir elemanı liste çünkü
        int matbirNot=notlarListesi.get(0).get(0); // 0.listenin 0. elemanı, mat ın 1.notu

        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0)); // 0.listeyi verdi.
        System.out.println("notlarListesi.get(1) = " + notlarListesi.get(1)); // 1.listeyi verdi.
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2)); // 2.listeyi verdi.

        // ykarıdak,lerin yerine bu döngü
        for (int i = 0; i < notlarListesi.size(); i++)
            System.out.println("notlarListesi = " + notlarListesi.get(i));


        for (int i = 0; i < notlarListesi.size(); i++) { // satırları takip ediyor, satır

            for (int j = 0; j <  notlarListesi.get(i).size() ; j++) { // her satırdaki sutunları
                System.out.print(notlarListesi.get(i).get(j)+"\t"); // tablo[i][j]
            }

            System.out.println();
        }


    }
}
