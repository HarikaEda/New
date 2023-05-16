package j27_Abstract.PizzaSiparişi;

public abstract class PizzaSekil {
    double en;
    double boy;

    public PizzaSekil(double en, double boy) {//2 parametreli constructr
        this.en = en;
        this.boy = boy;
    }

    public PizzaSekil() {

    }

    public abstract double pizzaAlanHesapla();{//double para.siz return typ met
      //return;
}

}