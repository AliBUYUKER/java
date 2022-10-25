package Gun31._02_FinalModifier.Ornek1;

public class Student {
    private final int okulNo;
    String tamAd;

    private static int sayac=1;

    public Student(String tamAd) {
        this.okulNo = sayac++;
        this.tamAd = tamAd;
    }

    @Override
    public String toString() {
        // okulNo =2; //private olsan da burdan değiştirebiliyorum

        return "Student{" +
                "okulNo=" + okulNo +
                ", tamAd='" + tamAd + '\'' +
                '}';
    }
}
