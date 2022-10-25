package Gun49;

import java.util.Arrays;

public class S39 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

//        for (int index = 1; index < 2; index++) {
//            for (int idx = 1; idx < 2; idx++) {
//                System.out.println(shirts[index][idx] + ":");
//            }
//        }

//        for (int index = 0; index < 2; ++index) {
//            for (int idx = 0; idx < index; ++idx) {   // index 0, 1
//                System.out.println(shirts[index][idx] + ":"); // 10 small
//            }
//        }
        // 2.for index e kadar gidiyor, index in ilk değeri olan 0 için, 2.for sınırlar izin
        // vermediği için dönemez. Bu sefer dış döngü de index in değeri 1 artar. iç döngü 0 dan
        // 1 küçüğe kadar çalıştığı için, sadee 1 0 elemanı yazılır. : small

        for (String[] c : shirts) {  // shirts içindeki satırları al c ismini ver ve döngüye gönder
            for (String s : c) { // satırdaki elemanları al s adını vererek döngüye gönder
                System.out.println(s + ":");
            }
        }

//        for (int index = 0; index <= 2; ) {
//            for (int idx = 0; idx <= 2; ) {
//                System.out.println(shirts[index][idx] + ":");
//                idx++;
//            }
//            index++;
//        }
    }
}
