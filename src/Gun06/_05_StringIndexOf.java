package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // Verilen karakter(ler)in string içindeki INDEX ini verir

        String cumle = "Merhaba Dünya";

        System.out.println("cumle.indexOf(r) = " + cumle.indexOf("r")); // 2
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(ny) = " + cumle.indexOf("ny")); // 10
        System.out.println("cumle.indexOf(\" \") = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A")); // -1 yok demenin diğer adı
        System.out.println("cumle.indexOf(a,5) = " + cumle.indexOf("a",5) ); // 6
        // a yı aramaya 5(dahil) nolu index ten sonra başla
    }
}
