package TasksWhileloop;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
/*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner input = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str ="";
        do { str=input.nextLine();
            if (str.equals("x"))break;
            System.out.println("javaCAN");
            //System.out.print("bir metin giriniz : ");

        }while (!str.equalsIgnoreCase("x"));//x girmediği sürece :x girene kadar şartı
        System.out.println("javaTAR");

    }
}
