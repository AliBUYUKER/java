package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        // hangi sayıya kadar sayı üretilecek. yani sınırı alıcam
        // bu sayıyı bulabilmek için tahmin sayısını alıcam

        Scanner oku=new Scanner(System.in);
        System.out.print("Üretilecek sayı sınırı = ");
        int sinir=oku.nextInt();

        int tutulanSayi= (int)(Math.random()* (sinir+1) );
        // Math.Rand -> 0.0 - 0.9999999
        // (5+1) ile çarparsan ->  0.0  - 5.9999
        // (int) ile casting yaptığında 0-5

        System.out.print("Tahmininiz=");
        int tahmin=oku.nextInt();

//        if (tutulanSayi == tahmin){
//            System.out.println("tebrikler bildiniz");
//        }
//        else{
//            System.out.println("Bilemediniz");
//        }

//        if (tutulanSayi == tahmin)
//            System.out.println("tebrikler bildiniz");
//        else
//            System.out.println("bilemediniz");

        System.out.println( (tutulanSayi == tahmin) ? "tebrikler bildiniz" : "Bilemediniz"  );

        System.out.println("tutulanSayi = " + tutulanSayi);
    }
}
