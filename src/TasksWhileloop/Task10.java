package TasksWhileloop;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar
        // olan tek sayıları print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int girilen= input.nextInt();
        int toplam=0;
        for (int i=1;i<=girilen;i++)if (i%2!=0){toplam+=i;}
        System.out.println("toplam = " + toplam);









}}
