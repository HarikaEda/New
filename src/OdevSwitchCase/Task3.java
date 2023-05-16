package OdevSwitchCase;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun
       Scanner input=new Scanner(System.in);
        System.out.println("1 ile 7 arasında bir gün sayısı giriniz");
        int gun= input.nextInt();
        switch (gun){
            case 1:
                System.out.println("bu gün pazartesi :) ");
            break;
            case 2:
                System.out.println("bu gün salı :) ");
            break;
            case 3:
                System.out.println("bu gün carşamba :) ");
            break;
            case 4:
                System.out.println("bu gün perşembe :) ");
            break;
            case 5:
                System.out.println("bu gün cuma :) ");
            break;
            case 6:
                System.out.println("bu gün cumartesi :) ");
            break;
            case 7:
                System.out.println("bu gün pazar :) ");
            break;
            default:
                System.out.println("hatalı bir giriş yaptınız");
            break;
}
        System.out.println("code active :))  ");











    }
}
