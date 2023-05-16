package j12_Arrays.ArrayListTasks01;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01_ArrayList {
    public static void main(String[] args) {
    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = "Orange , Kiwi , Peach , Banana , Orange"
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

        ArrayList<String> meyveList=new ArrayList<>(Arrays.asList("Orange , Kiwi , Peach , Banana , Orange"));
        getCount(meyveList, "Orange");
        System.out.println("meyveList = " + meyveList);
        //System.out.println("getCount(meyveList,\"Orange\") = " + getCount(meyveList, "Orange"));

    }

    public static int getCount(ArrayList<String>meyveList, String orange) {

        int counter=0;

        for (int i=0;i< meyveList.size();i++){
            String Orange="";
            if (meyveList.contains("orange")){
                counter++;

            }
        }
        System.out.println("counter = " + counter);

        return counter;
    }
}
