package EllyTaskssss;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
/*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	    ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	    hesaplayan kodu yazın
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */

        Scanner input=new Scanner(System.in);
        System.out.println("1'den büyük bir sayı giriniz");
        int sayi= input.nextInt();
        int kareToplam=0;
        for (int i=1;i<=sayi;i++){
            System.out.println(i+" ");
            kareToplam=i*i;
        }
        System.out.println("kareToplam : " + kareToplam);

        }



}
