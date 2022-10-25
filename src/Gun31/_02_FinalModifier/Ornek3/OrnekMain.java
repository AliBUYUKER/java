package Gun31._02_FinalModifier.Ornek3;

import java.util.Scanner;

public class OrnekMain {
    public static void main(String[] args) {
        int gun = 0;
        int saat = 0;
        int dak = 0;

        Scanner oku = new Scanner(System.in);
        System.out.print("Gun=");
        gun = oku.nextInt();
        System.out.print("Saat=");
        saat = oku.nextInt();
        System.out.print("Sakika=");
        dak = oku.nextInt();

        //1.Yöntem
        int toplamSaniye =
                gun * Sabitler.birGundekiSaatSayisi *
                        Sabitler.birSaattekiDakikaSayisi *
                        Sabitler.birDakikadakiSaniyeSayisi
                +
                saat * Sabitler.birSaattekiDakikaSayisi*
                Sabitler.birDakikadakiSaniyeSayisi
                +
                dak*Sabitler.birDakikadakiSaniyeSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        //2.Yöntem ve olması gereken yöntem
        System.out.println("Sabitler.toSecond() = " +
                Sabitler.toSecond(gun,saat,dak));
    }
}
