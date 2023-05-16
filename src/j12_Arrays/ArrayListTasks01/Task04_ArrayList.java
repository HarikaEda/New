package j12_Arrays.ArrayListTasks01;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04_ArrayList {
    public static void main(String[] args) {
 /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

         changeInArraylist();
        ArrayList<String> renk = new ArrayList<>(Arrays.asList("yellow", "red", "blue", "red", "blue"));

    }

    private static String changeInArraylist() {
        String s1 = "blue";
        String s2 = "yellow";
        ArrayList<String> list = new ArrayList<>();
        System.out.println("list.add(s1) = " + list.add(s1));


        return s1;
    }


}
