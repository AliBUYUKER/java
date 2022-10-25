package Gun10;

import java.util.Locale;
import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("şifre giriniz=");
        String sifre=oku.nextLine();

        int uzunluk = sifre.length();
        boolean varMi = sifre.toLowerCase().contains("pass");

        if (uzunluk >=8 && uzunluk <=12 && varMi==false)  // !varMi
        {
            System.out.println("uygun");
        }
        else{
            System.out.println("degil");
        }




    }
}
