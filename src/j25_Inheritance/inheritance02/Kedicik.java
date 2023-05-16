package j25_Inheritance.inheritance02;

public class Kedicik extends Mammal {//parent Mammal Class extend edilmiş
int c=2;
int d=7;

    public Kedicik() {//super Class p.siz call edildi
        super();
        System.out.println("Kedicik parametresiz");
    }

    @Override
    public String toString() {
        return "Kedicik{" +
                "c=" + c +
                ", d=" + d +
                '}';
    }

    public Kedicik(String str) {
        this();//
       // this("a")->cte recursive cont tanımlandı
        System.out.println(super.c);//paren class c variable c call edildi...
        System.out.println("Kedicik pa.li ");
    }
    public void mC(){
        System.out.println("mC->Kedicik class meth call edildi");

    }



}
