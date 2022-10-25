package Gun32._04_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Sepet Goster, 5-Çıkış
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza> siparis = new ArrayList<>();

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    Pizza sp = new Pizza(PizzaSize.SMALL);
                    siparis.add(sp); break;
                case 2:
                    Pizza mp = new Pizza(PizzaSize.MEDIUM);
                    siparis.add(mp); break;
                case 3:
                    Pizza lp = new Pizza(PizzaSize.LARGE);
                    siparis.add(lp); break;
                case 4:
                    siparisYaz(siparis);
                    break;
            }

        } while (secim <= 4);

    }

    public static void siparisYaz(ArrayList<Pizza>  siparis){

        int s=0; int m=0; int l=0;
        for(Pizza p : siparis)
        {
            if (p.size == PizzaSize.SMALL)  s++;
            if (p.size == PizzaSize.MEDIUM)  m++;
            if (p.size == PizzaSize.LARGE)  l++;
        }

        System.out.println("*** Siparişleriniz ***");
        System.out.println("Small Pizza count = " + s);
        System.out.println("Medium Pizza count = " + m);
        System.out.println("Large Pizza count =" + l);
    }

    public static void menu() // TDD : Test Driven Development
    {
        System.out.println("****** PIZZA MENU ******");
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- Sepet Goster");
        System.out.println("5- Çıkış");
        System.out.print("Seciminiz =");
    }
    // TODO : Bu programı Pizza Class ında verilen özellikleride
    //  kapsayacak sekılde yazınız.
}
