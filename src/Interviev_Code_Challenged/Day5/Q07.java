package Interviev_Code_Challenged.Day5;

import java.util.*;

public class Q07 {
    public static void main(String[] args) {
// create an array of random numbers of size 10
        // convert that array into a list
        // convert list into set

        // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
        // bu arrayi bir listeye dönüştür
        // listeyi sete çevir
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 10);
            list.add(randomNumber);
            list.add(i);
            System.out.println("list = " + list);
        }



    }
}
