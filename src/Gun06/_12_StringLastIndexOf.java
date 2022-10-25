package Gun06;

public class _12_StringLastIndexOf {
    public static void main(String[] args) {
        // indexOf gibi çalışır bu aramaya baştan başlar
        // lastIndexOf ise : aramaya sonrdan başlar.
        //         0123456
        String s1="Merhaba";

        System.out.println("Bastan sona doğru a yı arar = " + s1.indexOf("a")); // 4
        System.out.println("Sondan başa doğru a yı arar = " + s1.lastIndexOf("a")); // 6
        // index her zaman tek sadece arama yönü değişir

    }
}
