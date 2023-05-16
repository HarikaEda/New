package EllyTaskssss;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ece
         * output = cecece
         *
         * input = el
         * output = el
         */
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen bir kelime giriniz");
        String kelime=input.next();
        String sonİkiharf=kelime.substring(kelime.length()-2);
        if (kelime.length()>=3){
            System.out.println(sonİkiharf+" "+sonİkiharf+" "+sonİkiharf);}
        else System.out.println("kelime = " + kelime);


    }
}
