package j13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
// Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden code create ediniz
// bir method olusturun
// orn : [1, 3, 5, 3, 5, 6, 1, 7]
// output [1, 3, 5, 6, 7]
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,3,5,3,5,6,1,7));
      tekrarsızlistPrintEt(list);

    }//main sonu:

    private static void tekrarsızlistPrintEt(ArrayList<Integer>list) {
      ArrayList<Integer>benzersizElemanListi=new ArrayList<>();
        for (int i=0;i<list.size();i++){

            if (!benzersizElemanListi.contains(list.get(i))){//listten gelen eleman bu listte yoksa

             benzersizElemanListi.add(list.get(i));
            }
        }
        System.out.println(benzersizElemanListi);

    }


}
