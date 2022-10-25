package Gun35._02_Ornek;

public class Geometri {
    public static void main(String[] args) {
        Daire d=new Daire(5);
        System.out.println("d.alan() = " + d.alan());
        System.out.println("d.cevre() = " + d.cevre());

        Dikdortgen dd=new Dikdortgen(5,4);
        System.out.println("dd.alan() = " + dd.alan());
        System.out.println("dd.cevre() = " + dd.cevre());

        Kare k=new Kare(6);
        System.out.println("k.alan() = " + k.alan());
        System.out.println("k.cevre() = " + k.cevre());
    }
}
