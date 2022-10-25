package Gun19;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int sayi=0; // 1 tane sayı tutuyor
        int[] ders1Notlari=new int[40];  // 40 tane sayı saklayabilir
        int[] ders2Notlari=new int[40];
        int[] ders3Notlari=new int[40];  // index 0-39

        int[][] tumDersNotlari = new int[3][40] ; // 3 ders 40 öğrenci
                                                  // 3 satır 40 sütun
                                                  // her satır 0-39
                                                  // 0.Satır 1.Satır 2.Satır
                                                  // satır :0,1,2  - sütun:0,1,2,3 .... 39

        ders1Notlari[0] = 80;  // tek boyutlu dizide ilk(0) elemana 80 atandı.
        tumDersNotlari[0][0] = 80; //2 boyutlu dizide ilk(0) satırın ilk(0) sütununa 80 atandı

        System.out.println(tumDersNotlari[0][0]);
        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0] = oku.nextInt();
    }
}
