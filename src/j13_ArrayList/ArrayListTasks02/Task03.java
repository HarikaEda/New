package j13_ArrayList.ArrayListTasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(12,33,45,63,1,7,9,0,19));
        ArrayList<String>list2=new ArrayList<>();
        System.out.println(list2.add("list1"));
        Scanner input = new Scanner(System.in);
        System.out.println("aramak istediğiniz elemanı giriniz");
        for (String w : list2) {
            if (w.contains(input.nextLine())) {
                //System.out.println(input.nextInt());
                System.out.println("sorguladığınız eleman listte bulunmaktadır");
                break;
            } else System.out.println("sorguladığınız eleman listte XXXX bulunmamaktadır");
            System.out.println("list1 = " + list1);
            break;
        }


    }

}
