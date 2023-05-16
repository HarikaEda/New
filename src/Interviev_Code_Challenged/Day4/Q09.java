package Interviev_Code_Challenged.Day4;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
/*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("sifrelenecek ifadeyi giriniz :");
        String ifade = scan.nextLine().toLowerCase();
        for (int i = 0; i <ifade.length(); i++) {
        int index='z'-ifade.charAt(i);
            String sifreliIfade = String.valueOf((char) ('a') + index);
    }
       //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
}
}