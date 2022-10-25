package Gun38._01_Ornek;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar("model 5", 310);
        ToyotaPirus tp=new ToyotaPirus("pirus",1200);
        Bus bus=new Bus("IVECO",700);

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(tp);
        arabalar.add(bus);

        for(Vehicle v : arabalar){
            System.out.println( v.getClass().getSimpleName() );

            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if (v instanceof TeslaCar){
                System.out.println( ((TeslaCar)v).changeBattery() );
                System.out.println( ((TeslaCar)v).drive());
            }

            if (v instanceof ToyotaPirus){
                System.out.println( ((ToyotaPirus)v).changeBattery() );
                System.out.println( ((ToyotaPirus)v).drive());
                System.out.println( ((ToyotaPirus)v).changeOil());
            }

            if (v instanceof Bus){
                System.out.println( ((Bus)v).changeDiesel() );
                System.out.println( ((Bus)v).drive());
            }

        }

    }
}
