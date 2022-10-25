package Gun45._02_ExceptionHandling;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("program başladı");

        for(int i=0; i<3; i++)
        {
            Scanner oku=new Scanner(System.in);

            try {  // hata bölgesini try{} ine aldık
                System.out.print("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2=");
                int sayi2 = oku.nextInt();

                System.out.println("bolum= " + (sayi1 / sayi2));
            }
            catch(Exception hataBilgileri) // hata mesalarını hata isimli Eception cinsinden değişkene attım
            {
                System.out.println("hataBilgileri.getMessage() = " + hataBilgileri.getMessage());
                i--;
            }
        }

        System.out.println("program bitti");
    }
}
