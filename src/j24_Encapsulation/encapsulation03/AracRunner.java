package j24_Encapsulation.encapsulation03;

public class AracRunner {
    public static void main(String[] args) {
   Arac a1=new Arac();
   Arac a2=new Arac("volvo","inci beyaz",2000,2015);
   Arac a3=new Arac("Audi","bej",300,-1905);

        System.out.println("a1.getModel() = " + a1.getModel());
        System.out.println("a1.getRenk() = " + a1.getRenk());
        System.out.println("a1.getYıl() = " + a1.getYıl());

        System.out.println("a2.getYıl() = " + a2.getYıl());
        System.out.println("a2.getRenk() = " + a2.getRenk());
        System.out.println("a2.getModel() = " + a2.getModel());
        System.out.println("a2.getMotor() = " + a2.getMotor());

        System.out.println("a3.getMotor() = " + a3.getMotor());
        System.out.println("a3.getModel() = " + a3.getModel());
        System.out.println("a3.getRenk() = " + a3.getRenk());
        System.out.println("a3.getYıl() = " + a3.getYıl());

a1.setYıl(-1905);
a1.setMotor(1300);
a1.setModel("hacımurat");
a1.setRenk("civciv sarısı");

        System.out.println("a1.getModel() = " + a1.getModel());
        System.out.println("a1.getRenk() = " + a1.getRenk());
        System.out.println("a1.getYıl() = " + a1.getYıl());

        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a3.getYıl() = " + a3.getYıl());

    }//main sonu
}
