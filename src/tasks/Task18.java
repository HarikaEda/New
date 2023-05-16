package tasks;

import java.util.Scanner;

public class Task18 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        dikUcgenKontrol();


    }

    private static void dikUcgenKontrol() {
        System.out.println("1. kenar uzunluğunu giriniz");
        int k1= input.nextInt();
        System.out.println("2. kenar uzunluğunu giriniz");
        int k2=input.nextInt();
        System.out.println("3. kenar uzunluğunu giriniz");
        int k3= input.nextInt();
        k3 = (int) Math.sqrt(k1*k1+k2*k2);

        if (k3 == Math.sqrt(k1*k1+k2*k2)){
            System.out.println("pisagor kuralına uymaktadır");


    }else System.out.println("pisagor kuralına uymuyor");
}}
