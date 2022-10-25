package Gun28._02_Ornek;

// Math sınıfndaki metodlarıdan 5 tanesini
// kendi isimlendirmenizle ayrı bir sınıfta yazarak,
// (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
// mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
// kullanımlarını yazınız.

public class Soru {
    public static void main(String[] args) {

        MyMath.getMin(4,5);

        int rndSayi=MyMath.getRandom(10);
        System.out.println("rndSayi = " + rndSayi);

        int rndSayi2=MyMath.getRandom(4,11);
        System.out.println("rndSayi2 = " + rndSayi2);

        int roundSayi=MyMath.getRound(3.2344);
    }

}
