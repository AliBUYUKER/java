package Gun49;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null); // tip Integer olduğunda Nesne Tipleri null olabiliyor

        System.out.println("points = " + points);
        points.remove(1); // sadece rakam verirsen onu index kabul eder ve ona göre silerim
                         // Object yani değer verirsen , değer silerim

        System.out.println("points = " + points);

        points.remove((Object)1); // değere göre siler

        System.out.println("points = " + points);

        points.remove(null);
        System.out.println("points = " + points);

        // değer silerken aynı değerden 2 tane var ise ilkini siler.
    }
}
