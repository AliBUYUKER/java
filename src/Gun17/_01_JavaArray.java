package Gun17;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 2 atayınız  yazdırınız.

        int[] dizi=new int[50]; // 50 elemanlı bir dizi tanımlayınız

        for(int i=0;i<dizi.length;i++) // 0-49 dahil arası
            dizi[i]=(int)(Math.random()*10);  //10 a kadar olan sayılardan Random atayarak doldurunuz

        for(int i=0;i<dizi.length;i++) // kontrol için yazdırdık
            System.out.println(i+".sayi= "+dizi[i]);

        for(int i=0;i<dizi.length;i++) //Sonrasında ayrı bir döngü
        {
            if (dizi[i]%2 ==1)
                dizi[i]=1; //tek olanlar 1
            else
                dizi[i]=2; //çift olanlara 2
        }

        System.out.println("*********************");
        for(int i=0;i<dizi.length;i++) // kontrol için yazdırdık
            System.out.println(i+".sayi= "+dizi[i]);

    }
}
