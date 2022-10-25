package Gun06;

import java.util.Scanner;

public class _13_Soru {
    public static void main(String[] args) {
        // Girilen bir string de bosluk karakteri olup olmadıgını bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz=");
        String girilen=oku.nextLine();

        System.out.println("bosluk karakteri var MI = " + girilen.contains(" "));
    }
}
