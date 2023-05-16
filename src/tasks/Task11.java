package tasks;

import java.util.Scanner;

public class Task11 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
/* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

a->7
v->1
c->-4
e->2

 */


hackerDiliPrintEt();
        System.out.println("1. method run oldu");


    }

    private static void hackerDiliPrintEt() {
        System.out.println("bir kelime giriniz");
        String str= input.nextLine();
        System.out.println(str.replaceAll("a", "7").replaceAll("v", "1").
                replaceAll("c", "-4").replace("e", "2"));
    }
}
