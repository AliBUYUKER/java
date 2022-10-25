package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {
        int[] dizi=new int[10]; // boş default değer 0
        int[] dizi2={34,5,67,88,93,44,45,55,66,33}; // 10 elemanlı değerleri baştan atanıyor

        int[][] tablo=new int[2][3]; // boş default değer 0
        int[][] tablo1={ {3,4,5}, {56,7,88}  };  // her bir satır için içerde {} açılır
        // {3,4,5}  1.satır  ,   {56,7,88} 2.satır
        //   2 SATIR  ,    3 SUTUN     int[][] tablo1=new int[2][3];


        for(int satir=0;satir<2;satir++){
            System.out.print(tablo1[satir][0]);  // her satırın ilk elemanı 0 index
            System.out.print(" "+tablo1[satir][1]);  // her satırın ikinci elemanı 1 index
            System.out.print(" "+tablo1[satir][2]);  // her satırın ucuncu elemanı 2 index

            System.out.println();
        }

        for(int satir=0;satir<2;satir++){

          for(int sutun=0;sutun < 3 ; sutun++)
            System.out.print(tablo1[satir][sutun]+"\t");

            System.out.println();
        }



    }
}
