package j20_Costructor;

public class C05_Arac {
    //Fields-> obj'nin uretilirken alacagı değer variables
//bir class'da bir den çok cons tanımlanabilir
 /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */
   //fields
   String model;
   int maxhız;

    public C05_Arac(int maxhız) {//bir parametreli
        this("hacımurat",123);
        this.maxhız = maxhız;
        System.out.println("1 parametreli constructor call edilmiştir");
    }

    public C05_Arac(String model, int maxhız) {//ful parametreli
        this.model = model;
        this.maxhız = maxhız;
        System.out.println("ZENGİN constructor");


    }

    @Override
    public String toString() {
        return "C05_Arac{" +
                "model='" + model + '\'' +
                ", maxhız=" + maxhız +
                '}';
    }

    public C05_Arac() {//p.siz
        System.out.println("parametresiz constructor call edilmiştir");


    }
}
