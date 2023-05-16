package tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
/*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi= input.nextInt();
basamakSayısı(sayi);

    }

    private static int basamakSayısı(int sayi) {
     int adet=0;
     while (sayi>0){
         sayi/=10;
         ++adet;
     }
        System.out.println("Sayınızın basamak sayısı : " + adet);
        return adet;
    }
}
