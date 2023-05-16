package j12_Arrays.ArrayListTasks01;

import java.util.ArrayList;

public class Task09_2dArray_With_ArrayList {
    public static void main(String[] args) {
        /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */
int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<ArrayList<Integer>>x=new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> y = new ArrayList<ArrayList<Integer>>();
        for(int[]w : arr1) {
            ArrayList<Integer> p = new ArrayList<>();
            for(int z : w) p.add(z);
            x.add(p);
        }
        System.out.println(x);
    }



}
