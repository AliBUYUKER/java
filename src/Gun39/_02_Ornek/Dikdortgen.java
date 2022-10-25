package Gun39._02_Ornek;

public class Dikdortgen extends Sekil{
    private int kisaKenar;
    private int uzunKenar;

    public Dikdortgen(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    double alan() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    double cevre() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
