package Interviev_Code_Challenged.Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        /*
         * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
         * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
         */
int arr1[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        List<Integer>liste=new ArrayList<>();
        for (int i=0;i< arr1.length;i++){
            if (!liste.contains(arr1[i])){
                liste.add(arr1[i]);
            }
        }
int arr2[]=new int[liste.size()];
        for (int i=0;i< liste.size();i++){
            arr2[i]= liste.get(i);
        }
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


    }
}
