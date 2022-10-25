package Gun15;

public class OncekiGununSorusu {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
        // A -> 65 , B->66  -> karakter tablosu -> ascii tablosu
        // 65 sayı olarak yazdırırsam 65,   karaktere çevirisem (char)65 -> tablodaki karakter karşılığı

        for(int i=0;i <= 255; i++)
        {
            char harf= (char)i; // karakter tablosundaki karşılığı

            System.out.println(i+" harf = " + harf);
        }

    }
}
