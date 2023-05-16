package j05_IfStatement.Tasks_İf;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Ehliyetiniz var mı\n evet için 1'i\n hayır için 2'yi tuşlayınız");
        int secim=input.nextInt();
        if(secim==1){
            System.out.println("yıl tecrübenizi giriniz");
            int yilTecrübe=input.nextInt();
            if (yilTecrübe>=7){
                System.out.println("aldığınız toplam mesafeyi km olarak giriniz");
                int km=input.nextInt();
                if (km>=100000){
                    System.out.println("***Kontak anahtarını almaya hak kazandınız, tebrikler***");
                } else{
                    System.out.println("Km tecrübeniz 100000'in üzerinde olmalıdır");
                }
            }else System.out.println("Üzgünüz 7 yıl ve daha fazla yıl tecrübeniz olmalıdır");
        }else System.out.println("En kısa sürede ehliyet alabilmenizi temenni ederiz");






    }
}
