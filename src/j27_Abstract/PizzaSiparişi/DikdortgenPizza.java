package j27_Abstract.PizzaSiparişi;

public class DikdortgenPizza extends PizzaSekil {//concrete child class obj ureten class

   private double en;
   private double boy;

    public DikdortgenPizza() {

    }
    @Override
    public double pizzaAlanHesapla() {
        return en*boy;
    }
}
