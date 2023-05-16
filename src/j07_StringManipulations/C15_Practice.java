package j07_StringManipulations;

import java.util.Scanner;

public class C15_Practice {
    public static void main(String[] args) {
  /* task: girilen bir password için asağidaki sartları saglarsa "gayet basarılı:"
  saglamazsa "çok basarısız :(yeni password giriniz" print eden code create ediniz.
  1-en az 8 karakter
  2-ilk harf buyuk
  3-son harf kucuk
  4-boşluk içermesin

        */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir şifre oluşturunuz");
        System.out.println("şifrenizin ilk harfi büyük olmalı \nson harf küçük olmalı \nen az 8 karakter olmalı \nboşluk içermemeli ");
        String sifre= input.nextLine();
        Character ilkharf = sifre.charAt(0);
        Character sonharf=sifre.charAt(sifre.length()-1);
        boolean a=Character.isUpperCase(ilkharf);
        boolean b=Character.isLowerCase(sonharf);
        boolean c= sifre.length() >=8;
        if (a==true&&b==true&&c==true&&!sifre.contains(" ")){
            System.out.println("şifreniz geçerlidir");}else System.out.println("geçersiz şifre giriniz ");
/*    Scanner input = new Scanner(System.in);
        System.out.print("Agam password giresen : ");
        String password = input.nextLine();

        if (password.length() >= 8 &&//password 8 karakterden buyuk ve eşit olma şartı
                !password.contains(" ") && //password " " içermeme şartı
                Character.isUpperCase(password.charAt(0)) &&//password ilk harf buyuk olma şartı
                Character.isLowerCase(password.charAt(password.length() - 1)) //password son harf kucuk olma şartı
        ) {
            System.out.println("gayet başarılı DEWAMKEEE :)");
        } else System.out.println("Çok başarısız :( agam yeni password giresen");*/











    }
}
