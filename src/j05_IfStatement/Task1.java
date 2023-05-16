package j05_IfStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

     //girilen bir tam sayının pozitif olmasını kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı ironizing");
        int sayi= input.nextInt();
        String sonuc=sayi>0?"girilen sayı pozitiftir":"girilen sayı negatiftir";


    }
}
