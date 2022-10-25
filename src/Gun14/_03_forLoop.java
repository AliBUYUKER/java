package Gun14;

import java.util.Scanner;

public class _03_forLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayı giriniz =");
        int sinir=oku.nextInt();

        int toplam=0;
        for(int i=0;i<sinir;i++)
          toplam=toplam+i;

        System.out.println("toplam = " + toplam);
    }
}
