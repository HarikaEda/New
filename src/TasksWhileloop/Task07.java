package TasksWhileloop;

import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
  /*
        1 ile 100    sayi arasındaki  pc'nin atadığı
        tamsayıyı kullanıcıya  tahmin ettirip
         tahmin sayısını print eden  code create ediniz.
         */
        int cvp=33;
        int tahmin=1;
        Random rnd=new Random();
        Scanner input=new Scanner(System.in);
        int sayi= rnd.nextInt(100);

        System.out.println("***tahmin başlıyor***");
        while (tahmin<100){
            System.out.println("1 il1 100 arası bir tahminde bulunun");
            tahmin= input.nextInt();
            if (tahmin>cvp){
                System.out.println("tahmini küçültünüz");

            } else if (tahmin<cvp) {
                System.out.println("tahmini büyütünüz");

            } else if (tahmin==cvp) {
                System.out.println("***tebrikler***");
                break;




    }
}}}
