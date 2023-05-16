package Interviev_Code_Challenged.Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer>list=new ArrayList<>();


randomEkle(list);

    }

    private static void randomEkle(ArrayList<Integer> list) {

        for (int i=0;i<10;i++){
            int randomS=(int) (Math.random()*21);
            list.add(randomS) ;
            if (randomS%2==0){
             list.add(111) ;
            }else list.add (randomS);
        }
        System.out.println(list);

if (list.contains(111)){

}//her run edişimizde çift sayıların yerine 111 yazdıracak
    }


}
