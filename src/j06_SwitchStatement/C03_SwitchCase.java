package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
//girilen ay numarasına göre kac gün çektiğini print eden code create ediniz.

        Scanner input=new Scanner(System.in);
        System.out.println(" bir sayı giriniz :");
        int aysayisi= input.nextInt();
        switch (aysayisi){
            //default: buraya da girilebilir.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün içerir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ayda 30 gün vaedır");
                break;
            case 2:
                System.out.println("bir yıl giriniz");
                int yil= input.nextInt();
                //if (yil%4==0){
                    //System.out.println("girilen ayda 29 gün vardır");}else System.out.println("girilen ayda 28 gün vardır.");
                System.out.println(yil%4==0?"girilen ayda 29 gün vardır":"girilen ayda 28 gün vardır");
                break;
            default:
                System.out.println("yanlış bir giriş yaptınız");
             break;

        } System.out.println("code calıştı muhtesem");


















    }
}
