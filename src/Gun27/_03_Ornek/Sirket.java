package Gun27._03_Ornek;

public class Sirket {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

    public static void main(String[] args) {
        Person personel1=new Person();
        personel1.name="Ayser";
        personel1.surname="Yılmaz";
        personel1.age=30;

        Person personel2=new Person();
        personel2.name="Şakir";
        personel2.surname="Demir";
        personel2.age=32;

        //1.yöntem
        System.out.println("personel1 = " + personel1.name);
        System.out.println("personel1 = " + personel1.surname);
        System.out.println("personel1 = " + personel1.age);

        System.out.println("personel2 = " + personel2.name);
        System.out.println("personel2 = " + personel2.surname);
        System.out.println("personel2 = " + personel2.age);
        System.out.println("********************");

        //2.yöntem.
        bilgiYazdir(personel1);
        bilgiYazdir(personel2);

        //3.yöntem - en iyi yöntem, ilgili metodu kendi classına at
        personel1.bilgiYazdir();
        personel2.bilgiYazdir();

        System.out.println("personel1 = " + personel1.getBirthYear());
        System.out.println("personel2 = " + personel2.getBirthYear());

        System.out.println("personel1 = " + personel1.getInitials());
        System.out.println("personel2 = " + personel2.getInitials());
    }

    public static void bilgiYazdir(Person p){
        System.out.println("personel = " + p.name);
        System.out.println("personel = " + p.surname);
        System.out.println("personel = " + p.age);
    }





}
