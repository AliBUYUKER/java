package Gun42;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_Soru {
    public static void main(String[] args) {
        // Canlı digital saat yapınız

        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime saat = LocalTime.now();

        while (saat.getMinute() < 60) {
            saat = LocalTime.now();
            System.out.print("\r"+saat.format(f));
            MyFunc.Bekle(1);
        }
    }
}
