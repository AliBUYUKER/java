package Gun37._06_Soru_prev;

public class Dikdortgen implements ISekil{
    @Override
    public double cevresi(int kisaKenar, int uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }

    @Override
    public double alani(int kisaKenar, int uzunKenar) {
        return kisaKenar*uzunKenar;
    }
}
