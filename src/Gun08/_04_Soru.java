package Gun08;

import java.util.Scanner;

public class _04_Soru {
    // girilen 3 basamaklı bir sayının basamaklarını bulunuz.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("3 basamaklı sayı giriniz = ");
        int sayi=oku.nextInt();

        // 524 -> 5   2   4  ayrı ayrı atayabileyim

        int birlerBasamagi = sayi % 10 ;          // 4
        int onlarBasamagi = (sayi % 100) / 10 ;   // 2
        int yuzlerBasamagi = sayi /100 ;          // 5

        System.out.println("birlerBasamagi = " + birlerBasamagi);
        System.out.println("onlarBasamagi = " + onlarBasamagi);
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);
    }
}
