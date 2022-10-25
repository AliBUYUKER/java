package Gun40._01_Ornek;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogunTarihi) {
        super(isim, vahsi, dogunTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("et");
    }

    @Override
    void yemekMiktari() {
        System.out.println("1 kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyak");
    }
}
