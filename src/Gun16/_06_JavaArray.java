package Gun16;

public class _06_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] tvler={"trt1", "kanald", "atv","fox","habertürk"};

        int secilen= (int)(Math.random()*tvler.length); // 0 1 2 3 4
        System.out.println("secilen = " + secilen);
        System.out.println("tvler = " + tvler[secilen]);


        // TODO : gunun sorusu : bir döngü ile 5 tane buldurunuz
        // fakat bir buldunu tekrar bulmasın

    }
}
