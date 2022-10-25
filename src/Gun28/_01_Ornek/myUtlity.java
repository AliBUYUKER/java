package Gun28._01_Ornek;

public class myUtlity {
    // properties

    String getString(int sayi)
    {  //nesneye ait metod
        return String.valueOf(sayi);
    }

    int getInt(String sayi)
    { // nesneye ait metod
        return Integer.parseInt(sayi);
    }

    // static : zaten varolan demek
    static String getString2(int sayi)
    {   // tip e ait metod
        return String.valueOf(sayi);
    }

    static int getInt2(String sayi)
    {  // tipe e ait metod
        return Integer.parseInt(sayi);
    }

}
