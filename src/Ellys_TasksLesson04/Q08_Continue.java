package Ellys_TasksLesson04;

import java.util.Scanner;

public class Q08_Continue {
    public static void main(String[] args) {
 /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
        Scanner input=new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str= input.nextLine();
        System.out.println(str.charAt(0));

                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == 'a'  || str.charAt(i) == ' ' )
                        continue; //atla devam et
                    System.out.println(str.charAt(i) + " ");
                }


    }



}
