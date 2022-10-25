package Gun49;

public class S82 {
    public static void main(String[] args) {
        String[][] chs =new String[2][];
        chs[0] = new String[2]; // 2   97 98
        chs[1] = new String[5]; // 5   99 100 null null null
        int i = 97;

        for (int a=0; a< chs.length; a++){ // 2
            for (int b=0; b< chs.length; b++){  // 2
                chs[a][b] = ""+i;
                i++;
            }
        }

        for (String[] ca : chs){
            for (String c : ca){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }
}
