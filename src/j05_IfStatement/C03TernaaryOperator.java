package j05_IfStatement;

import java.util.Scanner;

public class C03TernaaryOperator {
    public static void main(String[] args) {
       /*
       Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
       Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir
       Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur
        */
  //task:girilen bir tamsayının tek-cift olmasını kontrol eden code create ediniz.

//kontrol et deyince if kullanırız
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
       /* int sayi= input.nextInt();
        if (sayi%2==0){
            System.out.println("sayı cift");}
        else System.out.println("sayı tek");
        System.out.println("ternary blok");
        //condition?(   ):(    );*/
        int sayı = 0;
        String sonuc=sayı%2==0?"sayı cift":"sayı tek";











    }
}
