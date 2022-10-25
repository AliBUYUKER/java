package Gun46;

public class _05_mainArgument {
    public static void main(String[] args) {
        // program calışmadan önce parameter olarak verilen
        // sayıları toplayan programı yazızını.

        int toplam=0;
        for(String s: args)
        {
            System.out.println("s = " + s);
            toplam=toplam + Integer.parseInt(s) ;
        }

        System.out.println("toplam = " + toplam);
    }
}
