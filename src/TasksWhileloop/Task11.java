package TasksWhileloop;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
 /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner input = new Scanner(System.in);
        int toplm = 0;
        int sayı;
        do {
            System.out.println("bir sayı giriniz");
            sayı = input.nextInt();
            toplm += sayı;

        } while (sayı != 0);
        System.out.println("toplm = " + toplm);


    }
}
