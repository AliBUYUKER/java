package Gun41._01_Ornek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        List<IFood> siparisler = new ArrayList();
        Scanner oku = new Scanner(System.in);

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    IFood ak = new AdanaKebap();
                    siparisler.add(ak);
                    break;
                case 2:
                    Lahmacun l = new Lahmacun();
                    siparisler.add(l);
                    break;
                case 3:
                    Borsh b = new Borsh();
                    siparisler.add(b);
                    break;
                case 4:
                    Palov p = new Palov();
                    siparisler.add(p);
                    break;
            }
        } while (secim < 5);

        System.out.println("Alınan Siparişler");
        for(IFood f : siparisler)
        {
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("Siparişler Hazilaniyor");
        double toplamUcret=0;
        for(IFood f : siparisler)
        {
            TechnoKitchen.hazirla(f);
            toplamUcret+=f.ucret();
        }
        System.out.println("toplamUcret = " + toplamUcret);
    }


    static void menu() {
        System.out.print("\n****Menü*****" +
                "\n1-Adana Kebap (50 TL)" +
                "\n2-Lahmacun (30 TL)" +
                "\n3-Borsh (30 TL)" +
                "\n4-Palov (20 TL)" +
                "\n5-Tamam" +
                "\nSeçiminiz=");
    }

}
