package j12_Arrays.ArrayTasks;

public class Task12 {
    public static void main(String[] args) {//array no14
 /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.
        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here
        int[] x = { 2, 3, 4};
        boolean y = false;
        boolean z = false;
        for ( int i = 0 ; i < x.length ; i++)
            if( x[i] == 1 ){
                y = true;
                break;
            }
        for ( int i = 0 ; i < x.length ; i++)
            if( x[i] == 4 ){
                z = true;
                break;
            }
        System.out.println(z ^ y);
        if ( y == z)
            System.out.println(false);
        else System.out.println(true);
    }
}