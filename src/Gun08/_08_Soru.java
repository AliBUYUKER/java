package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("sayi= ");
        int sayi=oku.nextInt();

        System.out.println("tek mi ? "+ (sayi%2 == 1));

//        5  tek mi   5 % 2  =>  1  se tektir
//
//        4  tek mi   4 % 2  =>  0 se tek değildir

    }
}
