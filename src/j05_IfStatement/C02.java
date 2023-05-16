package j05_IfStatement;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
 //if else statement
 /*task:girilen yasın 18 den buyuklugunu kontrol eden code create ediniz..*/
        Scanner input=new Scanner(System.in);
        System.out.println("yasınızı giriniz:");
        int yas= input.nextInt();

        if (yas>18){
            System.out.println("artık resitsin");
        }
        //task:girilen yasın 18 den buyuklugunu kontrol eden ve 18 den kucukse "agam buyude gel:(
        if (yas>=18){
            System.out.println("agam artık resitsin:");
        }else {
            System.out.println("agam buyu de gel:)");
        }











    }
}
