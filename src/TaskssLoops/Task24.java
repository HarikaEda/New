package TaskssLoops;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /* Task -> girilen  String'in tersini(reverse String) print eden code create ediniz */
        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= input.nextLine();
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));}




    }
}
