package OdevSwitchCase;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    /*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        String ay = scan.next().toLowerCase();*/
        Scanner input=new Scanner(System.in);
        System.out.println("bir ay seçiniz");
        int ay= input.nextInt();
        switch (ay){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("hatalı bir seçim yaptınız");
                break;


        }System.out.println("code active");













    }
}
