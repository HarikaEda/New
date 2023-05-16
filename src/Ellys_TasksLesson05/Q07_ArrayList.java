package Ellys_TasksLesson05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q07_ArrayList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner input=new Scanner(System.in);
        System.out.print("list uzunluğunu giriniz : ");
        int listUzunluk= input.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("arrayın elemanlarını giriniz");
        for (int i=0;i<listUzunluk;i++){
            list.add(input.nextInt());
        }
        tekrarlıEleman(list);




    }

    private static void tekrarlıEleman(ArrayList<Integer>list) {
        ArrayList<Integer>tekrarlist=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i)== list.get(j)&&!tekrarlist.contains(list.get(i))){
                    tekrarlist.add(list.get(i));
                }
            }
        }
        System.out.println("tekrarlist = " + tekrarlist);


    }
}
