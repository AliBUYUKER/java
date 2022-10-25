package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        ArrayList<Ogrenci> liste=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
           Ogrenci ogr=new Ogrenci();
           System.out.print("Ogrenci Ad=");
           ogr.adi=oku.nextLine();
            //....
           liste.add(ogr);
        }

        for(Ogrenci ogr : liste)
        {
            System.out.println("ogr.adi = " + ogr.adi);
        }

    }
}
