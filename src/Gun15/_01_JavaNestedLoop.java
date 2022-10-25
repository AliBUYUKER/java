package Gun15;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        //Bunu hepsini istiyoruz 1-10

        for(int j=1; j<10 ; j++) {

            for (int i = 1; i <= 10; i++) { // yukarıdaki her bir deger için çalışır
                System.out.println(j+ " x " + i + "=" + (j * i));
            }

            System.out.println();
        }



    }

}
