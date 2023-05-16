package EllyTaskssss;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

          Scanner input=new Scanner(System.in);
        System.out.println("adınızı giriniz :");
        String ad= input.next();
        System.out.println("soyadınızı giriniz :");
        String soyad= input.next();
        if (ad.length()>soyad.length()){
            System.out.println("ad uzun");}else System.out.println("soyad uzun");




    }
}
