package j12_Arrays.ArrayListTasks01;

import java.util.ArrayList;
import java.util.Arrays;

public class Task08_ArrayList {
    public static void main(String[] args) {
 /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */
        secondMax(new ArrayList<Integer>(Arrays.asList(5, 3, 4, 6, 7)));


    }

    public static int secondMax(ArrayList<Integer> list) {
        int max = list.get(0);
        int secondMax = 0;
        for (int x : list) {
            if (x > max)
                max = x;
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int y : list) {
                if (x != max) list2.add(x);
                secondMax = list2.get(0);
                for (int z : list2) {
                    if (x > secondMax) secondMax = x;

                }
            }

        }
        return secondMax;
    }
}