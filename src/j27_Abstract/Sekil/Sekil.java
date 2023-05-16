package j27_Abstract.Sekil;

public abstract class Sekil {
    String  name;
    public abstract double alan();//abs meth
    public abstract double cevre();//abs meth

    public  void ciz(){//concrete emethod
        System.out.println(this.name+" cizildi");
    }
    public String getName(){//anlıyorum ama anlamsız buluyorum nasıll bizniss locigg

        return this.name;
    }
    @Override
    public String toString() {
        return
                "name='" + name +
                        "\n Alan = "+this.alan()+
                        "\n Cevre = "+this.cevre();
    }

}