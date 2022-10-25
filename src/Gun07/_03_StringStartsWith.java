package Gun07;

public class _03_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : bununla başlıyor mu?
        // sonuç true veya false

        String text="HCL Teknolji";

        System.out.println("HC ile başlıyor mu = "+ text.startsWith("HC"));//true
        System.out.println("Te ile başlıyor mu = "+ text.startsWith("Te"));//false
        System.out.println("H ile başlıyor mu = "+ text.startsWith("H"));//true
        System.out.println("hc ile başlıyor mu = "+ text.startsWith("hc"));//false
        System.out.println("h ile başlıyor mu = "+ text.startsWith("h"));//false
        System.out.println("a ile başlıyor mu = "+ text.startsWith("a"));//false
    }
}
