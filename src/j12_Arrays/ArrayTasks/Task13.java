package j12_Arrays.ArrayTasks;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {//advens zero front
 /*
   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */
        // Kodu aşağıya yazınız..
int []aray={1,0,1,0,2,3,0,5};
        System.out.println(Arrays.toString(advenceZero(aray)));

    }public static int []advenceZero(int[]array){
        Arrays.sort(array);

        return array;
    }
}
