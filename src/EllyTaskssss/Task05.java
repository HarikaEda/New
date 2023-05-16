package EllyTaskssss;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner input=new Scanner(System.in);
        System.out.println("anlamlı bir kelime giriniz");
        String kelime1= input.nextLine();
        System.out.println("anlamlı ikinci kelimeyi giriniz");
        String kelime2= input.nextLine();
        System.out.println("anlamlı üçüncü kelimeyi giriniz");
        String kelime3= input.nextLine();
        System.out.println("anlamlı dördüncü kelimeyi giriniz");
        String kelime4= input.nextLine();
        System.out.println(kelime1.substring(0,1).toUpperCase()
                + kelime1.substring(1)+" "+kelime2+" "+kelime3+" "+kelime4+".");

    }
}
