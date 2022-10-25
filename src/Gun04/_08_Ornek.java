package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        //short olarak atadığınız bir değeri stringe çevirerek
        // ekrana yazdırınız.

        short sayi= 345;
        String strSayi= Short.toString(sayi);

        System.out.println("Sayi = " + strSayi);
    }
}
