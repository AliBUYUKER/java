package Gun07;

public class _09_StringReplaceFirst {
    public static void main(String[] args) {
        // replaceFirst : bir string içindeki karakter(leri) verilenle değiştirir.Sadece ilkini

        String text="Herkese Merhaba Dünya ";

        System.out.println("textin orjinal hali = "+text);
        System.out.println("a -> e  : "+text.replaceFirst("a","e")); // Merheba Dünya
        System.out.println("Dünya - > Java :" + text.replaceFirst("Dünya", "Java")); // Merhaba Java
        System.out.println("ilk a yı silelim  : " + text.replaceFirst("a","")); // Merhba Dünya
        System.out.println("ilk boşluğu temizle : "+ text.replaceFirst(" ","")); //HerkeseMerhaba Dünya
    }
}
