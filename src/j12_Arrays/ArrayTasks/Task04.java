package j12_Arrays.ArrayTasks;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {//create array string
/*
        String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */
        // Kodu aşağıya yazınız..
        String strArr[]={"new jersey","new york","boston","california"};
        //System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
        int kacİsim[]= new int[]{strArr.length};
        System.out.println("Arrays.toString(kacİsim) = " + Arrays.toString(kacİsim));

    }
}
