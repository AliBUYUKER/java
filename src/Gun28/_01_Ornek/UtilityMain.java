package Gun28._01_Ornek;

public class UtilityMain {
    public static void main(String[] args) {
        int sayi3; // int -> tip,   sayi-> değişken adı
        //tip    //nesne
        myUtlity myUt=new myUtlity();
        String strSayi=myUt.getString(356);
        int sayi=myUt.getInt("345");
        // bu metodlar Class a mı nesne ye mi ait
        // evet Nesne ye ait.

        Math.random(); // ben bunun direk nesne tanımlamadan
                      // kendi metdolarımı kullanmak istiyorum

        String strSayi2= myUtlity.getString2(23);
        int sayi2=myUtlity.getInt2("34");
        // bu metodlar nesne olusturmaya ihtiyac duymayan
        // class a (tipe ait) ait metodlardır.
        // tipe ait oldugu için tip adıyla cağrılabilir.
        Integer.parseInt("34"); // bu metod tipe ait
        Integer rakam=5;

        // Nesneyi ilgilendiren metdoları normal yazıyoruz.
        // Nesneyi ilgilendirmeyen, Tipi ilgilendiren
        // metodları STATIC ile yazıyoruz.
    }
}
