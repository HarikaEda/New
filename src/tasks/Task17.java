package tasks;

import java.util.Scanner;

public class Task17 { static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
/*
        Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
        input:1453
        output:3541
         */
        System.out.println("bir tam sayı giriniz");
        terstenYazdı();


    }

    private static void terstenYazdı() {
        int sayi= input.nextInt();
        System.out.println("giridiğiniz sayının tersten yazılışı : ");
        while (sayi>0){
            System.out.print(sayi%10);
            sayi/=10;

    }
}
   }
