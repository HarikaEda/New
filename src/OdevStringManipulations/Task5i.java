package OdevStringManipulations;

import java.util.Scanner;

public class Task5i {
    public static void main(String[] args) {
/* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz :) " );
        String name= input.next();
        System.out.println("lütfen soyadınızı giriniz :) ");
        String surname= input.next();
        String fulname=name+surname;
        System.out.println( name.substring(0,1).toUpperCase()+name.substring(1)+" "+surname.substring(0,1).toUpperCase()+surname.substring(1));







    }
}
