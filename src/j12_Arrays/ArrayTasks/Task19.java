package j12_Arrays.ArrayTasks;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {//2d array
 /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.
         */
  String[][]arr={{"new jersey","atlanta","ohio"},
        {"Pittsburgh" ,"ohio","new york","ohio"},
        {"ohio","new york"}};
for (int i=0;i< arr.length;i++)
    for (int j=0;j< arr[i].length;j++){
        if (arr[i][j].equals("ohiao"))arr[i][j]="Florida";
        System.out.println(Arrays.deepToString(arr));
    }



    }
}
