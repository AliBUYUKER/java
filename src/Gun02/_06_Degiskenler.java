package Gun02;

public class _06_Degiskenler {
    public static void main(String[] args) {
        // Değişkenler - Variable
        int sayi;  // int : tam sayı saklayacak kadar hazızada yer ayırıyor ve onun adına sayi diyor
        // değişkenin adı sayı,  tipi int,   int : tam sayı  INTEGER

        int saYi; // bir harf bile farklı olsa farklı değişkendir.
        int SAYI; // büyük harf ve küçük harf tamamen farklı değişken demektir.
        // Java büyük küçük harf duyarlı (case sensitive) dildir.

        sayi=5; // sayının değeri 5 oldu
        System.out.println("sayi"); // çift tırnak arasıdaki her şey erkana direk yazılır.
        System.out.println(sayi);  // değişkenin adını direkt yazarsak DEĞERİNİ yazar

        System.out.println("sayi="+sayi); // sayi=5

        sayi=7;  // sayının değeri 7 oldu

        int kisaKenar=5;
        int uzunKenar=7;

        int cevre= kisaKenar + kisaKenar + uzunKenar + uzunKenar;
        // cevre = 5 + 5 + 7 +7;

        System.out.println("Çevresi="+cevre);


    }
}
