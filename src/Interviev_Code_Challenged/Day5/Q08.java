package Interviev_Code_Challenged.Day5;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string ifade giriniz ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (str.charAt(i) == ' '&&str.charAt(i)=='a') {
                System.out.println();
            }
        }

// boşluk ve a harfi geldiginde bunlari yazmasin yapamadım

    }
}
