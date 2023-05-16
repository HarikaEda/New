package j25_Inheritance.inheritance02;

public class Hatvancık {
    int a;//int variable
    int m=3;//inst. variable initial edilmiş

    public Hatvancık(int x) {
        System.out.println("Hayvancık parametreli cont.");
    }

    public Hatvancık(){
        System.out.println("Hayvancık parametresiz constructor");
    }

    public void mA(){
        System.out.println("mA-> Hayvancık classda method call edildi");
    }
    public void mM(){//childde ezilen method
    System.out.println("mM-> Hayvancık classda method call edildi");



  }
}