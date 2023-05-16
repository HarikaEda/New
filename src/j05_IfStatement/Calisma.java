package j05_IfStatement;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
     /*
        Task-> Girilen  ürün miktarını ve ürünün birim fiyatını için Eğer urun miktarı 100 den fazla ise
                %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
                */
        Scanner input = new Scanner(System.in);
        System.out.println("ürün miktarı giriniz :");
        double urun = input.nextDouble();
        System.out.println("birim fiyatı giriniz :");
        double brm = input.nextDouble();
        System.out.println( urun>100 ? (urun* brm * 0.67) : (urun * brm));







    }
}
