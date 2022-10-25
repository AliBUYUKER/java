package Gun36._03_Polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabaş");
//        kopek1.ses();
//        kopek1.kokladi();

        Kedi kedi1=new Kedi("kopuk");
//        kedi1.ses();
//        kedi1.tirmaladi();

        kopekSesi(kopek1);
        kediSesi(kedi1);

        hayvaSesi(kopek1);
        hayvaSesi(kedi1);

        /*****************************/
        Hayvan hayvan1=new Hayvan("ördek"); // hayvanlar dan bir hayvan
        Hayvan hayvan2=new Kopek("kangal"); // hayvan lardan kopek
        Hayvan hayvan3=new Kedi("boncuk"); // hayvan lardan kedi
        //referans       nesne türü
        System.out.println("-----------------------");
        hayvan1.ses(); // genel hayvan  ses çıkardı
        hayvan2.ses(); // kopek hayvan  havladı
        hayvan3.ses(); // kedi hayvan   miyavladı
        System.out.println("----------------------");

        hayvan2.ses(); // kopek de olsa hayvan Referansı sebebiyle metodlar kısıtlı
        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yara mı
        ((Kopek)hayvan2).kokladi();  // artık diğer metodları kullanabilirim.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü



//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.
    }

    public static void kopekSesi(Kopek kopek1)
    {
        kopek1.ses();
    }

    public static void kediSesi(Kedi kedi1)
    {
        kedi1.ses();
    }

    public static void hayvaSesi(Hayvan hayvan){
        hayvan.ses();
    }


}
