package Gun40;

class C{
    public C() { System.out.println("C "); }
}

class B extends C{
    public B() {
       // super();
        System.out.println("B ");
    }
}

class A extends B{
    public A() {
       // super();
        System.out.println("A ");
    }
}


public class _03_Ornek {
    public static void main(String[] args) {
        A a=new A(); // main çalıştırılnca çıktısı ne olur
    }
}
