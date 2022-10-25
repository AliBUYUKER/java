package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {

    public static void main(String[] args) {
        tekMiCiftMi(55);
        tekMiCiftMi(30);

        // kullanıcıdan bir sayı alarak tek mi çift mi yazdırınız.
        tekMiCiftMiOku();
        tekMiCiftMiOku();
        tekMiCiftMiOku();
    }

    public static void tekMiCiftMiOku(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi=oku.nextInt();
        //tekMiCiftMi(sayi);
        if (sayi%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");
    }

    public static void tekMiCiftMi(int sayi)
    {
        if (sayi %2==0)
            System.out.println("Çift");
        else
            System.out.println("Tek");
    }


}
