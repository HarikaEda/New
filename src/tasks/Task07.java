package tasks;

import java.util.Scanner;

public class Task07 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
//Task->girilen 3 sayıdan en küçüğünü print eden METHOD create ediniz.


enKucukBul();


    }

    private static void enKucukBul() {
        System.out.println("1. sayıyı giriniz");
        int sayı1= input.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayı2= input.nextInt();
        System.out.println("3.sayıyı giriniz");
        int sayı3= input.nextInt();
        System.out.println((sayı1 < sayı2) ? ((sayı1 < sayı3) ? (sayı1) : (sayı3)) : ((sayı2 < sayı3) ? (sayı2) : (sayı3)));
    }
}
