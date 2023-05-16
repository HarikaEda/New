package j26_Exeptions;

public class C04_NullPointer {
    public static void main(String[] args) {
//null pointer exception:null ataması yapılan bir String variable length() math call edildiğinde RTE verir

        String str="";
        System.out.println("str.length = " + str.length());//0

String str2=null;
        //System.out.println("str2 = " + str2.length());//RTE null Pointer Exception code kırılır...
        try {
            System.out.println("str2 = " + str2.length());//
            System.out.println("bu satırı okuduysan code exception fırlatmadı..");
        }catch (NullPointerException e){
            System.out.println("dutluk boyutu olur mu hiç..");
            System.out.println("e.getMessage() = " + e.getMessage());
        }try {
            System.out.println("str.length() = " + str.length());
            System.out.println("bu satırı okuduysan code exception fırlatmadı..");
        }catch (NullPointerException e){
            System.out.println("dutluk boyutu olur mu hiç..");
        }

        System.out.println("code başarılı :) buraya geldiysen");

    }
}
