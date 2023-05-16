package j13_ArrayList.ArrayListTasks02;

import java.util.ArrayList;
import java.util.Scanner;

public class Task01_Market {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<String> list = new ArrayList<>();
        list.add("22");
        list.add("3");
        list.add("45");
        list.add("13");
        list.add("78");
        list.add("62");
        //System.out.println("list = " + list);
        Scanner input = new Scanner(System.in);
        System.out.println("aramak istediğiniz elemanı giriniz");
        for (String w : list) {
            if (w.contains(input.nextLine())) {
                //System.out.println(input.nextInt());
                System.out.println("sorguladığınız eleman listte bulunmaktadır *****");
                System.out.println("list = " + list);
                break;
            } else System.out.println("sorguladığınız eleman listte XXXX bulunmamaktadır");
            System.out.println("list = " + list);
            break;
        }


    }
}
