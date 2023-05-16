package j05_IfStatement;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
 //Task -girilen bir tam sayının iki basamaklı olmasını kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi= input.nextInt();
        System.out.println ((sayi <10&&sayi>-10)?"sayın tek basamaklı":"sayı en az iki basamaklı ");


    }
}
