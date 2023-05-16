package TaskssLoops;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
  /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". sayı giriniz:");
            int sayi = input.nextInt();
            if (sayi <= 10 || sayi >= 20) {
                toplam += sayi;
            }
        }
        System.out.println("girilen sayıların 10 20 arası hariç toplamı: " + toplam);


    }
}
