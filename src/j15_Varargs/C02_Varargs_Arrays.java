package j15_Varargs;

import java.util.concurrent.LinkedTransferQueue;

public class C02_Varargs_Arrays {
    public static void main(String[] args) {
        int arr[] = {31, 21, 33, 44, 58, 46, 2, 1, 79};
        //task01:verilen array elemanlarının toplamını print eden method cerate
        arrTopla(arr);
        System.out.println("arrTopla(arr) = " + arrTopla(arr));

        //task02:task 1 varargs method ile run ediniz.
        varargsTopla(arr);
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));

/*varargs methoda girilen parametreler array gibi tanımlandığı için array parametre de olabilir.
*/

    }

    private static int arrTopla(int[] arr) {
        int toplam=0;
        for (int a:arr) {
          toplam+=a;
        }
        return toplam;
    }

    private static int varargsTopla(int[] arr) {
        return 0;
    }


}