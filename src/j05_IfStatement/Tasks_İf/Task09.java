package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= input.nextInt();
        if (sayi>0){
            System.out.println("girdiğiniz sayı pozitiftir");
        }else System.out.println("girdiğiniz sayı negatiftir");



    }
}
