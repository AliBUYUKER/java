package Gun41._01_Ornek;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("Sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void boil()
    {
        System.out.println("Kısık ateşte kaynatılıyor.");
    }

    void eatTomarrow()
    {
        System.out.println("Bir gün sonra servis edilir.");
    }

}
