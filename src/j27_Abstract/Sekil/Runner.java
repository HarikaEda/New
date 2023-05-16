package j27_Abstract.Sekil;

public class Runner {
    public static void main(String[] args) {
        Cember c1=new Cember();
         c1.alan();
         c1.cevre();
        System.out.println("c1.name = " + c1.name);

        Dikdortgen d1=new Dikdortgen();
        d1.alan();
        d1.cevre();
        System.out.println("d1.name = " + d1.name);
    }
}
