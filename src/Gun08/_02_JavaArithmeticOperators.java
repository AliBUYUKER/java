package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1;  // sayacın degerini 1 artırır  1
        sayac++ ;  // sayacın degerini 1 artırır   2
        ++sayac ;  // sayacın degerini 1 artırır   3

        sayac=sayac-1; // sayacın degerini 1 azalt  2
        sayac-- ;  // sayacın değerini 1 azalt  1
        --sayac ;  // sayacın değerini 1 azalt  0

        /****************************/
        int sonuc =0;
        sayac=0;
        sonuc = sayac++;  // ++ veya -- ler sag tarafta ise
                          // yokumuş gibi işlemi yapıcaz sonra
                          // ++ veya -- leri yapıcaz.
        sonuc =sayac;
        sayac=sayac+1;

        // ++ lar solda
        sonuc=0;
        sayac=0;
        sonuc = ++sayac;  // ++ veya -- ler solda tarafta ise
                          // önce +++ veya -- ler yapılır
                          // sonra işlem yapılır
        sayac=sayac+1;
        sonuc = sayac;
    }
}
