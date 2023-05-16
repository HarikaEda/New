package j27_Abstract.PizzaSiparişi;

public class Pizza {//obj üreten class
public double fiyat ;
 public PizzaSekil pSekil;

    @Override
    public String toString() {
        return "Pizza{" +
                "fiyat=" + fiyat +
                ", pSekil=" + pSekil +
                '}';
    }

    public double getFiyat() {
        return fiyat;
    }

    public Pizza(double fiyat, PizzaSekil pSekil) {
        this.fiyat = fiyat;
        this.pSekil = pSekil;
    }
}
