package Gun25;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HastSet, LinkedHashSet, TreeSet
        // MAp -> HashMap, LinkedHaspMap, TreeMap
        // Map = Anahtar + Set -> Anahtarlı Set

        //anahtarmımın tipi Integer , depğerlerimin tipi String olacak
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1001, "İsmet Temur");
        hm.put(1002, "Birkan Yıldız");
        hm.put(2001, "Hasan Aşık");
        hm.put(5001, "Hatice");
        hm.put(2001, "Eyüpcan Bilgin"); // 2001 deki bilgiyi GÜNCELLİYOR

        System.out.println("hm = " + hm);
        System.out.println("hm.get(1002) = " + hm.get(1002));
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(2001); // 2001 anahtarındaki eleman silindi.
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        hm.clear();
        System.out.println("hm = " + hm);
    }
}
