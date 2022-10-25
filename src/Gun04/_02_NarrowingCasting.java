package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.9;
        int sayi=5;

        sayi = (int)oran;

        System.out.println("sayi = " + sayi); // 3

        long genelToplam = 3787878888560L;

        sayi=(int)genelToplam;   // veri kaybı olacak mı ?
        System.out.println("sayi = " + sayi);

    }
}
