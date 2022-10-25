package Gun06;

public class _09_StringEquals {
    public static void main(String[] args) {
        // equals : 2 stringin birbirine eşit olup olmadığını kontrol eder
        // sonuç boolean

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi= s1.equals(s2); // s1 s2 ye eşit mi ?
        System.out.println("esitMi = " + esitMi);


        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba"));
    }
}
