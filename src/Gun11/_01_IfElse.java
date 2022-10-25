package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();


        if (sayi > 0)
        {
            System.out.println("pozitif");
        }
        else {  // sıfırdan büyük değilse

            if (sayi < 0)
            {
                System.out.println("negatif");
            }
            else
            {
                System.out.println("sıfır");
            }

        }


    }
}
