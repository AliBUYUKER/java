package Gun17;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int[] dizi=new int[100];  //100 Elemanlı bir dizi

        //random olarak 100 e kadar olan sayılarla doldurunuz
        for(int i=0;i< dizi.length ; i++)
            dizi[i]=(int)(Math.random()*100);

        //kontrol için yazdırdık
        for(int i=0;i< dizi.length ; i++)
            System.out.println(i+".Kutu= "+dizi[i]);


        int enb=0;
        int enbIndex=0;
        for(int i=0;i< dizi.length ; i++){

            if (dizi[i]>enb) { // dizinin sıradaki elemanı enb den büyük ise enb o olsun
                enb = dizi[i];
                enbIndex=i;
            }

        }

        System.out.println("enb = " + enb);
        System.out.println("enbIndex = " + enbIndex);

    }
}
