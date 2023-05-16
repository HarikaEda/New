package EllyTaskssss;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("adınızı giriniz: ");
        String firstName= input.nextLine();
        System.out.println("soyadınızı giriniz: ");
        String lastName=input.nextLine();
        String fullname=firstName.concat(lastName).toUpperCase();
        System.out.println("fullname = " + fullname);
        /*Scanner input=new Scanner(System.in);***sonradan benim yazdığım***
        System.out.println("ad ve sayadınızı giriniz");
        String str= input.nextLine();
        System.out.println("Ad-Soyad : " + str.toUpperCase());*/


    }
}
