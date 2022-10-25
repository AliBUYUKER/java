package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {
        int a=4;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b => " + (a+b));

        System.out.println("Çıkartma işlemi");
        System.out.println("a-b => " + (a-b));

        System.out.println("Çarpma işlemi");
        System.out.println("a*b => " + (a*b));

        System.out.println("Bölme işlemi");
        System.out.println("a/b => " + (a/b)); // bölüm

        System.out.println("Modul işlemi");
        System.out.println("a % b => " + (a % b));  // 4%5 => 4
        System.out.println("b % a => " + (b % a));  // 5%4 => 1   // kalan
        //        kısa önemli not !
        //        Modül (%)'de
        //        sol büyük ise kalanı al
        //        sol küçükse solundakini al
    }
}
