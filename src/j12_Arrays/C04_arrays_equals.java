package j12_Arrays;

import java.util.Arrays;

public class C04_arrays_equals {
    public static void main(String[] args) {
  //arrays eşitilik kontrolü... equals();-> methodu arrays elemanlarının hem index hem de value kontrolunu yapar.
 int arr[]={1,2,46,79,80,21,27,44};
 int arr2[]={21,27,46,79,44,2,1,80};
        System.out.println("Arrays.equals(arr,arr2) = " + Arrays.equals(arr, arr2));
        System.out.println("(arr[0]==arr2[6]) = " + (arr[0] == arr2[6]));
Arrays.sort(arr);
Arrays.sort(arr2);
        System.out.println("Arrays.equals(arr,arr2) = " + Arrays.equals(arr, arr2));
    //Array'i stringe conver(çevirme )
       String str= Arrays.toString(arr);
        System.out.println("str = " + str);
        System.out.println("str.substring(3) = " + str.substring(3));//tamamı bir string oldu


    }
}
