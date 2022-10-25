package Gun39._02_Ornek;

import Utility.MyFunc;

public abstract class Sekil {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double alan();
    abstract double cevre();

    void ciz(){
        System.out.println(this.name+" isimli şekil çizildi");
    }

    @Override
    public String toString() {
        return "\n Sekil Adı =" + name +
                "\n alan="+ MyFunc.yuvarla(alan())+
                "\n cevre="+ MyFunc.yuvarla(cevre());
    }
}
