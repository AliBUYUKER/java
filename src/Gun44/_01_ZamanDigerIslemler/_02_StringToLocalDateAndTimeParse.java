package Gun44._01_ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanıcıdan alınan ve string durumunda olan bir time veya tarih
        // bilgisinin time veya tarih değişkenine çevrilmesi.
        long startTime=System.currentTimeMillis(); // kodun performansı için pratik
        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih Giriniz (25 01 2020) = ");
        String strTarih= oku.nextLine();

        // Kullanıcının girecegı formata gore format olusturduk.
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formatı bu formata uygun olmalı.parse ile çevirdik.
        LocalDate tarih= LocalDate.parse(strTarih, f);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(f) = " + tarih.format(f));
        long finihTime=System.currentTimeMillis();
        System.out.println("gecenSure = " + (finihTime-startTime)+" ms");
    }
}
