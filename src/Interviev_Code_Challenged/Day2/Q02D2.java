package Interviev_Code_Challenged.Day2;

import java.util.Scanner;

public class Q02D2 {
    public static void main(String[] args) {
 /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */
//bu 1. sorunun cevabı da olur..
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= input.nextInt();
        int basamak=0;
        int rakam=0;
        int toplam=0;
        int gecici=sayi;
        int gecici2=sayi;
        while (gecici2>0){
            gecici2/=10;
            basamak++;
        }

        while (sayi>0){
            rakam=sayi%10;
            toplam+=Math.pow(rakam,basamak);
            sayi/=10;
        }

        if (toplam==gecici){

            System.out.println(gecici2 + " girdiğiniz sayı Armstrong sayıdır :)");
        }else System.out.println(gecici2 + " girdiğiniz sayı Armstrong sayı değildir..");



    }
}
