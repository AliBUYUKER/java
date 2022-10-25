package Gun08;

public class _03_Soru {
    public static void main(String[] args) {
        // 2022(dahil) yılına kadar geçen gun miktarınız bulunuz.

       int gecenGunMiktari = 2022 * 365 + (2022/4);
       System.out.println("gecenGunMiktari = " + gecenGunMiktari);

       // 365  365  365 365  +1 -> her 4 yıl da bir 1 gün
    }
}
