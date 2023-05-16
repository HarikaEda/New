package j12_Arrays.ArrayListTasks01;

import java.util.ArrayList;

public class Task12_Array1 {
    public static void main(String[] args) {
/*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */
int [] arr={1,2,3,1};
        System.out.println("dupicate(arr) = " + dupicate(arr));

    }

    private static boolean dupicate(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        /*for (int i=0;i< arr.length;i++){
            list.add(arr);
            for (int j=0;j< list.size();j++){
                if (list.lastIndexOf(list.get(i))!=i)return true;
            }
        }
*/
        for (int w:arr) {
            list.add(w);
            for (int i=0;i< list.size();i++){
                if (list.lastIndexOf(list.get(i))!=i)return true;
            }

        }
        return false;

    }
}
