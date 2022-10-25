package Gun37._04_Ornek;

public class A4 implements IGosterir,IYazdirir{
    //hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("gösterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırdı");
    }
}
