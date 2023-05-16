package j09_Break_Continue;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
// task -> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir string ifade giriniz");
       String str= input.nextLine();
       int sayac=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c')
                break;
            if (str.charAt(i) == 'a')
                sayac++;
        }
  System.out.println("a karakter sayisi: " + sayac);

    }
}
