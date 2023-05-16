package j25_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
//data type obj=constructor
     Kedicik k1=new Kedicik();//kedicik data type obje
        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.d = " + k1.d);
        System.out.println("k1.m = " + k1.m);
Mammal k2=new Kedicik("pamuk");
        System.out.println("k2.a = " + k2.a);//0
        System.out.println("k2.c = " + k2.c);//4
       // System.out.println("k2.d = " + k2.d);//cte Mammal clSSDA TANIMLI DEĞİL
        System.out.println("k2.m = " + k2.m);//1

        Hatvancık k3=new Hatvancık();
        System.out.println("k3.a = " + k3.a);//0
        //System.out.println("k3.c = " + k3.c);//cte hayvancık classda tanımlı değik
        //System.out.println("k3.d = " + k3.d);//cte"         "       "    "
        System.out.println("k3.m = " + k3.m);//3
   //TRICK:Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
        // Variable araştırmaya data type Class'dan başlanıp parentlere gidilir
        System.out.println("             ******               ");
k1.mA();
k1.mC();
k1.mM();
        System.out.println("             ******             ");
k2.mA();
k2.mC();
k2.mM();
//k3.mC
        k3.mM();
        /*Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj methodları  cons. göre call edilir
        method araştırmaya cons. Class'dan başlanıp parentlere gidilir*/

    }//Main sonu
}//Class sonu
