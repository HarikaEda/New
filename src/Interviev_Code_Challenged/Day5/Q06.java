package Interviev_Code_Challenged.Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have
        // find out what are the duplicated values

        // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
        // kaç tane tekrarli eleman olduğunu sayin
        // yinelenen değerlerin ne olduğunu öğrenin

ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
      for (int i = 0; i < list.size(); i++){
          for (int j = i + 1; j < list.size(); j++){
              if (list.get(i) == list.get(j)){
                  System.out.print(list.get(i)+" ");
              }
          }


      }


    }
}
