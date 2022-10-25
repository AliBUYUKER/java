package Gun29._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    Book(){ // 1.Constructor
    }

    Book(String name, String author){// 2.Constructor
       this.name=name;
       this.author=author;
       this.publishYear=0;
    }

    Book(String name){// 3.Constructor
      this(name,"");
    }

    void yazdir()
    {
        System.out.println(name+" "+author+" "+publishYear);
    }

    public String toString()
    {
        return name+" "+author+" "+publishYear;
    }
}
