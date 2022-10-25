package Gun15;

public class GununSorusu {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        //     *   4 boşul 1 yıldız
        //    **   3 boşluk 2 yıldız
        //   ***   2
        //  ****   1
        // *****   0


        for(int i=1;i<=5;i++) {

            //boşluklar burda olmalı
            for (int j = 0; j < 5-i; j++) // satır değeri kadar yaz (i)
                System.out.print(" ");

            for (int j = 0; j < i; j++) // satır değeri kadar yaz (i)
                System.out.print("*");

            System.out.println(); // satır işi bitince satır atla

        }


        // Sayının simetrik olduğunu nasıl anlarsın ?
        // sayının tersi kendisiyle aynı ise,  121  ->  121
        // sayının sondaki basamağını alacaksın, ve onu yeni bacamak geldikçe 10 çarpıp
        // yeni basamakla toplayacaksın.
        // 12521  -> 1 ->  1*10+2   -> 12*10+5  -> 125*10+2 -> 1252*10+1 -> 12521
    }
}
