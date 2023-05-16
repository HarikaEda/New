package Ellys_TasksLesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Q16_Arrays {
    public static void main(String[] args) {
/*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner input=new Scanner(System.in);
        System.out.println(" 8 elemanlı Arrayinizi oluşturunuz");
        int arr[] = new int[8];
        int arr1= input.nextInt();
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        for (int w:arr) {
            if (w%3==0){
                int sayac = 0;
                sayac++;
            }
        }//!!!!!????????
        






    }
}
