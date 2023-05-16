package j12_Arrays.ArrayTasks;

import java.util.Scanner;

public class Task05_5 {
    public static void main(String[] args) {
// Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("list için sayı giriniz");
        int arr[] = new int[5];
        arr = new int[]{input.nextInt()};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("list = " + arr);
            arr[i] = input.nextInt();

        }
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println("tersten : " + i);
        }

    }

}




