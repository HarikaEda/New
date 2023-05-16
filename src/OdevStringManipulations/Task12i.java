package OdevStringManipulations;

import java.util.Scanner;

public class Task12i {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("üç kelimelik bir isim giriniz");
        String kelime1= input.next();
        String kelime2= input.next();
        String kelime3= input.next();
        /*String kelime1=kelime.substring(0,kelime.indexOf(" ")+1);
        String kelime2=kelime.substring(0,kelime1.indexOf(" "));
        String kelime3=kelime.substring(0,kelime2.indexOf(" ")-1);*/
      System.out.println(((kelime1.charAt(0))+"."+kelime2.charAt(0)+"."+kelime3.charAt(0)+".").toUpperCase());
     





    }
}
