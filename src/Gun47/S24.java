package Gun47;

public class S24 {
    public static void main(String[] args) {
        String[] strs=new String[2];

        // String ifadelerin dizilerinde default değer NULL

        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i]);
        }

        // buraya  kadar Stringin default durumu olarak NULL yazdı.


        // burada ise bir kere çağrıldığında , değer atanamasa bile
        // artık değer tarafında kendi değerleri geçerli olur.
        strs[0].concat("yılmaz");  // artık dizi olarak çağrıldı
        //fakat karşıda değer oluşmadı çünkü : concat

        System.out.println(strs[0]);
        System.out.println(strs[1]);

    }


}
