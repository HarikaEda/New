package CananTaskCözümü;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar  tek olanlarını
        // print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi= scan.nextInt();

        while (sayi>0) {
            if (sayi%2!=0) {
                System.out.println(sayi);
            }
            sayi--;
        }
    }
}
