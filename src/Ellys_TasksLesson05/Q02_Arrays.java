package Ellys_TasksLesson05;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String sArr[]={"Verilen bir cümledeki boşluklar hariç character sayısını bulunuz"};
        int sayac=0;
        for (int i=0;i<sArr.length;i++){
            if (sArr.length!=' '){
                sayac++;}
        }
        System.out.println("sArr = " + sArr);
        //System.out.println("Arrays.toString(sArr) = " + Arrays.toString(sArr));
        String str="Verilen bir cumledeki bosluklar haric" +
                "character sayisini bulunuz.";
        String [] arr= str.replace(" ","").split("");
        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

    }
}
