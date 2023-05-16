package CananTaskCözümü.March16;

import java.util.ArrayList;

public class Task13 {
    public static void main(String[] args) {
        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */
        int arr[]={3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        ardısıkTopla(arr);


    }

    private static void ardısıkTopla(int []arr) {
      int baslangıc=0;
      int sayi=1;
        ArrayList<Integer>list=new ArrayList<>();
        while ((sayi+baslangıc)<= arr.length){
            int toplam=0;
            for (int i=baslangıc;i<sayi+baslangıc;i++){
               //i=0 indexi
                toplam+=arr[i];

            }
            list.add(toplam);
            baslangıc+=sayi;
            sayi++;

        }

        System.out.println("list = " + list);
    }
}
