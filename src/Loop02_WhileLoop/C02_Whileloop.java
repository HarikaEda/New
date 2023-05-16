package Loop02_WhileLoop;

import java.util.Scanner;

public class C02_Whileloop {
    public static void main(String[] args) {
   //task: girilen tam sayının rak toplamını print
       Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
       int bisayi= input.nextInt();
       int rakt=0;
       while (bisayi>0){
           rakt+=bisayi%10;
           bisayi/=10;
       }
        System.out.println("rakt = " + rakt);


    }
}
