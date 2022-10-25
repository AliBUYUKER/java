package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
    // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
    // hayır yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cume giriniz=");
        String okunan=oku.nextLine();

        int uzunluk=okunan.length();  // int deger
        boolean varMi = okunan.contains("study"); // true veya false
        System.out.println("uzunluk = " + uzunluk);
        if (uzunluk > 10 && varMi){
            System.out.println("evet");
        }
        else {
            System.out.println("hayır");
        }


       //  if (okunan.length() > 10 && okunan.contains("study")){
       //  if (okunan.length() > 10 && okunan.toLowerCase().contains("study")){
    }
}
