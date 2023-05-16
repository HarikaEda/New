package j07_StringManipulations;

import java.util.Scanner;

public class C16_UpperCaseLoverCase {
    public static void main(String[] args) {

   /*
        toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
       toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
       ignoreCase()-> verilen string'i BUYU-kucuk harf duyarlılığını kaldırır.
         */

      /*  String str="javaCAN'lara selam bolcana offer :)";
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)
        System.out.println("str.toUpperCase() = " + str.toUpperCase());// JAVACAN'LARA SELAM BOLCANA OFFER :)
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//javacan'lara selam bolcana offer :)
        System.out.println("str = " + str);//javaCAN'lara selam bolcana offer :)
//girilen stringin karakterini silen code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.next();
        System.out.println(kelime.substring(0, kelime.length() - 1));


        String harfDeposu="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

           char birinci=harfDeposu.charAt(harfDeposu.indexOf("h"));
           char ikinci=harfDeposu.charAt (harfDeposu.indexOf("a"));
           char ucuncu=harfDeposu.charAt(harfDeposu.indexOf("r"));
           char dorduncu=harfDeposu.charAt(harfDeposu.indexOf("i"));
           char besinci=harfDeposu.charAt(harfDeposu.indexOf("k"));
           char altınci=harfDeposu.charAt(harfDeposu.indexOf("a")); */Scanner input=new Scanner(System.in);
        String kelime= input.nextLine();
        System.out.println("lütfen bir kelime giriniz");
        System.out.println(kelime.substring(0, kelime.length() / 2));












    }
}
