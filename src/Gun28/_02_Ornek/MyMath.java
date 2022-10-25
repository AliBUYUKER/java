package Gun28._02_Ornek;

public class MyMath {

    static int getMin(int a, int b)
    {
        return Math.min(a,b);
    }

    static int getRandom(int max)
    {
        return (int)(Math.random()*max);
    }

    static int getRandom(int min, int max)
    {
        return ((int)(Math.random()* (max-min))+min);
    }

    static int getRound(double sayi)
    {
        return (int)Math.round(sayi);
    }

}
