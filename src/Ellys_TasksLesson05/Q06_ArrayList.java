package Ellys_TasksLesson05;

import java.util.ArrayList;
import java.util.List;

public class Q06_ArrayList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
      int sayiArr[]={1,2,3,4,5,6,7,8};
int n=3;
        List<Integer>list=new ArrayList<>();
        for (int i=0;i< sayiArr.length;i++){
            list.add(sayiArr[i]);
        }
        List<Integer>maxlist=new ArrayList<>();
        int sayac=0;
        while (sayac<n){
            int max= list.get(0);
            for (int i=0;i< list.size();i++){
                max= list.get(i);
            }
            maxlist.add(max ) ;
            list.remove(list.indexOf(max));
            sayac++;
        }

        System.out.println("maxlist = " + maxlist);

    }
}
