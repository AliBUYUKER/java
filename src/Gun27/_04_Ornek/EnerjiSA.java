package Gun27._04_Ornek;

public class EnerjiSA {
    /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir (field) ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı(fatura)  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

    public static void main(String[] args) {
        Musteri mus1=new Musteri();
        mus1.name = "ismet temur";
        mus1.elektrikHesabim = new ElektrikHesabi();

        mus1.elektrikHesabim.toplamTuketimYaz();

        mus1.elektrikHesabim.tuketimEkle(50);
        mus1.elektrikHesabim.tuketimEkle(60);
        mus1.elektrikHesabim.tuketimEkle(70);

        mus1.elektrikHesabim.toplamTuketimYaz();
        mus1.elektrikHesabim.faturaYaz(mus1.name);

        // burada kullanılan tüm metodlara, NESNE oluşturdak sonra
        // sonra ulaşabiliyorum. çünkü bu metodlar NESNE ye ait.
    }
}
