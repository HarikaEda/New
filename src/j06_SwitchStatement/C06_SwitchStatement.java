package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchStatement {
    public static void main(String[] args) {
      //kullanıcının yaşadığı güne göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
      //pazartesiyi hafta başı olarak alınız
        Scanner input=new Scanner(System.in);
        System.out.println("pazartesi:1\nsalı:2\nçarşamba:3\nperşembe:4\ncuma:5\ncumartesi:6\npazar:7"+" Haftanın kaçıncı günündesiniz? ");
int
        kacıncıGün= input.nextInt();
if (kacıncıGün<1||kacıncıGün>7){
    System.out.println("1'den 7'ye kadar olan bir numara giriniz");
}else System.out.println("kaç gün sonrasını öğrenmek istiyor sununuz");
int kacgünSonra= input.nextInt();
int bulunanGun=(kacgünSonra+kacıncıGün)%7;
switch (bulunanGun){
    case 1:
        System.out.println("gün sonra pazartesi");
        break;
        case 2:
        System.out.println("gün sonra salı");
        break;
        case 3:
        System.out.println("gün sonra çarşamba");
        break;
        case 4:
        System.out.println("gün sonra perşembe");
        break;
        case 5:
        System.out.println("gün sonra cuma");
        break;
        case 6:
        System.out.println("gün sonra cumartesi");
        break;
        case 7:
        System.out.println("gün sonra pazar");
        break;
    default:
        System.out.println("Hatalı giriş");



}


    }
}
