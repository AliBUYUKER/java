package Gun48;

public class S79 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};

        for (int i=0 ; i<arr.length; i++) {

            System.out.println(arr[i] + " "); // A B C D

            if (arr[i].equals("D")) {
                System.out.println("work done");  // work done
                break;  // zaten döngünün sonunda bu da etkisiz
            }

            continue;  // dongunun benden sonrasını pass geçmek, fakat zaten sonrasında bir şey yok
        }
    }
}
