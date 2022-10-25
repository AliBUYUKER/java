package Gun37._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
        //bir interface in birden class tarafından implemente edilmesi
        Cember c=new Cember();
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        //interface lerden nesne üretileme fakat referans tipi
        // oluşturulabilir. bu bize Polymorphism sağladı.
        ICizdirir c2=new Cember();
        c2.ciz(); // direk olarak sadece Interface deki
        // ismi verilmiş olanlar metodlara erişeniirsin

        cizdirme(c);
        cizdirme(d);
    }

    public static void cizdirme(ICizdirir iciz)
    {
        iciz.ciz();
    }

}
