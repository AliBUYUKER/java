package Gun21;

public class _02_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // giden yok, donen yok -> mutfakta bardakları yıka
        toplamYaz(4,5); // giden var, donen yok (fonksiyonu bir şeye eşitleyebilir musun)
        int enb=Math.max(4,5); // giden var, donen var // elindeki bardağı verdin gönderdin, sonra bana kaç bardak yıkadığını söyle
        double sayi=Math.random(); //  giden yok, donen var // mutfaktaki bardakları yıka, kaç bardak yıkadığını bana gel söyle

       /***************************************/
       enbYaz(4,5); // giden var 4,5   ama dönen yok

       int donen = enbBul(4,5); // giden var , dönen de var
        System.out.println("donen = " + donen);
    }

    public static int enbBul(int sayi1, int sayi2)  // dönecek tip
    {
        int doenecek=0;
        if (sayi1 > sayi2)
            doenecek=sayi1;
        else
            doenecek=sayi2;

        return doenecek;  // dönecek olan değişken yazılıyor,
        // fonksiyonun adından önceye de
        // dönecek olan değişkenin tipi yazılır.
    }



    public static void enbYaz(int sayi1, int sayi2)
    {
        if (sayi1 > sayi2)
            System.out.println("sayi1 = " + sayi1);
        else
            System.out.println("sayi2 = " + sayi2);
    }










    public static void toplamYaz(int sayi1, int sayi2)
    {
        System.out.println(sayi1+sayi2);
    }

    public static void merhabaYaz()
    {
        System.out.println("Mehaba Dünya");
    }

}
