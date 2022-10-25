package Gun30._03_Protected.bir;

public class Doctor {
    protected String adi;//default ile aynı
    String bolumu; // default
    private String sicilNo; // private
    public String hastaneAdi; // public

    Doctor(){  // default

    }

    public Doctor(String adi){  // public
      this.adi=adi;
    }




}
