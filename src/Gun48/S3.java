package Gun48;

public class S3 {
    public static void main(String[] args) {

        int[][] num = new int[1][3];

//        num[0][0] = 10;
//        num[0][1] = 10;
//        num[0][2] = 10;

        for (int i = 0; i < num.length; i++) { //satır sayısını 1 num.length

            for (int j = 0; j < num[i].length; j++) {  //sütun uzunluğu num[i].length 3
                    num[i][j] = 10;
                            // 00 01 02
            }

        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("num["+i+"]["+j+"]="+  num[i][j]);
            }
        }

    }
}
