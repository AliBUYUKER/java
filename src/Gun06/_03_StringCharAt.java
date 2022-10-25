package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenen noktadaki karakteri verir
        // karakterlerin sırası 0(sıfır) dan başlar.
        // buna index denir.
        //            0123456789 10 11 12
        String cumle="Merhaba Dünya";

        char ilkHarf= cumle.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        System.out.println("h harfi="+cumle.charAt(3)); // cumle nin 3 deki karakteri
    }
}
