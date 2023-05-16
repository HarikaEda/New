package tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
//task-> girilen ikisayının eşitliğini control eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();
   System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();
        System.out.println("esitMi() = " + esitMi(num1,num2));//method oluşturduktan sonra yazdık.

    }//main sonu

    public static boolean esitMi(int num1, int num2) {
        boolean esit = true;//dynamic code

        if (num1 == num2) {

        } else esit = false;

        return esit;
    }public static void esitControl(){//dynamic değil
        int a=3;
        int b=3;
        if (b==a){
            System.out.println("sayıla eşit");
        }else System.out.println("sayılar eşit değil");
    }
}//class sonu














