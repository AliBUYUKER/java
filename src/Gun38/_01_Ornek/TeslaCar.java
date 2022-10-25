package Gun38._01_Ornek;

public class TeslaCar extends Vehicle implements IElectric{

    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 9 yıl gider";
    }

    @Override
    public String drive() {
        return "Auto sürüş özelliği var";
    }
}
