package TaskssLoops;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
/*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        int bolenSayısı=0;//boş kutu açtık
        for (int i=2;i<sayi;i++){if (sayi%i==0){
            bolenSayısı++;}}
        if (bolenSayısı==0){
            System.out.println("girilen sayı asaldır");}else System.out.println("girilen sayı asal değildir");







    }
}
