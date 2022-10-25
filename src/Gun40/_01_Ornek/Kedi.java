package Gun40._01_Ornek;

public class Kedi extends Hayvan{

    public Kedi(String isim, boolean vahsi, String dogunTarihi) {
        // int a=5; miras alınan constructor larda super in constructor ından önce herhangi bir satır olamaz
        super(isim, vahsi, dogunTarihi);

    }

    @Override
    void yiyecegi() {
        System.out.println("mama ve balık");
    }

    @Override
    void yemekMiktari() {
        System.out.println("100gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("16 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
