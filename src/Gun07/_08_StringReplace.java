package Gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // replace : bir string içindeki karakter(leri) verilenle değiştirir.hepsini

        String text="Merhaba Dünya";

        System.out.println("textin orjinal hali = "+text);
        System.out.println("a -> e  : "+text.replace("a","e")); // Merhebe Dünye
        System.out.println("ba -> de  :" + text.replace("ba","de")); // Merhade Dünya
        System.out.println("Dünya - > Java :" + text.replace("Dünya", "Java")); // Merhaba Java
        System.out.println("a ları ilelim : " + text.replace("a","")); // Merhb Düny
        System.out.println("boşulkarı temizle : "+ text.replace(" ","")); //MerhabaDünya
    }
}
