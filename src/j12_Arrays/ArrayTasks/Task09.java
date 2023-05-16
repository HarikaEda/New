package j12_Arrays.ArrayTasks;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {//array second max
/*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
int arr[]=new int[]{15,25,22,18,30};
        Arrays.sort(arr);
       int max=arr[arr.length-1];
        System.out.println("max = " + arr[arr.length-1]);
        System.out.println("max 2.değer = " +arr[arr.length-2 ]);


    }
}
