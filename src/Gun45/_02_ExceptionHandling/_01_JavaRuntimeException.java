package Gun45._02_ExceptionHandling;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("Program çalişmaya başladı");
        String kelime="";
        char ilkHarf=kelime.charAt(3);
        System.out.println("Program bitti");
    }
}

// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.