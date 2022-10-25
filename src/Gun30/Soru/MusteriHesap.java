package Gun30.Soru;

public class MusteriHesap {
    int gelenParaToplam=0;
    int cekilenParaToplam=0;
    private int bakiye=0;


    void paraYatir(int gelenPara)
    {
        this.gelenParaToplam = this.gelenParaToplam+gelenPara;
        this.bakiye = this.bakiye+gelenPara;
    }

    void paraCek(int cekılenPara)
    {
        this.cekilenParaToplam = this.cekilenParaToplam+cekılenPara;
        this.bakiye = this.bakiye-cekılenPara;
    }


    @Override
    public String toString() {
        return "MusteriHesap{" +
                "yatan=" + gelenParaToplam +
                ", cekilen=" + cekilenParaToplam +
                ", bakiye=" + bakiye +
                '}';
    }
}
