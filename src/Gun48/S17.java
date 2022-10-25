package Gun48;

public class S17 {
    public static void main(String[] args) {

        int[][] arr=new int[2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        //for(tipi değişken: anaDeğişken)

        for (int[] a:arr){  // 1.satırı a ya atıyor

            for (int i:a){  // satırı alıyor tek tek yazdırıyor
                System.out.print(i+" ");
            }

            System.out.println();
        }


    }
}
