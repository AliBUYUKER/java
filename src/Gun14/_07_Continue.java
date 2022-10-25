package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.
        // for ve continue kullanarak

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();
        // cumle.length -> string uzunluğunu veriri
        //cumle.charAt(5) -> 5 indexli karakteri veirir

        for(int i=0; i < cumle.length() ; i++)
        {
            if (cumle.charAt(i)==' ') continue; // çalıştığındaki sonraki satırlar pas geçilir

            System.out.println(cumle.charAt(i)); // index 0 dan başlar
        }




    }
}
