package j25_Inheritance.inheritance01;

public class HayvancıkRunner {//
    public static void main(String[] args) {
Hayvancık h=new Hayvancık();
h.hareket();
h.beslen();
h.icme();
        System.out.println("****");
Mammal m=new Mammal();
m.hareket();
m.beslen();
m.sutbeslent();
m.icme();
        System.out.println("****");
Koyun k=new Koyun();
k.hareket();
k.icme();
k.beslen();
        System.out.println("****");
Kedi ke=new Kedi();
ke.oynar();
ke.hareket();
ke.beslen();
        System.out.println("****");
Balık b=new Balık();
b.hareket();
b.yuzer();
b.beslen();
        System.out.println("****");

    }
}
