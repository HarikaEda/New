package j27_Abstract.PizzaSiparişi;

public class DairePizza  extends PizzaSekil{//concreete child clas
    final double pi=3.14;
    private double yaricap;//instance variable

    public double getYaricap(int i) {
        return yaricap;
    }

    @Override
    public String toString() {
        return "DairePizza{" +

                ", pizzanızın yaricapı=" + yaricap +
                ",buyuklugu :"+pizzaAlanHesapla();

    }

    public DairePizza(double yaricap) {
        super();//parametreli constructr
        this.yaricap = yaricap;
    }

    @Override
    public double pizzaAlanHesapla() {//imp edilen concrete method
        return (int) (pi*yaricap*yaricap);


    }
}
