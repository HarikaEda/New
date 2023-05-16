package Team_WorkProject02;

import java.util.Scanner;

public class sameFirstAndLast {
   /*

    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    print just true or false

    */


    /*

    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk ve son elemanın  eşitliğini kontrol eden code create ediniz..

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    sadece  true veya false print et

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
        int[] myArray = new int[useThisArray.length];

        for (int i = 0; i < useThisArray.length; i++) {
            myArray[i] = Integer.parseInt(useThisArray[i]);
        }

        boolean first = true;
        boolean last = true;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == myArray[0]) {
                first = false;
            }
            if (myArray[i] == myArray[myArray.length - 1]) {
                last = false;
            }
        }

        System.out.println(first);
        System.out.println(last);





    }


}


