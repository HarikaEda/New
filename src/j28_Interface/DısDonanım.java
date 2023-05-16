package j28_Interface;

public interface DısDonanım {

    void kapı();//public abstract method
    void kapat();//public abstract method
    void kaporta();
    final String renk="Kırmızı";//public static final initial variable

    public default String Stringsislamp() {
        return "sis lambaları kullanılmalı";
    }

   public static void anten(){
        System.out.println("anten");

   }

    public static void main(String[] args) {//interface main method tanımlanabilir fakat bad practicedir
        anten();
        //sislamp(); non static method obje call edilemez
    }
    //DısDonanım obj=new DısDonanım();interface obj yapamaz

}

