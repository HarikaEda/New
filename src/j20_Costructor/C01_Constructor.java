package j20_Costructor;

public class C01_Constructor {//class başı
 //fields:obj alabileceği variable'lar
 String str;//class levelda inintial edilmemiş instance (obj variable)-örnek-variable
 String selam="selam Javacan";
String mainetlevel="java";




    public static void main(String[] args) {//main başı->main meth. level
/*
1- consturctor ismi Calss name ile aynı olmalı.Cons name Buyuk harf ile başlamalı
2- constructor create edilirken name den sonra () {} mutlaka kullanılmalı.
3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
5-Class tanımlandığında java default cons. kendi create eder.
6-Fields-> obj'nin uretilirken alacagı değer variables
7-bir class'da bir den çok cons. tanımlanabilir
 */
  //classname objname=new constructor

   C01_Constructor obj1=new C01_Constructor();//p.siz default cons ile obj1 create edildi.
   obj1.selam="selam javatar";
   C01_Constructor obj2=new C01_Constructor();
   obj2.selam="sefil haluk";
   C01_Constructor obj3=new C01_Constructor();
        System.out.println("obj1.selam = " + obj1.selam);
        System.out.println("obj2.selam = " + obj2.selam);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj1.mainetlevel = " + obj1.mainetlevel);
        System.out.println("obj3.mainetlevel = " + obj3.mainetlevel);
        obj2.str="Taha beyyyy";
        System.out.println("obj2.str = " + obj2.str);
agamaselam();

obj1.agamaselam();
obj2.agamaselam();
obj3.agamaselam();
    }//main sonu

    private static void agamaselam() {//non-stattic c void psiz meth.
        System.out.println("agama bolcana selam");
    }

}//class sonu
