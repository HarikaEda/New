package j13_ArrayList.Tasks;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
/* TASK :
Bir integer list oluşturunuz ve bu list'deki tum sayıların karesinin
toplamını bulan code create ediniz.
 */
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("liste atamak içn sayı giriniz\nAgam yeter diyirsen 'q' gir ");
        String listSayılari = "";
        int toplam = 0;//list karelerini toplamı için boş kutu
        while (!listSayılari.equalsIgnoreCase("q")) {//while döngü girilen sayı q değilse action alır
            System.out.println(" Agam sayı giresen : ");
            listSayılari = input.nextLine();
            list.add(listSayılari);

        }
        System.out.println("agam girdiğin sayı listi : " + list);
        list.remove(list.size() - 1);//liste girilen son q elelmanı silinir
        System.out.println("q silinmiş kare toplamı almaya hazır hale gelen list :" + list);

        for (int i = 0; i < list.size(); i++) {
            toplam += Integer.parseInt(list.get(i)) * Integer.parseInt(list.get(i));
        }
        System.out.println("agam giridigin dsayılar toplamı : " + toplam);

        for (String w:list) {
          int m=Integer.parseInt(w);
          toplam+=m*m;
        }


    }
}













