package Gun33._03_Ornek;

public class Ogrenci {
    private int ID;
    private String ad;
    private String soyad;
    private int yas;

    private static int sayacID=0;

    public Ogrenci(String ad, String soyad, int yas) {
        this.ID = ++sayacID; // ++ : önce artır, sonra işlem

        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public int getID() {
        return ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
