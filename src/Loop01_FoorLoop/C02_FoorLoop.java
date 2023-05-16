package Loop01_FoorLoop;

import java.util.Scanner;

public class C02_FoorLoop {
    public static void main(String[] args) {
     //task:girilen sayıdan 100e kadar 4ün katı olan tam sayıları print eden code creat ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        for (int i=sayi;i<100;i++){
            if (i%4==0){
                System.out.print(i+" ");}
        }}







}
