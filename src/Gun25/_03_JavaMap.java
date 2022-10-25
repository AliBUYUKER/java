package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız.

        HashMap<String,String> vKartVizit=new HashMap<>();
        vKartVizit.put("isim", "Volkan Alntıntaş");
        vKartVizit.put("email", "volkan@gmail.com");
        vKartVizit.put("adres", "Çekmeköy/Türkiye");
        vKartVizit.put("telefon", "0505235896");

        System.out.println("vKartVizit.get(isim) = " + vKartVizit.get("isim"));
        System.out.println("vKartVizit.get(telefon) = " + vKartVizit.get("telefon"));

        HashMap<String,String> eKartVizit=new HashMap<>();
        eKartVizit.put("isim", "Elba Gurbanov");
        eKartVizit.put("email", "elba@gmail.com");
        eKartVizit.put("adres", "Bakü/Azerbaycan");
        eKartVizit.put("telefon", "+99423565544");

        // Kartvizitlerim diye bir defteri nasıl tanımlardım.
        // volkan ın kartviziti
        //       elba nın      kartviziti
        HashMap<String,   HashMap<String,String>      > Kartvizitlerim=new HashMap<>();
        Kartvizitlerim.put("volkan", vKartVizit);
        Kartvizitlerim.put("elba", eKartVizit);

        // volkanın telefonuna nasıl ulaşırım
        System.out.println("Kartvizitlerim.get(volkan) = " + Kartvizitlerim.get("volkan"));
        System.out.println("Volka nın telefonu ="+ Kartvizitlerim.get("volkan").get("telefon"));
        System.out.println("Elba nın adresi ="+ Kartvizitlerim.get("elba").get("adres"));
    }
}
