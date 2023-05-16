package j10_MetodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //task:girilen 3 sayının ortalamasını print eden METHODcreate ediniz
int toplam=0;//boş kutu
        Scanner input=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("i. = " + "sayı giriniz: ");
            toplam+= input.nextInt();
        }
        System.out.println(ortalamaHesapla());//3 int parametreli method call edildi
       ortalamaHesapla1(toplam);


    }

    private static void ortalamaHesapla1(int sayı){
       System.out.println("ben hesapla 1 methoduyum = " + ((sayı) / 3));
    }

    private static int ortalamaHesapla() {
        int sayı=0;
        return (sayı) / 3;
    }
}
