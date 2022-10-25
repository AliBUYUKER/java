package Gun27._02_Ornek;

public class Geometri {
    public static void main(String[] args) {

        Dikdortgen sekil=new Dikdortgen();
        sekil.kisaKenar=5;
        sekil.uzunKenar=10;

        int alan=sekil.alan();
        int cevre=sekil.cevre();

        System.out.println("cevre = " + sekil.cevre());
        System.out.println("alan = " + sekil.alan());
    }
}
