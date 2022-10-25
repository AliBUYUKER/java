package Gun03;

public class _04_Ornek1 {
    public static void main(String[] args) {
        //  İki kenarı tanımlı olarak verilen bir
        //  dikdortgenin çevresini ve alanını bulunuz
        //  çarpma :   * kullanılıyor ,   x ise harf olarak kullanılıyor
        //  bir kenarı a ise , diğer kenarı b ise, cevre=a+a+b+b, alan =a*b

        int kisaKenar=4;
        int uzunKenar=6;

        int cevre = kisaKenar+kisaKenar+uzunKenar+uzunKenar;
        int alan = kisaKenar * uzunKenar;

        System.out.println("Alan="+alan);
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
