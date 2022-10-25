package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bölümünü alma işlemini yapar.
        //         012345678901234567
        String s1="Merhaba arkadaşlar";

        String parca1=s1.substring(3,7); // 3 nolu indexten 7 nolu indexe kadar, 7 dahil değil.
        System.out.println("parca1 = " + parca1);

        String parca2=s1.substring(8,15);
        System.out.println("parca2 = " + parca2);

        String parca3=s1.substring(8); // verilenden başlar , sonuna kadar
        System.out.println("parca3 = " + parca3);
    }
}
