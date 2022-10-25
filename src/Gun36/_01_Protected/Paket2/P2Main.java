package Gun36._01_Protected.Paket2;

import Gun36._01_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h=new P1Hayvan();
        h.ad ="karabaş";
//        h.yas // default sadece kendi paketinden
//        h.cinsi // protected default gibi.
//        h.renk // private sadece kendi classından

        Kedi k=new Kedi("kopuk", "scotish");
        System.out.println("k = " + k);
    }
}
