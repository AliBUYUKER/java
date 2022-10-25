package Gun33._03_Ornek;

import java.util.ArrayList;

public class Okul {
    private String okulAd; // encapsulation
    private int kontenjan;
    ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd); // encapsulation
        setKontenjan(kontenjan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                '}';
    }
}
