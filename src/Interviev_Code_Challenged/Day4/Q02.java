package Interviev_Code_Challenged.Day4;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
 /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayi giriniz :");
            int sayi = scan.nextInt();
isEven(sayi);


        }

    private static int isEven(int sayi) {

        if (sayi % 2 == 0) {
            System.out.println("sayi = " + sayi+" ve sayınız çift sayıdır");
        }else System.out.println("sayınız çift sayı değildir");
        return sayi;
    }

}
