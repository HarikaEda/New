package j07_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
  //içerir-var demek
  String str="basarı gayrte asıktır,javacanlara selam olsun";
        System.out.println(str.contains("java"));//true
        System.out.println(str.contains("java"));//false
        System.out.println(str.contains(" "));//true
        System.out.println(str.contains(""));//true
String str1="başarı";
        System.out.println(str1.contains("str"));//false
        System.out.println(str.contains(str1));//true
        System.out.println(str.contains(str));//true
//task:girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin=input.nextLine();
        System.out.println("bir kelime giriniz :");
        String kelime=input.nextLine();
        System.out.println(metin.contains(kelime));
//String str2="selam";
      //  System.out.println(str2.contains("selam"));
       // System.out.println(str2.contains("hayat"));



    }
}
