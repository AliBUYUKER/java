package Gun21;

// Kullanıcıya aşağıdaki gibi bir menü çıkartarak, kullanıcı çıkış seçeneğini seçene kadar
// sürekli işlemleri yapınız ve her bir menü için gerekli değerleri parametre alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

import java.util.Scanner;

public class _01_JavaMethod {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int secim;
        do {
            menuYaz();
            secim=oku.nextInt();
            if (secim < 5)  islemYap(secim);
        }while (secim < 5); // dönme şartı secim <5

        System.out.println("Çıkış yapıldı");
    }

    public static void menuYaz()
    {
        System.out.print(
                "1 - Toplama\n" +
                        "2 - Çıkarma\n" +
                        "3 - Çarpma\n" +
                        "4 - Bölme\n" +
                        "5 - Çıkış\n" +
                        // Faktöryel menüsünü ekleyelim.
                        "Seçiminiz=");
    }

    public static void islemYap(int secim)
    {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi1=");
        int sayi1 = oku.nextInt();
        System.out.print("Sayi2=");
        int sayi2 = oku.nextInt();

        switch (secim) {
            case 1:System.out.println("Sonuç=" + (sayi1 + sayi2));break;
            case 2:System.out.println("Sonuç=" + (sayi1 - sayi2));break;
            case 3:System.out.println("Sonuç=" + (sayi1 * sayi2));break;
            case 4:System.out.println("Sonuç=" + (sayi1 / sayi2));break;
        }
    }

   // public static void topla(){}

}
// TODO : 4 işlem kısmınıda ayrı bir fonksiyonda yapalım
// TODO : menülere yeni bir seçenek olarak girilen sayıya kadar sayıların çarpımını veren faktörel i de ekleyelim