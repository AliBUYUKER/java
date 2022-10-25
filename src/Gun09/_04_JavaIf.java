package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi=oku.nextInt();

        // sayını  1 3 5 7 9    bunları 2 ye böldüğünde kalan 1 ise tektir
        int kalan = sayi % 2; // mod %   bize bölümünden kalanı verir

        if (kalan != 0){  // -1  1
            System.out.println("tek");
        }

        if (kalan == 0){
            System.out.println("çift");
        }

    }
}
