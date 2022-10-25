package Gun41._01_Ornek;

public class Lahmacun implements IFood{
    @Override
    public void taste() {
        System.out.println("Mükemmel yerli pizza");
    }

    @Override
    public double ucret() {
        return 30;
    }

    void dough()
    {
        System.out.println("Mayalı hamur hazırlandı.");
    }

    void addMeat()
    {
        System.out.println("Özel kıyma Eklendi");
    }

    void bake()
    {
        System.out.println("Odun ateşinde pişirildi");
    }

}
