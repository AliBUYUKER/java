package Gun40._02_Ornek;

public class ABMain {
    public static void main(String[] args) {

        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);

        B b=new B();
        System.out.println("B.mesaj = " + B.mesaj);

        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj);

    }
}
// çalışınca nasıl bir çıktı veririr
// SORU: static biliyormusun;
// A.mesaj = A dan merhaba
// B.mesaj = B den merhaba
// A.mesaj = B den merhaba