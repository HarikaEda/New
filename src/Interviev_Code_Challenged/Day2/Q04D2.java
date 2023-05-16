package Interviev_Code_Challenged.Day2;

import java.util.Scanner;

public class Q04D2 {
    public static void main(String[] args) {
 /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi= input.nextInt();
        int arr[]=new int[sayi];
        for (int i=0;i< arr.length;i++){

        }
        int toplam=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
if (toplam==sayi){
    System.out.println("girilen sayı mükemmel sayıdır");
}else System.out.println("girilen sayı mükemmel sayı değildir");

    }
}
