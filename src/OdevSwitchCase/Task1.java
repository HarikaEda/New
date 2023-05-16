package OdevSwitchCase;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int sayi= input.nextInt();
        int onlarbasamagi=(sayi/10)%10;
        switch (onlarbasamagi){
            case 1:
                System.out.println("sıfır");
            break;
            case 2:
                System.out.println("bir");
            break;
            case 3:
                System.out.println("iki");
            break;
            case 4:
                System.out.println("üç");
            break;
            case 5:
                System.out.println("dört");
            break;
            case 6:
                System.out.println("beş");
            break;
            case 7:
                System.out.println("altı");
            break;
            case 8:
                System.out.println("yedi");
            break;
            case 9:
                System.out.println("sekiz");
            break;
            case 10:
                System.out.println("dokuz");
            break;
            default:
                System.out.println("hatalı bir giriş yaptınız");
             break;
        }
        System.out.println("cade active :))  ");
















    }
}
