package TaskssLoops;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
  //girilen sayının faktöriyelini print eden code creat ediniz.
  //falan faktöriyel=1'den falana kadar tam sayıların çarpımı->1*2*3*...*falan

        Scanner input = new Scanner(System.in);
        System.out.print("bizim gızzz birinç sayı gir bakennn : ");
        int sayi = input.nextInt();
        int factorial = 1;//int type variable tanımlandı

        for (int i = 1; i <= sayi; i++) {
            factorial *= i;
        }
        System.out.println("bizin gızz girdigin sayının faktöriyeli : " + factorial);
    }















    }

