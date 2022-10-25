package Gun27._04_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;// değiştirelememli
    double fatura=0;

    void tuketimEkle(int gelenTuketim)
    {
       toplamTuketim=toplamTuketim+gelenTuketim;
    }

    void faturaYaz(String musteriAdi)
    {
        double toplamTutar= toplamTuketim*birimFiyat;
        System.out.println("***************************");
        System.out.println("musteriAdi = " + musteriAdi);
        System.out.println("toplamTuketim = " + toplamTuketim);
        System.out.println("toplamTutar = " +
                Math.round(toplamTutar)+" ₺");
        System.out.println("***************************");
    }

    void toplamTuketimYaz()
    {
        System.out.println("toplamTuketim = " + toplamTuketim);
    }

}
