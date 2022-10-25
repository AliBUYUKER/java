package Gun45._02_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");
        String kelime="";

        for(int i=0; i<3; i++)
        {
            Scanner oku=new Scanner(System.in);

            try {  // hata bölgesini try{} ine aldık
                System.out.print("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2=");
                int sayi2 = oku.nextInt();

                System.out.println("bolum= " + (sayi1 / sayi2));
                //kelime.charAt(5); //genel hataya düşmesi için kontrol
            }
            catch(InputMismatchException ex) // bu tipten hata olursa
            {
                System.out.println("Lütfen sayı giriniz");
                i--;
            }
            catch(ArithmeticException ex) // bu tipten hata olursa
            {
                System.out.println("Sıfıra bölme hatası");
                i--;
            }
            catch(Exception ex) // Genel hata olursa, yukarıdakilerin dışında
            {
                System.out.println("Lütfen tekrar deneyiniz");
                i--;
            }

        }

        System.out.println("program bitti");
    }
}
