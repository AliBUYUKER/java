package Gun48;

public class S114 {
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];  // 2 elemanlı
        numbers[0]=10;
        numbers[1]=20;

        numbers=new int[4]; // eski değerler ve eski uzunluk değişiyor, sıfırlanıyor
        numbers[2]=30;      // yeni referans yerine gidiyor
        numbers[3]=40;

        for (int x:numbers){
            System.out.println(" "+x);
        }


    }
}
