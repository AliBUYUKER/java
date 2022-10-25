package Gun48;

public class S71 {
    public static void main(String[] args) {
        int [][]  arr =new int[2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        System.out.println("satır sayısını="+arr.length); // satır sayısını 2
        System.out.println("0.satırın uzunluğu="+arr[0].length); // 0.satırın uzunluğu 4
        System.out.println("1.satırın uzunluğu="+arr[1].length); // 1.satırın uzunluğu 2

        for (int[] a: arr){   // 1357   13
            for (int i=0; i< arr.length;i++){   // 13   13
                System.out.print( a[i]+  "");
            }
            System.out.println();
        }
    }
}
