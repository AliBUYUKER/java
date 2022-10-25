package Gun34._02_Ornek;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("beyaz", 20, "kangal");

        kopek1.konustu();
        //önce kendisindeki kullanır , yoksa super e gider.


        Ordek ordek1=new Ordek("siyah",10, "pekin", 1);
        ordek1.konustu();
    }
}
