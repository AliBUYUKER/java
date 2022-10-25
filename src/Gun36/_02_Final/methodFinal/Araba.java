package Gun36._02_Final.methodFinal;

public class Araba extends Vasita{
    private String renk;

    public Araba(String cinsi, String renk) {
        super(cinsi);
        this.renk=renk;
    }

//    @Override
//    public void VasitaOzelYazdir() {
//        System.out.println("renk = " + renk);
//        super.VasitaOzelYazdir();
//    }
    // final method lar override edilemez ,
    // sadece direkt kullanılır

    @Override
    public String toString() {
        return "Araba{" +
                "cinsi="+getCinsi()+","+
                "renk='" + renk +
                '}';
    }
}
