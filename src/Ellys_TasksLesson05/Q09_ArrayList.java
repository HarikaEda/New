package Ellys_TasksLesson05;

import java.util.ArrayList;
import java.util.Arrays;

public class Q09_ArrayList {
    public static void main(String[] args) {
 /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(12,11,12,15,12,34,43));
        System.out.println("list1 = " + list1);

        if (list1.contains(12)){
            for (int i=0;i<list1.size();i++){
                if (list1.get(i)==12){
                  list1.set(list1.indexOf(12),21);
                }
            }
        }

        System.out.println("list1 = " + list1);

    }
}
