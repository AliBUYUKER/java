package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki şekilde çıktı veren programı print içerisinde
        //            #####
        //            #####
        //            #####
        //            #####
        //            #####


        for(int i=0;i<5;i++)  // kaç satır   (satır)
        {
            for(int j=0;j<25;j++) // kaç karakter (sütun)
               System.out.print("#");

            System.out.println(); // her satır dan sonra \n
        }

    }
}
