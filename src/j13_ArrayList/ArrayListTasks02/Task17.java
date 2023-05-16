package j13_ArrayList.ArrayListTasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
// Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
      ArrayList<Integer>sayilar= new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));
tekrarsızListe(sayilar);

    }

    private static void tekrarsızListe(ArrayList<Integer>sayilar) {
        ArrayList<Integer> tekrarsizList= new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if(!tekrarsizList.contains(sayilar.get(i))) {
                tekrarsizList.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsizList);
    }
}



