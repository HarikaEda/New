package Ellys_TasksLesson04;

import java.util.Scanner;

public class Q11_Count {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String str= input.nextLine();
        System.out.println("bir harf giriniz");
        char harf = input.nextLine().charAt(0);
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == harf) {
                toplam++;
            }

        }
        System.out.println("girdiğiniz cümlede " + toplam + " adet "  + harf + " vardır ");



    }
}
