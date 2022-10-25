package Gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi=oku.nextInt();

        if (sayi % 2 == 0){ // önce 0 ı kontrol edersek, negatif sayıları düşünerek
            System.out.println("çift");
        }
        else{ // -1   olsa 1 de olsa else ye düşecek
            System.out.println("tek");
        }

    }
}
