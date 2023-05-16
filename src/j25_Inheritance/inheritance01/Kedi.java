package j25_Inheritance.inheritance01;

import j25_Inheritance.inheritance01.Hayvancık;

public class Kedi extends Hayvancık {//child class,p.siz
    public Kedi() {//p.siz super cons.


        System.out.println("parametresiz constructor call edildi");
    }

    public void oynar() {

        System.out.println("hayvancık yumakla oynar");
    }



}