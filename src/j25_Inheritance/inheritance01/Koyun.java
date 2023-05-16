package j25_Inheritance.inheritance01;

import j25_Inheritance.inheritance01.Hayvancık;

public class Koyun extends Hayvancık {//child class,p.siz
    public Koyun() {//p.siz super cons.


        System.out.println("parametresiz constructor call edildi");

    }

    public void hareket() {

        System.out.println("hayvancık hareket eder");
        System.out.println("Koyun dört ayaklı bir canlıdır");
    }



}