package j12_Arrays.ArrayTasks;

import java.util.Arrays;

public class Task10_10 {
    public static void main(String[] args) {
/* TASK :
bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
input : 1,2,-3,4,-5,-6
output :-1,-2,3,-4,5,6

 */
int arr[]={1,2,-3,4,-5,-6};
    arrTersIsaret(arr);


    }

    private static void arrTersIsaret(int[]arr) {
        for (int i=0;i<arr.length;i++) {

            arr[i] *= -1;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
