package Gun30._02_PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;
    private String password;

    public void sifreAta(String sifre)
    {
        if (sifre.length() >= 8) {
            this.password = sifre;
            System.out.println("Şifre başarıyla atandı");
        }
        else
            System.out.println("Şifre kurala uyugn değil");
    }

    public void sifreGoster()
    {
        System.out.println( "****"+password.substring(4));
    }


}
