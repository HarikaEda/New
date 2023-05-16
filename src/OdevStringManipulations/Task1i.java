package OdevStringManipulations;

import java.util.Scanner;

public class Task1i {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle yazınız");
        String str = input.next();
        String str1=" ";
        System.out.println(str1.contains(" "));


    }}