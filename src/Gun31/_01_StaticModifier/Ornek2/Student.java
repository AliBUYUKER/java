package Gun31._01_StaticModifier.Ornek2;

public class Student {
    int id;
    String fullName;

    static int sayac=1; // sen bitanesin
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student(String fullName) {
        this.id = sayac++; // önce var olan deger veriliyor, sonra artıyor
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
