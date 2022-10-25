package Gun44._02_JavaVeriTipleri;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";

        cumle = cumle + "Bugün ";
        cumle = cumle + "hava ";
        cumle += "soğuk";

        System.out.println(cumle);
        System.out.println("yan yana hali ="+ cumle.concat(" dün daha sıcaktı."));
        System.out.println("cumle = " + cumle);

        cumle = cumle.concat(" dün daha sıcaktı."); //atama gerektirir
        System.out.println("cumle = " + cumle);

        /***** StringBuilder  ***/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün ");  // append : atama gerektirmez, ekler
        cumle2.append("hava ");
        cumle2.append("güzel ");

        System.out.println("cumle2 = " + cumle2);


        //***  String ekleme işlemlerinde performans testi  ***/
        // 1. Yöntem + ile ekleme
        long startTime=System.currentTimeMillis();

        String test1="";
        for(int i=0;i<10000;i++)
            test1 = test1 + " merhaba";

        System.out.println("+ için Süre = " + (System.currentTimeMillis()-startTime)+" ms"); // 886 ms

        // 2. Yöntem concat ile ekleme
        startTime=System.currentTimeMillis();

        String test2="";
        for(int i=0;i<10000;i++)
            test2 = test2.concat(" merhaba");

        System.out.println("concat için Süre = " + (System.currentTimeMillis()-startTime)+" ms"); //124 ms


        // 3. Yöntem StringBuilder ile ekleme
        startTime=System.currentTimeMillis();

        StringBuilder test3=new StringBuilder();
        for(int i=0;i<10000;i++)
            test3.append(" merhaba");

        System.out.println("StringBuilder için Süre = " + (System.currentTimeMillis()-startTime)+" ms"); //1 ms

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("******************\n\n");
        /******  StringBuilder ı biraz daha inceleyelim ****/
        StringBuilder s=new StringBuilder();
        s.append("Bugün ");  // tekrar kendine atama gerektirmez, concat de gerekir.
        s.append(" hava");
        s.append(" güzel");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4); // eklenen her şeyi toString hali varsa çevirerek ekler
        System.out.println("s = " + s);

        s.reverse(); // stringi tersine çevirir.
        System.out.println("s = " + s);
        s.reverse();
        System.out.println("s = " + s);

        s.delete(0,5); // 0 dahil 5 hariç indexe göre siler.
        System.out.println("s = " + s);
        
        s.deleteCharAt(3); // sadece belirtilen indexteki karakteri siler
        System.out.println("s = " + s);

        s.insert(5,"kelime"); // 5 nolu indexe araya kelime eklendi
        System.out.println("s = " + s);

        s=new StringBuilder("Bugun hava sıcak");  // sıfırlandı ve ilk değer atandı
        System.out.println("s = " + s);

        s.replace(3,8, "bu"); // verilen aralığı verilenle değiştir
        System.out.println("s = " + s);

        String str=s.toString();

        StringBuffer sbuffer=new StringBuffer(); // tamamen StringBilder ile aynı
        // tekr farkı, paralel çalıan yazılımlarda, StringBuffer kullanılır
    }
}
