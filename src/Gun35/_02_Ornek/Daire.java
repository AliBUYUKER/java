package Gun35._02_Ornek;

public class Daire extends Sekil{
    private int yaricap;

    public Daire(int yaricap) {
        setYaricap(yaricap);
    }

    @Override  // PI * r * r
    public double alan() {
        return  Math.PI * yaricap * yaricap ;
    }

    @Override
    public double cevre() {
        return Math.PI * 2 * yaricap;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
}
