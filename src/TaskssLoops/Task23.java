package TaskssLoops;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
 /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi= input.nextInt();
        int SumofSquers=0;
        for (int i = 0; i <=sayi ; i++) {//girilen sayıya kadar loop tanımlandı
             SumofSquers = sayi * sayi;

        }
        System.out.println(SumofSquers+" ");


    }
}

