package Interviev_Code_Challenged.Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // part 1: create list of 5 numbers from user input
        // sort the list in reverse order and print it
        // shuffle the list and print it
        // rotate right by 3 places and print it

        // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
        // listeyi ters sırada sırala ve yazdır
        // listeyi karıştır ve yazdır
        // 3 yer sağa döndür ve yazdır

        // part 2: find the max number and min number, print them
        // replace all max number with min number

        // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
        // tüm maksimum sayıları minimum sayı ile değiştir
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arrayList.add(input.nextInt());
            System.out.println();

        }
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("arrayList = " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("arrayList = " + arrayList);
        Collections.rotate(arrayList, 3);
        System.out.println("arrayList = " + arrayList);

Integer max = Collections.max(arrayList);
        System.out.println("max = " + max);
Integer min = Collections.min(arrayList);
        System.out.println("min = " + min);
        Collections.replaceAll(arrayList, max, min);
        System.out.println("arrayList = " + arrayList);

        }



    }

