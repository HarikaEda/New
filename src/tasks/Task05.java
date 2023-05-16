package tasks;

import java.util.Scanner;

public class Task05 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
// task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz

dortIslem();
        System.out.println("code cincix :)");
    }
    //main sonu
    private static void dortIslem(){
        System.out.println("1.sayıyı giriniz");
        double sayı1=input.nextDouble();
        System.out.println("2. sayıyı giriniz");
        double sayı2= input.nextDouble();
        System.out.println("işlem seçiniz");
        char islem=input.next().charAt(0);
        switch (islem){
            case '+':
               topla(sayı1,sayı2);
             break;
            case '-':
                cıkar(sayı1,sayı2);
                break;
            case '*':
                 carp(sayı1,sayı2);
                break;
            case '/':
                bol(sayı1,sayı2);
                break;
            default:
                System.out.println("hatalı giriş yaptınız");

        }


    }


    public static void topla(double sayı1,double sayı2){
        System.out.println(sayı1 + sayı2);
    }public static void cıkar(double sayı1,double sayı2){
 System.out.println((sayı2 - sayı1));
    }public static void carp(double sayı1,double sayı2){
        System.out.println((sayı1 * sayı2));
    }public static void bol(double sayı1,double sayı2){
        System.out.println((sayı1 /sayı2));
    }



}
