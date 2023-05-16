package TaskssLoops;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
// task-> girilen  bir char karakterden sonra gelen 10 karakteri print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=input.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {

            System.out.print((char) (girilenKarakter+i) + " ");
        }





    }
}
