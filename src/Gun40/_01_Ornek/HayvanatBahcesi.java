package Gun40._01_Ornek;

public class HayvanatBahcesi {
    public static void main(String[] args) {

        Hayvan h1=new Kedi("köpük", false, "01/01/2010");
        System.out.println(h1);

        Kedi k1=new Kedi("köpük", false, "01/01/201");
        System.out.println(k1);

        Hayvan kr=new Kartal("Kartal", true, "01/01/201");
        System.out.println(kr);
    }
}
