package EllyTaskssss;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime1= input.nextLine();
        System.out.println("ikinci kalimeyi giriniz");
        String kelime2=input.nextLine();
        //System.out.println(kelime1.concat(kelime2));

        System.out.println(kelime1.substring(1));
        System.out.println(kelime2.substring(1));
        System.out.println(kelime1.concat(" "+kelime2));
       /* Scanner input=new Scanner(System.in); sonradan benim yazdıgım
        System.out.println("bir kelime giriniz");
        String str1= input.next();
        System.out.println("ikinci kelimeyi giriniz");
        String str2= input.next();
        System.out.println(str1.concat(str2));
        System.out.println(str1.substring(1).concat(str2.substring(1)));
*/


    }
}
