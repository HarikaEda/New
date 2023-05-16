package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class tasks04 {
    public static void main(String[] args) {

  /* Task->
       Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana "Erkek çocuk" yazdırın.
Yaşı 18 den büyük eşit ise ekrana "Adam" yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana "Kız çocuk" yazdırın.
Yaşı 18 den büyük eşit ise ekrana "Kadın" yazdırın.
       */
        Scanner input1 = new Scanner(System.in);
        System.out.print("cinsiyet giriniz:");
        String cinsiyet = input1.next();

        System.out.print("yas giriniz:");
        int yas = input1.nextInt();

        if (cinsiyet.equals("erkek")) {
            if (yas < 18) {
                System.out.println("erkek cocuk");
            } else System.out.println("adam");
        } else {
            if (yas < 18) {
                System.out.println("kız cocugu");
            } else {
                System.out.println("kadın");
            }
        }

    }
    }