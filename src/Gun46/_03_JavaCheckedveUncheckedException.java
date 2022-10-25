package Gun46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _03_JavaCheckedveUncheckedException {
    public static void main(String[] args) {
        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.

        String str="";


        char ilkHarf=str.charAt(0); // try-catch mecbur değilim bana kalmış : Unchecked Exception


        try {
            Thread.sleep(3000);  // try-catch mecbur : Checked Exception
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream file=new FileInputStream("liste.txt"); // try-catch mecbur : dosyayı açma komutu
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
