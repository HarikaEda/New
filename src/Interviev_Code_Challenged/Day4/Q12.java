package Interviev_Code_Challenged.Day4;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //Get 2 numbers from the user.
        //first number base
        //second number Top
        //Write a code that calculates the prime of a number.
        // 2, 3 --> 2^3 = 2*2*2= 8

        // 4, 3 --> 4^3= 4*4*4 = 64

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen taban ve us giriniz :");
            int taban = scan.nextInt();
            int us = scan.nextInt();
            System.out.println("Taban : " + taban);
            System.out.println("Us : " + us);
            System.out.println(Math.pow(taban, us));


    }

}