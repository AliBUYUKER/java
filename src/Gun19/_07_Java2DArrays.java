package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Java2DArrays {
    // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
    // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
    // diziye atayınız.

    public static void main(String[] args) {
        int[][] tablo=new int[3][2]; //3x2 lik bir diziyi
        Scanner oku=new Scanner(System.in);

        //diziyi kullanıcıdan sayı alarak doldurunuz
        int teklerMik=0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(i+" "+j+".Sayı=");
                tablo[i][j]=oku.nextInt();

                if(tablo[i][j]%2==1)
                    teklerMik++;
            }

        }

        System.out.println(Arrays.deepToString(tablo));

        int[] tekler=new int[teklerMik];
        //doldurduktan sonra

        int tekIndex=0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                if (tablo[i][j]%2==1)
                {
                      tekler[tekIndex]=tablo[i][j];
                      tekIndex++;
                }

            }

        }

        System.out.println(Arrays.toString(tekler));
    }
}
