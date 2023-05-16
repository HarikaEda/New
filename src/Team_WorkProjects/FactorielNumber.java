package Team_WorkProjects;

import java.util.Scanner;

public class FactorielNumber {
     /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        girilen herhangi bir sayının faktöriyel değerini print eden code create ediniz.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */

    static Scanner dp = new Scanner(System.in);
    static String strNum = dp.nextLine();

    static int number = Integer.parseInt(strNum);

    //      kodu burdan başlatın ve int number kullanıniz
    public static void main(String[] args) {

        int factorial = Integer.parseInt(strNum);
        for (int i = 1; i <=number; i++) {
            factorial = factorial * i;
            System.out.println(number+" * "+i+" = "+factorial);
        }
        System.out.println( number+" != " + factorial);
    }

}



