package Gun46;

public class S23 {
    public static void main(String[] args) {
        int[] stack = {10,20,30};
        int size=3;
        int idx=0;

        do{
            idx++;   // idx=1 , 2
        }while (idx < size - 1);  // 1 < 2 ,   2<2 duruyor

        //idx=1
        System.out.println("The Top elemen : " + stack[idx]);  // 30

    }
}
