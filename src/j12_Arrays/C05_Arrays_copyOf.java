package j12_Arrays;

import java.util.Arrays;

public class C05_Arrays_copyOf {
    public static void main(String[] args) {
  //   Aray kopyalama..copyOf();->girilen arr'in newLength ekadar ilk elemanını kopyalar.
        int arr[]={1,2,46,79,80,21,27,44};
      int arr2[]= Arrays.copyOf(arr,3);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//task:arr'in son 3 elemanını atandığı arrayi print eden code create ediniz
  int arr3[]=Arrays.copyOfRange(arr,arr.length-3,arr.length);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

   /*array'i belirli bir eleman ile update (set) etme...fill(arr,value) ->girilen arr istenen value ile tüm elemanlar
        update edilir.*/
     Arrays.fill(arr,58);//arr tüm elemanları 58 ile update edildi
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.fill(arr,arr.length-3,arr.length,63);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


    }
}
