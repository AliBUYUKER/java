package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.
        Scanner okuyucu=new Scanner(System.in);

        System.out.print("adınızı giriniz=");
        String ad=okuyucu.next(); // next() -> bir kelime okuma için

        System.out.println("ad = " + ad);


        /*
         oku.next() -> bir kelime okuyor (char)
         oku.nextLine() -> tüm satırı okur

         oku.nextInt() ->  int değeri okur
         oku.nextByte() -> byte degerı okur
         oku.nextLong() -> long degeri okur
         oku.nextShort() -> Short degeri okur

         oku.nextFloat() -> float degeri okur
         oku.nextDouble() -> double degeri okur
         */
    }
}
