package Gun39._02_Ornek;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(4,5);
        d.setName("Dikdörtgen Şekli");
        System.out.println(d);


        Daire dr=new Daire(5);
        dr.setName("1.Daire Şekli");
        System.out.println(dr);


        Daire dr2=new Daire(4);
        dr2.setName("2.Daire Şekli");
        System.out.println(dr2);
    }
}
