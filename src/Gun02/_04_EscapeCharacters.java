package Gun02;

public class _04_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        // \n -> yeni satır açıyor , alt satıra geçiriyor
        // \t -> tab tuşuna basılmış gibi yapıyor
        // \b -> Bacspace basılmış etkisi yapar, yani 1 karakter geri siler
        // \" -> çift tırnak yazar
        // \\ -> \ işaretini yazıyor
        // \r -> satır başına geri gidiyor ve satır başına kadar olan karakterlerin hepsini siler

        System.out.println("MerhabaDünya");
        System.out.println("Merhaba\nDünya");
        System.out.println("Merhaba\tDünya");
        System.out.println("Merhaba\bDünya");
        System.out.println("Merhaba\"Dünya");
        System.out.println("Merhaba\\Dünya");
        System.out.println("Merhaba\rDünya");
    }
}
