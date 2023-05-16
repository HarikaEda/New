package TaskssLoops;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
   /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.
 */
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.nextLine();
        String yenikelime = "";
        int sayac = 0;
        for (int i = (kelime.length() - 1); i >=0; i--) {
            yenikelime += kelime.charAt(i);
        }
        if (yenikelime.equals(kelime)) {
            System.out.println("girilen kelime polindrom bir kelimedir");
        } else {
            System.out.println("girdiğiniz kelime polindrom kelime değildir");
        }


    }
}
