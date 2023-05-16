package Interviev_Code_Challenged.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q01D2 {
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
/*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
        amstrongSayıMı();

        System.out.println("Bir sayı giriniz");
        int sayi = input.nextInt();
    }
//bu 2. sorunun cevabı da olur..
    private static void amstrongSayıMı() {System.out.println("sayı giriniz");
        int sayi = input.nextInt();
        String s = String.valueOf(sayi);
        System.out.println("s = " + s);
        String sArr[] = s.split("");
        System.out.println("Arrays.toString(sArr) = " + Arrays.toString(sArr));

        int sum = 0;
        for (String w : sArr) {
            sum += (int) +Math.pow(Integer.parseInt(w), s.length());
        }
        System.out.println("sum = " + sum);

        if (sum == sayi) {
            System.out.println("amstrong sayı");
        } else System.out.println("amstrong sayı DEĞİL");

    }
}


//        char[] ch1 = s.toCharArray(); // 1,5,3
//        System.out.println("Arrays.toString(ch1) = " + Arrays.toString(ch1));
//
//        int toplam = 0;
//        for (char w : ch1) {
//            if (Character.isDigit(w)) {
//                int x = Integer.parseInt(w + "");
//                int sayınınKupu = (int) Math.pow(x, 3);
//
//                toplam += sayınınKupu;
//            }
//            System.out.println("w = " + w);
//        }
//
//        // System.out.println(" " +toplam);
//
//
//        if (toplam == sayi) {
//            System.out.println("amstrong sayı");
//        } else System.out.println("amstrong sayı DEĞİL");