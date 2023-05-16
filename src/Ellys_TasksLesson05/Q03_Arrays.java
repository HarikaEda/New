package Ellys_TasksLesson05;

import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir cümle giriniz :");
        String sArr = input.nextLine();
        int sayac = 1;
        for (int i = 0; i < sArr.length(); i++) {
            if (sArr.charAt(i) == ' ') {
                sayac++;
            }
        }

        /*System.out.println("girilen cümlede: "+sayac+" tane kelime vardır");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz ");
        String verilenCumle = scan.nextLine().trim();
        int kelimeSayisi=0;
    String[] cumle= verilenCumle.split(" ");
        kelimeSayisi=cumle.length;
        System.out.println(kelimeSayisi);*/



    }


}
