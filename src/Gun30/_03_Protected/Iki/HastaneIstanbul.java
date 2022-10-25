package Gun30._03_Protected.Iki;

import Gun30._03_Protected.bir.Doctor;

public class HastaneIstanbul {
    public static void main(String[] args) {
        Doctor dr=new Doctor("Mehmet");
        //Doctor dr1=new Doctor(); default sadece
        // kendi paketi ulasır.
        dr.hastaneAdi="Istanbul";
    }
}
