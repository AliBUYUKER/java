package Gun05;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu int olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuz=");
        double kilo=oku.nextDouble();

        System.out.print("Boyunuz=");
        int boy=oku.nextInt();

        double kitleIndexi= kilo / (boy*boy);

        System.out.println("Boyunuz="+boy+", kilonuz="+kilo);
        System.out.println("kitleIndexi = " + kitleIndexi);
    }
}
