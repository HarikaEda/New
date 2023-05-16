package tasks;

import java.util.Scanner;

public class Task06 {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
//task->girilen iki boyuta göre seçilen geometrik şeklin çevre ve alanını hesaplayan method create ediniz
        geometrikHesapla();

    }
    private static void geometrikHesapla() {
        System.out.println("bir boyut giriniz");
        double boyut1= input.nextDouble();
        System.out.println("bir boyut daha giriniz");
        double boyut2= input.nextDouble();
        System.out.println("geometrik bir şekil seçiniz");
        String geosekil= input.next();
        switch (geosekil){
            case "kare":
                kareAlanHesapla(boyut1);
                kareCevreHesapla(boyut1,boyut1);
                break;
            case "dikdörtgen":
                dikdortgenAlanHesapla(boyut1,boyut2);
                dikdortgenCevreHesapla(boyut1,boyut2);

                break;
            case "üçgen":
                ucgenAlanHesapla(boyut1);
                ucgenCevreHesapla(boyut1,boyut2);

                break;
            default:
                System.out.println("hatalı giriş yaptınız");
        }
    }
    private static void ucgenCevreHesapla(double boyut1, double boyut2) {
        System.out.println("bir boyut daha giriniz");
        double boyut3= input.nextDouble();
        System.out.println("çevre :" +(boyut3 + boyut2 + boyut1));
    }
    private static void ucgenAlanHesapla(double boyut1) {
        System.out.println("yukseklik giriniz");
        double h= input.nextDouble();
        System.out.println("alan :"+(boyut1 * h) / 2);
    }
    private static void dikdortgenCevreHesapla(double boyut1, double boyut2) {
        System.out.println("çevre :"+(boyut1 + boyut2) * 2);
    }
    private static void dikdortgenAlanHesapla(double boyut1, double boyut2) {
        System.out.println("alan :"+(boyut1 * boyut2));
    }
    private static void kareCevreHesapla(double boyut1, double boyut2) {
        System.out.println("çevre :"+boyut1*4);
    }
    private static void kareAlanHesapla(double boyut1) {
            System.out.println("alan :"+boyut1*boyut1);
        }
    }




