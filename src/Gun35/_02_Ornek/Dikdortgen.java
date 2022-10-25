package Gun35._02_Ornek;

public class Dikdortgen extends Sekil{
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    public double alan() {
        return uzunKenar*kisaKenar;
    }

    @Override
    public double cevre() {
        return (uzunKenar+kisaKenar) * 2;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        if (kisaKenar > 0)
           this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
