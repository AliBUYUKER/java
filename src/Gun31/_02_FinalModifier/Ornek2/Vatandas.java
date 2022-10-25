package Gun31._02_FinalModifier.Ornek2;

public class Vatandas {
    String isim;
    final int tcNo;

    static int sayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo=sayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
