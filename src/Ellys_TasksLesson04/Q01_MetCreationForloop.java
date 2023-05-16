package Ellys_TasksLesson04;

import java.util.Scanner;

public class Q01_MetCreationForloop {
    public static void main(String[] args) {
 /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */
        Scanner input=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= input.nextLine();
        System.out.println(reverseString(str));

    }

    private static String reverseString(String str) {

String tersStr="";
for (int i=str.length()-1;i>=0;i--){
    tersStr+=str.charAt(i);
}
        return tersStr;
    }
}
