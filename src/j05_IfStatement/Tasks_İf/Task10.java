package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not= scan.nextInt();

        if (not<50 ){
            System.out.println("Your grade is D");
        } else if (not >50&&not<60) {
            System.out.println("Your grade is C");
        } else if (not>60&&not<80) {
            System.out.println("Your grade is B");
        } else {
            System.out.println("Your grade is A");
        }
        System.out.println("not = " + not);









    }


}
