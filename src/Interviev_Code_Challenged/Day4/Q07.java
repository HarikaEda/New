package Interviev_Code_Challenged.Day4;

import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {
/*
      Convert the given Array to negative form sentence into a String.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */
            String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

            System.out.println(Arrays.toString(arr));

String str="";
        for (String s:arr) {
            str+=s;
        }
       String strNeg=str.replace("Is","isNot");
        //System.out.println(str);
        System.out.println(strNeg);



    }
}
