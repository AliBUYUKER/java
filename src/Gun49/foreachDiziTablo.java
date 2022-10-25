package Gun49;

public class foreachDiziTablo {
    public static void main(String[] args) {
        int[] dizi = {4, 5, 6, 7, 8};

        int toplam = 0;
        for (int e : dizi) //içindeki elemanları e adını vererek gönder:
        {
            toplam = toplam + e;
            System.out.println("e = " + e);
        }
        // default olarak davranışı sıralı gelir, ama garanti etmez, for gibi
        // indexli bir takip sırası olmadığından sırayı garanti etmez.

        // normalde 1 hafta sürer ama garanti edemeyiz iş yoğunluğuna göre değişir
        // normalde sıralı çalışır ama garanti edemeyiz.

        for (int i = 0; i < dizi.length; i++)  // sıra garanti, bir 3 günde bağlantıyı garanti ediyoruz
            System.out.println(dizi[i]);

        /***************** 2 boyutlula için *************************/

        int[][] tablo = new int[2][3];
        tablo[0][0] = 4; tablo[0][1] = 5; tablo[0][2] = 6;
        tablo[1][0] = 40; tablo[1][1] = 50; tablo[1][2] = 60;

        // tablonun elemanları satır bazlı, yani tablonun , tablonun elemanlar 0.Satır ve 1.Satır
        //tablo[0]= new int[5];


        for(int[] satir: tablo)  // tablonun her bir satırını alıp satir ismi ile gönderecek
        {

            for (int e: satir) // satir -> int[]
                System.out.println("e = " + e);
        }


        for(int i=0;i< tablo.length ; i++)   // sıra garanti
            for(int j=0; j< tablo[0].length ; j++)
                System.out.println(tablo[i][j]);

    }
}
