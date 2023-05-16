package EllyTaskssss;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.nextLine();
if (kelime.contains("xyz")){
    System.out.println("true");}else System.out.println("false");


    }
}
