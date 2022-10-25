package Gun34._03_Ornek;

public class GenelMudur extends Calisan{
    private double tazminat;

    public GenelMudur(String isim, double maas, int maasKatsayisi, double tazminat) {
        super(isim, maas, maasKatsayisi); // super: miras alınan sınıf
        setTazminat(tazminat);
    }

    public double maasHesapla() { // pratikte override
        return super.maasHesapla()+tazminat;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "isim='" + getIsim() +
                " tazminat=" + tazminat +
                " maas="+ super.getMaas()+
                " maasKatsayisi"+super.getMaasKatsayisi()+
                '}';
    }
}
