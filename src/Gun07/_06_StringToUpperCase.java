package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : string büyük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("text in büyük harf hali = "+ text.toUpperCase()); //MERHABA DÜNYA

        //büyük veya küçük harf farketmeksizin YA ile bitiyor mu ?
        System.out.println("Sonuç = "+ text.toUpperCase().endsWith("YA"));
    }
}
