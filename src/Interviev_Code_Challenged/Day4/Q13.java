package Interviev_Code_Challenged.Day4;

import java.util.ArrayList;

public class Q13 {
    /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */
    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        String str2 =str;
        String output = "";
        while (str2.length()>1){
            str2=str2.substring(0,1);
            int uzunluk=str.length();
            str2=str2.replaceAll(str,"");
            if (str2.length()<uzunluk-1){
                output+=str2;
            }
            System.out.println("Result= "+ output);
            ArrayList<String>dizi=new ArrayList<String>();
            for (int i=0;i<output.length();i++){
                dizi.add(output.substring(i,i+1));
            }

            System.out.println(dizi);
}




    }

    }

