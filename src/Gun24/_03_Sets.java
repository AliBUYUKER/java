package Gun24;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); // bu eklenmedi
        renkler.add("RED"); // bu eklendi

        // Ekrana yazdırma
        System.out.println("renkler = " + renkler);

        //Ekrana yazdırma tek tek
        for(String eleman : renkler)  // foreach, dizinin içndeki sırasına gelmesi garanti değil
        {
            System.out.println("eleman = " + eleman);
        }

        // içindeki sıranın garanti edildiği yöntem
        Iterator gosterge=renkler.iterator(); // Hafıdaki ilk kutucuğun yerini aldım,
        // ben adım adım gitcem, böylece içideki sırayı takip edeceğim.

        //adım adım gitme , bir sonraki bir sonraki
        while (gosterge.hasNext()) // bir sonrakisi var mı ?
        {
            System.out.println("gosterge.next() = " + gosterge.next()); // o kutucuğu yazdır
            //if (boyleyse)  gosterge.remove(); // o andaki kutucuğu siler
        }


    }
}
