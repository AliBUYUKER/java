package Gun46;

import java.util.Scanner;

public class _02_ThrowExample {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("yeni şifre oluşturma");

        System.out.print("yeni şifrenizi oluşturunuz=");
        String password=oku.nextLine();

        if (password.length() < 8)
        {
            System.out.println("Lütfen dikkat !");
            System.out.println("Şifre 8 karakterden küçük olamaz");
            // log tutma
        }

        if (password.length() > 15)
        {
            System.out.println("Lütfen dikkat !");
            System.out.println("Şifre 15 karakterden büyük olamaz");
            //log tutma
        }
    }
}
