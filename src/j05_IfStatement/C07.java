package j05_IfStatement;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /*TASK :
        Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
        degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
        degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.*/


        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi= input.nextInt();
        System.out.println ((sayi>999&&sayi<10000)?("4 basamaklı"):(sayi%2==0)?"4 basamaklı olmayan çift sayı"
        :"4 basmaklıolmayan tek sayı");

    }}