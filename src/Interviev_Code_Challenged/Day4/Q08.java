package Interviev_Code_Challenged.Day4;

public class Q08 {
    public static void main(String[] args) {
/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
        String str = "aaabbbbbcccccccc";
        String outPut="";
        for (int i = 0; i <str.length() ; i++) {
            int counter=0;
            for (int j = 0; j <str.length() ; j++) {
                if ((str.charAt(i) == str.charAt(j))) counter++;
            }
            if (!outPut.contains(String.valueOf(str.charAt(i))))
                outPut += ""+str.charAt(i)+counter+" ";

        }

        System.out.println(outPut);
    }
}