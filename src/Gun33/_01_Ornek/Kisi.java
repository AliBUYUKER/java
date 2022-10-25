package Gun33._01_Ornek;

public class Kisi {
    private String ad; // 25 karakter olsun
    private String soyad;
    private int yas; // korumaya aldım


    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + "\n" +
                ", soyad='" + soyad + "\n" +
                ", yas=" + yas + "\n" +
                '}';
    }

    void yasAta(int yas) // veriyi kontrol ederek aldım
    {
        if (yas > 0)
            this.yas=yas;
        else
            System.out.println("hatalı yaş");
    }

    int yasVer()
    {
        return this.yas;
    }

    void setAd(String ad)
    {
        if (ad.length() < 25)
            this.ad=ad;
    }

    String getAd()
    {
        return this.ad;
    }

    void setSoyad(String soyad)
    {
        if (soyad.length() < 25)
            this.soyad=soyad;
    }

    String getSoyad()
    {
        return this.soyad;
    }



}
