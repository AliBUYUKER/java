package Gun34._01_Ornek;

//extends miras al
public class YoneticiYeni extends Personel {
    private double yoneticiTazminati;

    // 1 dükkan daha ekledin
    public void zamYap()
    {
        System.out.println("zam yapıldı.");
    }

    public double getYoneticiTazminati() {
        return yoneticiTazminati;
    }

    public void setYoneticiTazminati(double yoneticiTazminati) {
        this.yoneticiTazminati = yoneticiTazminati;
    }
}
