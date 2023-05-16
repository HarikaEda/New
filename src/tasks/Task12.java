package tasks;

import java.util.Scanner;

public class Task12 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
/*
Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
1- @ karakteri olmalı
2- . (nokta) karakteri olmalı
3- @ karakterinden önce mutlaka en az bir karakter olmalı.
Example:
"@gmail.com"-> false
"@gmailcom"-> false
"gmail.com"-> false
"ebıkGabık@gmail.com"-> true*/
        System.out.println("e -mail adresinizi giriniz");

mailKontrol();

    }//main sonu

    private static void mailKontrol() {
        String mail= input.nextLine();
        System.out.println((mail.contains("@") && mail.contains(".") && mail.charAt(0) != '@' ? "e-mail başarılı" : "e-mail hatalı"));
    }


}
