package j09_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
   /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String mail= input.nextLine();

      /*for (int i=0;i<mail.length();i++){
          if (mail.charAt(i))==' '{
             continue;
          }
      } System.out.println(mail.charAt(i));*/
        System.out.print("gakgom hele bişeyler cizikdiresen ha :");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==' ') {
                continue;//bu komut run oldugunda sonraki satıra geçmeden loop bir sonraki tekrardan devam eder
                //ticari bekleme devamet
            }
            System.out.print(str.charAt(i));
        }





    }
}
