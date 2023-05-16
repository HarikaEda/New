package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchClassATM {
    public static void main(String[] args) {
 /* TaskATM-> Bakiye 1000 dolar olan bir banka hesabı için bakiye öğrenme-para çekme-para yatırma ve
 çıkış yapma işlemlerinin yapıldığı bir ATM app. create einiz*/


 int bakiye=1000;
        System.out.println("****");
        System.out.println("JavaBank ATM ye hoş geldiniz");
        Scanner input=new Scanner(System.in);
        System.out.println("hangi işlemi gerçekleştirmek istiyorsunuz: \nbakiye-1\npara yatırma-2\npara çekme-3\nçıkış-4");
      int tercih= input.nextInt();
        switch (tercih){
            case 1:
                System.out.println("bakiye = " + bakiye);

            case 2:
            System.out.println("para yatırma");
            int yatirilanMiktar= input.nextInt();
            bakiye+=yatirilanMiktar;
            break;
            case 3:
            System.out.println("para çekme");
            int cekilenMiktar= input.nextInt();
            if (cekilenMiktar<=bakiye){
                bakiye-=cekilenMiktar;}else System.out.println("çekimden sonraki bakiyeniz");
            int miktar2=input.nextInt();
            
            break ;
            case 4:
            System.out.println("çıkış yaptınız,yine bekleriz");
            break;
           default:
                System.out.println("yanlış bir seçim yaptınız");
            break ;
        }}

















    }

