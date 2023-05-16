package Interviev_Code_Challenged.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05D2 {
    public static void main(String[] args) {
/*  Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin boyutunu/eleman sayısını giriniz");
        int diziuzunluk = input.nextInt();
        System.out.println("array elemanlarını giriniz");
        int diziarr[] = new int[diziuzunluk];
        for (int i=0;i<diziuzunluk;i++){
            diziarr[i]=input.nextInt();
}
        System.out.println("Arrays.toString(diziarr) = " + Arrays.toString(diziarr));
        int max = 0;
        int min = 1000;



        for ( int i =0; i < diziarr.length; i++) {
            if (diziarr[i]< min) {
                min = diziarr[i];
            }
        }
        for (int i=0;i<diziarr.length;i++)
            if (diziarr[i] > max) {
            max = diziarr[i];
        }
        Arrays.sort(diziarr);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        int fark = max - min;
        System.out.println("fark = " + fark);
    }
}
