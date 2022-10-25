package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // Soru : 0 ile 6(hariç) arasında random sayı üreten programı yazını

        double doubleRandomSayi = Math.random(); // 0.0 - 0.9999999 arası sayı üretiyor.

        //0 ile 6 arasında random sayı
        int intRandomSayi = (int)(doubleRandomSayi * 6);   //  0 - 5.99999 - (int) -> 0-5

        // direkt yöntem
        System.out.println( (int)(Math.random() * 6)  );   // 0-5  arası verir
    }
}
