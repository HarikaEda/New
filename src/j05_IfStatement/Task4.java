package j05_IfStatement;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Task04-> girilen iki tamsayının iaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.     
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi1= input.nextInt();
        System.out.println("ikinci bir tam sayıyı giriniz");
        int sayi2= input.nextInt();
        Object sonuc = (sayi1 < 0 && sayi2 > 0) || (sayi1 > 0 && sayi2 < 0) ? (sayi1 + sayi2) : ("devam");
        System.out.println("sonuc");
//object class java class ların hepsini kapsar(hz Adem)

    }
}
