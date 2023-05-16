package OdevStringManipulations;

import java.util.Scanner;

public class Task6i {
    public static void main(String[] args) {
/*
        Girilen String'in son karakterini silen code create ediniz...

   Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();
        System.out.println(str.substring(0, str.length() - 1));

    }*/
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.next();
        System.out.println(kelime.substring(0, kelime.length() - 1));


    }
}
