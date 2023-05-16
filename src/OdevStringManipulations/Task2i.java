package OdevStringManipulations;

import java.util.Scanner;

public class Task2i {
    public static void main(String[] args) {
 /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı
		 */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir şifre oluşturunuz");
        System.out.println("şifrenizin ilk harfi büyük olmalı \nson karakteri sayı olmalı \nen az 6 karakter olmalı ");
        String sifre= input.nextLine();
       Character ilkharf = sifre.charAt(0);
       Character sonharf=sifre.charAt(sifre.length()-1);
       boolean a=Character.isUpperCase(ilkharf);
       boolean b=Character.isDigit(sonharf);
        boolean c= sifre.length() >=6;
        if (a==true&&b==true&&c==true){
            System.out.println("şifreniz geçerlidir");}else System.out.println("geçersiz şifre giriniz ");



    }
}