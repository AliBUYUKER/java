package Gun40._01_Ornek;

public abstract class Hayvan { // 2 si birarada
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogunTarihi;

    private static int idSayac=0;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public Hayvan(String isim, boolean vahsi, String dogunTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogunTarihi(dogunTarihi);
        this.id= ++idSayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogunTarihi() {
        return dogunTarihi;
    }

    public void setDogunTarihi(String dogunTarihi) {
        this.dogunTarihi = dogunTarihi;
    }

    public int getIdSayac() {
        return idSayac;
    }

    @Override
    public String toString() {
        System.out.println("********************");
        System.out.println("id="+id);
        System.out.println("isim="+isim);
        System.out.println("vahsi="+vahsi);
        System.out.println("dogunTarihi="+dogunTarihi);

        yiyecegi();
        yemekMiktari();
        gunlukUykuSuresi();
        sesi();

        return "Hayndan türetildi";
    }
}
