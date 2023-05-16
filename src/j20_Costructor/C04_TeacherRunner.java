package j20_Costructor;

public class C04_TeacherRunner {//class level
    public static void main(String[] args) {//main level

C04_Teacher ogrt1=new C04_Teacher();//p.siz constructor ile obj create edildi
ogrt1.ad="Eda";
ogrt1.soyad="Özdemir";
ogrt1.branş="javacı";
ogrt1.maaş=4000;
ogrt1.tecrube=10;
        System.out.println("ogrt1 = " + ogrt1);

C04_Teacher cıncıxogtr=new C04_Teacher("bahtiyar","javacan","java",1905,3,8500,false);
        System.out.println("cıncıxogtr = " + cıncıxogtr);


    }//main sonu
}//class sonu
