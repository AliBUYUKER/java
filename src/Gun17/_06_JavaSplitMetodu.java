package Gun17;

import java.util.Scanner;

public class _06_JavaSplitMetodu {
    public static void main(String[] args) {
        //Kullanıcın gireceği 02/11/2022 şeklindeki tarih bilgisini
        // gün ay yıl olarak yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("tarih giriniz = ");
        String tarih=oku.nextLine();

        String[] zamanlar=tarih.split("/");

        for(int i=0;i<zamanlar.length;i++)
            System.out.println("zamanlar = " + zamanlar[0]);

        System.out.println("Gün = " + zamanlar[0]);
        System.out.println("Ay = " + zamanlar[1]);
        System.out.println("Yıl = " + zamanlar[2]);
    }
}
