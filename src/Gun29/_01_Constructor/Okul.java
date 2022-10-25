package Gun29._01_Constructor;

import Gun29._01_Constructor.Student;

public class Okul {
    // Bir Student sınıfı oluşturunuz
    // (id(int), name, surName, classroom(int)) ve
    // bundan 3 adet öğrenci oluşturunuz.
    public static void main(String[] args) {

        //1.yöntem
        Student ogr1=new Student();//nesnenin oluşturulma anı
                                  // () bu bir metod işareti
        ogr1.id=1;
        ogr1.name="ismet";
        ogr1.surName="temur";
        ogr1.classroom=11;
        System.out.println("ogr1.name = " + ogr1.name);

        //2.Yöntem
        Student ogr2=new Student(1,"mehmet",
                        "temur",11);

        System.out.println("ogr2.name = " + ogr2.name);

        Student ogr3=new Student(3,"Hatice",
                "demir");


    }
}
