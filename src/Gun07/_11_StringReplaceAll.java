package Gun07;

public class _11_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak

        String text="Merhaba Dünya123";

        System.out.println("text = " + text); // orjinal hali

        System.out.println("abn -> _ = " + text.replaceAll("[abn]","_")); // Merh___ Dü_y_123  sadece abn
        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]","_")); // _erhaba _ünya123  büyük harfler
        System.out.println("0-9 -> _ = " + text.replaceAll("[0-9]","")); // Merhaba Dünya  sadece sayılar
        System.out.println("0-9 dışındakiler-> _ = " + text.replaceAll("[^0-9]","")); // 123      ^sayıların DIŞINDAKİLER
    }
}
