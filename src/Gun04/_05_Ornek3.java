package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double kilo=74.5;
        int boy=180;

        double kitleIndex= kilo / (boy*boy); // widening genişletme yönünde
        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("boyunuz="+boy+",kilonuz="+kilo);
        /**************************/

        int kitleIndex2=  (int)kilo / (boy*boy); // veri kaybı oluştu  narrow daraltma yönünde
        System.out.println("kitleIndex2 = " + kitleIndex2);
    }
}
