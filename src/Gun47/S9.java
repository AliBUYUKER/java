package Gun47;

public class S9 {
    public static void main(String[] args) {
        int[] intArr={8,16,32,64,128};

        //a out of bounds hatası : runtime error
//        for(int i: intArr)
//            System.out.println(intArr[i]+" ");

        // b doğru
        for(int i: intArr)
            System.out.println(i+" ");

        //c  hatalı compile error
//        for(int i=0: intArr){
//            System.out.println(intArr[i] + " ");
//            i++;
//        }

        //d  sadece indexi yazdırır
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println("i = " + i);
//        }

        //e doğru
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        //f  : compile error
//        for (int i; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }

    }
}
