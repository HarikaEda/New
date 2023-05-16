package Interviev_Code_Challenged.Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */


        //parse int : primitive return eder
        //value Of : non primitive return eder
        ArrayList<String>arrayList=new ArrayList<>(Arrays.asList("$13, $15, $20"));
        System.out.println("Toplam: "+getSum(arrayList));

    }

    private static int getSum(ArrayList<String> arrayList) {
        int toplam = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).length(); j++) {
                if (arrayList.get(i).charAt(j) == '$') {
                    arrayList.set(i, arrayList.get(i).substring(0, j) + arrayList);
                    toplam += Integer.parseInt(arrayList.get(i).substring(j + 1));


                }
            }
        }
        return toplam;
    }
}