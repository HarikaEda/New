package j25_Inheritance.inheritance01;

public class Balık extends Hayvancık {//child class
    public Balık(){//parent class ın child classı


    System.out.println("parametresiz constructor call edildi");

}

    public void yuzer(){

        System.out.println("balık suda yüzer");
        System.out.println("solungaçlarıyla solunum yapar");
    }
}
