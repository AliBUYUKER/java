package Gun20;

public class _02_JavaMethod {

    //buraya metodların yazılabileceği yerler

    public static void main(String[] args) { // ana çalışan kımın burası, burdan diğerlerini çağıracağız
        Math.max(5,6); // bi şeyler gönderiliyor, geriye değer alınıyor
        Math.random(); // bi şeyler gönderilmiyor, geriye değer alınıyor

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
        merhabaYaz(); // mainin daha kolay anlaşılabilir olur.
        merhabaYaz(); // fonksiyonu çağırma şekli
    } // mainin bitişi

    //buraya metodların yazılabileceği yerler
    public static void merhabaYaz()
    {
        System.out.println("fonksiyonda/metodda Mrhaba Dünya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}
