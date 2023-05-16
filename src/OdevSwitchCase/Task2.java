package OdevSwitchCase;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
       Scanner input =new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğununuzu giriniz : ");
        int gun= input.nextInt();
        switch (gun){
            case 1:
                System.out.println("yüz gün sonra bugün pazartesi");
            break;
            case 2:
                System.out.println("yüz gün sonra bugün salı");
            break;
            case 3:
                System.out.println("yüz gün sonra bugün çarşamba");
            break;
            case 4:
                System.out.println("yüz gün sonra bugün perşembe");
            break;
            case 5:
                System.out.println("yüz gün sonra bugün cuma");
            break;
            case 6:
                System.out.println("yüz gün sonra bugün cumartesi");
            break;
            case 7:
                System.out.println("yüz gün sonra bugün pazar");
            break;
            default:
                System.out.println("hatalı bir giriş yaptınız,tekrar deneyiniz");
            break;
        }
        System.out.println("code uuuuuu :)))   ");






    }
}
