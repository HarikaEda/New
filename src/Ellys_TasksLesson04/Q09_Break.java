package Ellys_TasksLesson04;

import java.util.Scanner;

public class Q09_Break {
    public static void main(String[] args) {
  /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif bir sayı giriniz");
        int sayi= input.nextInt();
        boolean flag=true;
        int sayac=0;
        for (int i=2;i<sayi;i++){
            if (sayi%i==0)
                sayac++;
        }if (sayac==0){
            System.out.println(sayi+"asal bir sayıdır");
        }else System.out.println(sayi +"asal sayı değildir");
/*  Scanner sc = new Scanner(System.in);
          System.out.println("bir sayi giriniz :");
          int sayi = sc.nextInt();
          boolean flag = true; //asal olma durumu
          if(sayi>=2){
              for (int i = 2; i <sayi ; i++) {
                  if (sayi % i == 0) { //sayinin herhangi bir boleni olup olmadigini kontrol ediyoruz
                      flag = false; //asal degildir
                      break;
                  }
              } if(flag){//sartim saglandiysa asal sayi true
                      System.out.println(sayi + " asal sayidir");
                  }else System.out.println(sayi +" asal sayi degildir");
              } else System.out.println(sayi + " asal degildir.."); //negatif sifir ve 1 olma durumu*/





    }
}
