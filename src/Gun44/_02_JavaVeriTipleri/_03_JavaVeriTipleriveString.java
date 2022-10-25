package Gun44._02_JavaVeriTipleri;

public class _03_JavaVeriTipleriveString {
    public static void main(String[] args) {
        int sayi1=5; // short,byte, long, float, char, boolean : primitive tipler
        int sayi2=10;

        // ilkel tipi durumu, herkesin kendi değer hücresi var
        sayi1=sayi2;  // sayi1=10 ,sayi2=10
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        // bunlar hafızada farklı yerlere sahipler

        //referans tipler
        int[] dizi1={1,2,3};
        int[] dizi2={5,6};

        dizi1=dizi2;

        dizi1[0]=67;
        System.out.println("dizi1[0] = " + dizi1[0]);
        System.out.println("dizi2[0] = " + dizi2[0]);

        dizi2[0]=5;
        System.out.println("dizi1[0] = " + dizi1[0]);
        System.out.println("dizi2[0] = " + dizi2[0]);


        // Nesne Tipler
        // String, Integer, Double, Long
        int sayi=5;
        Integer rakam=4;
        String kelime="merhaba";
        // Null değer alabilen ilkel tipler.
        // Referans a yakın , ilkel gibi davranırlar.

        String ad1="mehmet";
        String ad2="ali";
        ad1=ad2;  // ad1=ali

        ad2="ayşe";
        System.out.println("ad1 = " + ad1);
        System.out.println("ad2 = " + ad2);

    }
}
