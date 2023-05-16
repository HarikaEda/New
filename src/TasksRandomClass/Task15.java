package TasksRandomClass;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayı= input.nextInt();
        int i1=sayı%10;
        int i2=sayı%100;
        System.out.println((i1 + i2 ));

    }
}
