package j13_ArrayList.ArrayListTasks02;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02_ÖğrteNot {
    public static void main(String[] args) {
 /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        ArrayList<Integer>notList=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("kac tane not girmek istiyor sunuz?");
        int notSayisi= input.nextInt();
        int toplam=0;
        for (int i=0;i<notSayisi;i++){
            System.out.println("notları giriniz");
            int notlar= input.nextInt();
            notList.add(notlar);
            toplam+=notlar;
        }
        int ortalama=toplam/notSayisi;
        int sayac=0;
        for (int i=0;i<notList.size();i++){
            if (notList.get(i)>ortalama){
                sayac++;
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("Ortalamayı geçen öğrenci sayısı = " + sayac);




    }
}
