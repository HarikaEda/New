package j20_Costructor;

public class C02_Arac {//
 // fields:
    String marka;
    String model;
    int km;
    double motorhacmi;
    int vites;
    boolean Automatic;
    boolean ikinciel;
    int yıl;


    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorhacmi=" + motorhacmi +
                ", vites=" + vites +
                ", Automatic=" + Automatic +
                ", ikinciel=" + ikinciel +
                ", yıl=" + yıl +
                '}';
    }

    public static void main(String[] args) {//main bası
      /*fields:marka,model,km,motorhacmi,vites,ikinciel,yıl olan obj ler create ederek fields print eden code create ediniz*/
      C02_Arac Arac1=new C02_Arac();
        Arac1.marka="volvo";
        Arac1.model="S80";
        Arac1.km=95000;
        Arac1.ikinciel=true;
        Arac1.motorhacmi=2.0;
        Arac1.yıl=2015;
        //System.out.println("Arac1.marka+\",\"+Arac1.yıl+\",\"+Arac1.ikinciel+\",\"+Arac1.Automatic =" +
             //   "," + Arac1.marka + "," + Arac1.yıl + "," + Arac1.ikinciel + "," + Arac1.Automatic);
        System.out.println("Arac1 = " + Arac1);
        C02_Arac Arac2=new C02_Arac();
        Arac2.marka="tosba";
        Arac2.model="bıdıls";
        Arac2.km=99999;
        Arac2.ikinciel=true;
        Arac2.motorhacmi=3.14;
        Arac2.yıl=1905;

        System.out.println("Arac2 = " + Arac2);

        C02_Arac Arac3=new C02_Arac();
        Arac3.marka="mercedes";
        Arac3.model="e200";
        Arac3.km=7770;
        Arac3.ikinciel=true;
        Arac3.motorhacmi=1.8;
        Arac3.yıl=2;

        System.out.println("Arac3 = " + Arac3);


    }//main sonu
}//class sonu
