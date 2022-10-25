package Gun31._02_FinalModifier.Ornek1;

public class Okul {
    public static void main(String[] args) {

        Student ogr1=new Student("ismet temur");
        Student ogr2=new Student("mehmet yılmaz");
        Student ogr3=new Student("ayşe yıldız");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        //ogr1.okulNo=2; // yapabiliyorum : int okulNo böyleyken

        //private : erişimi engeller ama class dan erişebilirim.
        //final : değerin BIRKEZ atandıktan sonra değiştirilmesini engeller.
        //final değişkenlere değer ne zaman atılabilir ?
        // ilk tanımlandığı zaman veya CONSTRUCTOR da.

    }
}
