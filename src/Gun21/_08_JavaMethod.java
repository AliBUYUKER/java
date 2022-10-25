package Gun21;

import java.util.Scanner;

public class _08_JavaMethod {
    // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
    // yaptıktan sonra main de yazdırınız.

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("1.Sayı = ");
        int sayi1 = oku.nextInt();
        System.out.print("2.Sayı = ");
        int sayi2 = oku.nextInt();

        int enb=enbBul(sayi1,sayi2);
        System.out.println("enb = " + enb);
    }

    public static int enbBul(int s1 , int s2)
    {
        if (s1>s2)
            return s1;
        else
            return s2;
    }
}
