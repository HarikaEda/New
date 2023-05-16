package TasksWhileloop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
   //girilen sayıların toplamı 333 ü geçtiğinde girilen sayı adedini ve toplamını print eden code create ediniz
        Scanner input=new Scanner(System.in);
       int sayıtop=0;
       int sayac = 0;



        /*while (sayıtop<=333){ System.out.println("bir sayı giriniz");
            sayıtop+= input.nextInt();
            sayac++;*/

          Scanner sc = new Scanner(System.in);

            int toplam=0, sayacFurkan=0;
            while (toplam<=333){
           System.out.print("gakgom bisayi girisin : ");
                toplam+=sc.nextInt();
                sayacFurkan++;

            }
            System.out.println("gakgom yeter  "+sayacFurkan+" kadar sayi girdin. Toplamları : "+toplam);


    }
}
