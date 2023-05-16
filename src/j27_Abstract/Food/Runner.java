package j27_Abstract.Food;

public class Runner {
    public static void main(String[] args) {
Baklava HavucDilimi=new Baklava();
HavucDilimi.name="bol fıstıklı";
HavucDilimi.madeIn();
        System.out.println("HavucDilimi = " + HavucDilimi);
    HavucDilimi.taste();
        System.out.println("   ***   ");
       SezarSalad s=new SezarSalad();
       s.name="gavurdağı salatası";
       s.madeIn();
        System.out.println("s = " + s);



    }
}
