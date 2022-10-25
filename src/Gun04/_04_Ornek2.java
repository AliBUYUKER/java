package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short değişken tanımlayınız,
        // değer atayınız, sonra double değişkeni short değişkene çevirerek,
        // bütün değerleri ekrana yazdırınız.

        double oran= 3.2;
        short kisa=2;

        System.out.println("önce kisa = " + kisa);
        kisa = (short)oran; // değer sığabildiği için tam sayı kısmını alır, ama
                            // ama ondalıklı kısım alınamaz.
        System.out.println("sonra kisa = " + kisa);

        oran = 30000000.2;
        kisa = (short)oran; // short en fazla 32767 degeri alabilir
        System.out.println("sonra kisa 2= " + kisa);
        // hem tam sayı kısmı sığmıyor, hemde ondalıklı kısım atılamıyor
        // tamamen değer kayboluyor.

    }
}
