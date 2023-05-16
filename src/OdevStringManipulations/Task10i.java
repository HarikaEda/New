package OdevStringManipulations;

import java.util.Scanner;

public class Task10i {
    public static void main(String[] args) {
        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("üç harfli bir isim giriniz");
        String isim=input.nextLine();
        //1.yol
        System.out.println(isim.length() == 3);
        System.out.println((isim.charAt(0)!=isim.charAt(1)&&isim.charAt(1)!=isim.charAt(2)&&isim.charAt(0)!=isim.charAt(2))?
                "gecerli giris" : "hatali giris");
        //2.yol
String s1=isim.substring(0,1);
String s2=isim.substring(1,2);
String s3=isim.substring(2,3);
if (isim.length()==3){
    if (!s1.equals(s2)&&!s1.equals(s3)&&!s2.equals(s3)){
        System.out.println("bu isimdeki harfler uniquedir");
    }else System.out.println("bu isimdeki harfler unique değilsir");
}else {
    System.out.println("isim 3 harfli değildir");
    /*Scanner input=new Scanner(System.in);(benim son yazdığım)
    System.out.println("bir kelime giriniz");
    String str= input.nextLine();
    if (str.length()==3){
        System.out.println(str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && str.charAt(0) != str.charAt(2) ?
                "geçerli giriş" : "geçersiz giriş");}else System.out.println("karakter sayısı fazla");*/


}











    }
}
