package Gun21;

import java.util.Scanner;

public class _05_JavaMethod {
    //Kullanıcının gireceği 2 sayının toplamını
    //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayı = ");
        int s1 = oku.nextInt();
        System.out.print("2.Sayı = ");
        int s2 = oku.nextInt();

        int toplam=toplamBul(s1,s2); // 2 sayı al, sonucu gönder(return)

        System.out.println("toplam = " + toplam);
    }

    public static int toplamBul(int s1,int s2)
    {
        return s1+s2;
    }



}
