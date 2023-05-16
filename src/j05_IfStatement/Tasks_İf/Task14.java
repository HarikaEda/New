package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */
        Scanner input = new Scanner(System.in);
        System.out.print("Cinsiyetinizi giriniz : ");
        String cinsiyet = input.nextLine();
        if (cinsiyet.equalsIgnoreCase("kadın")) {
            System.out.print("Yaşınızı giriniz : ");
            int yas = input.nextInt();
            if (yas >=60) {
                System.out.print("Prim gunu : ");
                int prim_gunu = input.nextInt();
                if (prim_gunu >= 6000) {
                    System.out.println("Emeklilik hakkınız gelmiştir");
                } else {
                    System.out.println("Emeklilik hakkınıza daha var");

                }
            }
        if (cinsiyet.equalsIgnoreCase("erkek")){
            System.out.print("Yaşınızı giriniz : ");
            int yas2= input.nextInt();
            if (yas2 >= 65) {
                System.out.print("Prim gunu : ");
                 int prim_gunu = input.nextInt();
                 if (prim_gunu >= 7000) {
                     System.out.println("Emeklilik hakkınız gelmiştir");
            } else {
                 System.out.println("Emeklilik hakkınıza daha var");

        }
    }
}

        }
    }
}