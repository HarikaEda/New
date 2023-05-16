package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console 'a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= input.nextInt();
        if (sayi>99&&sayi<1000){
            System.out.println("Girdiğiniz sayı 3 basamaklı");
        } else if (sayi>10&&sayi<100) {
            System.out.println("Girdiğiniz sayı 2 basamaklı");

        }else System.out.println("Girdiğiniz sayı her ikisi de değil");

        System.out.println("sayi = " + sayi);

    }
}
