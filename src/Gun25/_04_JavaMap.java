package Gun25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {
        // ortak yönleri tekrarlı eleman olamaz
        Map<Integer, String> hm=new HashMap<>(); // Map lerden HasMap
        hm.put(9, "tilki");
        hm.put(2,"kedi");
        hm.put(30,"kopek");
        hm.put(11,"kuş");
        hm.put(4, "kurt");
        System.out.println("hm = " + hm); // hızlı çalışmak için kendisine göre

        Map<Integer, String> lhm=new LinkedHashMap<>(); // Map lerden LinkedHashMap
        lhm.put(9, "tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"kopek");
        lhm.put(11,"kuş");
        lhm.put(4, "kurt");
        System.out.println("lhm = " + lhm); // eklenme sırasına

        Map<Integer, String> tm=new TreeMap<>(); // Map lerden TreeMap
        tm.put(9, "tilki");
        tm.put(2,"kedi");
        tm.put(30,"kopek");
        tm.put(11,"kuş");
        tm.put(4, "kurt");
        System.out.println("tm = " + tm); // her zaman sıralı


    }
}
