package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan =a*a

        Scanner oku=new Scanner(System.in);

        System.out.print("Kenar=");
        int kenar= oku.nextInt();

        int alan=kenar*kenar;
        int cevre = kenar+kenar+kenar+kenar;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

        System.out.println(kenar*kenar);
        System.out.println(kenar+kenar+kenar+kenar);

        System.out.println("Alan="+(kenar*kenar));
        System.out.println("Cevre="+(4*kenar));
    }
}
