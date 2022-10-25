package Gun04;

public class _00_Giris {
    public static void main(String[] args) {
         byte ogrNot= 90;

         int notToplam = ogrNot; // byte turunu int turune atmı olduk widening casting, genişletilme

         ogrNot = (byte)notToplam; // int türünü byte türüne dönüştürüyorum
         // bunu ancak veri kaybı oluşmuyorsa yani DEGER atılacak tipe sığıyorsa yapabilirim.
         // bunu da bilerek yaptığını belirtmek için, dönüşecek tipin başına, hedef tipin adı
         // parantez içinde yazılır. Daraltma(Narrow) yönünde dönüşüm(Casting) denir.
    }
}
