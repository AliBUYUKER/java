package Gun47;

public class S56 {
    public static void main(String[] args) {
        String names[] ={"Thomas","Peter","Joseph"};
        String pwd[]=new String[3];
        int idx=0;
        
        try{
            for(String n: names){
                pwd[idx]=n.substring(2,6); // 2 dahil, 6 hariç  yani 2-5
                System.out.println(pwd[idx]);  // omas, Peter da hata alıyor.
                idx++;
            }
        }
        catch(Exception e){
            System.out.println("Invalid name");  // Invalid name
        }


    }
}
