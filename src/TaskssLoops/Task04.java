package TaskssLoops;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
//girilen 2 sayı arasındaki çift sayıları print eden cade create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi1= input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2= input.nextInt();

        for (int i =(sayi1<sayi2 ? sayi1 : sayi2); i <=(sayi1>sayi2 ? sayi1 : sayi2) ; i++) {
            System.out.print(i%2==0 ? i+" " : "");
        }
   System.out.println();
        System.out.println("code ok :)");















    }
}
