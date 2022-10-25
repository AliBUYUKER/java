package Gun30._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();

        cal1.id=1;  // direk erişim olmaması laszım
                    // sıradan gelen rakam verilmeli
        cal1.name="ismet";
        cal1.surName="temur";
        //cal1.password="123"; // direk erişiliyor,
        // hemde kontrolsüz atandı.
        // direk erişime kapalı olmalı
        // bunun yerine clasa metod ekledim
        cal1.sifreAta("123");
        cal1.sifreAta("wew32322323");

        cal1.sifreGoster();
    }
}
