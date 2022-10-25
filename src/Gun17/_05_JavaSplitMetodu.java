package Gun17;

import java.util.Arrays;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split : bir stringi parçalara ayırır, verilen kritere göre

        String cumle="Bugün hava oldukça soğuk"; // bunu kelimelerine ayırmak istiyoruz
        //Bugün
        //hava
        //oldukça
        //soğuk
        String[] kelimeler=cumle.split(" ");
        //bir şey verilmezse karakterlerine ayırır

        for(int i=0;i<kelimeler.length;i++)
            System.out.println(i+".kelime = " + kelimeler[i]);

        //kısa yazdırma yolu
        System.out.println("kelimeler = " + Arrays.toString(kelimeler));
    }
}
