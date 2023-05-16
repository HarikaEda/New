package j25_Inheritance.inheritance02;

public class Mammal extends Hatvancık {//hayvancık parent class extend edilmiş child class
int m=1;
int c=4;

    public Mammal() {//p.siz constructor
        this('H');//p.li constructor call edildi
        System.out.println("Mammal parametresiz");
        //this()//cte verir ilk satıra tanımlanmalı
    }

    public Mammal(char y) {//char data type p'li constructor
        super(34);//supr class p.li call edilid
        System.out.println("Mammal p.li");

        System.out.println("Mammal p.li const...");
    }
    //@Override(annotation-dip not)
    public  void mM(){//parent den ezen method
        System.out.println("mC-> Mammal class meth call edildi");
    }
public  void mC(){
    System.out.println("Mammal");

}



}//Class sonu
