package Gun19;

public class _05_Java2DArrays {
    public static void main(String[] args) {
       int[][] tablo={  // 5 satır 3 sütun -> 5x3
               {4,55,66},  // 0.Satır
               {45,6,77},  // 1.Satır
               {4,2,999},  // 2.Satır
               {42,12,9},  // 3.Satır
               {4,22,39},  // 4.Satır
       };

        System.out.println("Satır miktarı="+tablo.length);
        System.out.println("0.Satırdaki sutun sayısı="+tablo[0].length);
        System.out.println("1.Satırdaki sutun sayısı="+tablo[1].length);
        System.out.println("2.Satırdaki sutun sayısı="+tablo[2].length);
        System.out.println("3.Satırdaki sutun sayısı="+tablo[3].length);
        System.out.println("4.Satırdaki sutun sayısı="+tablo[4].length);

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length ; j++) {
                System.out.print(tablo[i][j]+"\t");
            }

            System.out.println();
        }



    }
}
