package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("oyuncu1 oynuyor: ");
        String oyuncu1= input.nextLine();
        System.out.println("oyuncu2 oynuyor: ");
        String oyuncu2= input.nextLine();

        String tas="1";
        String kagıt="2";
        String makas="3";
        if (oyuncu1.equals("1")&&oyuncu2.equals("1")){
            System.out.println("kazanan yok");
        } else if (oyuncu1.equals("1")&&oyuncu2.equals("2")){
            System.out.println("oyuncu 2 kazandı");
        } else if (oyuncu1.equals("1")&&oyuncu2.equals("3")) {
            System.out.println("oyuncu1 kazandı");
        } else if (oyuncu1.equals("2")&&oyuncu2.equals("1")) {
            System.out.println("oyuncu 2 kazandı");
        } else if (oyuncu1.equals("2")&&oyuncu2.equals("2")) {
            System.out.println("kazanan yok");
        } else if (oyuncu1.equals("3")&&oyuncu2.equals("1")) {
            System.out.println("oyuncu 2 kazanır");
        } else if (oyuncu1.equals("3")&&oyuncu2.equals("2")) {
            System.out.println("oyuncu1 kazanır");
        } else if (oyuncu1.equals("3")&&oyuncu2.equals("3")) {
            System.out.println("kazanan yok");
        }


    }
}
