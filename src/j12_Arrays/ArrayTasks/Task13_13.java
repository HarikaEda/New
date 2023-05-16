package j12_Arrays.ArrayTasks;

import java.util.Scanner;

public class Task13_13 {
    public static void main(String[] args) {
 /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )
         */
        Scanner x=new Scanner(System.in);
        int[]y=new int[8];
        for (int i=0;i<y.length;i++)

            y[i]=x.nextInt();
            int sayac=0;
            for (int z:y) {
                if (z%3==0)
                    sayac++;

            }
            System.out.println(sayac);



    }
}
