package Gun29._02_Constructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {
       Book kit1=new Book(); // 1.Constructor
       kit1.name="Harry Poter";
       kit1.author="JK Rowling";
       kit1.publishYear=1997;

        // 2.Constructor
       Book kit2=new Book("yüzükler","JRR Tolkien");
       Book kit3=new Book("Sefiller");// 3.Constructor

       kit1.yazdir();
       kit2.yazdir();

        System.out.println("kit1 = " + kit1.toString()); // toString
        System.out.println("kit1 = " + kit1);
        System.out.println("kit3 = " + kit3);
        System.out.println("kit2 = " + kit2);
    }
}
