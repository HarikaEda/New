package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner input=new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1=input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2=input.nextInt();

        System.out.println("toplama için 1'i\nçıkarma için 2'yi\nçarpma için 3'ü\nbölme için 4'ü seçiniz");
        System.out.print("secim giriniz: ");
        int secim=input.nextInt();

        System.out.println("secim = " + secim);

        if (secim==1){
            System.out.println("sonuç = "+sayi1+sayi2);
        }else if (secim==2){
            System.out.println("sonuç = "+(sayi1-sayi2));
        }else if (secim==3){
            System.out.println("sonuç = "+sayi1*sayi2);
        } else if (secim==4) {
            System.out.println("sonuç = "+sayi1/sayi2);
        }

    }
}
