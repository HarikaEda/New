package Interviev_Code_Challenged.Day4;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
//Get String from user and print just vowels(aeiou) inside String on the console

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir string giriniz: ");
            String str = scanner.nextLine().toLowerCase();//soruda kucuk harf istemis o yuzden toLowerCase yaptik

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    System.out.println("i = " + i);
                }
            }
    //String str2 = str.replaceAll([ ^aeiou^])
           // System.out.println(str2);


    }
}
