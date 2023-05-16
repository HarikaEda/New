package CananTaskCözümü.March23;

import java.util.Scanner;

public class T01 {
 /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru
    zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan
    do while code blogu create ediniz.

    */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("topun yüksekliğini giriniz");
        double yukseklik=input.nextDouble();
        int yereVurmaSayisis=0;
        double topunToplalmYolu=0;
        do {
            yereVurmaSayisis++;
            topunToplalmYolu+=yukseklik;
            yukseklik*=0.75;
        }while (yukseklik>=1);

        System.out.println("yereVurmaSayisis = " + yereVurmaSayisis);
        System.out.println("topunToplalmYolu = " + topunToplalmYolu);



    }
}
