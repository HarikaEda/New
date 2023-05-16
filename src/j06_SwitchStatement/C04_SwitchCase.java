package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
//girilen ay numarasına göre kac gün çektiğini print eden code create ediniz.

        Scanner input=new Scanner(System.in);
        System.out.println(" bir ay giriniz :");
        int aysayisi= input.nextInt();
        switch (aysayisi){
            //default: buraya da girilebilir.
            case 12:
            case 1:
            case 2:
                System.out.println("girilen ay kış mevsimidir");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("girilen ay sonbahar mevsimidir");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("girilen ay ilkbahar mevsimidir");
            case 6:
            case 7:
            case 8:
                System.out.println("girilen ay yaz mevsimidir:)");
                break;
            default:
                System.out.println("yanlış bir giriş yaptınız");
                break;

        } System.out.println("code calıştı muhtesem");













    }
}
