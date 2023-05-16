package TasksWhileloop;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
/*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */


        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int ilkTamsayi= input.nextInt();
        System.out.println("ikinci tam sayıyı giriniz");
        int ikinciTamsayi= input.nextInt();

       for (int sayi=ilkTamsayi;sayi<=ikinciTamsayi;sayi++){
           System.out.println("sayi = " + sayi);}
        System.out.println("ilk tam sayı ile ikinci tam sayı arasındaki sayılar");






    }
}
