package j13_ArrayList.ArrayListTasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {

         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String strarr[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        ArrayList<String>stringArrayList=new ArrayList<>();
        stringArrayList.add(Arrays.toString(strarr));
        System.out.println("stringArrayList = " + stringArrayList);
harfSirasi();
    }

    private static void harfSirasi() {



    }
}
