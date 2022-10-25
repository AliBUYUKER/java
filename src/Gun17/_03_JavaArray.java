package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında tek ve çift eleman sayılarını bulunuz.

        int[] dizi=new int[100];  //100 Elemanlı bir dizi

        //random olarak 100 e kadar olan sayılarla doldurunuz
        for(int i=0;i< dizi.length ; i++)
            dizi[i]=(int)(Math.random()*100); // 0,985656 -> 98,656656 -> (int) -> 98

        //kontrol için yazdırdık
        for(int i=0;i< dizi.length ; i++)
            System.out.println(i+".Kutu= "+dizi[i]);

        int ciftMiktar=0;
        int tekMiktar=0;
        for(int i=0;i< dizi.length ; i++)
        {
            if (dizi[i]%2 == 0) //ceviz leri 2 şer 2 şer dağıttın ne kaldı
                ciftMiktar++;
            else
                tekMiktar++;
        }

        System.out.println("tekMiktar = " + tekMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);
    }
}
