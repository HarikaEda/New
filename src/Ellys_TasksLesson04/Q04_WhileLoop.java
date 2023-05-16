package Ellys_TasksLesson04;

import java.util.Scanner;

public class Q04_WhileLoop {
    public static void main(String[] args) {
 /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        int sayac=0;
       while (sayi>0){
         if (sayi%2!=0){
             System.out.print(sayi+" ");
             sayac++;
         }
         sayi--;//butun sayılara bakacagı içib
       }
        System.out.println();
        System.out.println("sayac = " + sayac);


    }
}
