package j05_IfStatement;

import java.util.Scanner;

public class C06NestedTernaryOperator {
    public static void main(String[] args) {
  /*
 TASK :
Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
 */
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi= input.nextInt();
        System.out.println ((sayi>=0)?(sayi<10?"rakam":"pozitif sayı"):"negatif sayı");
//Trik: ne kadar ? o kadar :
//trik: javada nested bloklar run edildiğinde aplicationı yavaşlatır.dolayısıyla nested
// bloklar mecbur kalmmadıkca tercih edilmezler.














    }
}
