package Interviev_Code_Challenged.Day4;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
/*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"
        Lost onunca yaz ve çık
    */
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        if(sayi<100){
            System.out.println("Won!");
        }else{
            System.out.println("Lost!");
        }



    }
}
