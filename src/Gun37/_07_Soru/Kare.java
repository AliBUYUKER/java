package Gun37._07_Soru;

public class Kare implements ISekil{
    @Override
    public double cevresi(int... dizi) {
        return (dizi[0]+dizi[0])*2;
    }

    @Override
    public double alani(int... dizi) {
        return dizi[0]*dizi[0];
    }
}
