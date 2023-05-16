package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
//task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        boolean asalMi=true;
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                asalMi=false;
                break;
            }

        }


if (asalMi){
    System.out.println("girilen sayı asaldır.");
}else System.out.println("girilen sayı asal değildir.");
        System.out.println("çoooookkkk önemli");


    }
}
