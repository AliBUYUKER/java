package Gun38._01_Ornek;

public class Bus extends Vehicle implements IDiesel{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "bir depo ile 1000km gider";
    }

    @Override
    public String drive() {
        return "Şehir içine girme, yavaş sür";
    }
}
