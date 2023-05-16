package j25_Inheritance.inheritance01;

import j25_Inheritance.inheritance01.Hayvancık;

public class Mammal extends Hayvancık {//child class
    public Mammal() {//parent classın child clası
        System.out.println("");

    }

    public void sutbeslent() {

        System.out.println("hayvancık sütle beslenir");
        System.out.println("Mammal memeli hayvandır");
    }

    public void beslen() {
        System.out.println("hayvancık beslenir");


    }
}