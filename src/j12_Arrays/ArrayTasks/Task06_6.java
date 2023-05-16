package j12_Arrays.ArrayTasks;


import java.util.Arrays;
import java.util.Scanner;

public class Task06_6 {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
        int[] arr= {1,2,3,4};
        System.out.println(Arrays.toString(sırala(arr)));
     sırala(arr);
    }
    private static int[] sırala( int[] arr) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;



        }
        return arr;
    }

}
