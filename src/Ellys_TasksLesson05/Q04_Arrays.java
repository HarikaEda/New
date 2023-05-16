package Ellys_TasksLesson05;

import java.util.Arrays;

public class Q04_Arrays {
    public static void main(String[] args) throws InterruptedException {
    /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                a e i o u */
String str="Apex,nesne yönelimli bir programlama dilidir";
String sArr[]= new String[]{str};
        System.out.println(Arrays.toString(sArr));
        for (int i=0;i<sArr.length;i++){
 char k=' ';
            if (k=='a'||k=='e'||k=='ı'||k=='i'||k=='o'||k=='ö'||k=='u'||k=='ü'){
        System.out.println("cümle : " + i+ " ünlü harflerini içerir.");
    }
}
       /* String s= "Apex,nesne yonelimli bir programlama dilidir";
        s= s.replace(",","").replace(" ","");
        String[] arr= s.split("");

        String[] sesliHarfler= {"a", "e", "i", "o", "u"};
        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sesliHarfler.length; j++) {
                if (arr[i].equalsIgnoreCase(sesliHarfler[j])) {
                    sayac++;
                }
            }
        }
        System.out.println("sesli harf sayısı = "+sayac);*/

    }
}
