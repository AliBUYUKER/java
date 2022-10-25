package Gun32._02_Ornek;

public class Soru {
    // enum burda tanımlayabilirm

    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    public static void main(String[] args) {

        User user1 = new User("ismet", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("mehmet", Role.MUDUR, Statu.PASSIF);
        User user3 = new User("ayşe", Role.SATIS, Statu.AKTIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);
    }

    public static void userSil(User kullanici)
    {
           if (kullanici.role == Role.ADMIN)
           {
               System.out.println("Admin silinemez");
           }
           else
           {
               //bu bölümde silme işlemleri yapıldı
           }
    }
}
