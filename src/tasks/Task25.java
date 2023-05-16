package tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        //task-> girilen sayının faktoriyelini print eden METHOD create ediniz

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        System.out.println(faktoriyelHesaplama(sayi));
    }

    private static int faktoriyelHesaplama(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!=" + faktoriyel);


        return faktoriyel;}
    }
