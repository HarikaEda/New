package Loop03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileloop {
    public static void main(String[] args) {
    //task->girilen sayı 13den küçük ise "olaaa kazandınız:)değilse sayı girişi isteyen code create ediniz.
        Scanner input=new Scanner(System.in);
     int sayı=0;

        do {
    System.out.println("bir sayı giriniz");
     sayı= input.nextInt();
}    while (sayı>=13);
        System.out.println("olaaa kazandınız");




    }
}
