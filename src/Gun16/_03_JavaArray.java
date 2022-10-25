package Gun16;

public class _03_JavaArray {
    public static void main(String[] args) {
        int[] dizi1=new int[5]; // 0,1,2,3,4
        int[] dizi2={5,77,56,7,88,99,1021,33}; // hem uzunluğunu ve değerlerini verdin.

        System.out.println("dizi2.length = " + dizi2.length);

        String[] kelimeler=new String[5]; // 5 tane kelime saklayabilen bir dizi değişkeni
        boolean[] dizi3=new boolean[5]; // 5 tane boolean saklayabilen bir dizi değişkeni
        double[] oranlar=new double[5]; // 5 tane double cinsi değer saklayabilen bir dizi

        for(int i=0;i<dizi1.length;i++)
            System.out.println("dizi1 = " + dizi1[i]); // int[] def: 0

        for(int i=0;i<dizi2.length;i++)
            System.out.println("dizi2 = " + dizi2[i]);

        for(int i=0;i<kelimeler.length;i++)
            System.out.println("kelimeler = " + kelimeler[i]); // String[] def: null

        for(int i=0;i<dizi3.length;i++)
            System.out.println("dizi3 = " + dizi3[i]); // boolean[] def: false

        for(int i=0;i<oranlar.length;i++)
            System.out.println("oranlar = " + oranlar[i]); // double[] def: 0.0
    }
}
