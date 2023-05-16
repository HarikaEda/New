package j12_Arrays.ArrayListTasks01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02_ArrayList {
    public static void main(String[] args) {
 /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */
    /*public class ArrayList6 {
       // public static void main(String[] args) {
            //System.out.println(hillNum(new ArrayList<>(Arrays.asList(5, 6, 1, 2, 3, 7, 2, 1))));
        }
        public static int hillNum(ArrayList<Integer> integerArrayList){
            for( int i = 1; i < integerArrayList.size() - 1; i++)
                if(integerArrayList.get(i) < integerArrayList.get(i-1)
                        && integerArrayList.get(i) > integerArrayList.get(i+1)) return integerArrayList.get(i);
            return -1;*/


        ArrayList<Integer>List=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        
        }

    private static void getSum(ArrayList<String> list) {
       for (int i=0;i<List.of().size();i++){

           int toplam=0;
           toplam+=i;
           System.out.println("toplam = " + toplam);}
    }
}

