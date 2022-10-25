package Gun41._01_Ornek;

import Utility.MyFunc;

public class TechnoKitchen {

    public static void hazirla(IFood food)
    {
         MyFunc.Bekle(2);
         if (food instanceof AdanaKebap)
         {
             ((AdanaKebap)food).marinade();
             MyFunc.Bekle(1);
             ((AdanaKebap)food).grill();
             MyFunc.Bekle(1);
             ((AdanaKebap)food).taste();
         }
         else
         if (food instanceof Lahmacun)
         {
             MyFunc.Bekle(1);
             ((Lahmacun)food).dough();
             MyFunc.Bekle(1);
             ((Lahmacun)food).addMeat();
             MyFunc.Bekle(1);
             ((Lahmacun)food).bake();
             MyFunc.Bekle(1);
             ((Lahmacun)food).taste();
         }
         else
         if (food instanceof Borsh)
         {
             MyFunc.Bekle(1);
             ((Borsh)food).boil();
             MyFunc.Bekle(1);
             ((Borsh)food).eatTomarrow();
             MyFunc.Bekle(1);
             ((Borsh)food).taste();
         }
         else
         if (food instanceof Palov)
         {
             ((Palov)food).boil();
             ((Palov)food).fry();
             ((Palov)food).taste();
         }
         //****** diğer yemekler eklenecek



    }


}
